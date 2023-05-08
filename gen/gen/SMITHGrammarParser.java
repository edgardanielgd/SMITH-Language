// Generated from D:/UNAL Archivo/Lenguajes de Programación/SMITH/grammar\SMITHGrammar.g4 by ANTLR 4.12.0
package gen;
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
		DECIDE=31, IF=32, IFNOT=33, DEFAULT=34, LOOP=35, REPEAT=36, DEFINE=37, 
		INT=38, FLOAT=39, STRING=40, BOOL=41, FUNCTION=42, TYPE=43, OUTPUT=44, 
		PRINT=45, PRINTLN=46, WRITEFILE=47, INPUT=48, READFILE=49, READCONSOLE=50, 
		SET=51, PROB=52, DUNIFORM=53, DPOISSON=54, DBERNOULLI=55, DBINOMIAL=56, 
		DGEOMETRIC=57, PUNIFORM=58, PPOISSON=59, PBERNOULLI=60, PBINOMIAL=61, 
		PGEOMETRIC=62, RETURN=63, IDENTIFIER=64, WS=65, COMMENT=66, A=67, S=68;
	public static final int
		RULE_program = 0, RULE_decideblock = 1, RULE_decideargs = 2, RULE_conditional = 3, 
		RULE_expression = 4, RULE_block = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decideblock", "decideargs", "conditional", "expression", 
			"block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "','", "'.'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&'", "'|'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'as'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, null, 
			"'decide'", "'if'", "'ifnot'", "'default'", "'loop'", "'repeat'", "'define'", 
			"'int'", "'float'", "'string'", "'bool'", "'function'", "'type'", "'output'", 
			"'print'", "'println'", "'writefile'", "'input'", "'readfile'", "'readconsole'", 
			"'set'", "'prob'", "'duniform'", "'dpoisson'", "'dbernoulli'", "'dbinomial'", 
			"'dgeometric'", "'puniform'", "'ppoisson'", "'pbernoulli'", "'pbinomial'", 
			"'pgeometric'", "'return'"
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
			"DECIDE", "IF", "IFNOT", "DEFAULT", "LOOP", "REPEAT", "DEFINE", "INT", 
			"FLOAT", "STRING", "BOOL", "FUNCTION", "TYPE", "OUTPUT", "PRINT", "PRINTLN", 
			"WRITEFILE", "INPUT", "READFILE", "READCONSOLE", "SET", "PROB", "DUNIFORM", 
			"DPOISSON", "DBERNOULLI", "DBINOMIAL", "DGEOMETRIC", "PUNIFORM", "PPOISSON", 
			"PBERNOULLI", "PBINOMIAL", "PGEOMETRIC", "RETURN", "IDENTIFIER", "WS", 
			"COMMENT", "A", "S"
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
			setState(12);
			block();
			setState(13);
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
	public static class DecideblockContext extends ParserRuleContext {
		public TerminalNode DECIDE() { return getToken(SMITHGrammarParser.DECIDE, 0); }
		public TerminalNode COLON() { return getToken(SMITHGrammarParser.COLON, 0); }
		public DecideargsContext decideargs() {
			return getRuleContext(DecideargsContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(SMITHGrammarParser.OPEN_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SMITHGrammarParser.CLOSE_BRACKET, 0); }
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
		enterRule(_localctx, 2, RULE_decideblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(DECIDE);
			setState(16);
			match(COLON);
			setState(17);
			decideargs();
			setState(18);
			match(OPEN_BRACKET);
			setState(19);
			block();
			setState(20);
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
	public static class DecideargsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SMITHGrammarParser.IF, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode IFNOT() { return getToken(SMITHGrammarParser.IFNOT, 0); }
		public TerminalNode DEFAULT() { return getToken(SMITHGrammarParser.DEFAULT, 0); }
		public DecideargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decideargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterDecideargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitDecideargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitDecideargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecideargsContext decideargs() throws RecognitionException {
		DecideargsContext _localctx = new DecideargsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decideargs);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(IF);
				setState(23);
				conditional();
				}
				break;
			case IFNOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(IFNOT);
				setState(25);
				conditional();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(DEFAULT);
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
		enterRule(_localctx, 6, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(OPEN_BRACE);
			setState(30);
			expression();
			setState(31);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(SMITHGrammarParser.BOOLEAN_LITERAL, 0); }
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(BOOLEAN_LITERAL);
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
		enterRule(_localctx, 10, RULE_block);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				decideblock();
				setState(36);
				block();
				}
				break;
			case EOF:
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

	public static final String _serializedATN =
		"\u0004\u0001D*\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001c\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005(\b\u0005"+
		"\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000"+
		"&\u0000\f\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000"+
		"\u0004\u001b\u0001\u0000\u0000\u0000\u0006\u001d\u0001\u0000\u0000\u0000"+
		"\b!\u0001\u0000\u0000\u0000\n\'\u0001\u0000\u0000\u0000\f\r\u0003\n\u0005"+
		"\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005\u001f\u0000\u0000\u0010\u0011\u0005\u0001\u0000\u0000"+
		"\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0005\u0017\u0000\u0000"+
		"\u0013\u0014\u0003\n\u0005\u0000\u0014\u0015\u0005\u0018\u0000\u0000\u0015"+
		"\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0005 \u0000\u0000\u0017\u001c"+
		"\u0003\u0006\u0003\u0000\u0018\u0019\u0005!\u0000\u0000\u0019\u001c\u0003"+
		"\u0006\u0003\u0000\u001a\u001c\u0005\"\u0000\u0000\u001b\u0016\u0001\u0000"+
		"\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0019"+
		"\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0005\u001a\u0000"+
		"\u0000 \u0007\u0001\u0000\u0000\u0000!\"\u0005\u001e\u0000\u0000\"\t\u0001"+
		"\u0000\u0000\u0000#$\u0003\u0002\u0001\u0000$%\u0003\n\u0005\u0000%(\u0001"+
		"\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(\u000b\u0001\u0000\u0000\u0000\u0002\u001b"+
		"\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}