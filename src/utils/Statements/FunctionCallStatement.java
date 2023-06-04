package src.utils.Statements;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.ContextManager;
import src.utils.Error;
import src.utils.Function;
import src.utils.Variable;

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
        Variable functionVar = context.searchVariable(functionName);

        // Search function in context
        if( functionVar == null ){
            // Function not found
            Error.throwError(
                    "Function " + functionName + " not found",
                    ctx
            );
            return 1;
        }

        // Check if that var is a function
        if( functionVar.value.type != Variable.FUNCTION ){
            // This is not a function
            Error.throwError(
                    "Function " + functionName + " is not a function",
                    ctx
            );
            return 1;
        }

        // Get actual function
        Function function = (Function) functionVar.value;

        // Reset context return value
        context.setReturnValue(null);

        // Get function arguments
        SMITHGrammarParser.FunctioncallargumentsContext arguments = ctx.functioncallarguments();

        // Call function
        return function.call(parentVisitor, context, arguments );
    }
}
