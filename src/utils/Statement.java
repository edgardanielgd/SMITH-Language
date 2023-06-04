package src.utils;
import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.utils.Statements.*;

// Useful class for representing statements saved in functions code
public class Statement {

    public static int handle(
            ContextManager context,
            SMITHGrammarParser.BlockContext ctx,
            SMITHGrammarVisitor parentVisitor
            ){
        // Handle statements definition

        // First lets check statement's type
        if( ctx != null && ctx.getChildCount() > 0 ){
            // Check if it isn't empty (epsilon case)
            if( ctx.decideblock() != null ){
                // If it is a decide block
                return DecideStatement.handle(context, ctx.decideblock(), parentVisitor);
            } else if( ctx.definestatement() != null ){
                // If it is a define statement
                return DefineStatement.handle(context, ctx.definestatement(), parentVisitor);
            } else if( ctx.functioncall() != null ){
                // If it is a function call
                return FunctionCallStatement.handle(context, ctx.functioncall(), parentVisitor);
            } else if( ctx.returnstatement() != null ){
                // If it is a return statement
                return ReturnStatement.handle(context, ctx.returnstatement(), parentVisitor);
            } else if( ctx.loopblock() != null ) {
                // If it is a loop block
                return LoopStatement.handle(context, ctx.loopblock(), parentVisitor);
            } else if( ctx.setstatement() != null ){
                // If it is an assignation
                return SetStatement.handle(context, ctx.setstatement(), parentVisitor);
            } else if( ctx.outputblock() != null ){
                // If it is an output block
                return OutputStatement.handle(context, ctx.outputblock(), parentVisitor);
            } else {
                // If it is an error
                return 1;
            }
        }
        return 0; // Maybe we can return errors in this way
    }
}