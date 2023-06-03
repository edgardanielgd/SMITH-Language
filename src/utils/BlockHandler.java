package src.utils;

import src.gen.SMITHGrammarParser;
import src.gen.SMITHGrammarVisitor;
import src.visitors.SMITHVisitor;

public class BlockHandler {

    public static int handle(
            SMITHGrammarParser.BlockContext ctx,
            ContextManager context,
            SMITHGrammarVisitor parentVisitor
    ){
        // Push a new block into context
        context.push();

        int status = 0;
        System.out.println("BlockHandler");

        // Visit statements on parent, all recursion start from here
        SMITHGrammarParser.BlockContext currentStatement = ctx;
        while( currentStatement != null ) {


            status = Statement.handle(
                    context,
                    currentStatement,
                    parentVisitor
            );

            if( status == -1 ){
                break;
            }

            if( status != 0 ){
                // Something went wrong
                break;
            }

            currentStatement = currentStatement.block();
        }

        // Pop last remaining block after finishing all of these things
        context.pop();
        return status;
    }
}
