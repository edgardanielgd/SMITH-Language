package src.visitors;
import src.gen.*;

public class SMITHVisitor<T> extends SMITHGrammarBaseVisitor<T> {
    DecisionVisitor decisionVisitor = new DecisionVisitor();
    DeclarationVisitor declarationVisitor = new DeclarationVisitor();
    ExpressionVisitor expressionVisitor = new ExpressionVisitor();
    LoopVisitor loopVisitor = new LoopVisitor();

    @Override public T visitDefinestatement(SMITHGrammarParser.DefinestatementContext ctx) {
        declarationVisitor.visitDeclaration(
                this,
                ctx.declaration()
        );
        return visitChildren(ctx);
    }
}