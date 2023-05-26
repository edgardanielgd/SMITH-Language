package src.visitors;

import src.gen.SMITHGrammarParser;
import src.utils.Statements.DeclarationStatement;

// This visitor will create a new Declararation Statement
public class DeclarationVisitor {
    public void visitDeclaration(
            SMITHVisitor parentVisitor,
            SMITHGrammarParser.DefinestatementContext ctx
    ) {
        System.out.println("ola");
    }
}