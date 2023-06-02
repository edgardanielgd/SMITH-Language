package src.visitors;

import src.gen.SMITHGrammarParser;

// This visitor will create a new Declararation Statement
public class DeclarationVisitor {
    public void visitDeclaration(
            SMITHVisitor parentVisitor,
            SMITHGrammarParser.DefinestatementContext ctx
    ) {
        System.out.println("ola");
    }
}