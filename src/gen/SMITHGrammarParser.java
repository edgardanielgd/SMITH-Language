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
		PI=1, EULER=2, COLON=3, SEMICOLON=4, COMMA=5, TILDE=6, DOT=7, EQUAL=8, 
		PLUS=9, MINUS=10, TIMES=11, DIVIDE=12, MOD=13, AND=14, OR=15, NOT=16, 
		LESS=17, GREATER=18, LESS_EQUAL=19, GREATER_EQUAL=20, EQUAL_EQUAL=21, 
		NOT_EQUAL=22, ASSIGN=23, OPEN_PAREN=24, CLOSE_PAREN=25, OPEN_BRACKET=26, 
		CLOSE_BRACKET=27, OPEN_BRACE=28, CLOSE_BRACE=29, INTEGER_LITERAL=30, FLOAT_LITERAL=31, 
		STRING_LITERAL=32, BOOLEAN_LITERAL=33, DECIDE=34, IF=35, IFNOT=36, DEFAULT=37, 
		CALL=38, LOOP=39, REPEAT=40, UNTIL=41, WHILE=42, FOR=43, EACH=44, IN=45, 
		BLIND=46, DEFINE=47, INT=48, FLOAT=49, ARRAY=50, NUMBER=51, STRING=52, 
		BOOL=53, FUNCTION=54, TYPE=55, OUTPUT=56, PRINT=57, PRINTLN=58, WRITEFILE=59, 
		PLOT=60, INPUT=61, READFILE=62, READCONSOLE=63, SET=64, RETURN=65, IDENTIFIER=66, 
		WS=67, COMMENT=68, A=69, S=70;
	public static final int
		RULE_program = 0, RULE_atomictype = 1, RULE_variabletype = 2, RULE_numberliteral = 3, 
		RULE_arrayliteral = 4, RULE_arrayelements = 5, RULE_furtherarrayelements = 6, 
		RULE_optionalinterval = 7, RULE_decideblock = 8, RULE_decisionextension = 9, 
		RULE_decideprefix = 10, RULE_definestatement = 11, RULE_defineextension = 12, 
		RULE_definedefaultvalue = 13, RULE_arrayextension = 14, RULE_dimensions = 15, 
		RULE_furtherdimensions = 16, RULE_functiondefextension = 17, RULE_defineprefix = 18, 
		RULE_loopblock = 19, RULE_loopprefix = 20, RULE_loopextension = 21, RULE_repeattype = 22, 
		RULE_forextension = 23, RULE_rangeextension = 24, RULE_outputblock = 25, 
		RULE_outputprefix = 26, RULE_outputextension = 27, RULE_printtype = 28, 
		RULE_inputblock = 29, RULE_inputprefix = 30, RULE_inputextension = 31, 
		RULE_statementbody = 32, RULE_conditional = 33, RULE_functionblock = 34, 
		RULE_functionarguments = 35, RULE_arguments = 36, RULE_furtherarguments = 37, 
		RULE_expression = 38, RULE_expressionnc = 39, RULE_comparisonoperator = 40, 
		RULE_literal = 41, RULE_arrayitem = 42, RULE_arrayaccessor = 43, RULE_furtherarrayaccessor = 44, 
		RULE_functioncall = 45, RULE_functioncallarguments = 46, RULE_callarguments = 47, 
		RULE_furthercallarguments = 48, RULE_returnstatement = 49, RULE_setstatement = 50, 
		RULE_block = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "atomictype", "variabletype", "numberliteral", "arrayliteral", 
			"arrayelements", "furtherarrayelements", "optionalinterval", "decideblock", 
			"decisionextension", "decideprefix", "definestatement", "defineextension", 
			"definedefaultvalue", "arrayextension", "dimensions", "furtherdimensions", 
			"functiondefextension", "defineprefix", "loopblock", "loopprefix", "loopextension", 
			"repeattype", "forextension", "rangeextension", "outputblock", "outputprefix", 
			"outputextension", "printtype", "inputblock", "inputprefix", "inputextension", 
			"statementbody", "conditional", "functionblock", "functionarguments", 
			"arguments", "furtherarguments", "expression", "expressionnc", "comparisonoperator", 
			"literal", "arrayitem", "arrayaccessor", "furtherarrayaccessor", "functioncall", 
			"functioncallarguments", "callarguments", "furthercallarguments", "returnstatement", 
			"setstatement", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pi'", "'euler'", "':'", "';'", "','", "'~'", "'.'", "'='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'!'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", null, "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PI", "EULER", "COLON", "SEMICOLON", "COMMA", "TILDE", "DOT", "EQUAL", 
			"PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "AND", "OR", "NOT", "LESS", 
			"GREATER", "LESS_EQUAL", "GREATER_EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", 
			"ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_BRACE", "CLOSE_BRACE", "INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"BOOLEAN_LITERAL", "DECIDE", "IF", "IFNOT", "DEFAULT", "CALL", "LOOP", 
			"REPEAT", "UNTIL", "WHILE", "FOR", "EACH", "IN", "BLIND", "DEFINE", "INT", 
			"FLOAT", "ARRAY", "NUMBER", "STRING", "BOOL", "FUNCTION", "TYPE", "OUTPUT", 
			"PRINT", "PRINTLN", "WRITEFILE", "PLOT", "INPUT", "READFILE", "READCONSOLE", 
			"SET", "RETURN", "IDENTIFIER", "WS", "COMMENT", "A", "S"
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
			setState(104);
			block();
			setState(105);
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
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15481123719086080L) != 0)) ) {
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
			setState(109);
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
			setState(111);
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
			setState(113);
			match(OPEN_BRACKET);
			setState(114);
			arrayelements();
			setState(115);
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
			case EULER:
			case MINUS:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case CALL:
			case INT:
			case FLOAT:
			case ARRAY:
			case STRING:
			case BOOL:
			case INPUT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				expression(0);
				setState(118);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(SMITHGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SMITHGrammarParser.SEMICOLON, i);
		}
		public OptionalintervalContext optionalinterval() {
			return getRuleContext(OptionalintervalContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(COMMA);
				setState(124);
				arrayelements();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(SEMICOLON);
				setState(126);
				optionalinterval();
				setState(127);
				match(SEMICOLON);
				setState(128);
				expression(0);
				}
				break;
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 3);
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
	public static class OptionalintervalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OptionalintervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalinterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterOptionalinterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitOptionalinterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitOptionalinterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalintervalContext optionalinterval() throws RecognitionException {
		OptionalintervalContext _localctx = new OptionalintervalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optionalinterval);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
			case EULER:
			case MINUS:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case CALL:
			case INT:
			case FLOAT:
			case ARRAY:
			case STRING:
			case BOOL:
			case INPUT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
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
		enterRule(_localctx, 16, RULE_decideblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			decideprefix();
			setState(138);
			match(IF);
			setState(139);
			conditional();
			setState(140);
			statementbody();
			setState(141);
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
		enterRule(_localctx, 18, RULE_decisionextension);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				decideprefix();
				setState(144);
				match(IFNOT);
				setState(145);
				conditional();
				setState(146);
				statementbody();
				setState(147);
				decisionextension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				decideprefix();
				setState(150);
				match(DEFAULT);
				setState(151);
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
		enterRule(_localctx, 20, RULE_decideprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(DECIDE);
			setState(157);
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
		enterRule(_localctx, 22, RULE_definestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			defineprefix();
			setState(160);
			defineextension();
			setState(161);
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
		enterRule(_localctx, 24, RULE_defineextension);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ARRAY:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				atomictype();
				setState(164);
				match(IDENTIFIER);
				setState(165);
				definedefaultvalue();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(FUNCTION);
				setState(168);
				functiondefextension();
				setState(169);
				match(IDENTIFIER);
				setState(170);
				match(ASSIGN);
				setState(171);
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
		enterRule(_localctx, 26, RULE_definedefaultvalue);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(ASSIGN);
				setState(176);
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
		enterRule(_localctx, 28, RULE_arrayextension);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(OPEN_BRACKET);
				setState(181);
				dimensions();
				setState(182);
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
		enterRule(_localctx, 30, RULE_dimensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			numberliteral();
			setState(188);
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
		enterRule(_localctx, 32, RULE_furtherdimensions);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(COMMA);
				setState(191);
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
		enterRule(_localctx, 34, RULE_functiondefextension);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(COLON);
				setState(196);
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
		enterRule(_localctx, 36, RULE_defineprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(DEFINE);
			setState(201);
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
		enterRule(_localctx, 38, RULE_loopblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			loopprefix();
			setState(204);
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
		enterRule(_localctx, 40, RULE_loopprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LOOP);
			setState(207);
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
		enterRule(_localctx, 42, RULE_loopextension);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(REPEAT);
				setState(210);
				match(COLON);
				setState(211);
				repeattype();
				setState(212);
				conditional();
				setState(213);
				statementbody();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(FOR);
				setState(216);
				match(COLON);
				setState(217);
				forextension();
				setState(218);
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
		enterRule(_localctx, 44, RULE_repeattype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 46, RULE_forextension);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EACH:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(EACH);
				setState(225);
				match(OPEN_BRACE);
				setState(226);
				match(IDENTIFIER);
				setState(227);
				match(IN);
				setState(228);
				expression(0);
				setState(229);
				match(CLOSE_BRACE);
				}
				break;
			case BLIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(BLIND);
				setState(232);
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
		enterRule(_localctx, 48, RULE_rangeextension);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(COLON);
				setState(236);
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
		enterRule(_localctx, 50, RULE_outputblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			outputprefix();
			setState(241);
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
		enterRule(_localctx, 52, RULE_outputprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(OUTPUT);
			setState(244);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SMITHGrammarParser.SEMICOLON, 0); }
		public TerminalNode PLOT() { return getToken(SMITHGrammarParser.PLOT, 0); }
		public TerminalNode COMMA() { return getToken(SMITHGrammarParser.COMMA, 0); }
		public TerminalNode WRITEFILE() { return getToken(SMITHGrammarParser.WRITEFILE, 0); }
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
		enterRule(_localctx, 54, RULE_outputextension);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				printtype();
				setState(247);
				match(OPEN_BRACE);
				setState(248);
				expression(0);
				setState(249);
				match(CLOSE_BRACE);
				setState(250);
				match(SEMICOLON);
				}
				break;
			case PLOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(PLOT);
				setState(253);
				match(OPEN_BRACE);
				setState(254);
				expression(0);
				setState(255);
				match(COMMA);
				setState(256);
				expression(0);
				setState(257);
				match(CLOSE_BRACE);
				setState(258);
				match(SEMICOLON);
				}
				break;
			case WRITEFILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(WRITEFILE);
				setState(261);
				match(OPEN_BRACE);
				setState(262);
				expression(0);
				setState(263);
				match(COMMA);
				setState(264);
				expression(0);
				setState(265);
				match(CLOSE_BRACE);
				setState(266);
				match(SEMICOLON);
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
		enterRule(_localctx, 56, RULE_printtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
	public static class InputblockContext extends ParserRuleContext {
		public InputprefixContext inputprefix() {
			return getRuleContext(InputprefixContext.class,0);
		}
		public InputextensionContext inputextension() {
			return getRuleContext(InputextensionContext.class,0);
		}
		public InputblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterInputblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitInputblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitInputblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputblockContext inputblock() throws RecognitionException {
		InputblockContext _localctx = new InputblockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_inputblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			inputprefix();
			setState(273);
			inputextension();
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
	public static class InputprefixContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(SMITHGrammarParser.INPUT, 0); }
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public InputprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterInputprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitInputprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitInputprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputprefixContext inputprefix() throws RecognitionException {
		InputprefixContext _localctx = new InputprefixContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inputprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(INPUT);
			setState(276);
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
	public static class InputextensionContext extends ParserRuleContext {
		public TerminalNode READFILE() { return getToken(SMITHGrammarParser.READFILE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SMITHGrammarParser.OPEN_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public TerminalNode READCONSOLE() { return getToken(SMITHGrammarParser.READCONSOLE, 0); }
		public InputextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterInputextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitInputextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitInputextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputextensionContext inputextension() throws RecognitionException {
		InputextensionContext _localctx = new InputextensionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inputextension);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READFILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(READFILE);
				setState(279);
				match(OPEN_BRACE);
				setState(280);
				expression(0);
				setState(281);
				match(CLOSE_BRACE);
				}
				break;
			case READCONSOLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(READCONSOLE);
				setState(284);
				match(OPEN_BRACE);
				setState(285);
				match(CLOSE_BRACE);
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
		enterRule(_localctx, 64, RULE_statementbody);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(OPEN_BRACKET);
				setState(289);
				block();
				setState(290);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				expression(0);
				setState(293);
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
		enterRule(_localctx, 66, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(OPEN_BRACE);
			setState(298);
			expression(0);
			setState(299);
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
		enterRule(_localctx, 68, RULE_functionblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			functionarguments();
			setState(302);
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
		enterRule(_localctx, 70, RULE_functionarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(OPEN_BRACE);
			setState(305);
			arguments();
			setState(306);
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
		enterRule(_localctx, 72, RULE_arguments);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ARRAY:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				atomictype();
				setState(309);
				match(COLON);
				setState(310);
				match(IDENTIFIER);
				setState(311);
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
		enterRule(_localctx, 74, RULE_furtherarguments);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(COMMA);
				setState(317);
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
		public List<ExpressionncContext> expressionnc() {
			return getRuleContexts(ExpressionncContext.class);
		}
		public ExpressionncContext expressionnc(int i) {
			return getRuleContext(ExpressionncContext.class,i);
		}
		public ComparisonoperatorContext comparisonoperator() {
			return getRuleContext(ComparisonoperatorContext.class,0);
		}
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
		public InputblockContext inputblock() {
			return getRuleContext(InputblockContext.class,0);
		}
		public AtomictypeContext atomictype() {
			return getRuleContext(AtomictypeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(SMITHGrammarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(SMITHGrammarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SMITHGrammarParser.CLOSE_PAREN, 0); }
		public TerminalNode TILDE() { return getToken(SMITHGrammarParser.TILDE, 0); }
		public TerminalNode TIMES() { return getToken(SMITHGrammarParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SMITHGrammarParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SMITHGrammarParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SMITHGrammarParser.PLUS, 0); }
		public TerminalNode OR() { return getToken(SMITHGrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(SMITHGrammarParser.AND, 0); }
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(322);
				expressionnc(0);
				setState(323);
				comparisonoperator();
				setState(324);
				expressionnc(0);
				}
				break;
			case 2:
				{
				setState(326);
				literal();
				}
				break;
			case 3:
				{
				setState(327);
				match(MINUS);
				setState(328);
				expression(12);
				}
				break;
			case 4:
				{
				setState(329);
				inputblock();
				}
				break;
			case 5:
				{
				setState(330);
				atomictype();
				setState(331);
				match(OPEN_BRACE);
				setState(332);
				expression(0);
				setState(333);
				match(CLOSE_BRACE);
				}
				break;
			case 6:
				{
				setState(335);
				match(OPEN_PAREN);
				setState(336);
				expression(0);
				setState(337);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(342);
						match(TILDE);
						setState(343);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(345);
						match(TIMES);
						setState(346);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(348);
						match(DIVIDE);
						setState(349);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(351);
						match(MOD);
						setState(352);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(354);
						match(PLUS);
						setState(355);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(357);
						match(MINUS);
						setState(358);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(360);
						match(OR);
						setState(361);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(363);
						match(AND);
						setState(364);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(369);
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
		public InputblockContext inputblock() {
			return getRuleContext(InputblockContext.class,0);
		}
		public AtomictypeContext atomictype() {
			return getRuleContext(AtomictypeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(SMITHGrammarParser.OPEN_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(SMITHGrammarParser.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(SMITHGrammarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SMITHGrammarParser.CLOSE_PAREN, 0); }
		public TerminalNode TILDE() { return getToken(SMITHGrammarParser.TILDE, 0); }
		public TerminalNode TIMES() { return getToken(SMITHGrammarParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SMITHGrammarParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SMITHGrammarParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SMITHGrammarParser.PLUS, 0); }
		public TerminalNode OR() { return getToken(SMITHGrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(SMITHGrammarParser.AND, 0); }
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expressionnc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
			case EULER:
			case OPEN_BRACKET:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case CALL:
			case IDENTIFIER:
				{
				setState(371);
				literal();
				}
				break;
			case MINUS:
				{
				setState(372);
				match(MINUS);
				setState(373);
				expressionnc(12);
				}
				break;
			case INPUT:
				{
				setState(374);
				inputblock();
				}
				break;
			case INT:
			case FLOAT:
			case ARRAY:
			case STRING:
			case BOOL:
				{
				setState(375);
				atomictype();
				setState(376);
				match(OPEN_BRACE);
				setState(377);
				expression(0);
				setState(378);
				match(CLOSE_BRACE);
				}
				break;
			case OPEN_PAREN:
				{
				setState(380);
				match(OPEN_PAREN);
				setState(381);
				expression(0);
				setState(382);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(386);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(387);
						match(TILDE);
						setState(388);
						expressionnc(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(389);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(390);
						match(TIMES);
						setState(391);
						expressionnc(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(392);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(393);
						match(DIVIDE);
						setState(394);
						expressionnc(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(395);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(396);
						match(MOD);
						setState(397);
						expressionnc(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(398);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(399);
						match(PLUS);
						setState(400);
						expressionnc(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(401);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(402);
						match(MINUS);
						setState(403);
						expressionnc(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(404);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(405);
						match(OR);
						setState(406);
						expression(0);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionncContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionnc);
						setState(407);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(408);
						match(AND);
						setState(409);
						expression(0);
						}
						break;
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 80, RULE_comparisonoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0)) ) {
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
		public TerminalNode PI() { return getToken(SMITHGrammarParser.PI, 0); }
		public TerminalNode EULER() { return getToken(SMITHGrammarParser.EULER, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SMITHGrammarParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SMITHGrammarParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public ArrayitemContext arrayitem() {
			return getRuleContext(ArrayitemContext.class,0);
		}
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
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(PI);
				}
				break;
			case EULER:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(EULER);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(BOOLEAN_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				match(IDENTIFIER);
				setState(422);
				arrayitem();
				}
				break;
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				numberliteral();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 7);
				{
				setState(424);
				functioncall();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 8);
				{
				setState(425);
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
	public static class ArrayitemContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SMITHGrammarParser.OPEN_BRACKET, 0); }
		public ArrayaccessorContext arrayaccessor() {
			return getRuleContext(ArrayaccessorContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SMITHGrammarParser.CLOSE_BRACKET, 0); }
		public ArrayitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterArrayitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitArrayitem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitArrayitem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayitemContext arrayitem() throws RecognitionException {
		ArrayitemContext _localctx = new ArrayitemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayitem);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(OPEN_BRACKET);
				setState(429);
				arrayaccessor();
				setState(430);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
	public static class ArrayaccessorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FurtherarrayaccessorContext furtherarrayaccessor() {
			return getRuleContext(FurtherarrayaccessorContext.class,0);
		}
		public ArrayaccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayaccessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterArrayaccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitArrayaccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitArrayaccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayaccessorContext arrayaccessor() throws RecognitionException {
		ArrayaccessorContext _localctx = new ArrayaccessorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayaccessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			expression(0);
			setState(436);
			furtherarrayaccessor();
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
	public static class FurtherarrayaccessorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SMITHGrammarParser.COMMA, 0); }
		public ArrayaccessorContext arrayaccessor() {
			return getRuleContext(ArrayaccessorContext.class,0);
		}
		public FurtherarrayaccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_furtherarrayaccessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterFurtherarrayaccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitFurtherarrayaccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitFurtherarrayaccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FurtherarrayaccessorContext furtherarrayaccessor() throws RecognitionException {
		FurtherarrayaccessorContext _localctx = new FurtherarrayaccessorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_furtherarrayaccessor);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(COMMA);
				setState(439);
				arrayaccessor();
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
		enterRule(_localctx, 90, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(CALL);
			setState(444);
			match(COLON);
			setState(445);
			match(IDENTIFIER);
			setState(446);
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
		enterRule(_localctx, 92, RULE_functioncallarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(OPEN_BRACE);
			setState(449);
			callarguments();
			setState(450);
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
		enterRule(_localctx, 94, RULE_callarguments);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
			case EULER:
			case MINUS:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case CALL:
			case INT:
			case FLOAT:
			case ARRAY:
			case STRING:
			case BOOL:
			case INPUT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				expression(0);
				setState(453);
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
		enterRule(_localctx, 96, RULE_furthercallarguments);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(COMMA);
				setState(459);
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
		enterRule(_localctx, 98, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(RETURN);
			setState(464);
			expression(0);
			setState(465);
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
	public static class SetstatementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SMITHGrammarParser.SET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public ArrayitemContext arrayitem() {
			return getRuleContext(ArrayitemContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SMITHGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SMITHGrammarParser.SEMICOLON, 0); }
		public SetstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterSetstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitSetstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitSetstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetstatementContext setstatement() throws RecognitionException {
		SetstatementContext _localctx = new SetstatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_setstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(SET);
			setState(468);
			match(IDENTIFIER);
			setState(469);
			arrayitem();
			setState(470);
			match(ASSIGN);
			setState(471);
			expression(0);
			setState(472);
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
		public SetstatementContext setstatement() {
			return getRuleContext(SetstatementContext.class,0);
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
		enterRule(_localctx, 102, RULE_block);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				decideblock();
				setState(475);
				block();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				loopblock();
				setState(478);
				block();
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				definestatement();
				setState(481);
				block();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				functioncall();
				setState(484);
				match(SEMICOLON);
				setState(485);
				block();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				returnstatement();
				setState(488);
				block();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(490);
				outputblock();
				setState(491);
				block();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				setstatement();
				setState(494);
				block();
				}
				break;
			case EOF:
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 8);
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
		case 38:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 39:
			return expressionnc_sempred((ExpressionncContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressionnc_sempred(ExpressionncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001F\u01f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005z\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0084\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0088\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009b"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00ae\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00b3"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00ba\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00c2\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00c7\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00dd"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00ea\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00ef"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u010d"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u011f"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0128"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#"+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u013b"+
		"\b$\u0001%\u0001%\u0001%\u0003%\u0140\b%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0154\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u016e\b&\n&\f&\u0171\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u0181\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u019b"+
		"\b\'\n\'\f\'\u019e\t\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01ab\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u01b2\b*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0003"+
		",\u01ba\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0003/\u01c9\b/\u00010\u00010\u00010\u0003"+
		"0\u01ce\b0\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u01f2\b3\u00013\u0000\u0002"+
		"LN4\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0005\u0002"+
		"\u00000245\u0001\u0000\u001e\u001f\u0001\u0000)*\u0001\u00009:\u0001\u0000"+
		"\u0011\u0016\u01fe\u0000h\u0001\u0000\u0000\u0000\u0002k\u0001\u0000\u0000"+
		"\u0000\u0004m\u0001\u0000\u0000\u0000\u0006o\u0001\u0000\u0000\u0000\b"+
		"q\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000\u0000\f\u0083\u0001\u0000"+
		"\u0000\u0000\u000e\u0087\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000"+
		"\u0000\u0000\u0012\u009a\u0001\u0000\u0000\u0000\u0014\u009c\u0001\u0000"+
		"\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000\u0018\u00ad\u0001\u0000"+
		"\u0000\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000"+
		"\u0000\u0000\u001e\u00bb\u0001\u0000\u0000\u0000 \u00c1\u0001\u0000\u0000"+
		"\u0000\"\u00c6\u0001\u0000\u0000\u0000$\u00c8\u0001\u0000\u0000\u0000"+
		"&\u00cb\u0001\u0000\u0000\u0000(\u00ce\u0001\u0000\u0000\u0000*\u00dc"+
		"\u0001\u0000\u0000\u0000,\u00de\u0001\u0000\u0000\u0000.\u00e9\u0001\u0000"+
		"\u0000\u00000\u00ee\u0001\u0000\u0000\u00002\u00f0\u0001\u0000\u0000\u0000"+
		"4\u00f3\u0001\u0000\u0000\u00006\u010c\u0001\u0000\u0000\u00008\u010e"+
		"\u0001\u0000\u0000\u0000:\u0110\u0001\u0000\u0000\u0000<\u0113\u0001\u0000"+
		"\u0000\u0000>\u011e\u0001\u0000\u0000\u0000@\u0127\u0001\u0000\u0000\u0000"+
		"B\u0129\u0001\u0000\u0000\u0000D\u012d\u0001\u0000\u0000\u0000F\u0130"+
		"\u0001\u0000\u0000\u0000H\u013a\u0001\u0000\u0000\u0000J\u013f\u0001\u0000"+
		"\u0000\u0000L\u0153\u0001\u0000\u0000\u0000N\u0180\u0001\u0000\u0000\u0000"+
		"P\u019f\u0001\u0000\u0000\u0000R\u01aa\u0001\u0000\u0000\u0000T\u01b1"+
		"\u0001\u0000\u0000\u0000V\u01b3\u0001\u0000\u0000\u0000X\u01b9\u0001\u0000"+
		"\u0000\u0000Z\u01bb\u0001\u0000\u0000\u0000\\\u01c0\u0001\u0000\u0000"+
		"\u0000^\u01c8\u0001\u0000\u0000\u0000`\u01cd\u0001\u0000\u0000\u0000b"+
		"\u01cf\u0001\u0000\u0000\u0000d\u01d3\u0001\u0000\u0000\u0000f\u01f1\u0001"+
		"\u0000\u0000\u0000hi\u0003f3\u0000ij\u0005\u0000\u0000\u0001j\u0001\u0001"+
		"\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l\u0003\u0001\u0000\u0000"+
		"\u0000mn\u0003\u0002\u0001\u0000n\u0005\u0001\u0000\u0000\u0000op\u0007"+
		"\u0001\u0000\u0000p\u0007\u0001\u0000\u0000\u0000qr\u0005\u001a\u0000"+
		"\u0000rs\u0003\n\u0005\u0000st\u0005\u001b\u0000\u0000t\t\u0001\u0000"+
		"\u0000\u0000uv\u0003L&\u0000vw\u0003\f\u0006\u0000wz\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z\u000b\u0001\u0000\u0000\u0000{|\u0005\u0005\u0000\u0000"+
		"|\u0084\u0003\n\u0005\u0000}~\u0005\u0004\u0000\u0000~\u007f\u0003\u000e"+
		"\u0007\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u0081\u0003L&\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000"+
		"\u0083{\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0088\u0003"+
		"L&\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u000f\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0003\u0014\n\u0000\u008a\u008b\u0005#\u0000\u0000"+
		"\u008b\u008c\u0003B!\u0000\u008c\u008d\u0003@ \u0000\u008d\u008e\u0003"+
		"\u0012\t\u0000\u008e\u0011\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u0014"+
		"\n\u0000\u0090\u0091\u0005$\u0000\u0000\u0091\u0092\u0003B!\u0000\u0092"+
		"\u0093\u0003@ \u0000\u0093\u0094\u0003\u0012\t\u0000\u0094\u009b\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0003\u0014\n\u0000\u0096\u0097\u0005%"+
		"\u0000\u0000\u0097\u0098\u0003@ \u0000\u0098\u009b\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u008f\u0001\u0000\u0000\u0000"+
		"\u009a\u0095\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u0013\u0001\u0000\u0000\u0000\u009c\u009d\u0005\"\u0000\u0000\u009d"+
		"\u009e\u0005\u0003\u0000\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0003$\u0012\u0000\u00a0\u00a1\u0003\u0018\f\u0000\u00a1\u00a2"+
		"\u0005\u0004\u0000\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0003\u0002\u0001\u0000\u00a4\u00a5\u0005B\u0000\u0000\u00a5\u00a6\u0003"+
		"\u001a\r\u0000\u00a6\u00ae\u0001\u0000\u0000\u0000\u00a7\u00a8\u00056"+
		"\u0000\u0000\u00a8\u00a9\u0003\"\u0011\u0000\u00a9\u00aa\u0005B\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0017\u0000\u0000\u00ab\u00ac\u0003D\"\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a3\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\u0017\u0000\u0000\u00b0\u00b3\u0003L&\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u001a\u0000\u0000\u00b5\u00b6\u0003\u001e\u000f\u0000\u00b6\u00b7"+
		"\u0005\u001b\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0003\u0006\u0003\u0000\u00bc\u00bd\u0003 \u0010\u0000\u00bd\u001f\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\u0005\u0000\u0000\u00bf\u00c2\u0003"+
		"\u001e\u000f\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2!\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c7\u0003\u0002"+
		"\u0001\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7#\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005/\u0000\u0000\u00c9\u00ca\u0005\u0003\u0000\u0000"+
		"\u00ca%\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003(\u0014\u0000\u00cc\u00cd"+
		"\u0003*\u0015\u0000\u00cd\'\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\'\u0000\u0000\u00cf\u00d0\u0005\u0003\u0000\u0000\u00d0)\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005(\u0000\u0000\u00d2\u00d3\u0005\u0003\u0000"+
		"\u0000\u00d3\u00d4\u0003,\u0016\u0000\u00d4\u00d5\u0003B!\u0000\u00d5"+
		"\u00d6\u0003@ \u0000\u00d6\u00dd\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"+\u0000\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u00da\u0003.\u0017"+
		"\u0000\u00da\u00db\u0003@ \u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d1\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000\u00dd"+
		"+\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0002\u0000\u0000\u00df-\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0005,\u0000\u0000\u00e1\u00e2\u0005\u001c"+
		"\u0000\u0000\u00e2\u00e3\u0005B\u0000\u0000\u00e3\u00e4\u0005-\u0000\u0000"+
		"\u00e4\u00e5\u0003L&\u0000\u00e5\u00e6\u0005\u001d\u0000\u0000\u00e6\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005.\u0000\u0000\u00e8\u00ea\u0003"+
		"L&\u0000\u00e9\u00e0\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ea/\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000"+
		"\u00ec\u00ef\u0003L&\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef1\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u00034\u001a\u0000\u00f1\u00f2\u00036\u001b"+
		"\u0000\u00f23\u0001\u0000\u0000\u0000\u00f3\u00f4\u00058\u0000\u0000\u00f4"+
		"\u00f5\u0005\u0003\u0000\u0000\u00f55\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u00038\u001c\u0000\u00f7\u00f8\u0005\u001c\u0000\u0000\u00f8\u00f9\u0003"+
		"L&\u0000\u00f9\u00fa\u0005\u001d\u0000\u0000\u00fa\u00fb\u0005\u0004\u0000"+
		"\u0000\u00fb\u010d\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005<\u0000\u0000"+
		"\u00fd\u00fe\u0005\u001c\u0000\u0000\u00fe\u00ff\u0003L&\u0000\u00ff\u0100"+
		"\u0005\u0005\u0000\u0000\u0100\u0101\u0003L&\u0000\u0101\u0102\u0005\u001d"+
		"\u0000\u0000\u0102\u0103\u0005\u0004\u0000\u0000\u0103\u010d\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005;\u0000\u0000\u0105\u0106\u0005\u001c\u0000"+
		"\u0000\u0106\u0107\u0003L&\u0000\u0107\u0108\u0005\u0005\u0000\u0000\u0108"+
		"\u0109\u0003L&\u0000\u0109\u010a\u0005\u001d\u0000\u0000\u010a\u010b\u0005"+
		"\u0004\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u00f6\u0001"+
		"\u0000\u0000\u0000\u010c\u00fc\u0001\u0000\u0000\u0000\u010c\u0104\u0001"+
		"\u0000\u0000\u0000\u010d7\u0001\u0000\u0000\u0000\u010e\u010f\u0007\u0003"+
		"\u0000\u0000\u010f9\u0001\u0000\u0000\u0000\u0110\u0111\u0003<\u001e\u0000"+
		"\u0111\u0112\u0003>\u001f\u0000\u0112;\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0005=\u0000\u0000\u0114\u0115\u0005\u0003\u0000\u0000\u0115=\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0005>\u0000\u0000\u0117\u0118\u0005\u001c\u0000"+
		"\u0000\u0118\u0119\u0003L&\u0000\u0119\u011a\u0005\u001d\u0000\u0000\u011a"+
		"\u011f\u0001\u0000\u0000\u0000\u011b\u011c\u0005?\u0000\u0000\u011c\u011d"+
		"\u0005\u001c\u0000\u0000\u011d\u011f\u0005\u001d\u0000\u0000\u011e\u0116"+
		"\u0001\u0000\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011f?\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005\u001a\u0000\u0000\u0121\u0122\u0003"+
		"f3\u0000\u0122\u0123\u0005\u001b\u0000\u0000\u0123\u0128\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0003L&\u0000\u0125\u0126\u0005\u0004\u0000\u0000\u0126"+
		"\u0128\u0001\u0000\u0000\u0000\u0127\u0120\u0001\u0000\u0000\u0000\u0127"+
		"\u0124\u0001\u0000\u0000\u0000\u0128A\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005\u001c\u0000\u0000\u012a\u012b\u0003L&\u0000\u012b\u012c\u0005\u001d"+
		"\u0000\u0000\u012cC\u0001\u0000\u0000\u0000\u012d\u012e\u0003F#\u0000"+
		"\u012e\u012f\u0003@ \u0000\u012fE\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0005\u001c\u0000\u0000\u0131\u0132\u0003H$\u0000\u0132\u0133\u0005\u001d"+
		"\u0000\u0000\u0133G\u0001\u0000\u0000\u0000\u0134\u0135\u0003\u0002\u0001"+
		"\u0000\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0137\u0005B\u0000\u0000"+
		"\u0137\u0138\u0003J%\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u013b"+
		"\u0001\u0000\u0000\u0000\u013a\u0134\u0001\u0000\u0000\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013bI\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"\u0005\u0000\u0000\u013d\u0140\u0003H$\u0000\u013e\u0140\u0001\u0000\u0000"+
		"\u0000\u013f\u013c\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000"+
		"\u0000\u0140K\u0001\u0000\u0000\u0000\u0141\u0142\u0006&\uffff\uffff\u0000"+
		"\u0142\u0143\u0003N\'\u0000\u0143\u0144\u0003P(\u0000\u0144\u0145\u0003"+
		"N\'\u0000\u0145\u0154\u0001\u0000\u0000\u0000\u0146\u0154\u0003R)\u0000"+
		"\u0147\u0148\u0005\n\u0000\u0000\u0148\u0154\u0003L&\f\u0149\u0154\u0003"+
		":\u001d\u0000\u014a\u014b\u0003\u0002\u0001\u0000\u014b\u014c\u0005\u001c"+
		"\u0000\u0000\u014c\u014d\u0003L&\u0000\u014d\u014e\u0005\u001d\u0000\u0000"+
		"\u014e\u0154\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0018\u0000\u0000"+
		"\u0150\u0151\u0003L&\u0000\u0151\u0152\u0005\u0019\u0000\u0000\u0152\u0154"+
		"\u0001\u0000\u0000\u0000\u0153\u0141\u0001\u0000\u0000\u0000\u0153\u0146"+
		"\u0001\u0000\u0000\u0000\u0153\u0147\u0001\u0000\u0000\u0000\u0153\u0149"+
		"\u0001\u0000\u0000\u0000\u0153\u014a\u0001\u0000\u0000\u0000\u0153\u014f"+
		"\u0001\u0000\u0000\u0000\u0154\u016f\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\n\t\u0000\u0000\u0156\u0157\u0005\u0006\u0000\u0000\u0157\u016e\u0003"+
		"L&\n\u0158\u0159\n\b\u0000\u0000\u0159\u015a\u0005\u000b\u0000\u0000\u015a"+
		"\u016e\u0003L&\t\u015b\u015c\n\u0007\u0000\u0000\u015c\u015d\u0005\f\u0000"+
		"\u0000\u015d\u016e\u0003L&\b\u015e\u015f\n\u0006\u0000\u0000\u015f\u0160"+
		"\u0005\r\u0000\u0000\u0160\u016e\u0003L&\u0007\u0161\u0162\n\u0005\u0000"+
		"\u0000\u0162\u0163\u0005\t\u0000\u0000\u0163\u016e\u0003L&\u0006\u0164"+
		"\u0165\n\u0004\u0000\u0000\u0165\u0166\u0005\n\u0000\u0000\u0166\u016e"+
		"\u0003L&\u0005\u0167\u0168\n\u0003\u0000\u0000\u0168\u0169\u0005\u000f"+
		"\u0000\u0000\u0169\u016e\u0003L&\u0004\u016a\u016b\n\u0002\u0000\u0000"+
		"\u016b\u016c\u0005\u000e\u0000\u0000\u016c\u016e\u0003L&\u0003\u016d\u0155"+
		"\u0001\u0000\u0000\u0000\u016d\u0158\u0001\u0000\u0000\u0000\u016d\u015b"+
		"\u0001\u0000\u0000\u0000\u016d\u015e\u0001\u0000\u0000\u0000\u016d\u0161"+
		"\u0001\u0000\u0000\u0000\u016d\u0164\u0001\u0000\u0000\u0000\u016d\u0167"+
		"\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016e\u0171"+
		"\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170M\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0006\'\uffff\uffff\u0000\u0173\u0181\u0003"+
		"R)\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175\u0181\u0003N\'\f\u0176"+
		"\u0181\u0003:\u001d\u0000\u0177\u0178\u0003\u0002\u0001\u0000\u0178\u0179"+
		"\u0005\u001c\u0000\u0000\u0179\u017a\u0003L&\u0000\u017a\u017b\u0005\u001d"+
		"\u0000\u0000\u017b\u0181\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0018"+
		"\u0000\u0000\u017d\u017e\u0003L&\u0000\u017e\u017f\u0005\u0019\u0000\u0000"+
		"\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u0172\u0001\u0000\u0000\u0000"+
		"\u0180\u0174\u0001\u0000\u0000\u0000\u0180\u0176\u0001\u0000\u0000\u0000"+
		"\u0180\u0177\u0001\u0000\u0000\u0000\u0180\u017c\u0001\u0000\u0000\u0000"+
		"\u0181\u019c\u0001\u0000\u0000\u0000\u0182\u0183\n\t\u0000\u0000\u0183"+
		"\u0184\u0005\u0006\u0000\u0000\u0184\u019b\u0003N\'\n\u0185\u0186\n\b"+
		"\u0000\u0000\u0186\u0187\u0005\u000b\u0000\u0000\u0187\u019b\u0003N\'"+
		"\t\u0188\u0189\n\u0007\u0000\u0000\u0189\u018a\u0005\f\u0000\u0000\u018a"+
		"\u019b\u0003N\'\b\u018b\u018c\n\u0006\u0000\u0000\u018c\u018d\u0005\r"+
		"\u0000\u0000\u018d\u019b\u0003N\'\u0007\u018e\u018f\n\u0005\u0000\u0000"+
		"\u018f\u0190\u0005\t\u0000\u0000\u0190\u019b\u0003N\'\u0006\u0191\u0192"+
		"\n\u0004\u0000\u0000\u0192\u0193\u0005\n\u0000\u0000\u0193\u019b\u0003"+
		"N\'\u0005\u0194\u0195\n\u0003\u0000\u0000\u0195\u0196\u0005\u000f\u0000"+
		"\u0000\u0196\u019b\u0003L&\u0000\u0197\u0198\n\u0002\u0000\u0000\u0198"+
		"\u0199\u0005\u000e\u0000\u0000\u0199\u019b\u0003L&\u0000\u019a\u0182\u0001"+
		"\u0000\u0000\u0000\u019a\u0185\u0001\u0000\u0000\u0000\u019a\u0188\u0001"+
		"\u0000\u0000\u0000\u019a\u018b\u0001\u0000\u0000\u0000\u019a\u018e\u0001"+
		"\u0000\u0000\u0000\u019a\u0191\u0001\u0000\u0000\u0000\u019a\u0194\u0001"+
		"\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019dO\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0007\u0004\u0000\u0000\u01a0Q\u0001\u0000\u0000"+
		"\u0000\u01a1\u01ab\u0005\u0001\u0000\u0000\u01a2\u01ab\u0005\u0002\u0000"+
		"\u0000\u01a3\u01ab\u0005!\u0000\u0000\u01a4\u01ab\u0005 \u0000\u0000\u01a5"+
		"\u01a6\u0005B\u0000\u0000\u01a6\u01ab\u0003T*\u0000\u01a7\u01ab\u0003"+
		"\u0006\u0003\u0000\u01a8\u01ab\u0003Z-\u0000\u01a9\u01ab\u0003\b\u0004"+
		"\u0000\u01aa\u01a1\u0001\u0000\u0000\u0000\u01aa\u01a2\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a3\u0001\u0000\u0000\u0000\u01aa\u01a4\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a5\u0001\u0000\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000"+
		"\u0000\u01abS\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u001a\u0000\u0000"+
		"\u01ad\u01ae\u0003V+\u0000\u01ae\u01af\u0005\u001b\u0000\u0000\u01af\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01ac"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2U\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0003L&\u0000\u01b4\u01b5\u0003X,\u0000"+
		"\u01b5W\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005\u0005\u0000\u0000\u01b7"+
		"\u01ba\u0003V+\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01baY\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0005&\u0000\u0000\u01bc\u01bd\u0005\u0003\u0000"+
		"\u0000\u01bd\u01be\u0005B\u0000\u0000\u01be\u01bf\u0003\\.\u0000\u01bf"+
		"[\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\u001c\u0000\u0000\u01c1\u01c2"+
		"\u0003^/\u0000\u01c2\u01c3\u0005\u001d\u0000\u0000\u01c3]\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0003L&\u0000\u01c5\u01c6\u0003`0\u0000\u01c6"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9"+
		"_\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\u0005\u0000\u0000\u01cb\u01ce"+
		"\u0003^/\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cea\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0005A\u0000\u0000\u01d0\u01d1\u0003L&\u0000\u01d1"+
		"\u01d2\u0005\u0004\u0000\u0000\u01d2c\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0005@\u0000\u0000\u01d4\u01d5\u0005B\u0000\u0000\u01d5\u01d6\u0003T"+
		"*\u0000\u01d6\u01d7\u0005\u0017\u0000\u0000\u01d7\u01d8\u0003L&\u0000"+
		"\u01d8\u01d9\u0005\u0004\u0000\u0000\u01d9e\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0003\u0010\b\u0000\u01db\u01dc\u0003f3\u0000\u01dc\u01f2\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0003&\u0013\u0000\u01de\u01df\u0003f3"+
		"\u0000\u01df\u01f2\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003\u0016\u000b"+
		"\u0000\u01e1\u01e2\u0003f3\u0000\u01e2\u01f2\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0003Z-\u0000\u01e4\u01e5\u0005\u0004\u0000\u0000\u01e5\u01e6\u0003"+
		"f3\u0000\u01e6\u01f2\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003b1\u0000"+
		"\u01e8\u01e9\u0003f3\u0000\u01e9\u01f2\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u00032\u0019\u0000\u01eb\u01ec\u0003f3\u0000\u01ec\u01f2\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0003d2\u0000\u01ee\u01ef\u0003f3\u0000\u01ef"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1"+
		"\u01da\u0001\u0000\u0000\u0000\u01f1\u01dd\u0001\u0000\u0000\u0000\u01f1"+
		"\u01e0\u0001\u0000\u0000\u0000\u01f1\u01e3\u0001\u0000\u0000\u0000\u01f1"+
		"\u01e7\u0001\u0000\u0000\u0000\u01f1\u01ea\u0001\u0000\u0000\u0000\u01f1"+
		"\u01ed\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2"+
		"g\u0001\u0000\u0000\u0000\u001dy\u0083\u0087\u009a\u00ad\u00b2\u00b9\u00c1"+
		"\u00c6\u00dc\u00e9\u00ee\u010c\u011e\u0127\u013a\u013f\u0153\u016d\u016f"+
		"\u0180\u019a\u019c\u01aa\u01b1\u01b9\u01c8\u01cd\u01f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}