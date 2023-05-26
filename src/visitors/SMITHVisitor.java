package src.visitors;

import src.gen.*;

public class SMITHVisitor<T> extends SMITHGrammarBaseVisitor<T> {
    DecisionVisitor decisionVisitor = new DecisionVisitor();
    DeclarationVisitor declarationVisitor = new DeclarationVisitor();
    ExpressionVisitor expressionVisitor = new ExpressionVisitor();

    ProgramVisitor programVisitor = new ProgramVisitor();
    LoopVisitor loopVisitor = new LoopVisitor();

    @Override
    public T visitDefinestatement(SMITHGrammarParser.DefinestatementContext ctx) {
        declarationVisitor.visitDeclaration(
                this,
                ctx
        );
        return (T)"Ola";
    }

    @Override
    public T visitProgram(SMITHGrammarParser.ProgramContext ctx){
        programVisitor.visitProgram(
            this, ctx
        );
    }
}