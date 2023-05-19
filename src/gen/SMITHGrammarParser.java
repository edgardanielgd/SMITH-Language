// Generated from D:/UNAL Archivo/Lenguajes de Programación/SMITH/src/grammar\SMITHGrammar.g4 by ANTLR 4.12.0
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
		DECIDE=31, IF=32, IFNOT=33, DEFAULT=34, LOOP=35, REPEAT=36, UNTIL=37, 
		WHILE=38, FOR=39, EACH=40, IN=41, BLIND=42, DEFINE=43, INT=44, FLOAT=45, 
		ARRAY=46, NUMBER=47, STRING=48, BOOL=49, FUNCTION=50, TYPE=51, OUTPUT=52, 
		PRINT=53, PRINTLN=54, WRITEFILE=55, INPUT=56, READFILE=57, READCONSOLE=58, 
		SET=59, PROB=60, DUNIFORM=61, DPOISSON=62, DBERNOULLI=63, DBINOMIAL=64, 
		DGEOMETRIC=65, PUNIFORM=66, PPOISSON=67, PBERNOULLI=68, PBINOMIAL=69, 
		PGEOMETRIC=70, RETURN=71, IDENTIFIER=72, WS=73, COMMENT=74, A=75, S=76;
	public static final int
		RULE_program = 0, RULE_atomictype = 1, RULE_variabletype = 2, RULE_numberliteral = 3, 
		RULE_decideblock = 4, RULE_decisionextension = 5, RULE_decideprefix = 6, 
		RULE_definestatement = 7, RULE_definedefaultvalue = 8, RULE_defineextension = 9, 
		RULE_arrayextension = 10, RULE_dimensions = 11, RULE_furtherdimensions = 12, 
		RULE_functiondefextension = 13, RULE_assignationexp = 14, RULE_defineprefix = 15, 
		RULE_loopblock = 16, RULE_loopprefix = 17, RULE_loopextension = 18, RULE_repeattype = 19, 
		RULE_forextension = 20, RULE_rangeextension = 21, RULE_statementbody = 22, 
		RULE_conditional = 23, RULE_functionblock = 24, RULE_functionarguments = 25, 
		RULE_arguments = 26, RULE_furtherarguments = 27, RULE_expression = 28, 
		RULE_expressionextension = 29, RULE_expressionnc = 30, RULE_expressionncextension = 31, 
		RULE_aritmeticoperator = 32, RULE_logicaloperator = 33, RULE_comparisonoperator = 34, 
		RULE_literal = 35, RULE_functioncall = 36, RULE_returnstatement = 37, 
		RULE_block = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "atomictype", "variabletype", "numberliteral", "decideblock", 
			"decisionextension", "decideprefix", "definestatement", "definedefaultvalue", 
			"defineextension", "arrayextension", "dimensions", "furtherdimensions", 
			"functiondefextension", "assignationexp", "defineprefix", "loopblock", 
			"loopprefix", "loopextension", "repeattype", "forextension", "rangeextension", 
			"statementbody", "conditional", "functionblock", "functionarguments", 
			"arguments", "furtherarguments", "expression", "expressionextension", 
			"expressionnc", "expressionncextension", "aritmeticoperator", "logicaloperator", 
			"comparisonoperator", "literal", "functioncall", "returnstatement", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "','", "'.'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&'", "'|'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'as'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, null, 
			"'decide'", "'if'", "'ifnot'", "'default'", "'loop'", "'repeat'", "'until'", 
			"'while'", "'for'", "'each'", "'in'", "'blind'", "'define'", "'int'", 
			"'float'", "'array'", null, "'string'", "'bool'", "'function'", "'type'", 
			"'output'", "'print'", "'println'", "'writefile'", "'input'", "'readfile'", 
			"'readconsole'", "'set'", "'prob'", "'duniform'", "'dpoisson'", "'dbernoulli'", 
			"'dbinomial'", "'dgeometric'", "'puniform'", "'ppoisson'", "'pbernoulli'", 
			"'pbinomial'", "'pgeometric'", "'return'"
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
			"DECIDE", "IF", "IFNOT", "DEFAULT", "LOOP", "REPEAT", "UNTIL", "WHILE", 
			"FOR", "EACH", "IN", "BLIND", "DEFINE", "INT", "FLOAT", "ARRAY", "NUMBER", 
			"STRING", "BOOL", "FUNCTION", "TYPE", "OUTPUT", "PRINT", "PRINTLN", "WRITEFILE", 
			"INPUT", "READFILE", "READCONSOLE", "SET", "PROB", "DUNIFORM", "DPOISSON", 
			"DBERNOULLI", "DBINOMIAL", "DGEOMETRIC", "PUNIFORM", "PPOISSON", "PBERNOULLI", 
			"PBINOMIAL", "PGEOMETRIC", "RETURN", "IDENTIFIER", "WS", "COMMENT", "A", 
			"S"
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
			setState(78);
			block();
			setState(79);
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
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 897201488265216L) != 0)) ) {
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
			setState(83);
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
			setState(85);
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
		enterRule(_localctx, 8, RULE_decideblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			decideprefix();
			setState(88);
			match(IF);
			setState(89);
			conditional();
			setState(90);
			statementbody();
			setState(91);
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
		enterRule(_localctx, 10, RULE_decisionextension);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				decideprefix();
				setState(94);
				match(IFNOT);
				setState(95);
				conditional();
				setState(96);
				statementbody();
				setState(97);
				decisionextension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				decideprefix();
				setState(100);
				match(DEFAULT);
				setState(101);
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
		enterRule(_localctx, 12, RULE_decideprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(DECIDE);
			setState(107);
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
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public DefinedefaultvalueContext definedefaultvalue() {
			return getRuleContext(DefinedefaultvalueContext.class,0);
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
		enterRule(_localctx, 14, RULE_definestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			defineprefix();
			setState(110);
			defineextension();
			setState(111);
			match(IDENTIFIER);
			setState(112);
			definedefaultvalue();
			setState(113);
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
	public static class DefinedefaultvalueContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SMITHGrammarParser.ASSIGN, 0); }
		public AssignationexpContext assignationexp() {
			return getRuleContext(AssignationexpContext.class,0);
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
		enterRule(_localctx, 16, RULE_definedefaultvalue);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(ASSIGN);
				setState(116);
				assignationexp();
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
	public static class DefineextensionContext extends ParserRuleContext {
		public AtomictypeContext atomictype() {
			return getRuleContext(AtomictypeContext.class,0);
		}
		public ArrayextensionContext arrayextension() {
			return getRuleContext(ArrayextensionContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(SMITHGrammarParser.FUNCTION, 0); }
		public FunctiondefextensionContext functiondefextension() {
			return getRuleContext(FunctiondefextensionContext.class,0);
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
		enterRule(_localctx, 18, RULE_defineextension);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				atomictype();
				setState(121);
				arrayextension();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(FUNCTION);
				setState(124);
				functiondefextension();
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
		enterRule(_localctx, 20, RULE_arrayextension);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(OPEN_BRACKET);
				setState(128);
				dimensions();
				setState(129);
				match(CLOSE_BRACKET);
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
		enterRule(_localctx, 22, RULE_dimensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			numberliteral();
			setState(135);
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
		enterRule(_localctx, 24, RULE_furtherdimensions);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(COMMA);
				setState(138);
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
		enterRule(_localctx, 26, RULE_functiondefextension);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(COLON);
				setState(143);
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
	public static class AssignationexpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionblockContext functionblock() {
			return getRuleContext(FunctionblockContext.class,0);
		}
		public AssignationexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterAssignationexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitAssignationexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitAssignationexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationexpContext assignationexp() throws RecognitionException {
		AssignationexpContext _localctx = new AssignationexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignationexp);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 30, RULE_defineprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DEFINE);
			setState(152);
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
		enterRule(_localctx, 32, RULE_loopblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			loopprefix();
			setState(155);
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
		enterRule(_localctx, 34, RULE_loopprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(LOOP);
			setState(158);
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
		enterRule(_localctx, 36, RULE_loopextension);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(REPEAT);
				setState(161);
				match(COLON);
				setState(162);
				repeattype();
				setState(163);
				conditional();
				setState(164);
				statementbody();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(FOR);
				setState(167);
				match(COLON);
				setState(168);
				forextension();
				setState(169);
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
		enterRule(_localctx, 38, RULE_repeattype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 40, RULE_forextension);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EACH:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(EACH);
				setState(176);
				match(OPEN_BRACE);
				setState(177);
				match(IDENTIFIER);
				setState(178);
				match(IN);
				setState(179);
				expression();
				setState(180);
				match(CLOSE_BRACE);
				}
				break;
			case BLIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(BLIND);
				setState(183);
				expression();
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
		enterRule(_localctx, 42, RULE_rangeextension);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(COLON);
				setState(187);
				expression();
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
		enterRule(_localctx, 44, RULE_statementbody);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(OPEN_BRACKET);
				setState(192);
				block();
				setState(193);
				match(CLOSE_BRACKET);
				}
				break;
			case OPEN_PAREN:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				expression();
				setState(196);
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
		enterRule(_localctx, 46, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(OPEN_BRACE);
			setState(201);
			expression();
			setState(202);
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
		enterRule(_localctx, 48, RULE_functionblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			functionarguments();
			setState(205);
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
		enterRule(_localctx, 50, RULE_functionarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(OPEN_BRACE);
			setState(208);
			arguments();
			setState(209);
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
		enterRule(_localctx, 52, RULE_arguments);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				atomictype();
				setState(212);
				match(IDENTIFIER);
				setState(213);
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
		enterRule(_localctx, 54, RULE_furtherarguments);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(COMMA);
				setState(219);
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
		public ExpressionextensionContext expressionextension() {
			return getRuleContext(ExpressionextensionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SMITHGrammarParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SMITHGrammarParser.CLOSE_PAREN, 0); }
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
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				literal();
				setState(224);
				expressionextension();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(OPEN_PAREN);
				setState(227);
				expression();
				setState(228);
				match(CLOSE_PAREN);
				setState(229);
				expressionextension();
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
	public static class ExpressionextensionContext extends ParserRuleContext {
		public AritmeticoperatorContext aritmeticoperator() {
			return getRuleContext(AritmeticoperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicaloperatorContext logicaloperator() {
			return getRuleContext(LogicaloperatorContext.class,0);
		}
		public ComparisonoperatorContext comparisonoperator() {
			return getRuleContext(ComparisonoperatorContext.class,0);
		}
		public ExpressionncContext expressionnc() {
			return getRuleContext(ExpressionncContext.class,0);
		}
		public ExpressionextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterExpressionextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitExpressionextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitExpressionextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionextensionContext expressionextension() throws RecognitionException {
		ExpressionextensionContext _localctx = new ExpressionextensionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionextension);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TIMES:
			case DIVIDE:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				aritmeticoperator();
				setState(234);
				expression();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				logicaloperator();
				setState(237);
				expression();
				}
				break;
			case LESS:
			case GREATER:
			case LESS_EQUAL:
			case GREATER_EQUAL:
			case EQUAL_EQUAL:
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				comparisonoperator();
				setState(240);
				expressionnc();
				}
				break;
			case EOF:
			case SEMICOLON:
			case OPEN_PAREN:
			case CLOSE_PAREN:
			case OPEN_BRACKET:
			case CLOSE_BRACE:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
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
	public static class ExpressionncContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionncextensionContext expressionncextension() {
			return getRuleContext(ExpressionncextensionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(SMITHGrammarParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SMITHGrammarParser.CLOSE_PAREN, 0); }
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
		ExpressionncContext _localctx = new ExpressionncContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionnc);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				literal();
				setState(246);
				expressionncextension();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(OPEN_PAREN);
				setState(249);
				expression();
				setState(250);
				match(CLOSE_PAREN);
				setState(251);
				expressionncextension();
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
	public static class ExpressionncextensionContext extends ParserRuleContext {
		public AritmeticoperatorContext aritmeticoperator() {
			return getRuleContext(AritmeticoperatorContext.class,0);
		}
		public ExpressionncContext expressionnc() {
			return getRuleContext(ExpressionncContext.class,0);
		}
		public LogicaloperatorContext logicaloperator() {
			return getRuleContext(LogicaloperatorContext.class,0);
		}
		public ExpressionncextensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionncextension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterExpressionncextension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitExpressionncextension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitExpressionncextension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionncextensionContext expressionncextension() throws RecognitionException {
		ExpressionncextensionContext _localctx = new ExpressionncextensionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionncextension);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TIMES:
			case DIVIDE:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				aritmeticoperator();
				setState(256);
				expressionnc();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				logicaloperator();
				setState(259);
				expressionnc();
				}
				break;
			case EOF:
			case SEMICOLON:
			case OPEN_PAREN:
			case CLOSE_PAREN:
			case OPEN_BRACKET:
			case CLOSE_BRACE:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
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
	public static class AritmeticoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SMITHGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SMITHGrammarParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(SMITHGrammarParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SMITHGrammarParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SMITHGrammarParser.MOD, 0); }
		public AritmeticoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmeticoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).enterAritmeticoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMITHGrammarListener ) ((SMITHGrammarListener)listener).exitAritmeticoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMITHGrammarVisitor ) return ((SMITHGrammarVisitor<? extends T>)visitor).visitAritmeticoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmeticoperatorContext aritmeticoperator() throws RecognitionException {
		AritmeticoperatorContext _localctx = new AritmeticoperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_aritmeticoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1984L) != 0)) ) {
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
		enterRule(_localctx, 66, RULE_logicaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 68, RULE_comparisonoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 70, RULE_literal);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				numberliteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				functioncall();
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
	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SMITHGrammarParser.IDENTIFIER, 0); }
		public FunctionargumentsContext functionarguments() {
			return getRuleContext(FunctionargumentsContext.class,0);
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
		enterRule(_localctx, 72, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(IDENTIFIER);
			setState(278);
			functionarguments();
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
		enterRule(_localctx, 74, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(RETURN);
			setState(281);
			expression();
			setState(282);
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
		enterRule(_localctx, 76, RULE_block);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				decideblock();
				setState(285);
				block();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				loopblock();
				setState(288);
				block();
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				definestatement();
				setState(291);
				block();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				functioncall();
				setState(294);
				match(SEMICOLON);
				setState(295);
				block();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				returnstatement();
				setState(298);
				block();
				}
				break;
			case EOF:
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 6);
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
		"\u0004\u0001L\u0130\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005i\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\bw\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t~\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0085\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u008d\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0003\r\u0092\b\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0096\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ac\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b9"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00be\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00c7\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00d9\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u00de\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00e8\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u00f4\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u00fe\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0107\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u0114\b#\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u012e\b&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000"+
		"\u0006\u0002\u0000,-01\u0001\u0000\u001b\u001c\u0001\u0000%&\u0001\u0000"+
		"\u0006\n\u0001\u0000\u000b\f\u0001\u0000\u000e\u0013\u0126\u0000N\u0001"+
		"\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004S\u0001\u0000\u0000"+
		"\u0000\u0006U\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\nh\u0001"+
		"\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000"+
		"\u0000\u0010v\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014"+
		"\u0084\u0001\u0000\u0000\u0000\u0016\u0086\u0001\u0000\u0000\u0000\u0018"+
		"\u008c\u0001\u0000\u0000\u0000\u001a\u0091\u0001\u0000\u0000\u0000\u001c"+
		"\u0095\u0001\u0000\u0000\u0000\u001e\u0097\u0001\u0000\u0000\u0000 \u009a"+
		"\u0001\u0000\u0000\u0000\"\u009d\u0001\u0000\u0000\u0000$\u00ab\u0001"+
		"\u0000\u0000\u0000&\u00ad\u0001\u0000\u0000\u0000(\u00b8\u0001\u0000\u0000"+
		"\u0000*\u00bd\u0001\u0000\u0000\u0000,\u00c6\u0001\u0000\u0000\u0000."+
		"\u00c8\u0001\u0000\u0000\u00000\u00cc\u0001\u0000\u0000\u00002\u00cf\u0001"+
		"\u0000\u0000\u00004\u00d8\u0001\u0000\u0000\u00006\u00dd\u0001\u0000\u0000"+
		"\u00008\u00e7\u0001\u0000\u0000\u0000:\u00f3\u0001\u0000\u0000\u0000<"+
		"\u00fd\u0001\u0000\u0000\u0000>\u0106\u0001\u0000\u0000\u0000@\u0108\u0001"+
		"\u0000\u0000\u0000B\u010a\u0001\u0000\u0000\u0000D\u010c\u0001\u0000\u0000"+
		"\u0000F\u0113\u0001\u0000\u0000\u0000H\u0115\u0001\u0000\u0000\u0000J"+
		"\u0118\u0001\u0000\u0000\u0000L\u012d\u0001\u0000\u0000\u0000NO\u0003"+
		"L&\u0000OP\u0005\u0000\u0000\u0001P\u0001\u0001\u0000\u0000\u0000QR\u0007"+
		"\u0000\u0000\u0000R\u0003\u0001\u0000\u0000\u0000ST\u0003\u0002\u0001"+
		"\u0000T\u0005\u0001\u0000\u0000\u0000UV\u0007\u0001\u0000\u0000V\u0007"+
		"\u0001\u0000\u0000\u0000WX\u0003\f\u0006\u0000XY\u0005 \u0000\u0000YZ"+
		"\u0003.\u0017\u0000Z[\u0003,\u0016\u0000[\\\u0003\n\u0005\u0000\\\t\u0001"+
		"\u0000\u0000\u0000]^\u0003\f\u0006\u0000^_\u0005!\u0000\u0000_`\u0003"+
		".\u0017\u0000`a\u0003,\u0016\u0000ab\u0003\n\u0005\u0000bi\u0001\u0000"+
		"\u0000\u0000cd\u0003\f\u0006\u0000de\u0005\"\u0000\u0000ef\u0003,\u0016"+
		"\u0000fi\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000h]\u0001\u0000"+
		"\u0000\u0000hc\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\u000b"+
		"\u0001\u0000\u0000\u0000jk\u0005\u001f\u0000\u0000kl\u0005\u0001\u0000"+
		"\u0000l\r\u0001\u0000\u0000\u0000mn\u0003\u001e\u000f\u0000no\u0003\u0012"+
		"\t\u0000op\u0005H\u0000\u0000pq\u0003\u0010\b\u0000qr\u0005\u0002\u0000"+
		"\u0000r\u000f\u0001\u0000\u0000\u0000st\u0005\u0014\u0000\u0000tw\u0003"+
		"\u001c\u000e\u0000uw\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000w\u0011\u0001\u0000\u0000\u0000xy\u0003\u0002"+
		"\u0001\u0000yz\u0003\u0014\n\u0000z~\u0001\u0000\u0000\u0000{|\u00052"+
		"\u0000\u0000|~\u0003\u001a\r\u0000}x\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0017\u0000"+
		"\u0000\u0080\u0081\u0003\u0016\u000b\u0000\u0081\u0082\u0005\u0018\u0000"+
		"\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0006\u0003"+
		"\u0000\u0087\u0088\u0003\u0018\f\u0000\u0088\u0017\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008d\u0003\u0016\u000b\u0000"+
		"\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0019\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\u0001\u0000\u0000\u008f\u0092\u0003\u0002\u0001\u0000"+
		"\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u001b\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u00038\u001c\u0000\u0094\u0096\u00030\u0018\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u001d"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005+\u0000\u0000\u0098\u0099\u0005"+
		"\u0001\u0000\u0000\u0099\u001f\u0001\u0000\u0000\u0000\u009a\u009b\u0003"+
		"\"\u0011\u0000\u009b\u009c\u0003$\u0012\u0000\u009c!\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005#\u0000\u0000\u009e\u009f\u0005\u0001\u0000\u0000"+
		"\u009f#\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005$\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0001\u0000\u0000\u00a2\u00a3\u0003&\u0013\u0000\u00a3\u00a4\u0003"+
		".\u0017\u0000\u00a4\u00a5\u0003,\u0016\u0000\u00a5\u00ac\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\'\u0000\u0000\u00a7\u00a8\u0005\u0001\u0000\u0000"+
		"\u00a8\u00a9\u0003(\u0014\u0000\u00a9\u00aa\u0003,\u0016\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a0\u0001\u0000\u0000\u0000\u00ab\u00a6"+
		"\u0001\u0000\u0000\u0000\u00ac%\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007"+
		"\u0002\u0000\u0000\u00ae\'\u0001\u0000\u0000\u0000\u00af\u00b0\u0005("+
		"\u0000\u0000\u00b0\u00b1\u0005\u0019\u0000\u0000\u00b1\u00b2\u0005H\u0000"+
		"\u0000\u00b2\u00b3\u0005)\u0000\u0000\u00b3\u00b4\u00038\u001c\u0000\u00b4"+
		"\u00b5\u0005\u001a\u0000\u0000\u00b5\u00b9\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005*\u0000\u0000\u00b7\u00b9\u00038\u001c\u0000\u00b8\u00af\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9)\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0001\u0000\u0000\u00bb\u00be\u00038\u001c"+
		"\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be+\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0017\u0000\u0000\u00c0\u00c1\u0003L&\u0000\u00c1\u00c2"+
		"\u0005\u0018\u0000\u0000\u00c2\u00c7\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u00038\u001c\u0000\u00c4\u00c5\u0005\u0002\u0000\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00bf\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c7-\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0019"+
		"\u0000\u0000\u00c9\u00ca\u00038\u001c\u0000\u00ca\u00cb\u0005\u001a\u0000"+
		"\u0000\u00cb/\u0001\u0000\u0000\u0000\u00cc\u00cd\u00032\u0019\u0000\u00cd"+
		"\u00ce\u0003,\u0016\u0000\u00ce1\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0019\u0000\u0000\u00d0\u00d1\u00034\u001a\u0000\u00d1\u00d2\u0005\u001a"+
		"\u0000\u0000\u00d23\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003\u0002\u0001"+
		"\u0000\u00d4\u00d5\u0005H\u0000\u0000\u00d5\u00d6\u00036\u001b\u0000\u00d6"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"5\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00de"+
		"\u00034\u001a\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de7\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0003F#\u0000\u00e0\u00e1\u0003:\u001d\u0000"+
		"\u00e1\u00e8\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0015\u0000\u0000"+
		"\u00e3\u00e4\u00038\u001c\u0000\u00e4\u00e5\u0005\u0016\u0000\u0000\u00e5"+
		"\u00e6\u0003:\u001d\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00df"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e89\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0003@ \u0000\u00ea\u00eb\u00038\u001c"+
		"\u0000\u00eb\u00f4\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003B!\u0000\u00ed"+
		"\u00ee\u00038\u001c\u0000\u00ee\u00f4\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0003D\"\u0000\u00f0\u00f1\u0003<\u001e\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00e9\u0001\u0000"+
		"\u0000\u0000\u00f3\u00ec\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4;\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0003F#\u0000\u00f6\u00f7\u0003>\u001f\u0000\u00f7"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0015\u0000\u0000\u00f9"+
		"\u00fa\u00038\u001c\u0000\u00fa\u00fb\u0005\u0016\u0000\u0000\u00fb\u00fc"+
		"\u0003>\u001f\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f5\u0001"+
		"\u0000\u0000\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fe=\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0003@ \u0000\u0100\u0101\u0003<\u001e\u0000"+
		"\u0101\u0107\u0001\u0000\u0000\u0000\u0102\u0103\u0003B!\u0000\u0103\u0104"+
		"\u0003<\u001e\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0107\u0001"+
		"\u0000\u0000\u0000\u0106\u00ff\u0001\u0000\u0000\u0000\u0106\u0102\u0001"+
		"\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107?\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0007\u0003\u0000\u0000\u0109A\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0007\u0004\u0000\u0000\u010bC\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0007\u0005\u0000\u0000\u010dE\u0001\u0000\u0000\u0000\u010e"+
		"\u0114\u0005\u001e\u0000\u0000\u010f\u0114\u0005\u001d\u0000\u0000\u0110"+
		"\u0114\u0005H\u0000\u0000\u0111\u0114\u0003\u0006\u0003\u0000\u0112\u0114"+
		"\u0003H$\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000"+
		"\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114G\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0005H\u0000\u0000\u0116\u0117\u00032\u0019\u0000\u0117"+
		"I\u0001\u0000\u0000\u0000\u0118\u0119\u0005G\u0000\u0000\u0119\u011a\u0003"+
		"8\u001c\u0000\u011a\u011b\u0005\u0002\u0000\u0000\u011bK\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0003\b\u0004\u0000\u011d\u011e\u0003L&\u0000\u011e"+
		"\u012e\u0001\u0000\u0000\u0000\u011f\u0120\u0003 \u0010\u0000\u0120\u0121"+
		"\u0003L&\u0000\u0121\u012e\u0001\u0000\u0000\u0000\u0122\u0123\u0003\u000e"+
		"\u0007\u0000\u0123\u0124\u0003L&\u0000\u0124\u012e\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0003H$\u0000\u0126\u0127\u0005\u0002\u0000\u0000\u0127\u0128"+
		"\u0003L&\u0000\u0128\u012e\u0001\u0000\u0000\u0000\u0129\u012a\u0003J"+
		"%\u0000\u012a\u012b\u0003L&\u0000\u012b\u012e\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u011c\u0001\u0000\u0000\u0000"+
		"\u012d\u011f\u0001\u0000\u0000\u0000\u012d\u0122\u0001\u0000\u0000\u0000"+
		"\u012d\u0125\u0001\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000"+
		"\u012d\u012c\u0001\u0000\u0000\u0000\u012eM\u0001\u0000\u0000\u0000\u0013"+
		"hv}\u0084\u008c\u0091\u0095\u00ab\u00b8\u00bd\u00c6\u00d8\u00dd\u00e7"+
		"\u00f3\u00fd\u0106\u0113\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}