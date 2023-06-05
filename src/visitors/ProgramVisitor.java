package src.visitors;

import src.gen.SMITHGrammarVisitor;
import src.utils.BlockHandler;
import src.utils.Statement;
import src.gen.SMITHGrammarParser;
import src.utils.ContextManager;

// This visitor will create a new Declararation Statement
public class ProgramVisitor {
    public void visitProgram(
            SMITHGrammarVisitor parentVisitor,
            SMITHGrammarParser.ProgramContext ctx
    ) {
        System.out.println("SMITH (Simple Mathematical Interpreter for Technical Handling)");
        System.out.println("Jhonatan Steven Rodriguez Ibañez");
        System.out.println("Miguel Angel Puentes Cespedes");
        System.out.println("Edgar Daniel Gonzalez Diaz");

        // Initialize global context manager
        // This object will handle all of variables definition and check
        // their scope by means of a stack of contexts (HashMaps actually)
        ContextManager context = new ContextManager();

        BlockHandler.handle(
                ctx.block(),
                context,
                parentVisitor
        );

        System.out.println("\n[SMITH] Program finished successfully");
    }
}