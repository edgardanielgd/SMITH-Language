// Generated from D:/UNAL Archivo/Lenguajes de Programación/SMITH/grammar\SMITHGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SMITHGrammarParser}.
 */
public interface SMITHGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SMITHGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SMITHGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#decideblock}.
	 * @param ctx the parse tree
	 */
	void enterDecideblock(SMITHGrammarParser.DecideblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#decideblock}.
	 * @param ctx the parse tree
	 */
	void exitDecideblock(SMITHGrammarParser.DecideblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#decideargs}.
	 * @param ctx the parse tree
	 */
	void enterDecideargs(SMITHGrammarParser.DecideargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#decideargs}.
	 * @param ctx the parse tree
	 */
	void exitDecideargs(SMITHGrammarParser.DecideargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(SMITHGrammarParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(SMITHGrammarParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SMITHGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SMITHGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SMITHGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SMITHGrammarParser.BlockContext ctx);
}