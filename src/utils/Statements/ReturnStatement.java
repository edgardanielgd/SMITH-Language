package src.utils.Statements;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.ContextManager;
import src.utils.Expression;
import src.utils.Expressions.Value;

public class ReturnStatement {

    public static int handle(
            ContextManager context,
            SMITHGrammarParser.ReturnstatementContext ctx,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle return definition

        // Get expression
        SMITHGrammarParser.ExpressionContext expression = ctx.expression();

        // Evaluate expression
        Value value = Expression.evaluate(expression, context, parentVisitor);

        // Set return value
        context.setReturnValue(value);

        return -1;
    }
}
