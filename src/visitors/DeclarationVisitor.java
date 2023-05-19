package src.visitors;
import src.gen.SMITHGrammarParser;
class DeclarationVisitor {
    public visitDeclaration(
            SMITHVisitor parentVisitor,
            SMITHGrammarParser.DeclarationContext ctx
    ) {
        System.out.println("ola");
    }
}