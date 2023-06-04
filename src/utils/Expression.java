package src.utils;

import src.gen.SMITHGrammarBaseVisitor;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.Expressions.*;
import src.utils.Expressions.AritmeticOperator;
import src.utils.Variable;

import java.util.ArrayList;

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
        } else if( ctx.IDENTIFIER() != null ){
            // Check if identifier exists
            String variableName = ctx.IDENTIFIER().getText();
            Variable variable = context.searchVariable(variableName);

            if( variable == null ){
                // If variable does not exist
                return -1;
            } else {
                // If variable exists
                return variable.value.type;
            }
        }
        return -1;
    }

    // Evaluate and get literal value
    public static Value evaluateLiteral(
            SMITHGrammarParser.LiteralContext literal,
            ContextManager context
    ) {
        // We are performing an operation directly

        // Get literal type

        if( literal.IDENTIFIER() != null ) {
            // Check if identifier exists
            String variableName = literal.IDENTIFIER().getText();
            Variable variable = context.searchVariable(variableName);

            if (variable == null) {
                // If variable does not exist
                return null;
            } else {
                // If variable exists
                return variable.value;
            }
        }
        else if( literal.functioncall() != null ) {

            SMITHGrammarParser.FunctioncallContext functioncall = literal.functioncall();
            // Get function name
            String functionName = functioncall.IDENTIFIER().getText();

            Variable var = context.searchVariable(functionName);
            if (var == null) {
                // Function not found
                return null;
            }

            // Check if that var is a function
            Value varValue = var.value;
            if (varValue.type != Variable.FUNCTION) {
                // This is not a function
                return null;
            }

            // Get actual function
            Function function = (Function) varValue;

            // call function
            function.call(
                    null,
                    context,
                    functioncall.functioncallarguments()
            );

            // Context now should have the return value, if any
            Value toReturn = context.getReturnValue();

            // Reset context return value
            context.setReturnValue(null);

            return toReturn;
        }
        else if( literal.arrayliteral() != null ){
            // Evaluate array literal

            SMITHGrammarParser.ArrayelementsContext arrayElements = literal.arrayliteral().arrayelements();

            // Arrays will be represented as array lists containing values
            ArrayList<Value> values = new ArrayList<>();

            // We will check they type of the array on the way, like a pro :D
            int elementsType = Variable.UNDEFINED;

            while( arrayElements != null && arrayElements.getChildCount() > 0){
                // Get value
                Value value = evaluate(
                        arrayElements.expression(),
                        context,
                        null
                );

                if( value == null )
                    return null;

                // Check if type corresponds with given type
                if( elementsType == Variable.UNDEFINED ) {
                    // Check if this is an array
                    if( value.type == Variable.ARRAY )
                        elementsType = value.subtype;
                    else
                        elementsType = value.type;
                } else if( value.type == Variable.ARRAY){
                    // Check if this is an array
                    if( elementsType != value.subtype ){
                        // Type mismatch (Not all array elements are of the same type)
                        return null;
                    }
                } else if( elementsType != value.type ){
                    // Type mismatch (Not all array elements are of the same type)
                    return null;
                }

                // Add value to array
                values.add(value);

                // Get next element
                SMITHGrammarParser.FurtherarrayelementsContext furtherArrayElements =
                        arrayElements.furtherarrayelements();

                if( furtherArrayElements != null && furtherArrayElements.getChildCount() > 0)
                    arrayElements = furtherArrayElements.arrayelements();
                else
                    break;
            }

            // We have an array of elements, now we need to create an array (as a Value)
            // and return it
            return new Value<>(
                    values,
                    Variable.ARRAY,
                    elementsType
            );
        }
        else {
            int literalType = getLiteralType(literal, context);

            if( literalType == Variable.STRING ){
                // Remove " " from string
                String stringLiteral = literal.STRING_LITERAL().getText();
                stringLiteral = stringLiteral.substring(1, stringLiteral.length() - 1);
                return new Value<>(
                        stringLiteral,
                        Variable.STRING
                );
            }
            else if( literalType == Variable.INT ){
                // Parse all numbers to double
                try{
                    return new Value<>(
                            Integer.parseInt(literal.numberliteral().getText()),
                            Variable.INT
                    );
                } catch (NumberFormatException e){
                    return null;
                }
            }
            else if( literalType == Variable.FLOAT ){
                // Parse all numbers to double
                try{
                    return new Value<>(
                            Double.parseDouble(literal.numberliteral().getText()),
                            Variable.FLOAT
                    );
                } catch (NumberFormatException e){
                    return null;
                }
            }
            else if( literalType == Variable.BOOLEAN )
                return new Value<>(
                        Boolean.parseBoolean(literal.BOOLEAN_LITERAL().getText()),
                        Variable.BOOLEAN
                );
            else
                return null;
        }
    }

    public static Value evaluate(
            SMITHGrammarParser.ExpressionContext ctx,
            ContextManager context,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle expression and return appropriate value

        // Check on which kind of rule are we standing on

        // This time we got a direct value
        if( ctx.literal() != null ){
            return evaluateLiteral(ctx.literal(), context);
        }
        // Check if there are parenthesis
        if( ctx.OPEN_PAREN() != null ){
            return evaluate(
                    ctx.expression(0),
                    context,
                    parentVisitor
            );
        }
        // Check if this a minus (negation of an expression)
        if( ctx.MINUS() != null && ctx.getChildCount() == 2){
            Value evaluated = evaluate(
                    ctx.expression(0),
                    context,
                    parentVisitor
            );

            if( evaluated == null )
                return null;

            return AritmeticOperator.singleMinus(evaluated);
        }
        // Check if there are logical expressions
        if( ctx.logicaloperator() != null ){

            // Getting value for each operand

            Value rightMost = evaluate(
                    ctx.expression(1),
                    context,
                    parentVisitor
            );
            Value leftMost = evaluate(
                    ctx.expression(0),
                    context,
                    parentVisitor
            );

            if( rightMost == null || leftMost == null )
                return null;

            // Separate AND and OR logic within source file
            return LogicalOperator.evaluate(
                    leftMost,
                    rightMost,
                    ctx.logicaloperator()
            );
        }
        // Check if there is a comparison operator
        if( ctx.comparisonoperator() != null ){
            // have on mind that there are two expressionsnc trees
            Value rightMost = evaluateNonComparatorExp(
                    ctx.expressionnc(1),
                    context,
                    parentVisitor
            );

            Value leftMost = evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );

            if( rightMost == null || leftMost == null )
                return null;

            return ComparisonOperator.evaluate(
                    leftMost,
                    rightMost,
                    ctx.comparisonoperator()
            );
        }
        // Check if there are aritmetic expressions
        else {

            // Getting value for each operand

            Value rightMost = evaluate(
                    ctx.expression(1),
                    context,
                    parentVisitor
            );
            Value leftMost = evaluate(
                    ctx.expression(0),
                    context,
                    parentVisitor
            );

            if( ctx.TIMES() != null ){
                return AritmeticOperator.times(leftMost, rightMost);
            } else if( ctx.DIVIDE() != null ){
                return AritmeticOperator.divide(leftMost, rightMost);
            } else if( ctx.PLUS() != null ){
                return AritmeticOperator.sum(leftMost, rightMost);
            } else if( ctx.MINUS() != null ){
                return AritmeticOperator.difference(leftMost, rightMost);
            } else if( ctx.MOD() != null ){
                return AritmeticOperator.mod(leftMost, rightMost);
            }
        }
        return null;
    }

    public static Value evaluateNonComparatorExp(
        SMITHGrammarParser.ExpressionncContext ctx,
        ContextManager context,
        SMITHGrammarVisitor parentVisitor
    ){
        // Handle expression and return appropriate value

        Value leftmostEvaluatedValue;

        // Check on which kind of rule are we standing on

        // This time we got a direct value
        if( ctx.literal() != null ){
            return evaluateLiteral(ctx.literal(), context);
        }
        // Check if there are parenthesis
        if( ctx.OPEN_PAREN() != null ){
            return evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );
        }
        // Check if this a minus (negation of an expression)
        if( ctx.MINUS() != null && ctx.getChildCount() == 2){
            Value evaluated = evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );

            if( evaluated == null )
                return null;

            return AritmeticOperator.singleMinus(evaluated);
        }
        // Check if there are logical expressions
        if( ctx.logicaloperator() != null ){

            // Getting value for each operand

            Value rightMost = evaluateNonComparatorExp(
                    ctx.expressionnc(1),
                    context,
                    parentVisitor
            );
            Value leftMost = evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );

            if( rightMost != null || leftMost != null )
                return null;

            // Separate AND and OR logic within source file
            return LogicalOperator.evaluate(
                    leftMost,
                    rightMost,
                    ctx.logicaloperator()
            );
        }
        // Check if there are aritmetic expressions
        else {

            // Getting value for each operand

            Value rightMost = evaluateNonComparatorExp(
                    ctx.expressionnc(1),
                    context,
                    parentVisitor
            );
            Value leftMost = evaluateNonComparatorExp(
                    ctx.expressionnc(0),
                    context,
                    parentVisitor
            );

            if( ctx.TIMES() != null ){
                return AritmeticOperator.times(leftMost, rightMost);
            } else if( ctx.DIVIDE() != null ){
                return AritmeticOperator.divide(leftMost, rightMost);
            } else if( ctx.PLUS() != null ){
                return AritmeticOperator.sum(leftMost, rightMost);
            } else if( ctx.MINUS() != null ){
                return AritmeticOperator.difference(leftMost, rightMost);
            } else if( ctx.MOD() != null ){
                return AritmeticOperator.mod(leftMost, rightMost);
            }
        }
        return null;
    }
}