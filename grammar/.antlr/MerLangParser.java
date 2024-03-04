// Generated from c://Users//Luiz//Desktop//Compiladores-Final//MerLang//grammar//MerLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MerLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, BOOLEAN_ASSIGNMENT=17, 
		INT_ASSIGNMENT=18, STRING_ASSIGNMENT=19, INT=20, STRING=21, BOOLEAN=22, 
		TRUE=23, FALSE=24, FUNCTION=25, RETURN=26, WHILE=27, FOR=28, VAR=29, CONST=30, 
		LET=31, IF=32, ELSE=33, LT=34, LTE=35, GT=36, GTE=37, EQ=38, NEQ=39, PRINT=40, 
		SCAN_KEYWORD=41, BREAK=42, ADD_OP=43, SUB_OP=44, MUL_OP=45, DIV_OP=46, 
		UNARY_ADD=47, UNARY_MINUS=48, VARIABLE=49, NUMBER=50, WHITESPACE=51, NEWLINE=52, 
		TEXT=53;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_scan_statement = 3, 
		RULE_condition = 4, RULE_conditional_statement = 5, RULE_ternary_statement = 6, 
		RULE_value = 7, RULE_assignment = 8, RULE_function = 9, RULE_function_call = 10, 
		RULE_function_return = 11, RULE_op = 12, RULE_unary_arithmetic = 13, RULE_arithmetic = 14, 
		RULE_relop = 15, RULE_expression = 16, RULE_array_item = 17, RULE_array_length = 18, 
		RULE_array = 19, RULE_array_ops = 20, RULE_array_concat = 21, RULE_print = 22, 
		RULE_while_loop = 23, RULE_for_loop = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "scan_statement", "condition", "conditional_statement", 
			"ternary_statement", "value", "assignment", "function", "function_call", 
			"function_return", "op", "unary_arithmetic", "arithmetic", "relop", "expression", 
			"array_item", "array_length", "array", "array_ops", "array_concat", "print", 
			"while_loop", "for_loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'{'", "'}'", "'?'", "':'", "'['", 
			"']'", "'.'", "'length'", "','", "'push'", "'pop'", "'concat'", null, 
			null, null, "'int'", "'string'", "'boolean'", "'True'", "'False'", "'function'", 
			"'return'", "'while'", "'for'", "'var'", "'const'", "'let'", "'if'", 
			"'else'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'print'", "'scan'", 
			"'break'", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "BOOLEAN_ASSIGNMENT", "INT_ASSIGNMENT", 
			"STRING_ASSIGNMENT", "INT", "STRING", "BOOLEAN", "TRUE", "FALSE", "FUNCTION", 
			"RETURN", "WHILE", "FOR", "VAR", "CONST", "LET", "IF", "ELSE", "LT", 
			"LTE", "GT", "GTE", "EQ", "NEQ", "PRINT", "SCAN_KEYWORD", "BREAK", "ADD_OP", 
			"SUB_OP", "MUL_OP", "DIV_OP", "UNARY_ADD", "UNARY_MINUS", "VARIABLE", 
			"NUMBER", "WHITESPACE", "NEWLINE", "TEXT"
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
	public String getGrammarFileName() { return "MerLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MerLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MerLangParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<Scan_statementContext> scan_statement() {
			return getRuleContexts(Scan_statementContext.class);
		}
		public Scan_statementContext scan_statement(int i) {
			return getRuleContext(Scan_statementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(50);
					line();
					}
					break;
				case 2:
					{
					setState(51);
					function();
					}
					break;
				case 3:
					{
					setState(52);
					scan_statement();
					}
					break;
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10697153432257024L) != 0) );
			setState(57);
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
	public static class LineContext extends ParserRuleContext {
		public Ternary_statementContext ternary_statement() {
			return getRuleContext(Ternary_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MerLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MerLangParser.NEWLINE, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				ternary_statement();
				}
				break;
			case 2:
				{
				setState(60);
				statement();
				}
				break;
			case 3:
				{
				setState(61);
				conditional_statement();
				}
				break;
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(64);
				match(T__0);
				}
			}

			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				match(NEWLINE);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Array_opsContext array_ops() {
			return getRuleContext(Array_opsContext.class,0);
		}
		public Array_concatContext array_concat() {
			return getRuleContext(Array_concatContext.class,0);
		}
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(72);
				assignment();
				}
				break;
			case 2:
				{
				setState(73);
				array_ops();
				}
				break;
			case 3:
				{
				setState(74);
				array_concat();
				}
				break;
			case 4:
				{
				setState(75);
				function_return();
				}
				break;
			case 5:
				{
				setState(76);
				function_call();
				}
				break;
			case 6:
				{
				setState(77);
				arithmetic();
				}
				break;
			case 7:
				{
				setState(78);
				print();
				}
				break;
			case 8:
				{
				setState(79);
				while_loop();
				}
				break;
			case 9:
				{
				setState(80);
				for_loop();
				}
				break;
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
	public static class Scan_statementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public TerminalNode SCAN_KEYWORD() { return getToken(MerLangParser.SCAN_KEYWORD, 0); }
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scan_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VARIABLE);
			setState(84);
			match(T__1);
			setState(85);
			match(SCAN_KEYWORD);
			setState(86);
			match(T__2);
			setState(87);
			match(T__3);
			setState(88);
			match(T__0);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<RelopContext> relop() {
			return getRuleContexts(RelopContext.class);
		}
		public RelopContext relop(int i) {
			return getRuleContext(RelopContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			expression();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082331758592L) != 0)) {
				{
				{
				setState(91);
				relop();
				setState(92);
				expression();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Conditional_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MerLangParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MerLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MerLangParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IF);
			setState(100);
			match(T__2);
			setState(101);
			condition();
			setState(102);
			match(T__3);
			setState(103);
			match(T__4);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(104);
				match(NEWLINE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				line();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10697153398702592L) != 0) );
			setState(115);
			match(T__5);
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
	public static class Ternary_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Ternary_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_statement; }
	}

	public final Ternary_statementContext ternary_statement() throws RecognitionException {
		Ternary_statementContext _localctx = new Ternary_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ternary_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expression();
			setState(118);
			match(T__6);
			setState(119);
			statement();
			setState(120);
			match(T__7);
			setState(121);
			statement();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(MerLangParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(MerLangParser.TEXT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Array_itemContext array_item() {
			return getRuleContext(Array_itemContext.class,0);
		}
		public Array_lengthContext array_length() {
			return getRuleContext(Array_lengthContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(123);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				setState(124);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(125);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(126);
				function_call();
				}
				break;
			case 5:
				{
				setState(127);
				array_item();
				}
				break;
			case 6:
				{
				setState(128);
				array_length();
				}
				break;
			case 7:
				{
				setState(129);
				array();
				}
				break;
			case 8:
				{
				setState(130);
				assignment();
				}
				break;
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode INT() { return getToken(MerLangParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MerLangParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(MerLangParser.BOOLEAN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			match(VARIABLE);
			setState(135);
			match(T__1);
			setState(136);
			value();
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
		public TerminalNode FUNCTION() { return getToken(MerLangParser.FUNCTION, 0); }
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MerLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MerLangParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			match(FUNCTION);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(139);
				match(VARIABLE);
				}
			}

			setState(142);
			match(T__2);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10696049122345472L) != 0)) {
				{
				{
				setState(143);
				value();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(T__3);
			setState(150);
			match(T__4);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(151);
				match(NEWLINE);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				line();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10697153398702592L) != 0) );
			setState(162);
			match(T__5);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(163);
				match(T__0);
				}
			}

			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				match(NEWLINE);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(VARIABLE);
			setState(172);
			match(T__2);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10696049122345472L) != 0)) {
				{
				{
				setState(173);
				value();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(T__3);
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
	public static class Function_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MerLangParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Array_concatContext array_concat() {
			return getRuleContext(Array_concatContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(RETURN);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(182);
				value();
				}
				break;
			case 2:
				{
				setState(183);
				array_concat();
				}
				break;
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
	public static class OpContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(MerLangParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(MerLangParser.SUB_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(MerLangParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(MerLangParser.DIV_OP, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) ) {
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
	public static class Unary_arithmeticContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public TerminalNode UNARY_ADD() { return getToken(MerLangParser.UNARY_ADD, 0); }
		public TerminalNode UNARY_MINUS() { return getToken(MerLangParser.UNARY_MINUS, 0); }
		public Unary_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_arithmetic; }
	}

	public final Unary_arithmeticContext unary_arithmetic() throws RecognitionException {
		Unary_arithmeticContext _localctx = new Unary_arithmeticContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(VARIABLE);
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==UNARY_ADD || _la==UNARY_MINUS) ) {
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
	public static class ArithmeticContext extends ParserRuleContext {
		public Unary_arithmeticContext unary_arithmetic() {
			return getRuleContext(Unary_arithmeticContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				{
				setState(191);
				value();
				setState(192);
				op();
				setState(193);
				value();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) {
					{
					{
					setState(194);
					op();
					setState(195);
					value();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(202);
				unary_arithmetic();
				}
				break;
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
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(MerLangParser.LT, 0); }
		public TerminalNode LTE() { return getToken(MerLangParser.LTE, 0); }
		public TerminalNode GT() { return getToken(MerLangParser.GT, 0); }
		public TerminalNode GTE() { return getToken(MerLangParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(MerLangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MerLangParser.NEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082331758592L) != 0)) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(207);
				value();
				}
				break;
			case 2:
				{
				setState(208);
				arithmetic();
				}
				break;
			}
			setState(211);
			relop();
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(212);
				value();
				}
				break;
			case 2:
				{
				setState(213);
				arithmetic();
				}
				break;
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
	public static class Array_itemContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Array_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_item; }
	}

	public final Array_itemContext array_item() throws RecognitionException {
		Array_itemContext _localctx = new Array_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(VARIABLE);
			setState(217);
			match(T__8);
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(218);
				value();
				}
				break;
			case 2:
				{
				setState(219);
				arithmetic();
				}
				break;
			}
			setState(222);
			match(T__9);
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
	public static class Array_lengthContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public Array_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_length; }
	}

	public final Array_lengthContext array_length() throws RecognitionException {
		Array_lengthContext _localctx = new Array_lengthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(VARIABLE);
			setState(225);
			match(T__10);
			setState(226);
			match(T__11);
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
	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__8);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10696049122345472L) != 0)) {
				{
				setState(229);
				value();
				}
			}

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(232);
				match(T__12);
				setState(233);
				value();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__9);
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
	public static class Array_opsContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MerLangParser.VARIABLE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Array_itemContext> array_item() {
			return getRuleContexts(Array_itemContext.class);
		}
		public Array_itemContext array_item(int i) {
			return getRuleContext(Array_itemContext.class,i);
		}
		public Array_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_ops; }
	}

	public final Array_opsContext array_ops() throws RecognitionException {
		Array_opsContext _localctx = new Array_opsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(VARIABLE);
			setState(242);
			match(T__10);
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(244);
			match(T__2);
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(245);
					value();
					}
					break;
				case 2:
					{
					setState(246);
					array_item();
					}
					break;
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10696049122345472L) != 0) );
			setState(251);
			match(T__3);
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
	public static class Array_concatContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Array_itemContext> array_item() {
			return getRuleContexts(Array_itemContext.class);
		}
		public Array_itemContext array_item(int i) {
			return getRuleContext(Array_itemContext.class,i);
		}
		public Array_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_concat; }
	}

	public final Array_concatContext array_concat() throws RecognitionException {
		Array_concatContext _localctx = new Array_concatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			value();
			setState(254);
			match(T__10);
			setState(255);
			match(T__15);
			setState(256);
			match(T__2);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(257);
				value();
				}
				break;
			case 2:
				{
				setState(258);
				array_item();
				}
				break;
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(261);
				match(T__12);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(262);
					value();
					}
					break;
				case 2:
					{
					setState(263);
					array_item();
					}
					break;
				}
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(T__3);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MerLangParser.PRINT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(MerLangParser.TEXT, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Array_itemContext array_item() {
			return getRuleContext(Array_itemContext.class,0);
		}
		public Array_lengthContext array_length() {
			return getRuleContext(Array_lengthContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_print);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(PRINT);
				setState(274);
				match(T__2);
				setState(275);
				value();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(276);
					match(T__12);
					setState(277);
					value();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(PRINT);
				setState(286);
				match(T__2);
				setState(287);
				match(TEXT);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(288);
					match(T__12);
					setState(289);
					value();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(PRINT);
				setState(297);
				match(T__2);
				setState(298);
				match(TEXT);
				setState(299);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(PRINT);
				setState(301);
				match(T__2);
				setState(302);
				assignment();
				setState(303);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(PRINT);
				setState(306);
				match(T__2);
				setState(307);
				expression();
				setState(308);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				match(PRINT);
				setState(311);
				match(T__2);
				setState(312);
				array();
				setState(313);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				match(PRINT);
				setState(316);
				match(T__2);
				setState(317);
				array_item();
				setState(318);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
				match(PRINT);
				setState(321);
				match(T__2);
				setState(322);
				array_length();
				setState(323);
				match(T__3);
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
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MerLangParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MerLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MerLangParser.NEWLINE, i);
		}
		public TerminalNode BREAK() { return getToken(MerLangParser.BREAK, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(WHILE);
			setState(328);
			match(T__2);
			setState(329);
			condition();
			setState(330);
			match(T__3);
			setState(331);
			match(T__4);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(332);
				match(NEWLINE);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case INT:
			case STRING:
			case BOOLEAN:
			case RETURN:
			case WHILE:
			case FOR:
			case IF:
			case PRINT:
			case VARIABLE:
			case NUMBER:
			case TEXT:
				{
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(338);
					line();
					}
					}
					setState(341); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10697153398702592L) != 0) );
				}
				break;
			case BREAK:
				{
				{
				setState(343);
				match(BREAK);
				setState(344);
				match(NEWLINE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(347);
			match(T__5);
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
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MerLangParser.FOR, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MerLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MerLangParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(FOR);
			setState(350);
			match(T__2);
			setState(351);
			assignment();
			setState(352);
			match(T__0);
			setState(353);
			condition();
			setState(354);
			match(T__0);
			setState(355);
			assignment();
			setState(356);
			match(T__3);
			setState(357);
			match(T__4);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(358);
				match(NEWLINE);
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(364);
				line();
				}
				}
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10697153398702592L) != 0) );
			setState(369);
			match(T__5);
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
		"\u0004\u00015\u0174\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001?\b\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0004"+
		"\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002R\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0005\u0004\u0005p\b\u0005\u000b"+
		"\u0005\f\u0005q\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0084\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\t\u008d\b\t\u0001\t\u0001\t\u0005\t\u0091\b\t\n\t\f\t\u0094\t"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0099\b\t\n\t\f\t\u009c\t\t\u0001\t"+
		"\u0004\t\u009f\b\t\u000b\t\f\t\u00a0\u0001\t\u0001\t\u0003\t\u00a5\b\t"+
		"\u0001\t\u0004\t\u00a8\b\t\u000b\t\f\t\u00a9\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00af\b\n\n\n\f\n\u00b2\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00b9\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00c6\b\u000e\n\u000e\f\u000e\u00c9\t\u000e\u0001\u000e"+
		"\u0003\u000e\u00cc\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00d2\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00d7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00dd\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00e7\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00eb\b\u0013\n\u0013\f\u0013\u00ee\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0004\u0014\u00f8\b\u0014\u000b\u0014\f\u0014\u00f9"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0104\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0109\b\u0015\u0005\u0015\u010b\b\u0015\n\u0015"+
		"\f\u0015\u010e\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0117\b\u0016\n\u0016"+
		"\f\u0016\u011a\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0123\b\u0016\n\u0016"+
		"\f\u0016\u0126\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0146\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u014e\b\u0017"+
		"\n\u0017\f\u0017\u0151\t\u0017\u0001\u0017\u0004\u0017\u0154\b\u0017\u000b"+
		"\u0017\f\u0017\u0155\u0001\u0017\u0001\u0017\u0003\u0017\u015a\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0168\b\u0018\n\u0018\f\u0018\u016b\t\u0018\u0001\u0018\u0004"+
		"\u0018\u016e\b\u0018\u000b\u0018\f\u0018\u016f\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0005\u0001"+
		"\u0000\u0014\u0016\u0001\u0000+.\u0001\u0000/0\u0001\u0000\"\'\u0001\u0000"+
		"\u000e\u000f\u0195\u00005\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000"+
		"\u0000\u0004Q\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\b"+
		"Z\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000"+
		"\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000"+
		"\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u00ab\u0001\u0000\u0000"+
		"\u0000\u0016\u00b5\u0001\u0000\u0000\u0000\u0018\u00ba\u0001\u0000\u0000"+
		"\u0000\u001a\u00bc\u0001\u0000\u0000\u0000\u001c\u00cb\u0001\u0000\u0000"+
		"\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00d1\u0001\u0000\u0000\u0000"+
		"\"\u00d8\u0001\u0000\u0000\u0000$\u00e0\u0001\u0000\u0000\u0000&\u00e4"+
		"\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000\u0000\u0000*\u00fd\u0001\u0000"+
		"\u0000\u0000,\u0145\u0001\u0000\u0000\u0000.\u0147\u0001\u0000\u0000\u0000"+
		"0\u015d\u0001\u0000\u0000\u000026\u0003\u0002\u0001\u000036\u0003\u0012"+
		"\t\u000046\u0003\u0006\u0003\u000052\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0000\u0000\u0001:\u0001\u0001\u0000\u0000\u0000;?\u0003\f\u0006"+
		"\u0000<?\u0003\u0004\u0002\u0000=?\u0003\n\u0005\u0000>;\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@B\u0005\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CE\u00054\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000G\u0003\u0001\u0000\u0000\u0000HR\u0003\u0010"+
		"\b\u0000IR\u0003(\u0014\u0000JR\u0003*\u0015\u0000KR\u0003\u0016\u000b"+
		"\u0000LR\u0003\u0014\n\u0000MR\u0003\u001c\u000e\u0000NR\u0003,\u0016"+
		"\u0000OR\u0003.\u0017\u0000PR\u00030\u0018\u0000QH\u0001\u0000\u0000\u0000"+
		"QI\u0001\u0000\u0000\u0000QJ\u0001\u0000\u0000\u0000QK\u0001\u0000\u0000"+
		"\u0000QL\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000QN\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\u0005"+
		"\u0001\u0000\u0000\u0000ST\u00051\u0000\u0000TU\u0005\u0002\u0000\u0000"+
		"UV\u0005)\u0000\u0000VW\u0005\u0003\u0000\u0000WX\u0005\u0004\u0000\u0000"+
		"XY\u0005\u0001\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000Z`\u0003 \u0010"+
		"\u0000[\\\u0003\u001e\u000f\u0000\\]\u0003 \u0010\u0000]_\u0001\u0000"+
		"\u0000\u0000^[\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\t\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cd\u0005 \u0000\u0000de\u0005\u0003\u0000\u0000"+
		"ef\u0003\b\u0004\u0000fg\u0005\u0004\u0000\u0000gk\u0005\u0005\u0000\u0000"+
		"hj\u00054\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u0006\u0000\u0000"+
		"t\u000b\u0001\u0000\u0000\u0000uv\u0003 \u0010\u0000vw\u0005\u0007\u0000"+
		"\u0000wx\u0003\u0004\u0002\u0000xy\u0005\b\u0000\u0000yz\u0003\u0004\u0002"+
		"\u0000z\r\u0001\u0000\u0000\u0000{\u0084\u00051\u0000\u0000|\u0084\u0005"+
		"2\u0000\u0000}\u0084\u00055\u0000\u0000~\u0084\u0003\u0014\n\u0000\u007f"+
		"\u0084\u0003\"\u0011\u0000\u0080\u0084\u0003$\u0012\u0000\u0081\u0084"+
		"\u0003&\u0013\u0000\u0082\u0084\u0003\u0010\b\u0000\u0083{\u0001\u0000"+
		"\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000"+
		"\u0083~\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0007\u0000\u0000\u0000\u0086\u0087\u00051\u0000\u0000\u0087\u0088"+
		"\u0005\u0002\u0000\u0000\u0088\u0089\u0003\u000e\u0007\u0000\u0089\u0011"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0005\u0019\u0000\u0000\u008b\u008d"+
		"\u00051\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0092\u0005"+
		"\u0003\u0000\u0000\u008f\u0091\u0003\u000e\u0007\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0004\u0000\u0000\u0096\u009a\u0005\u0005\u0000\u0000\u0097\u0099\u0005"+
		"4\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009f\u0003\u0002\u0001\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0005\u0006\u0000\u0000\u00a3\u00a5\u0005\u0001"+
		"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a8\u00054\u0000"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00ac\u00051\u0000\u0000"+
		"\u00ac\u00b0\u0005\u0003\u0000\u0000\u00ad\u00af\u0003\u000e\u0007\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\u0004\u0000\u0000\u00b4\u0015\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0005\u001a\u0000\u0000\u00b6\u00b9\u0003\u000e\u0007\u0000"+
		"\u00b7\u00b9\u0003*\u0015\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u0017\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0007\u0001\u0000\u0000\u00bb\u0019\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u00051\u0000\u0000\u00bd\u00be\u0007\u0002\u0000\u0000\u00be\u001b"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003\u000e\u0007\u0000\u00c0\u00c1"+
		"\u0003\u0018\f\u0000\u00c1\u00c7\u0003\u000e\u0007\u0000\u00c2\u00c3\u0003"+
		"\u0018\f\u0000\u00c3\u00c4\u0003\u000e\u0007\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cc\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0003\u001a\r\u0000\u00cb\u00bf\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u001d\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0007\u0003\u0000\u0000\u00ce\u001f\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0003\u000e\u0007\u0000\u00d0\u00d2\u0003\u001c\u000e"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6\u0003\u001e\u000f"+
		"\u0000\u00d4\u00d7\u0003\u000e\u0007\u0000\u00d5\u00d7\u0003\u001c\u000e"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7!\u0001\u0000\u0000\u0000\u00d8\u00d9\u00051\u0000\u0000\u00d9"+
		"\u00dc\u0005\t\u0000\u0000\u00da\u00dd\u0003\u000e\u0007\u0000\u00db\u00dd"+
		"\u0003\u001c\u000e\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005\n\u0000\u0000\u00df#\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005"+
		"1\u0000\u0000\u00e1\u00e2\u0005\u000b\u0000\u0000\u00e2\u00e3\u0005\f"+
		"\u0000\u0000\u00e3%\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005\t\u0000"+
		"\u0000\u00e5\u00e7\u0003\u000e\u0007\u0000\u00e6\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00ec\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\r\u0000\u0000\u00e9\u00eb\u0003\u000e\u0007\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005\n\u0000\u0000\u00f0\'\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u00051\u0000\u0000\u00f2\u00f3\u0005\u000b\u0000\u0000\u00f3\u00f4"+
		"\u0007\u0004\u0000\u0000\u00f4\u00f7\u0005\u0003\u0000\u0000\u00f5\u00f8"+
		"\u0003\u000e\u0007\u0000\u00f6\u00f8\u0003\"\u0011\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"\u0004\u0000\u0000\u00fc)\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\u000e"+
		"\u0007\u0000\u00fe\u00ff\u0005\u000b\u0000\u0000\u00ff\u0100\u0005\u0010"+
		"\u0000\u0000\u0100\u0103\u0005\u0003\u0000\u0000\u0101\u0104\u0003\u000e"+
		"\u0007\u0000\u0102\u0104\u0003\"\u0011\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u010c\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0005\r\u0000\u0000\u0106\u0109\u0003\u000e\u0007\u0000"+
		"\u0107\u0109\u0003\"\u0011\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a"+
		"\u0105\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005\u0004\u0000\u0000\u0110+\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0005(\u0000\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0118\u0003"+
		"\u000e\u0007\u0000\u0114\u0115\u0005\r\u0000\u0000\u0115\u0117\u0003\u000e"+
		"\u0007\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005\u0004\u0000\u0000\u011c\u0146\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0005(\u0000\u0000\u011e\u011f\u0005\u0003\u0000"+
		"\u0000\u011f\u0124\u00055\u0000\u0000\u0120\u0121\u0005\r\u0000\u0000"+
		"\u0121\u0123\u0003\u000e\u0007\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0146\u0005\u0004\u0000\u0000"+
		"\u0128\u0129\u0005(\u0000\u0000\u0129\u012a\u0005\u0003\u0000\u0000\u012a"+
		"\u012b\u00055\u0000\u0000\u012b\u0146\u0005\u0004\u0000\u0000\u012c\u012d"+
		"\u0005(\u0000\u0000\u012d\u012e\u0005\u0003\u0000\u0000\u012e\u012f\u0003"+
		"\u0010\b\u0000\u012f\u0130\u0005\u0004\u0000\u0000\u0130\u0146\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005(\u0000\u0000\u0132\u0133\u0005\u0003\u0000"+
		"\u0000\u0133\u0134\u0003 \u0010\u0000\u0134\u0135\u0005\u0004\u0000\u0000"+
		"\u0135\u0146\u0001\u0000\u0000\u0000\u0136\u0137\u0005(\u0000\u0000\u0137"+
		"\u0138\u0005\u0003\u0000\u0000\u0138\u0139\u0003&\u0013\u0000\u0139\u013a"+
		"\u0005\u0004\u0000\u0000\u013a\u0146\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0005(\u0000\u0000\u013c\u013d\u0005\u0003\u0000\u0000\u013d\u013e\u0003"+
		"\"\u0011\u0000\u013e\u013f\u0005\u0004\u0000\u0000\u013f\u0146\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005(\u0000\u0000\u0141\u0142\u0005\u0003\u0000"+
		"\u0000\u0142\u0143\u0003$\u0012\u0000\u0143\u0144\u0005\u0004\u0000\u0000"+
		"\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0111\u0001\u0000\u0000\u0000"+
		"\u0145\u011d\u0001\u0000\u0000\u0000\u0145\u0128\u0001\u0000\u0000\u0000"+
		"\u0145\u012c\u0001\u0000\u0000\u0000\u0145\u0131\u0001\u0000\u0000\u0000"+
		"\u0145\u0136\u0001\u0000\u0000\u0000\u0145\u013b\u0001\u0000\u0000\u0000"+
		"\u0145\u0140\u0001\u0000\u0000\u0000\u0146-\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005\u001b\u0000\u0000\u0148\u0149\u0005\u0003\u0000\u0000\u0149"+
		"\u014a\u0003\b\u0004\u0000\u014a\u014b\u0005\u0004\u0000\u0000\u014b\u014f"+
		"\u0005\u0005\u0000\u0000\u014c\u014e\u00054\u0000\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0159\u0001"+
		"\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0154\u0003"+
		"\u0002\u0001\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001"+
		"\u0000\u0000\u0000\u0156\u015a\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"*\u0000\u0000\u0158\u015a\u00054\u0000\u0000\u0159\u0153\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0005\u0006\u0000\u0000\u015c/\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005\u001c\u0000\u0000\u015e\u015f\u0005\u0003\u0000\u0000"+
		"\u015f\u0160\u0003\u0010\b\u0000\u0160\u0161\u0005\u0001\u0000\u0000\u0161"+
		"\u0162\u0003\b\u0004\u0000\u0162\u0163\u0005\u0001\u0000\u0000\u0163\u0164"+
		"\u0003\u0010\b\u0000\u0164\u0165\u0005\u0004\u0000\u0000\u0165\u0169\u0005"+
		"\u0005\u0000\u0000\u0166\u0168\u00054\u0000\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000"+
		"\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016e\u0003\u0002"+
		"\u0001\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0006"+
		"\u0000\u0000\u01721\u0001\u0000\u0000\u0000&57>AFQ`kq\u0083\u008c\u0092"+
		"\u009a\u00a0\u00a4\u00a9\u00b0\u00b8\u00c7\u00cb\u00d1\u00d6\u00dc\u00e6"+
		"\u00ec\u00f7\u00f9\u0103\u0108\u010c\u0118\u0124\u0145\u014f\u0155\u0159"+
		"\u0169\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}