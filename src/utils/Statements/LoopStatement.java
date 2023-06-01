package src.utils.Statements;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.BlockHandler;
import src.utils.ContextManager;
import src.utils.Expression;
import src.utils.Expressions.Value;
import src.utils.Variable;

public class LoopStatement {

    public static int handle(
            ContextManager context,
            SMITHGrammarParser.LoopblockContext ctx,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle loop definition

        SMITHGrammarParser.LoopextensionContext loopExtension = ctx.loopextension();

        // Global loop body
        SMITHGrammarParser.StatementbodyContext statementBody = loopExtension.statementbody();

        // Get loop type
        if( loopExtension.REPEAT() != null ){
            // Repeat loop

            // Specify repeat type
            SMITHGrammarParser.RepeattypeContext repeatType = loopExtension.repeattype();
            SMITHGrammarParser.ConditionalContext conditional = loopExtension.conditional();
            SMITHGrammarParser.ExpressionContext expression = conditional.expression();

            Value evaluatedExpression = Expression.evaluate(
                    expression, context, parentVisitor
            );

            while(
                evaluatedExpression.type == Variable.BOOLEAN &&
                (repeatType.UNTIL() != null ?
                        ! ((boolean) evaluatedExpression.value) :
                        ((boolean) evaluatedExpression.value)
                )
            ){
                int status = BlockHandler.handle(statementBody.block(), context, parentVisitor);
                if( status != 0 ){
                    return status;
                }
                evaluatedExpression = Expression.evaluate(
                        expression, context, parentVisitor
                );
            }

        } else if( loopExtension.FOR() != null ){
            // For loop

            // Specify for type
            SMITHGrammarParser.ForextensionContext forExtension = loopExtension.forextension();

            if( forExtension.EACH() != null ){
                Value evaluatedExpression = Expression.evaluate(
                        forExtension.expression(), context, parentVisitor
                );

                // EvaluatedExpression should be a list
                if( evaluatedExpression.type != Variable.ARRAY ){
                    return 1;
                }

                // Now go through each element in array
                for( Value element : (Value[]) evaluatedExpression.value ){

                    // Define iterator variable
                    Variable variable = new Variable(
                            forExtension.IDENTIFIER().getText(),
                            element.type
                    );

                    // Set value to iterator
                    variable.setValue(element.value);

                    // Define variable
                    context.defineVariable(
                            forExtension.IDENTIFIER().getText(),
                            variable
                    );

                    // Execute loop body
                    int status = BlockHandler.handle(statementBody.block(), context, parentVisitor);
                    if( status != 0 ){
                        return status;
                    }
                }
            } else if( forExtension.BLIND() != null ){
                // Iterate n times, no care about iterator
                Value evaluatedExpression = Expression.evaluate(
                        forExtension.expression(), context, parentVisitor
                );

                // EvaluatedExpression should be an integer
                if( evaluatedExpression.type != Variable.INT ){
                    return 1;
                }

                // Now iterate n times
                for( int i = 0; i < (int) evaluatedExpression.value; i++ ){
                    // Execute loop body
                    int status = BlockHandler.handle(statementBody.block(), context, parentVisitor);
                    if( status != 0 ){
                        return status;
                    }
                }

            } else {
                // This should never happen
                return 1;
            }
        } else {
            // This should never happen
            return 1;
        }

        return 0;
    }
}
