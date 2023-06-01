package src.utils.Statements;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.ContextManager;
import src.utils.Function;

public class FunctionCallStatement {

    public static int handle(
            ContextManager context,
            SMITHGrammarParser.FunctioncallContext ctx,
            SMITHGrammarVisitor parentVisitor
    ){
        // Handle function call

        // Get function name
        String functionName = ctx.IDENTIFIER().getText();

        // Get function
        Function function = (Function) context.searchVariable(functionName);

        // Search function in context
        if( function == null ){
            // Function not found
            return 1;
        }

        // Reset context return value
        context.setReturnValue(null);

        // Get function arguments
        SMITHGrammarParser.FunctionargumentsContext arguments = ctx.functionarguments();

        // Call function
        function.call(parentVisitor, context, arguments);

        return 0;
    }
}
