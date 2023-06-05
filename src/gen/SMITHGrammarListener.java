// Generated from D:/UNALArchivo/Lenguajes de Programacion/SMITH/src/grammar\SMITHGrammar.g4 by ANTLR 4.12.0
package src.gen;
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
	 * Enter a parse tree produced by {@link SMITHGrammarParser#atomictype}.
	 * @param ctx the parse tree
	 */
	void enterAtomictype(SMITHGrammarParser.AtomictypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#atomictype}.
	 * @param ctx the parse tree
	 */
	void exitAtomictype(SMITHGrammarParser.AtomictypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#variabletype}.
	 * @param ctx the parse tree
	 */
	void enterVariabletype(SMITHGrammarParser.VariabletypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#variabletype}.
	 * @param ctx the parse tree
	 */
	void exitVariabletype(SMITHGrammarParser.VariabletypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#numberliteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberliteral(SMITHGrammarParser.NumberliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#numberliteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberliteral(SMITHGrammarParser.NumberliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#arrayliteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayliteral(SMITHGrammarParser.ArrayliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#arrayliteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayliteral(SMITHGrammarParser.ArrayliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#arrayelements}.
	 * @param ctx the parse tree
	 */
	void enterArrayelements(SMITHGrammarParser.ArrayelementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#arrayelements}.
	 * @param ctx the parse tree
	 */
	void exitArrayelements(SMITHGrammarParser.ArrayelementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#furtherarrayelements}.
	 * @param ctx the parse tree
	 */
	void enterFurtherarrayelements(SMITHGrammarParser.FurtherarrayelementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#furtherarrayelements}.
	 * @param ctx the parse tree
	 */
	void exitFurtherarrayelements(SMITHGrammarParser.FurtherarrayelementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#optionalinterval}.
	 * @param ctx the parse tree
	 */
	void enterOptionalinterval(SMITHGrammarParser.OptionalintervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#optionalinterval}.
	 * @param ctx the parse tree
	 */
	void exitOptionalinterval(SMITHGrammarParser.OptionalintervalContext ctx);
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
	 * Enter a parse tree produced by {@link SMITHGrammarParser#decisionextension}.
	 * @param ctx the parse tree
	 */
	void enterDecisionextension(SMITHGrammarParser.DecisionextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#decisionextension}.
	 * @param ctx the parse tree
	 */
	void exitDecisionextension(SMITHGrammarParser.DecisionextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#decideprefix}.
	 * @param ctx the parse tree
	 */
	void enterDecideprefix(SMITHGrammarParser.DecideprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#decideprefix}.
	 * @param ctx the parse tree
	 */
	void exitDecideprefix(SMITHGrammarParser.DecideprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#definestatement}.
	 * @param ctx the parse tree
	 */
	void enterDefinestatement(SMITHGrammarParser.DefinestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#definestatement}.
	 * @param ctx the parse tree
	 */
	void exitDefinestatement(SMITHGrammarParser.DefinestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#defineextension}.
	 * @param ctx the parse tree
	 */
	void enterDefineextension(SMITHGrammarParser.DefineextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#defineextension}.
	 * @param ctx the parse tree
	 */
	void exitDefineextension(SMITHGrammarParser.DefineextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#definedefaultvalue}.
	 * @param ctx the parse tree
	 */
	void enterDefinedefaultvalue(SMITHGrammarParser.DefinedefaultvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#definedefaultvalue}.
	 * @param ctx the parse tree
	 */
	void exitDefinedefaultvalue(SMITHGrammarParser.DefinedefaultvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#arrayextension}.
	 * @param ctx the parse tree
	 */
	void enterArrayextension(SMITHGrammarParser.ArrayextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#arrayextension}.
	 * @param ctx the parse tree
	 */
	void exitArrayextension(SMITHGrammarParser.ArrayextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(SMITHGrammarParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(SMITHGrammarParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#furtherdimensions}.
	 * @param ctx the parse tree
	 */
	void enterFurtherdimensions(SMITHGrammarParser.FurtherdimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#furtherdimensions}.
	 * @param ctx the parse tree
	 */
	void exitFurtherdimensions(SMITHGrammarParser.FurtherdimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#functiondefextension}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefextension(SMITHGrammarParser.FunctiondefextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#functiondefextension}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefextension(SMITHGrammarParser.FunctiondefextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#defineprefix}.
	 * @param ctx the parse tree
	 */
	void enterDefineprefix(SMITHGrammarParser.DefineprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#defineprefix}.
	 * @param ctx the parse tree
	 */
	void exitDefineprefix(SMITHGrammarParser.DefineprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#loopblock}.
	 * @param ctx the parse tree
	 */
	void enterLoopblock(SMITHGrammarParser.LoopblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#loopblock}.
	 * @param ctx the parse tree
	 */
	void exitLoopblock(SMITHGrammarParser.LoopblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#loopprefix}.
	 * @param ctx the parse tree
	 */
	void enterLoopprefix(SMITHGrammarParser.LoopprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#loopprefix}.
	 * @param ctx the parse tree
	 */
	void exitLoopprefix(SMITHGrammarParser.LoopprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#loopextension}.
	 * @param ctx the parse tree
	 */
	void enterLoopextension(SMITHGrammarParser.LoopextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#loopextension}.
	 * @param ctx the parse tree
	 */
	void exitLoopextension(SMITHGrammarParser.LoopextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#repeattype}.
	 * @param ctx the parse tree
	 */
	void enterRepeattype(SMITHGrammarParser.RepeattypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#repeattype}.
	 * @param ctx the parse tree
	 */
	void exitRepeattype(SMITHGrammarParser.RepeattypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#forextension}.
	 * @param ctx the parse tree
	 */
	void enterForextension(SMITHGrammarParser.ForextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#forextension}.
	 * @param ctx the parse tree
	 */
	void exitForextension(SMITHGrammarParser.ForextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#rangeextension}.
	 * @param ctx the parse tree
	 */
	void enterRangeextension(SMITHGrammarParser.RangeextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#rangeextension}.
	 * @param ctx the parse tree
	 */
	void exitRangeextension(SMITHGrammarParser.RangeextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#outputblock}.
	 * @param ctx the parse tree
	 */
	void enterOutputblock(SMITHGrammarParser.OutputblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#outputblock}.
	 * @param ctx the parse tree
	 */
	void exitOutputblock(SMITHGrammarParser.OutputblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#outputprefix}.
	 * @param ctx the parse tree
	 */
	void enterOutputprefix(SMITHGrammarParser.OutputprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#outputprefix}.
	 * @param ctx the parse tree
	 */
	void exitOutputprefix(SMITHGrammarParser.OutputprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#outputextension}.
	 * @param ctx the parse tree
	 */
	void enterOutputextension(SMITHGrammarParser.OutputextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#outputextension}.
	 * @param ctx the parse tree
	 */
	void exitOutputextension(SMITHGrammarParser.OutputextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#printtype}.
	 * @param ctx the parse tree
	 */
	void enterPrinttype(SMITHGrammarParser.PrinttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#printtype}.
	 * @param ctx the parse tree
	 */
	void exitPrinttype(SMITHGrammarParser.PrinttypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#inputblock}.
	 * @param ctx the parse tree
	 */
	void enterInputblock(SMITHGrammarParser.InputblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#inputblock}.
	 * @param ctx the parse tree
	 */
	void exitInputblock(SMITHGrammarParser.InputblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#inputprefix}.
	 * @param ctx the parse tree
	 */
	void enterInputprefix(SMITHGrammarParser.InputprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#inputprefix}.
	 * @param ctx the parse tree
	 */
	void exitInputprefix(SMITHGrammarParser.InputprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#inputextension}.
	 * @param ctx the parse tree
	 */
	void enterInputextension(SMITHGrammarParser.InputextensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#inputextension}.
	 * @param ctx the parse tree
	 */
	void exitInputextension(SMITHGrammarParser.InputextensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#statementbody}.
	 * @param ctx the parse tree
	 */
	void enterStatementbody(SMITHGrammarParser.StatementbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#statementbody}.
	 * @param ctx the parse tree
	 */
	void exitStatementbody(SMITHGrammarParser.StatementbodyContext ctx);
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
	 * Enter a parse tree produced by {@link SMITHGrammarParser#functionblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionblock(SMITHGrammarParser.FunctionblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#functionblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionblock(SMITHGrammarParser.FunctionblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#functionarguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionarguments(SMITHGrammarParser.FunctionargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#functionarguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionarguments(SMITHGrammarParser.FunctionargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SMITHGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SMITHGrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#furtherarguments}.
	 * @param ctx the parse tree
	 */
	void enterFurtherarguments(SMITHGrammarParser.FurtherargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#furtherarguments}.
	 * @param ctx the parse tree
	 */
	void exitFurtherarguments(SMITHGrammarParser.FurtherargumentsContext ctx);
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
	 * Enter a parse tree produced by {@link SMITHGrammarParser#expressionnc}.
	 * @param ctx the parse tree
	 */
	void enterExpressionnc(SMITHGrammarParser.ExpressionncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#expressionnc}.
	 * @param ctx the parse tree
	 */
	void exitExpressionnc(SMITHGrammarParser.ExpressionncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#comparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonoperator(SMITHGrammarParser.ComparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#comparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonoperator(SMITHGrammarParser.ComparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SMITHGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SMITHGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#arrayitem}.
	 * @param ctx the parse tree
	 */
	void enterArrayitem(SMITHGrammarParser.ArrayitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#arrayitem}.
	 * @param ctx the parse tree
	 */
	void exitArrayitem(SMITHGrammarParser.ArrayitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#arrayaccessor}.
	 * @param ctx the parse tree
	 */
	void enterArrayaccessor(SMITHGrammarParser.ArrayaccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#arrayaccessor}.
	 * @param ctx the parse tree
	 */
	void exitArrayaccessor(SMITHGrammarParser.ArrayaccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#furtherarrayaccessor}.
	 * @param ctx the parse tree
	 */
	void enterFurtherarrayaccessor(SMITHGrammarParser.FurtherarrayaccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#furtherarrayaccessor}.
	 * @param ctx the parse tree
	 */
	void exitFurtherarrayaccessor(SMITHGrammarParser.FurtherarrayaccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(SMITHGrammarParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(SMITHGrammarParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#functioncallarguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncallarguments(SMITHGrammarParser.FunctioncallargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#functioncallarguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncallarguments(SMITHGrammarParser.FunctioncallargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#callarguments}.
	 * @param ctx the parse tree
	 */
	void enterCallarguments(SMITHGrammarParser.CallargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#callarguments}.
	 * @param ctx the parse tree
	 */
	void exitCallarguments(SMITHGrammarParser.CallargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#furthercallarguments}.
	 * @param ctx the parse tree
	 */
	void enterFurthercallarguments(SMITHGrammarParser.FurthercallargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#furthercallarguments}.
	 * @param ctx the parse tree
	 */
	void exitFurthercallarguments(SMITHGrammarParser.FurthercallargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(SMITHGrammarParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(SMITHGrammarParser.ReturnstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMITHGrammarParser#setstatement}.
	 * @param ctx the parse tree
	 */
	void enterSetstatement(SMITHGrammarParser.SetstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMITHGrammarParser#setstatement}.
	 * @param ctx the parse tree
	 */
	void exitSetstatement(SMITHGrammarParser.SetstatementContext ctx);
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