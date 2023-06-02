package src.utils.Statements;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.ContextManager;
import src.utils.Expression;
import src.utils.Expressions.Value;
import src.utils.Variable;

public class OutputStatement {

    public static int handle(
            ContextManager context,
            SMITHGrammarParser.OutputblockContext ctx,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle output definition
        SMITHGrammarParser.OutputextensionContext extension = ctx.outputextension();

        // Check if this is a print-case output
        if( extension.printtype() != null ){
            String type = extension.printtype().getText();
            // Get expression
            SMITHGrammarParser.ExpressionContext expression = extension.expression();
            // Evaluate expression
            Value value = Expression.evaluate(expression, context, parentVisitor);

            String printable = "";

            if( value.type == Variable.STRING ){
                printable = (String) value.value;
            } else if ( value.type == Variable.INT ) {
                printable = Integer.toString((Integer) value.value);
            } else if ( value.type == Variable.FLOAT ) {
                printable = Double.toString((Double) value.value);
            } else if ( value.type == Variable.BOOLEAN ) {
                printable = Boolean.toString((Boolean) value.value);
            }

            if( type.equals("println") ){
                // Print value
                System.out.println(printable);
            } else if( type.equals("print")) {
                // Print value
                System.out.print(printable);
            } else {
                // If it is an error
                return 1;
            }
        }

        return 0;
    }
}
