// Generated from D:/UNALArchivo/Lenguajes de Programacion/SMITH/src/grammar\SMITHGrammar.g4 by ANTLR 4.12.0
package src.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SMITHGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, SEMICOLON=2, COMMA=3, DOT=4, EQUAL=5, PLUS=6, MINUS=7, TIMES=8, 
		DIVIDE=9, MOD=10, AND=11, OR=12, NOT=13, LESS=14, GREATER=15, LESS_EQUAL=16, 
		GREATER_EQUAL=17, EQUAL_EQUAL=18, NOT_EQUAL=19, ASSIGN=20, OPEN_PAREN=21, 
		CLOSE_PAREN=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, OPEN_BRACE=25, CLOSE_BRACE=26, 
		INTEGER_LITERAL=27, FLOAT_LITERAL=28, STRING_LITERAL=29, BOOLEAN_LITERAL=30, 
		DECIDE=31, IF=32, IFNOT=33, DEFAULT=34, CALL=35, LOOP=36, REPEAT=37, UNTIL=38, 
		WHILE=39, FOR=40, EACH=41, IN=42, BLIND=43, DEFINE=44, INT=45, FLOAT=46, 
		ARRAY=47, NUMBER=48, STRING=49, BOOL=50, FUNCTION=51, TYPE=52, OUTPUT=53, 
		PRINT=54, PRINTLN=55, WRITEFILE=56, PLOT=57, INPUT=58, READFILE=59, READCONSOLE=60, 
		SET=61, RETURN=62, IDENTIFIER=63, WS=64, COMMENT=65, A=66, S=67;
	public static final int
		RULE_program = 0, RULE_atomictype = 1, RULE_variabletype = 2, RULE_numberliteral = 3, 
		RULE_arrayliteral = 4, RULE_arrayelements = 5, RULE_furtherarrayelements = 6, 
		RULE_decideblock = 7, RULE_decisionextension = 8, RULE_decideprefix = 9, 
		RULE_definestatement = 10, RULE_defineextension = 11, RULE_definedefaultvalue = 12, 
		RULE_arrayextension = 13, RULE_dimensions = 14, RULE_furtherdimensions = 15, 
		RULE_functiondefextension = 16, RULE_defineprefix = 17, RULE_loopblock = 18, 
		RULE_loopprefix = 19, RULE_loopextension = 20, RULE_repeattype = 21, RULE_forextension = 22, 
		RULE_rangeextension = 23, RULE_outputblock = 24, RULE_outputprefix = 25, 
		RULE_outputextension = 26, RULE_printtype = 27, RULE_statementbody = 28, 
		RULE_conditional = 29, RULE_functionblock = 30, RULE_functionarguments = 31, 
		RULE_arguments = 32, RULE_furtherarguments = 33, RULE_expression = 34, 
		RULE_expressionnc = 35, RULE_logicaloperator = 36, RULE_comparisonoperator = 37, 
		RULE_literal = 38, RULE_functioncall = 39, RULE_functioncallarguments = 40, 
		RULE_callarguments = 41, RULE_furthercallarguments = 42, RULE_returnstatement = 43, 
		RULE_block = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "atomictype", "variabletype", "numberliteral", "arrayliteral", 
			"arrayelements", "furtherarrayelements", "decideblock", "decisionextension", 
			"decideprefix", "definestatement", "defineextension", "definedefaultvalue", 
			"arrayextension", "dimensions", "furtherdimensions", "functiondefextension", 
			"defineprefix", "loopblock", "loopprefix", "loopextension", "repeattype", 
			"forextension", "rangeextension", "outputblock", "outputprefix", "outputextension", 
			"printtype", "statementbody", "conditional", "functionblock", "functionarguments", 
			"arguments", "furtherarguments", "expression", "expressionnc", "logicaloperator", 
			"comparisonoperator", "literal", "functioncall", "functioncallarguments", 
			"callarguments", "furthercallarguments", "returnstatement", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "','", "'.'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&'", "'|'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'as'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, null, 
			"'decide'", "'if'", "'ifnot'", "'default'", "'call'", "'loop'", "'repeat'", 
			"'until'", "'while'", "'for'", "'each'", "'in'", "'noiterator'", "'define'", 
			"'int'", "'float'", "'array'", null, "'string'", "'bool'", "'function'", 
			"'type'", "'output'", "'print'", "'println'", "'writefile'", "'plot'", 
			"'input'", "'readfile'", "'readconsole'", "'set'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SEMICOLON", "COMMA", "DOT", "EQUAL", "PLUS", "MINUS", 
			"TIMES", "DIVIDE", "MOD", "AND", "OR", "NOT", "LESS", "GREATER", "LESS_EQUAL", 
			"GREATER_EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", "ASSIGN", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", 
			"INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
			"DECIDE", "IF", "IFNOT", "DEFAULT", "CALL", "LOOP", "REPEAT", "UNTIL", 
			"WHILE", "FOR", "EACH", "IN", "BLIND", "DEFINE", "INT", "FLOAT", "ARRAY", 
			"NUMBER", "STRING", "BOOL", "FUNCTION", "TYPE", "OUTPUT", "PRINT", "PRINTLN", 
			"WRITEFILE", "PLOT", "INPUT", "READFILE", "READCONSOLE", "SET", "RETURN", 
			"IDENTIFIER", "WS", "COMMENT", "A", "S"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SMITHGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SMITHGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SMITHGrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			block();
			setState(91);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomictypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SMITHGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SMITHGrammarParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(SMITHGrammarParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(SMITHGrammarParser.STRING, 0); }
		public TerminalNode ARRAY() { return getToken(SMITHGrammarParser.ARRAY, 0); }
		public AtomictypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomictype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterAtomictype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitAtomictype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitAtomictype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomictypeContext atomictype() throws RecognitionException {
		AtomictypeContext _localctx = new AtomictypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atomictype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1935140464885760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariabletypeContext extends ParserRuleContext {
		public AtomictypeContext atomictype() {
			return getRuleContext(AtomictypeContext.class,0);
		}
		public VariabletypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabletype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterVariabletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitVariabletype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitVariabletype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabletypeContext variabletype() throws RecognitionException {
		VariabletypeContext _localctx = new VariabletypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variabletype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			atomictype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberliteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(SMITHGrammarParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(SMITHGrammarParser.FLOAT_LITERAL, 0); }
		public NumberliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterNumberliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitNumberliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitNumberliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberliteralContext numberliteral() throws RecognitionException {
		NumberliteralContext _localctx = new NumberliteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numberliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_LITERAL || _la==FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayliteralContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SMITHGrammarParser.OPEN_BRACKET, 0); }
		public ArrayelementsContext arrayelements() {
			return getRuleContext(ArrayelementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SMITHGrammarParser.CLOSE_BRACKET, 0); }
		public ArrayliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterArrayliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitArrayliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitArrayliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayliteralContext arrayliteral() throws RecognitionException {
		ArrayliteralContext _localctx = new ArrayliteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(OPEN_BRACKET);
			setState(100);
			arrayelements();
			setState(101);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayelementsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FurtherarrayelementsContext furtherarrayelements() {
			return getRuleContext(FurtherarrayelementsContext.class,0);
		}
		public ArrayelementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayelements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterArrayelements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitArrayelements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitArrayelements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayelementsContext arrayelements() throws RecognitionException {
		ArrayelementsContext _localctx = new ArrayelementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayelements);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case CALL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				expression(0);
				setState(104);
				furtherarrayelements();
				}
				break;
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FurtherarrayelementsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SMITHGrammarParser.COMMA, 0); }
		public ArrayelementsContext arrayelements() {
			return getRuleContext(ArrayelementsContext.class,0);
		}
		public FurtherarrayelementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_furtherarrayelements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFurtherarrayelements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFurtherarrayelements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFurtherarrayelements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FurtherarrayelementsContext furtherarrayelements() throws RecognitionException {
		FurtherarrayelementsContext _localctx = new FurtherarrayelementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_furtherarrayelements);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(COMMA);
				setState(110);
				arrayelements();
				}
				break;
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecideblockContext extends ParserRuleContext {
		public DecideprefixContext decideprefix() {
			return getRuleContext(DecideprefixContext.class,0);
		}
		public TerminalNode IF() { return getToken(SMITHGrammarParser.IF, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public StatementbodyContext statementbody() {
			return getRuleContext(StatementbodyContext.class,0);
		}
		public DecisionextensionContext decisionextension() {
			return getRuleContext(DecisionextensionContext.class,0);
		}
		public DecideblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decideblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDecideblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDecideblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDecideblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecideblockContext decideblock() throws RecognitionException {
		DecideblockContext _localctx = new DecideblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decideblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			decideprefix();
			setState(115);
			match(IF);
			setState(116);
			conditional();
			setState(117);
			statementbody();
			setState(118);
			decisionextension();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecisionextensionContext extends ParserRuleContext {
		public DecideprefixContext decideprefix() {
			return getRuleContext(DecideprefixContext.class,0);
		}
		public TerminalNode IFNOT() { return getToken(SMITHGrammarParser.IFNOT, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public StatementbodyContext statementbody() {
			return getRuleContext(StatementbodyContext.class,0);
		}
		public DecisionextensionContext decisionextension() {
			return getRuleContext(DecisionextensionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SMITHGrammarParser.DEFAULT, 0); }
		public DecisionextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisionextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDecisionextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDecisionextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDecisionextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecisionextensionContext decisionextension() throws RecognitionException {
		DecisionextensionContext _localctx = new DecisionextensionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decisionextension);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				decideprefix();
				setState(121);
				match(IFNOT);
				setState(122);
				conditional();
				setState(123);
				statementbody();
				setState(124);
				decisionextension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				decideprefix();
				setState(127);
				match(DEFAULT);
				setState(128);
				statementbody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecideprefixContext extends ParserRuleContext {
		public TerminalNode DECIDE() { return getToken(SMITHGrammarParser.DECIDE, 0); }
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public DecideprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decideprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDecideprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDecideprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDecideprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecideprefixContext decideprefix() throws RecognitionException {
		DecideprefixContext _localctx = new DecideprefixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decideprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(DECIDE);
			setState(134);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinestatementContext extends ParserRuleContext {
		public DefineprefixContext defineprefix() {
			return getRuleContext(DefineprefixContext.class,0);
		}
		public DefineextensionContext defineextension() {
			return getRuleContext(DefineextensionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SMITHGrammarParser.SEMICOLON, 0); }
		public DefinestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDefinestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDefinestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDefinestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinestatementContext definestatement() throws RecognitionException {
		DefinestatementContext _localctx = new DefinestatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_definestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			defineprefix();
			setState(137);
			defineextension();
			setState(138);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefineextensionContext extends ParserRuleContext {
		public AtomictypeContext atomictype() {
			return getRuleContext(AtomictypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public DefinedefaultvalueContext definedefaultvalue() {
			return getRuleContext(DefinedefaultvalueContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(SMITHGrammarParser.FUNCTION, 0); }
		public FunctiondefextensionContext functiondefextension() {
			return getRuleContext(FunctiondefextensionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SMITHGrammarParser.ASSIGN, 0); }
		public FunctionblockContext functionblock() {
			return getRuleContext(FunctionblockContext.class,0);
		}
		public DefineextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDefineextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDefineextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDefineextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineextensionContext defineextension() throws RecognitionException {
		DefineextensionContext _localctx = new DefineextensionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defineextension);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ARRAY:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				atomictype();
				setState(141);
				match(IDENTIFIER);
				setState(142);
				definedefaultvalue();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(FUNCTION);
				setState(145);
				functiondefextension();
				setState(146);
				match(IDENTIFIER);
				setState(147);
				match(ASSIGN);
				setState(148);
				functionblock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinedefaultvalueContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SMITHGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefinedefaultvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedefaultvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDefinedefaultvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDefinedefaultvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDefinedefaultvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinedefaultvalueContext definedefaultvalue() throws RecognitionException {
		DefinedefaultvalueContext _localctx = new DefinedefaultvalueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_definedefaultvalue);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ASSIGN);
				setState(153);
				expression(0);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayextensionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SMITHGrammarParser.OPEN_BRACKET, 0); }
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SMITHGrammarParser.CLOSE_BRACKET, 0); }
		public ArrayextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterArrayextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitArrayextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitArrayextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayextensionContext arrayextension() throws RecognitionException {
		ArrayextensionContext _localctx = new ArrayextensionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayextension);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(OPEN_BRACKET);
				setState(158);
				dimensions();
				setState(159);
				match(CLOSE_BRACKET);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionsContext extends ParserRuleContext {
		public NumberliteralContext numberliteral() {
			return getRuleContext(NumberliteralContext.class,0);
		}
		public FurtherdimensionsContext furtherdimensions() {
			return getRuleContext(FurtherdimensionsContext.class,0);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDimensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDimensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dimensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			numberliteral();
			setState(165);
			furtherdimensions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FurtherdimensionsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SMITHGrammarParser.COMMA, 0); }
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public FurtherdimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_furtherdimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFurtherdimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFurtherdimensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFurtherdimensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FurtherdimensionsContext furtherdimensions() throws RecognitionException {
		FurtherdimensionsContext _localctx = new FurtherdimensionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_furtherdimensions);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(COMMA);
				setState(168);
				dimensions();
				}
				break;
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctiondefextensionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public AtomictypeContext atomictype() {
			return getRuleContext(AtomictypeContext.class,0);
		}
		public FunctiondefextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFunctiondefextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFunctiondefextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFunctiondefextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefextensionContext functiondefextension() throws RecognitionException {
		FunctiondefextensionContext _localctx = new FunctiondefextensionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functiondefextension);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(COLON);
				setState(173);
				atomictype();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefineprefixContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SMITHGrammarParser.DEFINE, 0); }
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public DefineprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDefineprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDefineprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDefineprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineprefixContext defineprefix() throws RecognitionException {
		DefineprefixContext _localctx = new DefineprefixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defineprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(DEFINE);
			setState(178);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopblockContext extends ParserRuleContext {
		public LoopprefixContext loopprefix() {
			return getRuleContext(LoopprefixContext.class,0);
		}
		public LoopextensionContext loopextension() {
			return getRuleContext(LoopextensionContext.class,0);
		}
		public LoopblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterLoopblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitLoopblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitLoopblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopblockContext loopblock() throws RecognitionException {
		LoopblockContext _localctx = new LoopblockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loopblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			loopprefix();
			setState(181);
			loopextension();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopprefixContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(SMITHGrammarParser.LOOP, 0); }
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public LoopprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterLoopprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitLoopprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitLoopprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopprefixContext loopprefix() throws RecognitionException {
		LoopprefixContext _localctx = new LoopprefixContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loopprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(LOOP);
			setState(184);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopextensionContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(SMITHGrammarParser.REPEAT, 0); }
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public RepeattypeContext repeattype() {
			return getRuleContext(RepeattypeContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public StatementbodyContext statementbody() {
			return getRuleContext(StatementbodyContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SMITHGrammarParser.FOR, 0); }
		public ForextensionContext forextension() {
			return getRuleContext(ForextensionContext.class,0);
		}
		public LoopextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterLoopextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitLoopextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitLoopextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopextensionContext loopextension() throws RecognitionException {
		LoopextensionContext _localctx = new LoopextensionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopextension);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(REPEAT);
				setState(187);
				match(COLON);
				setState(188);
				repeattype();
				setState(189);
				conditional();
				setState(190);
				statementbody();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(FOR);
				setState(193);
				match(COLON);
				setState(194);
				forextension();
				setState(195);
				statementbody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeattypeContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(SMITHGrammarParser.UNTIL, 0); }
		public TerminalNode WHILE() { return getToken(SMITHGrammarParser.WHILE, 0); }
		public RepeattypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeattype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterRepeattype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitRepeattype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitRepeattype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeattypeContext repeattype() throws RecognitionException {
		RepeattypeContext _localctx = new RepeattypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_repeattype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==UNTIL || _la==WHILE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForextensionContext extends ParserRuleContext {
		public TerminalNode EACH() { return getToken(SMITHGrammarParser.EACH, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SMITHGrammarParser.OPEN_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(SMITHGrammarParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public TerminalNode BLIND() { return getToken(SMITHGrammarParser.BLIND, 0); }
		public ForextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterForextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitForextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitForextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForextensionContext forextension() throws RecognitionException {
		ForextensionContext _localctx = new ForextensionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forextension);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EACH:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(EACH);
				setState(202);
				match(OPEN_BRACE);
				setState(203);
				match(IDENTIFIER);
				setState(204);
				match(IN);
				setState(205);
				expression(0);
				setState(206);
				match(CLOSE_BRACE);
				}
				break;
			case BLIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(BLIND);
				setState(209);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeextensionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterRangeextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitRangeextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitRangeextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeextensionContext rangeextension() throws RecognitionException {
		RangeextensionContext _localctx = new RangeextensionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rangeextension);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(COLON);
				setState(213);
				expression(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputblockContext extends ParserRuleContext {
		public OutputprefixContext outputprefix() {
			return getRuleContext(OutputprefixContext.class,0);
		}
		public OutputextensionContext outputextension() {
			return getRuleContext(OutputextensionContext.class,0);
		}
		public OutputblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterOutputblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitOutputblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitOutputblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputblockContext outputblock() throws RecognitionException {
		OutputblockContext _localctx = new OutputblockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_outputblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			outputprefix();
			setState(218);
			outputextension();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputprefixContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(SMITHGrammarParser.OUTPUT, 0); }
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public OutputprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterOutputprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitOutputprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitOutputprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputprefixContext outputprefix() throws RecognitionException {
		OutputprefixContext _localctx = new OutputprefixContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_outputprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(OUTPUT);
			setState(221);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputextensionContext extends ParserRuleContext {
		public PrinttypeContext printtype() {
			return getRuleContext(PrinttypeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(SMITHGrammarParser.OPEN_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SMITHGrammarParser.SEMICOLON, 0); }
		public OutputextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterOutputextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitOutputextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitOutputextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputextensionContext outputextension() throws RecognitionException {
		OutputextensionContext _localctx = new OutputextensionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_outputextension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			printtype();
			setState(224);
			match(OPEN_BRACE);
			setState(225);
			expression(0);
			setState(226);
			match(CLOSE_BRACE);
			setState(227);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrinttypeContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SMITHGrammarParser.PRINT, 0); }
		public TerminalNode PRINTLN() { return getToken(SMITHGrammarParser.PRINTLN, 0); }
		public PrinttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterPrinttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitPrinttype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitPrinttype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrinttypeContext printtype() throws RecognitionException {
		PrinttypeContext _localctx = new PrinttypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_printtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==PRINT || _la==PRINTLN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementbodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SMITHGrammarParser.OPEN_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SMITHGrammarParser.CLOSE_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SMITHGrammarParser.SEMICOLON, 0); }
		public StatementbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterStatementbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitStatementbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitStatementbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementbodyContext statementbody() throws RecognitionException {
		StatementbodyContext _localctx = new StatementbodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementbody);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(OPEN_BRACKET);
				setState(232);
				block();
				setState(233);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				expression(0);
				setState(236);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(SMITHGrammarParser.OPEN_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OPEN_BRACE);
			setState(241);
			expression(0);
			setState(242);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionblockContext extends ParserRuleContext {
		public FunctionargumentsContext functionarguments() {
			return getRuleContext(FunctionargumentsContext.class,0);
		}
		public StatementbodyContext statementbody() {
			return getRuleContext(StatementbodyContext.class,0);
		}
		public FunctionblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFunctionblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFunctionblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFunctionblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionblockContext functionblock() throws RecognitionException {
		FunctionblockContext _localctx = new FunctionblockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			functionarguments();
			setState(245);
			statementbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionargumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(SMITHGrammarParser.OPEN_BRACE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public FunctionargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFunctionarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFunctionarguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFunctionarguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionargumentsContext functionarguments() throws RecognitionException {
		FunctionargumentsContext _localctx = new FunctionargumentsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(OPEN_BRACE);
			setState(248);
			arguments();
			setState(249);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public AtomictypeContext atomictype() {
			return getRuleContext(AtomictypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public FurtherargumentsContext furtherarguments() {
			return getRuleContext(FurtherargumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arguments);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ARRAY:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				atomictype();
				setState(252);
				match(COLON);
				setState(253);
				match(IDENTIFIER);
				setState(254);
				furtherarguments();
				}
				break;
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FurtherargumentsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SMITHGrammarParser.COMMA, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FurtherargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_furtherarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFurtherarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFurtherarguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFurtherarguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FurtherargumentsContext furtherarguments() throws RecognitionException {
		FurtherargumentsContext _localctx = new FurtherargumentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_furtherarguments);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(COMMA);
				setState(260);
				arguments();
				}
				break;
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SMITHGrammarParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionncContext> expressionnc() {
			return getRuleContexts(ExpressionncContext.class);
		}
		public ExpressionncContext expressionnc(int i) {
			return getRuleContext(ExpressionncContext.class,i);
		}
		public ComparisonoperatorContext comparisonoperator() {
			return getRuleContext(ComparisonoperatorContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SMITHGrammarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SMITHGrammarParser.CLOSE_PAREN, 0); }
		public TerminalNode TIMES() { return getToken(SMITHGrammarParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SMITHGrammarParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SMITHGrammarParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SMITHGrammarParser.PLUS, 0); }
		public LogicaloperatorContext logicaloperator() {
			return getRuleContext(LogicaloperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(265);
				literal();
				}
				break;
			case 2:
				{
				setState(266);
				match(MINUS);
				setState(267);
				expression(9);
				}
				break;
			case 3:
				{
				setState(268);
				expressionnc(0);
				setState(269);
				comparisonoperator();
				setState(270);
				expressionnc(0);
				}
				break;
			case 4:
				{
				setState(272);
				match(OPEN_PAREN);
				setState(273);
				expression(0);
				setState(274);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(279);
						match(TIMES);
						setState(280);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(282);
						match(DIVIDE);
						setState(283);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(285);
						match(MOD);
						setState(286);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(288);
						match(PLUS);
						setState(289);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(291);
						match(MINUS);
						setState(292);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(294);
						logicaloperator();
						setState(295);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionncContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SMITHGrammarParser.MINUS, 0); }
		public List<ExpressionncContext> expressionnc() {
			return getRuleContexts(ExpressionncContext.class);
		}
		public ExpressionncContext expressionnc(int i) {
			return getRuleContext(ExpressionncContext.class,i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SMITHGrammarParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SMITHGrammarParser.CLOSE_PAREN, 0); }
		public TerminalNode TIMES() { return getToken(SMITHGrammarParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SMITHGrammarParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SMITHGrammarParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SMITHGrammarParser.PLUS, 0); }
		public LogicaloperatorContext logicaloperator() {
			return getRuleContext(LogicaloperatorContext.class,0);
		}
		public ExpressionncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionnc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterExpressionnc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitExpressionnc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitExpressionnc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionncContext expressionnc() throws RecognitionException {
		return expressionnc(0);
	}

	private ExpressionncContext expressionnc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionncContext _localctx = new ExpressionncContext(_ctx, _parentState);
		ExpressionncContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expressionnc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case CALL:
			case IDENTIFIER:
				{
				setState(303);
				literal();
				}
				break;
			case MINUS:
				{
				setState(304);
				match(MINUS);
				setState(305);
				expressionnc(8);
				}
				break;
			case OPEN_PAREN:
				{
				setState(306);
				match(OPEN_PAREN);
				setState(307);
				expression(0);
				setState(308);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(312);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(313);
						match(TIMES);
						setState(314);
						expressionnc(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(315);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(316);
						match(DIVIDE);
						setState(317);
						expressionnc(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(318);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(319);
						match(MOD);
						setState(320);
						expressionnc(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(321);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(322);
						match(PLUS);
						setState(323);
						expressionnc(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(324);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(325);
						match(MINUS);
						setState(326);
						expressionnc(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(327);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(328);
						logicaloperator();
						setState(329);
						expression(0);
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicaloperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SMITHGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SMITHGrammarParser.OR, 0); }
		public LogicaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicaloperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterLogicaloperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitLogicaloperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitLogicaloperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicaloperatorContext logicaloperator() throws RecognitionException {
		LogicaloperatorContext _localctx = new LogicaloperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logicaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonoperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(SMITHGrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(SMITHGrammarParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(SMITHGrammarParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(SMITHGrammarParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(SMITHGrammarParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SMITHGrammarParser.NOT_EQUAL, 0); }
		public ComparisonoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterComparisonoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitComparisonoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitComparisonoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonoperatorContext comparisonoperator() throws RecognitionException {
		ComparisonoperatorContext _localctx = new ComparisonoperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comparisonoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SMITHGrammarParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SMITHGrammarParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public NumberliteralContext numberliteral() {
			return getRuleContext(NumberliteralContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ArrayliteralContext arrayliteral() {
			return getRuleContext(ArrayliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(BOOLEAN_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(IDENTIFIER);
				}
				break;
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				numberliteral();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				functioncall();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				arrayliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(SMITHGrammarParser.CALL, 0); }
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public FunctioncallargumentsContext functioncallarguments() {
			return getRuleContext(FunctioncallargumentsContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(CALL);
			setState(349);
			match(COLON);
			setState(350);
			match(IDENTIFIER);
			setState(351);
			functioncallarguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctioncallargumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(SMITHGrammarParser.OPEN_BRACE, 0); }
		public CallargumentsContext callarguments() {
			return getRuleContext(CallargumentsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public FunctioncallargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncallarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFunctioncallarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFunctioncallarguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFunctioncallarguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallargumentsContext functioncallarguments() throws RecognitionException {
		FunctioncallargumentsContext _localctx = new FunctioncallargumentsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functioncallarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(OPEN_BRACE);
			setState(354);
			callarguments();
			setState(355);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallargumentsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FurthercallargumentsContext furthercallarguments() {
			return getRuleContext(FurthercallargumentsContext.class,0);
		}
		public CallargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterCallarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitCallarguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitCallarguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallargumentsContext callarguments() throws RecognitionException {
		CallargumentsContext _localctx = new CallargumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_callarguments);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case CALL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				expression(0);
				setState(358);
				furthercallarguments();
				}
				break;
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FurthercallargumentsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SMITHGrammarParser.COMMA, 0); }
		public CallargumentsContext callarguments() {
			return getRuleContext(CallargumentsContext.class,0);
		}
		public FurthercallargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_furthercallarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFurthercallarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFurthercallarguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFurthercallarguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FurthercallargumentsContext furthercallarguments() throws RecognitionException {
		FurthercallargumentsContext _localctx = new FurthercallargumentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_furthercallarguments);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(COMMA);
				setState(364);
				callarguments();
				}
				break;
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SMITHGrammarParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SMITHGrammarParser.SEMICOLON, 0); }
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(RETURN);
			setState(369);
			expression(0);
			setState(370);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public DecideblockContext decideblock() {
			return getRuleContext(DecideblockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopblockContext loopblock() {
			return getRuleContext(LoopblockContext.class,0);
		}
		public DefinestatementContext definestatement() {
			return getRuleContext(DefinestatementContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SMITHGrammarParser.SEMICOLON, 0); }
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public OutputblockContext outputblock() {
			return getRuleContext(OutputblockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_block);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				decideblock();
				setState(373);
				block();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				loopblock();
				setState(376);
				block();
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				definestatement();
				setState(379);
				block();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				functioncall();
				setState(382);
				match(SEMICOLON);
				setState(383);
				block();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				returnstatement();
				setState(386);
				block();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				outputblock();
				setState(389);
				block();
				}
				break;
			case EOF:
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 7);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 35:
			return expressionnc_sempred((ExpressionncContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expressionnc_sempred(ExpressionncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u018b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005l\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006q\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0084\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0097\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u009c\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a3\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ab\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b0\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00c6\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00d3\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00d8\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u00ef\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0102\b \u0001"+
		"!\u0001!\u0001!\u0003!\u0107\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0115"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u012a\b\"\n\"\f\"\u012d\t\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u0137\b#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u014c\b#\n#\f#\u014f\t#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u015b\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003)\u016a\b)\u0001*\u0001*\u0001"+
		"*\u0003*\u016f\b*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0189\b,\u0001,\u0000"+
		"\u0002DF-\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\u0006\u0002"+
		"\u0000-/12\u0001\u0000\u001b\u001c\u0001\u0000&\'\u0001\u000067\u0001"+
		"\u0000\u000b\f\u0001\u0000\u000e\u0013\u018a\u0000Z\u0001\u0000\u0000"+
		"\u0000\u0002]\u0001\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000\u0006"+
		"a\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000"+
		"\u0000\fp\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010"+
		"\u0083\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014"+
		"\u0088\u0001\u0000\u0000\u0000\u0016\u0096\u0001\u0000\u0000\u0000\u0018"+
		"\u009b\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c"+
		"\u00a4\u0001\u0000\u0000\u0000\u001e\u00aa\u0001\u0000\u0000\u0000 \u00af"+
		"\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000\u0000\u0000$\u00b4\u0001"+
		"\u0000\u0000\u0000&\u00b7\u0001\u0000\u0000\u0000(\u00c5\u0001\u0000\u0000"+
		"\u0000*\u00c7\u0001\u0000\u0000\u0000,\u00d2\u0001\u0000\u0000\u0000."+
		"\u00d7\u0001\u0000\u0000\u00000\u00d9\u0001\u0000\u0000\u00002\u00dc\u0001"+
		"\u0000\u0000\u00004\u00df\u0001\u0000\u0000\u00006\u00e5\u0001\u0000\u0000"+
		"\u00008\u00ee\u0001\u0000\u0000\u0000:\u00f0\u0001\u0000\u0000\u0000<"+
		"\u00f4\u0001\u0000\u0000\u0000>\u00f7\u0001\u0000\u0000\u0000@\u0101\u0001"+
		"\u0000\u0000\u0000B\u0106\u0001\u0000\u0000\u0000D\u0114\u0001\u0000\u0000"+
		"\u0000F\u0136\u0001\u0000\u0000\u0000H\u0150\u0001\u0000\u0000\u0000J"+
		"\u0152\u0001\u0000\u0000\u0000L\u015a\u0001\u0000\u0000\u0000N\u015c\u0001"+
		"\u0000\u0000\u0000P\u0161\u0001\u0000\u0000\u0000R\u0169\u0001\u0000\u0000"+
		"\u0000T\u016e\u0001\u0000\u0000\u0000V\u0170\u0001\u0000\u0000\u0000X"+
		"\u0188\u0001\u0000\u0000\u0000Z[\u0003X,\u0000[\\\u0005\u0000\u0000\u0001"+
		"\\\u0001\u0001\u0000\u0000\u0000]^\u0007\u0000\u0000\u0000^\u0003\u0001"+
		"\u0000\u0000\u0000_`\u0003\u0002\u0001\u0000`\u0005\u0001\u0000\u0000"+
		"\u0000ab\u0007\u0001\u0000\u0000b\u0007\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0017\u0000\u0000de\u0003\n\u0005\u0000ef\u0005\u0018\u0000\u0000f\t"+
		"\u0001\u0000\u0000\u0000gh\u0003D\"\u0000hi\u0003\f\u0006\u0000il\u0001"+
		"\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0005\u0003"+
		"\u0000\u0000nq\u0003\n\u0005\u0000oq\u0001\u0000\u0000\u0000pm\u0001\u0000"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0003"+
		"\u0012\t\u0000st\u0005 \u0000\u0000tu\u0003:\u001d\u0000uv\u00038\u001c"+
		"\u0000vw\u0003\u0010\b\u0000w\u000f\u0001\u0000\u0000\u0000xy\u0003\u0012"+
		"\t\u0000yz\u0005!\u0000\u0000z{\u0003:\u001d\u0000{|\u00038\u001c\u0000"+
		"|}\u0003\u0010\b\u0000}\u0084\u0001\u0000\u0000\u0000~\u007f\u0003\u0012"+
		"\t\u0000\u007f\u0080\u0005\"\u0000\u0000\u0080\u0081\u00038\u001c\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000"+
		"\u0083x\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u001f\u0000\u0000\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u0013"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0003\"\u0011\u0000\u0089\u008a\u0003"+
		"\u0016\u000b\u0000\u008a\u008b\u0005\u0002\u0000\u0000\u008b\u0015\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0003\u0002\u0001\u0000\u008d\u008e\u0005"+
		"?\u0000\u0000\u008e\u008f\u0003\u0018\f\u0000\u008f\u0097\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u00053\u0000\u0000\u0091\u0092\u0003 \u0010\u0000"+
		"\u0092\u0093\u0005?\u0000\u0000\u0093\u0094\u0005\u0014\u0000\u0000\u0094"+
		"\u0095\u0003<\u001e\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u008c"+
		"\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000\u0000\u0097\u0017"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0014\u0000\u0000\u0099\u009c"+
		"\u0003D\"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u0019\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005\u0017\u0000\u0000\u009e\u009f\u0003"+
		"\u001c\u000e\u0000\u009f\u00a0\u0005\u0018\u0000\u0000\u00a0\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009d\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u001b\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0003\u0006\u0003\u0000\u00a5\u00a6\u0003"+
		"\u001e\u000f\u0000\u00a6\u001d\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0003\u0000\u0000\u00a8\u00ab\u0003\u001c\u000e\u0000\u00a9\u00ab\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u001f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0001\u0000\u0000\u00ad\u00b0\u0003\u0002\u0001\u0000\u00ae\u00b0\u0001"+
		"\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0!\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005,\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3#\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0003&\u0013\u0000\u00b5\u00b6\u0003(\u0014\u0000\u00b6%"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005$\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0001\u0000\u0000\u00b9\'\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005%"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0001\u0000\u0000\u00bc\u00bd\u0003*\u0015"+
		"\u0000\u00bd\u00be\u0003:\u001d\u0000\u00be\u00bf\u00038\u001c\u0000\u00bf"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005(\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0001\u0000\u0000\u00c2\u00c3\u0003,\u0016\u0000\u00c3\u00c4\u0003"+
		"8\u001c\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c6)\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0007\u0002\u0000\u0000\u00c8+\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005)\u0000\u0000\u00ca\u00cb\u0005\u0019\u0000\u0000\u00cb"+
		"\u00cc\u0005?\u0000\u0000\u00cc\u00cd\u0005*\u0000\u0000\u00cd\u00ce\u0003"+
		"D\"\u0000\u00ce\u00cf\u0005\u001a\u0000\u0000\u00cf\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005+\u0000\u0000\u00d1\u00d3\u0003D\"\u0000"+
		"\u00d2\u00c9\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d3-\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5"+
		"\u00d8\u0003D\"\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8/\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u00032\u0019\u0000\u00da\u00db\u00034\u001a"+
		"\u0000\u00db1\u0001\u0000\u0000\u0000\u00dc\u00dd\u00055\u0000\u0000\u00dd"+
		"\u00de\u0005\u0001\u0000\u0000\u00de3\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u00036\u001b\u0000\u00e0\u00e1\u0005\u0019\u0000\u0000\u00e1\u00e2\u0003"+
		"D\"\u0000\u00e2\u00e3\u0005\u001a\u0000\u0000\u00e3\u00e4\u0005\u0002"+
		"\u0000\u0000\u00e45\u0001\u0000\u0000\u0000\u00e5\u00e6\u0007\u0003\u0000"+
		"\u0000\u00e67\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0017\u0000\u0000"+
		"\u00e8\u00e9\u0003X,\u0000\u00e9\u00ea\u0005\u0018\u0000\u0000\u00ea\u00ef"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003D\"\u0000\u00ec\u00ed\u0005"+
		"\u0002\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ef9\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005\u0019\u0000\u0000\u00f1\u00f2\u0003D\""+
		"\u0000\u00f2\u00f3\u0005\u001a\u0000\u0000\u00f3;\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0003>\u001f\u0000\u00f5\u00f6\u00038\u001c\u0000\u00f6="+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0019\u0000\u0000\u00f8\u00f9"+
		"\u0003@ \u0000\u00f9\u00fa\u0005\u001a\u0000\u0000\u00fa?\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0003\u0002\u0001\u0000\u00fc\u00fd\u0005\u0001"+
		"\u0000\u0000\u00fd\u00fe\u0005?\u0000\u0000\u00fe\u00ff\u0003B!\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000"+
		"\u0101\u00fb\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000"+
		"\u0102A\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104"+
		"\u0107\u0003@ \u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0103\u0001"+
		"\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107C\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0006\"\uffff\uffff\u0000\u0109\u0115\u0003L"+
		"&\u0000\u010a\u010b\u0005\u0007\u0000\u0000\u010b\u0115\u0003D\"\t\u010c"+
		"\u010d\u0003F#\u0000\u010d\u010e\u0003J%\u0000\u010e\u010f\u0003F#\u0000"+
		"\u010f\u0115\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0015\u0000\u0000"+
		"\u0111\u0112\u0003D\"\u0000\u0112\u0113\u0005\u0016\u0000\u0000\u0113"+
		"\u0115\u0001\u0000\u0000\u0000\u0114\u0108\u0001\u0000\u0000\u0000\u0114"+
		"\u010a\u0001\u0000\u0000\u0000\u0114\u010c\u0001\u0000\u0000\u0000\u0114"+
		"\u0110\u0001\u0000\u0000\u0000\u0115\u012b\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\n\b\u0000\u0000\u0117\u0118\u0005\b\u0000\u0000\u0118\u012a\u0003"+
		"D\"\t\u0119\u011a\n\u0007\u0000\u0000\u011a\u011b\u0005\t\u0000\u0000"+
		"\u011b\u012a\u0003D\"\b\u011c\u011d\n\u0006\u0000\u0000\u011d\u011e\u0005"+
		"\n\u0000\u0000\u011e\u012a\u0003D\"\u0007\u011f\u0120\n\u0005\u0000\u0000"+
		"\u0120\u0121\u0005\u0006\u0000\u0000\u0121\u012a\u0003D\"\u0006\u0122"+
		"\u0123\n\u0004\u0000\u0000\u0123\u0124\u0005\u0007\u0000\u0000\u0124\u012a"+
		"\u0003D\"\u0005\u0125\u0126\n\u0003\u0000\u0000\u0126\u0127\u0003H$\u0000"+
		"\u0127\u0128\u0003D\"\u0004\u0128\u012a\u0001\u0000\u0000\u0000\u0129"+
		"\u0116\u0001\u0000\u0000\u0000\u0129\u0119\u0001\u0000\u0000\u0000\u0129"+
		"\u011c\u0001\u0000\u0000\u0000\u0129\u011f\u0001\u0000\u0000\u0000\u0129"+
		"\u0122\u0001\u0000\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u012a"+
		"\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012cE\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0006#\uffff\uffff\u0000\u012f\u0137"+
		"\u0003L&\u0000\u0130\u0131\u0005\u0007\u0000\u0000\u0131\u0137\u0003F"+
		"#\b\u0132\u0133\u0005\u0015\u0000\u0000\u0133\u0134\u0003D\"\u0000\u0134"+
		"\u0135\u0005\u0016\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136"+
		"\u012e\u0001\u0000\u0000\u0000\u0136\u0130\u0001\u0000\u0000\u0000\u0136"+
		"\u0132\u0001\u0000\u0000\u0000\u0137\u014d\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\n\u0007\u0000\u0000\u0139\u013a\u0005\b\u0000\u0000\u013a\u014c"+
		"\u0003F#\b\u013b\u013c\n\u0006\u0000\u0000\u013c\u013d\u0005\t\u0000\u0000"+
		"\u013d\u014c\u0003F#\u0007\u013e\u013f\n\u0005\u0000\u0000\u013f\u0140"+
		"\u0005\n\u0000\u0000\u0140\u014c\u0003F#\u0006\u0141\u0142\n\u0004\u0000"+
		"\u0000\u0142\u0143\u0005\u0006\u0000\u0000\u0143\u014c\u0003F#\u0005\u0144"+
		"\u0145\n\u0003\u0000\u0000\u0145\u0146\u0005\u0007\u0000\u0000\u0146\u014c"+
		"\u0003F#\u0004\u0147\u0148\n\u0002\u0000\u0000\u0148\u0149\u0003H$\u0000"+
		"\u0149\u014a\u0003D\"\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b"+
		"\u0138\u0001\u0000\u0000\u0000\u014b\u013b\u0001\u0000\u0000\u0000\u014b"+
		"\u013e\u0001\u0000\u0000\u0000\u014b\u0141\u0001\u0000\u0000\u0000\u014b"+
		"\u0144\u0001\u0000\u0000\u0000\u014b\u0147\u0001\u0000\u0000\u0000\u014c"+
		"\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014eG\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0007\u0004\u0000\u0000\u0151I\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0007\u0005\u0000\u0000\u0153K\u0001\u0000"+
		"\u0000\u0000\u0154\u015b\u0005\u001e\u0000\u0000\u0155\u015b\u0005\u001d"+
		"\u0000\u0000\u0156\u015b\u0005?\u0000\u0000\u0157\u015b\u0003\u0006\u0003"+
		"\u0000\u0158\u015b\u0003N\'\u0000\u0159\u015b\u0003\b\u0004\u0000\u015a"+
		"\u0154\u0001\u0000\u0000\u0000\u015a\u0155\u0001\u0000\u0000\u0000\u015a"+
		"\u0156\u0001\u0000\u0000\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015a"+
		"\u0158\u0001\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b"+
		"M\u0001\u0000\u0000\u0000\u015c\u015d\u0005#\u0000\u0000\u015d\u015e\u0005"+
		"\u0001\u0000\u0000\u015e\u015f\u0005?\u0000\u0000\u015f\u0160\u0003P("+
		"\u0000\u0160O\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0019\u0000\u0000"+
		"\u0162\u0163\u0003R)\u0000\u0163\u0164\u0005\u001a\u0000\u0000\u0164Q"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0003D\"\u0000\u0166\u0167\u0003"+
		"T*\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000"+
		"\u0000\u0169\u0165\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016aS\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0003\u0000\u0000"+
		"\u016c\u016f\u0003R)\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u016b"+
		"\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016fU\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005>\u0000\u0000\u0171\u0172\u0003D\""+
		"\u0000\u0172\u0173\u0005\u0002\u0000\u0000\u0173W\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0003\u000e\u0007\u0000\u0175\u0176\u0003X,\u0000\u0176\u0189"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0003$\u0012\u0000\u0178\u0179\u0003"+
		"X,\u0000\u0179\u0189\u0001\u0000\u0000\u0000\u017a\u017b\u0003\u0014\n"+
		"\u0000\u017b\u017c\u0003X,\u0000\u017c\u0189\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0003N\'\u0000\u017e\u017f\u0005\u0002\u0000\u0000\u017f\u0180"+
		"\u0003X,\u0000\u0180\u0189\u0001\u0000\u0000\u0000\u0181\u0182\u0003V"+
		"+\u0000\u0182\u0183\u0003X,\u0000\u0183\u0189\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u00030\u0018\u0000\u0185\u0186\u0003X,\u0000\u0186\u0189"+
		"\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0174"+
		"\u0001\u0000\u0000\u0000\u0188\u0177\u0001\u0000\u0000\u0000\u0188\u017a"+
		"\u0001\u0000\u0000\u0000\u0188\u017d\u0001\u0000\u0000\u0000\u0188\u0181"+
		"\u0001\u0000\u0000\u0000\u0188\u0184\u0001\u0000\u0000\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u0189Y\u0001\u0000\u0000\u0000\u0018kp\u0083"+
		"\u0096\u009b\u00a2\u00aa\u00af\u00c5\u00d2\u00d7\u00ee\u0101\u0106\u0114"+
		"\u0129\u012b\u0136\u014b\u014d\u015a\u0169\u016e\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}