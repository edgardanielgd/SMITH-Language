package src.visitors;

import src.gen.*;

public class SMITHVisitor<T> extends SMITHGrammarBaseVisitor<T> {

    ProgramVisitor programVisitor = new ProgramVisitor();

    @Override
    public T visitProgram(SMITHGrammarParser.ProgramContext ctx){
        programVisitor.visitProgram(
            this, ctx
        );
        return null;
    }
}