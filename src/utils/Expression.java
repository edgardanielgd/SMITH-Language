package src.utils;

import src.gen.SMITHGrammarBaseVisitor;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.Expressions.*;
import src.utils.Variable;

public class Expression {
    public static int getLiteralType(
            SMITHGrammarParser.LiteralContext ctx,
            ContextManager context
    ) {
        if( ctx.BOOLEAN_LITERAL() != null ){
            return Variable.BOOLEAN;
        } else if( ctx.STRING_LITERAL() != null ){
            return Variable.STRING;
        } else if( ctx.numberliteral() != null ) {
            if( ctx.numberliteral().FLOAT_LITERAL() != null ){
                return Variable.FLOAT;
            } else if( ctx.numberliteral().INTEGER_LITERAL() != null ){
                return Variable.INT;
            } else {
                return Variable.NUMBER;
            }
        }
        return -1;
    }

    public static Value evaluate(
            SMITHGrammarParser.ExpressionContext ctx,
            ContextManager context,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle expression and return appropriate value

        SMITHGrammarParser.ExpressionextensionContext extension = ctx.expressionextension();
        Value leftmostEvaluatedValue = null;

        // Check on which kind of rule are we standing on
        if( ctx.literal() != null ){
            // We are performing an operation directly

            // Get literal type
            int literalType = getLiteralType(ctx.literal(), context);
            if( literalType == Variable.STRING ){
                // Remove " " from string
                String stringLiteral = ctx.literal().STRING_LITERAL().getText();
                stringLiteral = stringLiteral.substring(1, stringLiteral.length() - 1);
                leftmostEvaluatedValue = new Value<>(
                        stringLiteral,
                        Variable.STRING
                );
            }

            else if( literalType == Variable.INT ){
                // Parse all numbers to double
                try{
                    leftmostEvaluatedValue = new Value<Integer>(
                        Integer.parseInt(ctx.literal().numberliteral().getText()),
                        Variable.INT
                    );
                } catch (NumberFormatException e){
                    return null;
                }
            }
            else if( literalType == Variable.FLOAT ){
                // Parse all numbers to double
                try{
                    leftmostEvaluatedValue = new Value<Double>(
                        Double.parseDouble(ctx.literal().numberliteral().getText()),
                        Variable.FLOAT
                    );
                } catch (NumberFormatException e){
                    return null;
                }
            }
            else if( literalType == Variable.BOOLEAN )
                leftmostEvaluatedValue = new Value<Boolean>(
                    Boolean.parseBoolean(ctx.literal().BOOLEAN_LITERAL().getText()),
                    Variable.BOOLEAN
                );
            else
                return null;

            // Now that we got the literal value, check if an operation must be performed
            if(
                    ctx.expressionextension() != null &&
                            ctx.expressionextension().getChildCount() > 0
            ){
                // Decide which kind of comparison are we going to perform around here B)

                // First than all, get value evaluated by right side
                Value rightmostEvaluatedValue = (Value)evaluate(
                        ctx.expressionextension().expression(),
                        context,
                        parentVisitor
                );

                if( extension.aritmeticoperator() != null ){
                    return AritmeticOperator.evaluate(
                            leftmostEvaluatedValue, rightmostEvaluatedValue,
                            extension.aritmeticoperator()
                    );
                } else if( extension.logicaloperator() != null ){
                    return LogicalOperator.evaluate(
                            leftmostEvaluatedValue, rightmostEvaluatedValue
                    );
                } else if( extension.comparisonoperator() != null ){
                    return ComparisonOperator.evaluate(
                            leftmostEvaluatedValue, rightmostEvaluatedValue
                    );
                }

            } else {
                // This is a final value, so just return it
                return leftmostEvaluatedValue;
            }

        } else {
            // There are parenthesis, so just return expression evaluated
            Value leftParenthesisEvaluatedValue = (Value)evaluate(
                    ctx.expression(),
                    context,
                    parentVisitor
            );

            // Now that we got the literal value, check if an operation must be performed
            if(
                    ctx.expressionextension() != null &&
                    ctx.expressionextension().getChildCount() > 0
            ){
                // Decide which kind of comparison are we going to perform around here B)

                // First than all, get value evaluated by right side
                Value rightmostEvaluatedValue = (Value)evaluate(
                        ctx.expressionextension().expression(),
                        context,
                        parentVisitor
                );

                if( extension.aritmeticoperator() != null ){
                    return AritmeticOperator.evaluate(
                            leftParenthesisEvaluatedValue, rightmostEvaluatedValue,
                            extension.aritmeticoperator()
                    );
                } else if( extension.logicaloperator() != null ){
                    return LogicalOperator.evaluate(
                            leftParenthesisEvaluatedValue, rightmostEvaluatedValue
                    );
                } else if( extension.comparisonoperator() != null ){
                    return ComparisonOperator.evaluate(
                            leftParenthesisEvaluatedValue, rightmostEvaluatedValue
                    );
                }

            } else {
                // This is a final value, so just return it
                return leftParenthesisEvaluatedValue;
            }



        }
        return null;
    }
}