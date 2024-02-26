// Generated from c://Users//Luiz//Desktop//Compiladores-Final//Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, OE=3, CE=4, OB=5, CB=6, AT=7, SEP=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, AND=13, OR=14, NOT=15, EQ=16, LT=17, GT=18, LE=19, GE=20, 
		NE=21, BOOL_TRUE=22, BOL_FALSE=23, IF=24, WHILE=25, DO=26, FOR=27, FUNCTION=28, 
		RETURN=29, THEN=30, ELSE=31, WRITE=32, READ=33, STR=34, EOL=35, NUM=36, 
		VAR=37, COMMENT=38, WS=39;
	public static final int
		RULE_prog = 0, RULE_start_ = 1, RULE_functions = 2, RULE_function = 3, 
		RULE_fnBlock = 4, RULE_fnBody = 5, RULE_params = 6, RULE_line = 7, RULE_funcInvoc = 8, 
		RULE_stmt = 9, RULE_input = 10, RULE_output = 11, RULE_tipo = 12, RULE_ifst = 13, 
		RULE_whilest = 14, RULE_forst = 15, RULE_block = 16, RULE_cond = 17, RULE_atrib = 18, 
		RULE_expr = 19, RULE_term = 20, RULE_factor = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "start_", "functions", "function", "fnBlock", "fnBody", "params", 
			"line", "funcInvoc", "stmt", "input", "output", "tipo", "ifst", "whilest", 
			"forst", "block", "cond", "atrib", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'numero'", "'texto'", "'('", "')'", "'{'", "'}'", "'='", "','", 
			"'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "'=='", "'<'", "'>'", 
			"'<='", "'>='", "'!='", "'true'", "'false'", null, null, null, null, 
			null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", "MINUS", 
			"MULT", "DIV", "AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", 
			"BOOL_TRUE", "BOL_FALSE", "IF", "WHILE", "DO", "FOR", "FUNCTION", "RETURN", 
			"THEN", "ELSE", "WRITE", "READ", "STR", "EOL", "NUM", "VAR", "COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgLineContext extends ProgContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgLineContext(ProgContext ctx) { copyFrom(ctx); }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			functions();
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				line();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 176345317382L) != 0) );
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
	public static class Start_Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EOF() { return getToken(LangParser.EOF, 0); }
		public List<TerminalNode> EOL() { return getTokens(LangParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LangParser.EOL, i);
		}
		public Start_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_; }
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			expr();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(51);
				match(EOL);
				setState(52);
				expr();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functions);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				function();
				setState(61);
				functions();
				}
				break;
			case T__0:
			case T__1:
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case WRITE:
			case EOL:
			case VAR:
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LangParser.FUNCTION, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(FUNCTION);
			setState(67);
			match(VAR);
			setState(68);
			match(OE);
			setState(69);
			params();
			setState(70);
			match(CE);
			setState(71);
			fnBlock();
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
	public static class FnBlockContext extends ParserRuleContext {
		public FnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBlock; }
	 
		public FnBlockContext() { }
		public void copyFrom(FnBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBlockLineContext extends FnBlockContext {
		public TerminalNode OB() { return getToken(LangParser.OB, 0); }
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(LangParser.CB, 0); }
		public FnBlockLineContext(FnBlockContext ctx) { copyFrom(ctx); }
	}

	public final FnBlockContext fnBlock() throws RecognitionException {
		FnBlockContext _localctx = new FnBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnBlock);
		try {
			_localctx = new FnBlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(OB);
			setState(74);
			fnBody();
			setState(75);
			match(CB);
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
	public static class FnBodyContext extends ParserRuleContext {
		public FnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBody; }
	 
		public FnBodyContext() { }
		public void copyFrom(FnBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnReturnLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public FnReturnLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnReturnExprLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public FnReturnExprLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineMoreContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnBodyLineMoreContext(FnBodyContext ctx) { copyFrom(ctx); }
	}

	public final FnBodyContext fnBody() throws RecognitionException {
		FnBodyContext _localctx = new FnBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fnBody);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new FnBodyLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				line();
				}
				break;
			case 2:
				_localctx = new FnBodyLineMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				line();
				setState(79);
				fnBody();
				}
				break;
			case 3:
				_localctx = new FnReturnExprLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(RETURN);
				setState(82);
				expr();
				setState(83);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new FnReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(RETURN);
				setState(86);
				match(EOL);
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
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode SEP() { return getToken(LangParser.SEP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(VAR);
				setState(91);
				match(SEP);
				setState(92);
				params();
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
	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineWhileContext extends LineContext {
		public WhilestContext whilest() {
			return getRuleContext(WhilestContext.class,0);
		}
		public LineWhileContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineEOLContext extends LineContext {
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineEOLContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineStmtContext extends LineContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineStmtContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineIfContext extends LineContext {
		public IfstContext ifst() {
			return getRuleContext(IfstContext.class,0);
		}
		public LineIfContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineForContext extends LineContext {
		public ForstContext forst() {
			return getRuleContext(ForstContext.class,0);
		}
		public LineForContext(LineContext ctx) { copyFrom(ctx); }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_line);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case WRITE:
			case VAR:
				_localctx = new LineStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				stmt();
				setState(97);
				match(EOL);
				}
				break;
			case IF:
				_localctx = new LineIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				ifst();
				}
				break;
			case WHILE:
			case DO:
				_localctx = new LineWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				whilest();
				}
				break;
			case FOR:
				_localctx = new LineForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				forst();
				}
				break;
			case EOL:
				_localctx = new LineEOLContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(EOL);
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
	public static class FuncInvocContext extends ParserRuleContext {
		public FuncInvocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvoc; }
	 
		public FuncInvocContext() { }
		public void copyFrom(FuncInvocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvocLineContext extends FuncInvocContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FuncInvocLineContext(FuncInvocContext ctx) { copyFrom(ctx); }
	}

	public final FuncInvocContext funcInvoc() throws RecognitionException {
		FuncInvocContext _localctx = new FuncInvocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcInvoc);
		try {
			_localctx = new FuncInvocLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(VAR);
			setState(106);
			match(OE);
			setState(107);
			params();
			setState(108);
			match(CE);
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtOutputContext extends StmtContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StmtOutputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtInputContext extends StmtContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StmtInputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAtribContext extends StmtContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public StmtAtribContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineFuncInvocContext extends StmtContext {
		public FuncInvocContext funcInvoc() {
			return getRuleContext(FuncInvocContext.class,0);
		}
		public LineFuncInvocContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StmtAtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				atrib();
				}
				break;
			case 2:
				_localctx = new StmtInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				input();
				}
				break;
			case 3:
				_localctx = new StmtOutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				output();
				}
				break;
			case 4:
				_localctx = new LineFuncInvocContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				funcInvoc();
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
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputReadContext extends InputContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public InputReadContext(InputContext ctx) { copyFrom(ctx); }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input);
		try {
			_localctx = new InputReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			tipo();
			setState(117);
			match(READ);
			setState(118);
			match(VAR);
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
	public static class OutputContext extends ParserRuleContext {
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteStrContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public OutputWriteStrContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteVarContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public OutputWriteVarContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteExprContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputWriteExprContext(OutputContext ctx) { copyFrom(ctx); }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new OutputWriteVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(WRITE);
				setState(121);
				match(VAR);
				}
				break;
			case 2:
				_localctx = new OutputWriteStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(WRITE);
				setState(123);
				match(STR);
				}
				break;
			case 3:
				_localctx = new OutputWriteExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(WRITE);
				setState(125);
				expr();
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoNumeroContext extends TipoContext {
		public TipoNumeroContext(TipoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoTextoContext extends TipoContext {
		public TipoTextoContext(TipoContext ctx) { copyFrom(ctx); }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new TipoNumeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new TipoTextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__1);
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
	public static class IfstContext extends ParserRuleContext {
		public IfstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifst; }
	 
		public IfstContext() { }
		public void copyFrom(IfstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstIfElseContext extends IfstContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public TerminalNode THEN() { return getToken(LangParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfstIfElseContext(IfstContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstIfContext extends IfstContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public TerminalNode THEN() { return getToken(LangParser.THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfstIfContext(IfstContext ctx) { copyFrom(ctx); }
	}

	public final IfstContext ifst() throws RecognitionException {
		IfstContext _localctx = new IfstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifst);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfstIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(IF);
				setState(133);
				match(OE);
				setState(134);
				cond(0);
				setState(135);
				match(CE);
				setState(136);
				match(THEN);
				setState(137);
				block();
				}
				break;
			case 2:
				_localctx = new IfstIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(IF);
				setState(140);
				match(OE);
				setState(141);
				cond(0);
				setState(142);
				match(CE);
				setState(143);
				match(THEN);
				setState(144);
				((IfstIfElseContext)_localctx).b1 = block();
				setState(145);
				match(ELSE);
				setState(146);
				((IfstIfElseContext)_localctx).b2 = block();
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
	public static class WhilestContext extends ParserRuleContext {
		public WhilestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilest; }
	 
		public WhilestContext() { }
		public void copyFrom(WhilestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestDoWhileContext extends WhilestContext {
		public TerminalNode DO() { return getToken(LangParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public WhilestDoWhileContext(WhilestContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestWhileContext extends WhilestContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestWhileContext(WhilestContext ctx) { copyFrom(ctx); }
	}

	public final WhilestContext whilest() throws RecognitionException {
		WhilestContext _localctx = new WhilestContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whilest);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhilestWhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(WHILE);
				setState(151);
				match(OE);
				setState(152);
				cond(0);
				setState(153);
				match(CE);
				setState(154);
				block();
				}
				break;
			case DO:
				_localctx = new WhilestDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(DO);
				setState(157);
				block();
				setState(158);
				match(WHILE);
				setState(159);
				match(OE);
				setState(160);
				cond(0);
				setState(161);
				match(CE);
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
	public static class ForstContext extends ParserRuleContext {
		public ForstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forst; }
	 
		public ForstContext() { }
		public void copyFrom(ForstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForstForContext extends ForstContext {
		public TerminalNode FOR() { return getToken(LangParser.FOR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public List<TerminalNode> EOL() { return getTokens(LangParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LangParser.EOL, i);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ForstForContext(ForstContext ctx) { copyFrom(ctx); }
	}

	public final ForstContext forst() throws RecognitionException {
		ForstContext _localctx = new ForstContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forst);
		int _la;
		try {
			_localctx = new ForstForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(FOR);
			setState(166);
			match(OE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(167);
				atrib();
				}
			}

			setState(170);
			match(EOL);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 206158462984L) != 0)) {
				{
				setState(171);
				cond(0);
				}
			}

			setState(174);
			match(EOL);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(175);
				atrib();
				}
			}

			setState(178);
			match(CE);
			setState(179);
			block();
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockLineContext extends BlockContext {
		public TerminalNode OB() { return getToken(LangParser.OB, 0); }
		public TerminalNode CB() { return getToken(LangParser.CB, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockLineContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			_localctx = new BlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(OB);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				line();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 176345317382L) != 0) );
			setState(187);
			match(CB);
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
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondRelopContext extends CondContext {
		public ExprContext e1;
		public Token RELOP;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LangParser.NE, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode LE() { return getToken(LangParser.LE, 0); }
		public TerminalNode GE() { return getToken(LangParser.GE, 0); }
		public CondRelopContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExprContext extends CondContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondAndContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode AND() { return getToken(LangParser.AND, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondOrContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode OR() { return getToken(LangParser.OR, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondNotContext extends CondContext {
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new CondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new CondRelopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				((CondRelopContext)_localctx).e1 = expr();
				setState(192);
				((CondRelopContext)_localctx).RELOP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
					((CondRelopContext)_localctx).RELOP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				((CondRelopContext)_localctx).e2 = expr();
				}
				break;
			case 3:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(NOT);
				setState(196);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(199);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(200);
						match(AND);
						setState(201);
						((CondAndContext)_localctx).c2 = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(202);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(203);
						match(OR);
						setState(204);
						((CondOrContext)_localctx).c2 = cond(3);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribVarStrContext extends AtribContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public AtribVarStrContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribVarContext extends AtribContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribVarContext(AtribContext ctx) { copyFrom(ctx); }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atrib);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AtribVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				tipo();
				setState(211);
				match(VAR);
				setState(212);
				match(AT);
				setState(213);
				expr();
				}
				break;
			case 2:
				_localctx = new AtribVarStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				tipo();
				setState(216);
				match(VAR);
				setState(217);
				match(AT);
				setState(218);
				match(STR);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMinusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				term();
				setState(223);
				match(PLUS);
				setState(224);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				term();
				setState(227);
				match(MINUS);
				setState(228);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				term();
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermDivContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermMultContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LangParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermFactorContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new TermMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				factor();
				setState(234);
				match(MULT);
				setState(235);
				term();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				factor();
				setState(238);
				match(DIV);
				setState(239);
				term();
				}
				break;
			case 3:
				_localctx = new TermFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				factor();
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
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public FactorNumContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorVarContext extends FactorContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public FactorVarContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorExprContext extends FactorContext {
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FactorExprContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OE:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(OE);
				setState(245);
				expr();
				setState(246);
				match(CE);
				}
				break;
			case VAR:
				_localctx = new FactorVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(VAR);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(NUM);
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
		case 17:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0004\u0000/\b\u0000\u000b\u0000\f\u00000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u00019\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005X\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006_\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\ts\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u007f\b\u000b\u0001"+
		"\f\u0001\f\u0003\f\u0083\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0095\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a4\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a9\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00ad\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b1"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u00b8\b\u0010\u000b\u0010\f\u0010\u00b9\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00c6\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ce\b\u0011"+
		"\n\u0011\f\u0011\u00d1\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00dd\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00e8\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f3"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00fb\b\u0015\u0001\u0015\u0000\u0001\"\u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0001\u0001\u0000\u0010\u0015\u0109\u0000,\u0001\u0000"+
		"\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000"+
		"\u0006B\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nW\u0001\u0000"+
		"\u0000\u0000\f^\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000\u0000"+
		"\u0010i\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000\u0014t"+
		"\u0001\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u0082\u0001"+
		"\u0000\u0000\u0000\u001a\u0094\u0001\u0000\u0000\u0000\u001c\u00a3\u0001"+
		"\u0000\u0000\u0000\u001e\u00a5\u0001\u0000\u0000\u0000 \u00b5\u0001\u0000"+
		"\u0000\u0000\"\u00c5\u0001\u0000\u0000\u0000$\u00dc\u0001\u0000\u0000"+
		"\u0000&\u00e7\u0001\u0000\u0000\u0000(\u00f2\u0001\u0000\u0000\u0000*"+
		"\u00fa\u0001\u0000\u0000\u0000,.\u0003\u0004\u0002\u0000-/\u0003\u000e"+
		"\u0007\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0001\u0001\u0000\u0000"+
		"\u000027\u0003&\u0013\u000034\u0005#\u0000\u000046\u0003&\u0013\u0000"+
		"53\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0000\u0000\u0001;\u0003\u0001\u0000\u0000\u0000"+
		"<=\u0003\u0006\u0003\u0000=>\u0003\u0004\u0002\u0000>A\u0001\u0000\u0000"+
		"\u0000?A\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u001c\u0000\u0000"+
		"CD\u0005%\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0003\f\u0006\u0000"+
		"FG\u0005\u0004\u0000\u0000GH\u0003\b\u0004\u0000H\u0007\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u0005\u0000\u0000JK\u0003\n\u0005\u0000KL\u0005\u0006\u0000"+
		"\u0000L\t\u0001\u0000\u0000\u0000MX\u0003\u000e\u0007\u0000NO\u0003\u000e"+
		"\u0007\u0000OP\u0003\n\u0005\u0000PX\u0001\u0000\u0000\u0000QR\u0005\u001d"+
		"\u0000\u0000RS\u0003&\u0013\u0000ST\u0005#\u0000\u0000TX\u0001\u0000\u0000"+
		"\u0000UV\u0005\u001d\u0000\u0000VX\u0005#\u0000\u0000WM\u0001\u0000\u0000"+
		"\u0000WN\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000X\u000b\u0001\u0000\u0000\u0000Y_\u0005%\u0000\u0000Z[\u0005"+
		"%\u0000\u0000[\\\u0005\b\u0000\u0000\\_\u0003\f\u0006\u0000]_\u0001\u0000"+
		"\u0000\u0000^Y\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_\r\u0001\u0000\u0000\u0000`a\u0003\u0012\t\u0000ab"+
		"\u0005#\u0000\u0000bh\u0001\u0000\u0000\u0000ch\u0003\u001a\r\u0000dh"+
		"\u0003\u001c\u000e\u0000eh\u0003\u001e\u000f\u0000fh\u0005#\u0000\u0000"+
		"g`\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u000f\u0001"+
		"\u0000\u0000\u0000ij\u0005%\u0000\u0000jk\u0005\u0003\u0000\u0000kl\u0003"+
		"\f\u0006\u0000lm\u0005\u0004\u0000\u0000m\u0011\u0001\u0000\u0000\u0000"+
		"ns\u0003$\u0012\u0000os\u0003\u0014\n\u0000ps\u0003\u0016\u000b\u0000"+
		"qs\u0003\u0010\b\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0013\u0001\u0000"+
		"\u0000\u0000tu\u0003\u0018\f\u0000uv\u0005!\u0000\u0000vw\u0005%\u0000"+
		"\u0000w\u0015\u0001\u0000\u0000\u0000xy\u0005 \u0000\u0000y\u007f\u0005"+
		"%\u0000\u0000z{\u0005 \u0000\u0000{\u007f\u0005\"\u0000\u0000|}\u0005"+
		" \u0000\u0000}\u007f\u0003&\u0013\u0000~x\u0001\u0000\u0000\u0000~z\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0017\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0005\u0001\u0000\u0000\u0081\u0083\u0005\u0002\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0019\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0018\u0000"+
		"\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0003\"\u0011\u0000"+
		"\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u0089\u0005\u001e\u0000\u0000"+
		"\u0089\u008a\u0003 \u0010\u0000\u008a\u0095\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u0018\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d"+
		"\u008e\u0003\"\u0011\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090"+
		"\u0005\u001e\u0000\u0000\u0090\u0091\u0003 \u0010\u0000\u0091\u0092\u0005"+
		"\u001f\u0000\u0000\u0092\u0093\u0003 \u0010\u0000\u0093\u0095\u0001\u0000"+
		"\u0000\u0000\u0094\u0084\u0001\u0000\u0000\u0000\u0094\u008b\u0001\u0000"+
		"\u0000\u0000\u0095\u001b\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0019"+
		"\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0003\"\u0011"+
		"\u0000\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u009b\u0003 \u0010\u0000"+
		"\u009b\u00a4\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001a\u0000\u0000"+
		"\u009d\u009e\u0003 \u0010\u0000\u009e\u009f\u0005\u0019\u0000\u0000\u009f"+
		"\u00a0\u0005\u0003\u0000\u0000\u00a0\u00a1\u0003\"\u0011\u0000\u00a1\u00a2"+
		"\u0005\u0004\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u0096"+
		"\u0001\u0000\u0000\u0000\u00a3\u009c\u0001\u0000\u0000\u0000\u00a4\u001d"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6\u00a8"+
		"\u0005\u0003\u0000\u0000\u00a7\u00a9\u0003$\u0012\u0000\u00a8\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0005#\u0000\u0000\u00ab\u00ad\u0003\""+
		"\u0011\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005#\u0000"+
		"\u0000\u00af\u00b1\u0003$\u0012\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0004\u0000\u0000\u00b3\u00b4\u0003 \u0010\u0000\u00b4"+
		"\u001f\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u0005\u0000\u0000\u00b6"+
		"\u00b8\u0003\u000e\u0007\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0006\u0000\u0000\u00bc!\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0006\u0011\uffff\uffff\u0000\u00be\u00c6\u0003&\u0013\u0000\u00bf\u00c0"+
		"\u0003&\u0013\u0000\u00c0\u00c1\u0007\u0000\u0000\u0000\u00c1\u00c2\u0003"+
		"&\u0013\u0000\u00c2\u00c6\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u000f"+
		"\u0000\u0000\u00c4\u00c6\u0003\"\u0011\u0001\u00c5\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00cf\u0001\u0000\u0000\u0000\u00c7\u00c8\n\u0003\u0000\u0000"+
		"\u00c8\u00c9\u0005\r\u0000\u0000\u00c9\u00ce\u0003\"\u0011\u0004\u00ca"+
		"\u00cb\n\u0002\u0000\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc\u00ce"+
		"\u0003\"\u0011\u0003\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0#\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\u0018"+
		"\f\u0000\u00d3\u00d4\u0005%\u0000\u0000\u00d4\u00d5\u0005\u0007\u0000"+
		"\u0000\u00d5\u00d6\u0003&\u0013\u0000\u00d6\u00dd\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0003\u0018\f\u0000\u00d8\u00d9\u0005%\u0000\u0000\u00d9"+
		"\u00da\u0005\u0007\u0000\u0000\u00da\u00db\u0005\"\u0000\u0000\u00db\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dc\u00d7"+
		"\u0001\u0000\u0000\u0000\u00dd%\u0001\u0000\u0000\u0000\u00de\u00df\u0003"+
		"(\u0014\u0000\u00df\u00e0\u0005\t\u0000\u0000\u00e0\u00e1\u0003&\u0013"+
		"\u0000\u00e1\u00e8\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003(\u0014\u0000"+
		"\u00e3\u00e4\u0005\n\u0000\u0000\u00e4\u00e5\u0003&\u0013\u0000\u00e5"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e8\u0003(\u0014\u0000\u00e7\u00de"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\'\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003"+
		"*\u0015\u0000\u00ea\u00eb\u0005\u000b\u0000\u0000\u00eb\u00ec\u0003(\u0014"+
		"\u0000\u00ec\u00f3\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003*\u0015\u0000"+
		"\u00ee\u00ef\u0005\f\u0000\u0000\u00ef\u00f0\u0003(\u0014\u0000\u00f0"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003*\u0015\u0000\u00f2\u00e9"+
		"\u0001\u0000\u0000\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3)\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"\u0003\u0000\u0000\u00f5\u00f6\u0003&\u0013\u0000\u00f6\u00f7\u0005\u0004"+
		"\u0000\u0000\u00f7\u00fb\u0001\u0000\u0000\u0000\u00f8\u00fb\u0005%\u0000"+
		"\u0000\u00f9\u00fb\u0005$\u0000\u0000\u00fa\u00f4\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb+\u0001\u0000\u0000\u0000\u001607@W^gr~\u0082\u0094\u00a3\u00a8"+
		"\u00ac\u00b0\u00b9\u00c5\u00cd\u00cf\u00dc\u00e7\u00f2\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}