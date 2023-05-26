package src.visitors;

import src.gen.SMITHGrammarParser;

// This visitor will create a new Declararation Statement
public class ProgramVisitor {
    public void visitProgram(
            SMITHVisitor parentVisitor,
            SMITHGrammarParser.ProgramContext ctx
    ) {
        System.out.println("SMITH (Structured Maths Interface and Transformation Hyperproccesor");
        System.out.println("Edgar Daniel Gonzalez Diaz");
        System.out.println("Jhonatan Steven Rodriguez Ibañez");
        System.out.println("Edgar Daniel Gonzalez Diaz");
    }
}