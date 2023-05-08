// Generated from D:/UNAL Archivo/Lenguajes de Programación/SMITH/grammar\SMITHGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SMITHGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SMITHGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SMITHGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#decideblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecideblock(SMITHGrammarParser.DecideblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#decideargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecideargs(SMITHGrammarParser.DecideargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(SMITHGrammarParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SMITHGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SMITHGrammarParser.BlockContext ctx);
}