// Generated from D:/UNALArchivo/Lenguajes de Programacion/SMITH/src/grammar\SMITHGrammar.g4 by ANTLR 4.12.0
package src.gen;
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
	 * Visit a parse tree produced by {@link SMITHGrammarParser#atomictype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomictype(SMITHGrammarParser.AtomictypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#variabletype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabletype(SMITHGrammarParser.VariabletypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#numberliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberliteral(SMITHGrammarParser.NumberliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#arrayliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayliteral(SMITHGrammarParser.ArrayliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#arrayelements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayelements(SMITHGrammarParser.ArrayelementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#furtherarrayelements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFurtherarrayelements(SMITHGrammarParser.FurtherarrayelementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#optionalinterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalinterval(SMITHGrammarParser.OptionalintervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#decideblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecideblock(SMITHGrammarParser.DecideblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#decisionextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecisionextension(SMITHGrammarParser.DecisionextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#decideprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecideprefix(SMITHGrammarParser.DecideprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#definestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinestatement(SMITHGrammarParser.DefinestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#defineextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineextension(SMITHGrammarParser.DefineextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#definedefaultvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedefaultvalue(SMITHGrammarParser.DefinedefaultvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#arrayextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayextension(SMITHGrammarParser.ArrayextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#dimensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensions(SMITHGrammarParser.DimensionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#furtherdimensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFurtherdimensions(SMITHGrammarParser.FurtherdimensionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#functiondefextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondefextension(SMITHGrammarParser.FunctiondefextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#defineprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineprefix(SMITHGrammarParser.DefineprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#loopblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopblock(SMITHGrammarParser.LoopblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#loopprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopprefix(SMITHGrammarParser.LoopprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#loopextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopextension(SMITHGrammarParser.LoopextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#repeattype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeattype(SMITHGrammarParser.RepeattypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#forextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForextension(SMITHGrammarParser.ForextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#rangeextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeextension(SMITHGrammarParser.RangeextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#outputblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputblock(SMITHGrammarParser.OutputblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#outputprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputprefix(SMITHGrammarParser.OutputprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#outputextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputextension(SMITHGrammarParser.OutputextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#printtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinttype(SMITHGrammarParser.PrinttypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#inputblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputblock(SMITHGrammarParser.InputblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#inputprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputprefix(SMITHGrammarParser.InputprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#inputextension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputextension(SMITHGrammarParser.InputextensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#statementbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementbody(SMITHGrammarParser.StatementbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(SMITHGrammarParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#functionblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionblock(SMITHGrammarParser.FunctionblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#functionarguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionarguments(SMITHGrammarParser.FunctionargumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SMITHGrammarParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#furtherarguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFurtherarguments(SMITHGrammarParser.FurtherargumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SMITHGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#expressionnc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionnc(SMITHGrammarParser.ExpressionncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#comparisonoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonoperator(SMITHGrammarParser.ComparisonoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SMITHGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#arrayitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayitem(SMITHGrammarParser.ArrayitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#arrayaccessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayaccessor(SMITHGrammarParser.ArrayaccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#furtherarrayaccessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFurtherarrayaccessor(SMITHGrammarParser.FurtherarrayaccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(SMITHGrammarParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#functioncallarguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncallarguments(SMITHGrammarParser.FunctioncallargumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#callarguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallarguments(SMITHGrammarParser.CallargumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#furthercallarguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFurthercallarguments(SMITHGrammarParser.FurthercallargumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(SMITHGrammarParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#setstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetstatement(SMITHGrammarParser.SetstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMITHGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SMITHGrammarParser.BlockContext ctx);
}