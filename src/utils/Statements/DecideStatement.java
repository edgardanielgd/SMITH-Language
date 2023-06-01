package src.utils.Statements;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.*;
import src.utils.Expressions.Value;

public class DecideStatement {

    public static int handle(
            ContextManager context,
            SMITHGrammarParser.DecideblockContext ctx,
            SMITHGrammarVisitor parentVisitor
            ){
        // Handle if definition

        // Get conditional and its expression
        SMITHGrammarParser.ConditionalContext conditional = ctx.conditional();
        SMITHGrammarParser.ExpressionContext expression = conditional.expression();

        // Evaluate expression
        Value evaluatedExpression = Expression.evaluate(expression, context, parentVisitor);
        SMITHGrammarParser.StatementbodyContext statementBody = ctx.statementbody();

        while(
            evaluatedExpression.type == Variable.BOOLEAN &&
            ! ((boolean) evaluatedExpression.value)
        ){
            // We haven't gotten a true value yet
            // Evaluate next conditional
            SMITHGrammarParser.DecisionextensionContext decisionExtension =
                    ctx.decisionextension();
            if( decisionExtension == null ){
                // No more conditionals to evaluate
                return 0;
            }

            // Get next conditional
            if( decisionExtension.IFNOT() != null ){
                // This is an else if case
                conditional = decisionExtension.conditional();
                expression = conditional.expression();

                // Evaluate expression
                evaluatedExpression = Expression.evaluate(expression, context, parentVisitor);
                statementBody = decisionExtension.statementbody();
            } else {
                // This is an else case
                statementBody = decisionExtension.statementbody();
                break;
            }
        }

        // Check if body is null

        // Now statementBody has the body to execute
        // Execute it

        BlockHandler.handle(statementBody.block(), context, parentVisitor);

        return 0;
    }
}
