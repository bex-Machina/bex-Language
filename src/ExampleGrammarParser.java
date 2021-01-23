// Generated from C:/Users/Evilcorez/Desktop/FOPL ANTLAR PROFRAMS/Task2gG/src\ExampleGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExampleGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYPE=9, 
		TRUE=10, FALSE=11, CONCAT=12, LT=13, LE=14, GT=15, GE=16, EQEQ=17, NEQ=18, 
		AND=19, OR=20, NOT=21, XOR=22, INC=23, DEC=24, MUL=25, DIV=26, ADD=27, 
		SUB=28, EQ=29, SEMICOLON=30, COMMA=31, LSQ=32, RSQ=33, LPAREN=34, RPAREN=35, 
		LCURL=36, RCURL=37, INT=38, FLOAT=39, IDENTIFIER=40, STRING=41, WS=42, 
		COMMENT=43;
	public static final int
		RULE_prgm = 0, RULE_decl = 1, RULE_declArr = 2, RULE_param = 3, RULE_declFunc = 4, 
		RULE_assignment = 5, RULE_assignStmt = 6, RULE_controlStmt = 7, RULE_atomStmt = 8, 
		RULE_block = 9, RULE_stmt = 10, RULE_unknownExpr = 11, RULE_exprAll = 12, 
		RULE_exprArr = 13, RULE_floatExprArr = 14, RULE_boolExprArr = 15, RULE_stringExprArr = 16, 
		RULE_expr = 17, RULE_floatExpr = 18, RULE_boolExpr = 19, RULE_stringExpr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prgm", "decl", "declArr", "param", "declFunc", "assignment", "assignStmt", 
			"controlStmt", "atomStmt", "block", "stmt", "unknownExpr", "exprAll", 
			"exprArr", "floatExprArr", "boolExprArr", "stringExprArr", "expr", "floatExpr", 
			"boolExpr", "stringExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'do'", "'input'", "'print'", 
			"'return'", null, "'true'", "'false'", "'##'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'^'", "'++'", "'--'", 
			"'*'", "'/'", "'+'", "'-'", "'='", "';'", "','", "'['", "']'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TYPE", "TRUE", 
			"FALSE", "CONCAT", "LT", "LE", "GT", "GE", "EQEQ", "NEQ", "AND", "OR", 
			"NOT", "XOR", "INC", "DEC", "MUL", "DIV", "ADD", "SUB", "EQ", "SEMICOLON", 
			"COMMA", "LSQ", "RSQ", "LPAREN", "RPAREN", "LCURL", "RCURL", "INT", "FLOAT", 
			"IDENTIFIER", "STRING", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "ExampleGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExampleGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrgmContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclArrContext> declArr() {
			return getRuleContexts(DeclArrContext.class);
		}
		public DeclArrContext declArr(int i) {
			return getRuleContext(DeclArrContext.class,i);
		}
		public List<DeclFuncContext> declFunc() {
			return getRuleContexts(DeclFuncContext.class);
		}
		public DeclFuncContext declFunc(int i) {
			return getRuleContext(DeclFuncContext.class,i);
		}
		public PrgmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prgm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterPrgm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitPrgm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitPrgm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgmContext prgm() throws RecognitionException {
		PrgmContext _localctx = new PrgmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prgm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(42);
						decl();
						}
						break;
					case 2:
						{
						setState(43);
						declArr();
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				declFunc();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ExampleGrammarParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ExampleGrammarParser.SEMICOLON, 0); }
		public TerminalNode EQ() { return getToken(ExampleGrammarParser.EQ, 0); }
		public ExprAllContext exprAll() {
			return getRuleContext(ExprAllContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TYPE);
			setState(55);
			match(IDENTIFIER);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(56);
				match(EQ);
				setState(57);
				exprAll();
				}
			}

			setState(60);
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

	public static class DeclArrContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ExampleGrammarParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LSQ() { return getToken(ExampleGrammarParser.LSQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(ExampleGrammarParser.RSQ, 0); }
		public TerminalNode SEMICOLON() { return getToken(ExampleGrammarParser.SEMICOLON, 0); }
		public TerminalNode EQ() { return getToken(ExampleGrammarParser.EQ, 0); }
		public ExprArrContext exprArr() {
			return getRuleContext(ExprArrContext.class,0);
		}
		public DeclArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterDeclArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitDeclArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitDeclArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclArrContext declArr() throws RecognitionException {
		DeclArrContext _localctx = new DeclArrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TYPE);
			setState(63);
			match(IDENTIFIER);
			setState(64);
			match(LSQ);
			setState(65);
			expr();
			setState(66);
			match(RSQ);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(67);
				match(EQ);
				setState(68);
				exprArr();
				}
			}

			setState(71);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ExampleGrammarParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LSQ() { return getToken(ExampleGrammarParser.LSQ, 0); }
		public TerminalNode RSQ() { return getToken(ExampleGrammarParser.RSQ, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(TYPE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQ) {
				{
				setState(74);
				match(LSQ);
				setState(75);
				match(RSQ);
				}
			}

			setState(78);
			match(IDENTIFIER);
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

	public static class DeclFuncContext extends ParserRuleContext {
		public ParamContext param;
		public List<ParamContext> params = new ArrayList<ParamContext>();
		public TerminalNode TYPE() { return getToken(ExampleGrammarParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ExampleGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExampleGrammarParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LSQ() { return getToken(ExampleGrammarParser.LSQ, 0); }
		public TerminalNode RSQ() { return getToken(ExampleGrammarParser.RSQ, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExampleGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExampleGrammarParser.COMMA, i);
		}
		public DeclFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterDeclFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitDeclFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitDeclFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclFuncContext declFunc() throws RecognitionException {
		DeclFuncContext _localctx = new DeclFuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(TYPE);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQ) {
				{
				setState(81);
				match(LSQ);
				setState(82);
				match(RSQ);
				}
			}

			setState(85);
			match(IDENTIFIER);
			setState(86);
			match(LPAREN);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(87);
				((DeclFuncContext)_localctx).param = param();
				((DeclFuncContext)_localctx).params.add(((DeclFuncContext)_localctx).param);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(88);
					match(COMMA);
					setState(89);
					((DeclFuncContext)_localctx).param = param();
					((DeclFuncContext)_localctx).params.add(((DeclFuncContext)_localctx).param);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(97);
			match(RPAREN);
			setState(98);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecIdContext extends AssignmentContext {
		public TerminalNode DEC() { return getToken(ExampleGrammarParser.DEC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public DecIdContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterDecId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitDecId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitDecId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncIdContext extends AssignmentContext {
		public TerminalNode INC() { return getToken(ExampleGrammarParser.INC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public IncIdContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterIncId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitIncId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitIncId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignToIdAsArrContext extends AssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LSQ() { return getToken(ExampleGrammarParser.LSQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RSQ() { return getToken(ExampleGrammarParser.RSQ, 0); }
		public TerminalNode EQ() { return getToken(ExampleGrammarParser.EQ, 0); }
		public AssignToIdAsArrContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterAssignToIdAsArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitAssignToIdAsArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitAssignToIdAsArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncIdAsArrContext extends AssignmentContext {
		public TerminalNode INC() { return getToken(ExampleGrammarParser.INC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LSQ() { return getToken(ExampleGrammarParser.LSQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(ExampleGrammarParser.RSQ, 0); }
		public IncIdAsArrContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterIncIdAsArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitIncIdAsArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitIncIdAsArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignToIdContext extends AssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(ExampleGrammarParser.EQ, 0); }
		public ExprAllContext exprAll() {
			return getRuleContext(ExprAllContext.class,0);
		}
		public AssignToIdContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterAssignToId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitAssignToId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitAssignToId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecIdAsArrContext extends AssignmentContext {
		public TerminalNode DEC() { return getToken(ExampleGrammarParser.DEC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LSQ() { return getToken(ExampleGrammarParser.LSQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(ExampleGrammarParser.RSQ, 0); }
		public DecIdAsArrContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterDecIdAsArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitDecIdAsArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitDecIdAsArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignToIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(IDENTIFIER);
				setState(101);
				match(EQ);
				setState(102);
				exprAll();
				}
				break;
			case 2:
				_localctx = new AssignToIdAsArrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(IDENTIFIER);
				setState(104);
				match(LSQ);
				setState(105);
				expr();
				setState(106);
				match(RSQ);
				setState(107);
				match(EQ);
				setState(108);
				expr();
				}
				break;
			case 3:
				_localctx = new IncIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(INC);
				setState(111);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new IncIdAsArrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(INC);
				setState(113);
				match(IDENTIFIER);
				setState(114);
				match(LSQ);
				setState(115);
				expr();
				setState(116);
				match(RSQ);
				}
				break;
			case 5:
				_localctx = new DecIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(DEC);
				setState(119);
				match(IDENTIFIER);
				}
				break;
			case 6:
				_localctx = new DecIdAsArrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(DEC);
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(LSQ);
				setState(123);
				expr();
				setState(124);
				match(RSQ);
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

	public static class AssignStmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExampleGrammarParser.SEMICOLON, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			assignment();
			setState(129);
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

	public static class ControlStmtContext extends ParserRuleContext {
		public ControlStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStmt; }
	 
		public ControlStmtContext() { }
		public void copyFrom(ControlStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends ControlStmtContext {
		public TerminalNode LPAREN() { return getToken(ExampleGrammarParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ExampleGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ExampleGrammarParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(ExampleGrammarParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(ExampleGrammarParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(ExampleGrammarParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForContext(ControlStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileContext extends ControlStmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public DoWhileContext(ControlStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ControlStmtContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ControlStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ControlStmtContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfContext(ControlStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStmtContext controlStmt() throws RecognitionException {
		ControlStmtContext _localctx = new ControlStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_controlStmt);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__0);
				setState(132);
				boolExpr(0);
				setState(133);
				block();
				setState(134);
				match(T__1);
				setState(135);
				block();
				}
				break;
			case T__2:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__2);
				setState(138);
				match(LPAREN);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(139);
					match(TYPE);
					setState(140);
					match(IDENTIFIER);
					setState(141);
					match(EQ);
					setState(142);
					expr();
					}
				}

				setState(145);
				match(SEMICOLON);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << LPAREN) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(146);
					boolExpr(0);
					}
				}

				setState(149);
				match(SEMICOLON);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(150);
					assignment();
					}
				}

				setState(153);
				match(RPAREN);
				setState(154);
				block();
				}
				break;
			case T__3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(T__3);
				setState(156);
				boolExpr(0);
				setState(157);
				block();
				}
				break;
			case T__4:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(T__4);
				setState(160);
				block();
				setState(161);
				match(T__3);
				setState(162);
				boolExpr(0);
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

	public static class AtomStmtContext extends ParserRuleContext {
		public AtomStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomStmt; }
	 
		public AtomStmtContext() { }
		public void copyFrom(AtomStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends AtomStmtContext {
		public ExprAllContext exprAll() {
			return getRuleContext(ExprAllContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExampleGrammarParser.SEMICOLON, 0); }
		public PrintContext(AtomStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends AtomStmtContext {
		public ExprAllContext exprAll;
		public List<ExprAllContext> args = new ArrayList<ExprAllContext>();
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ExampleGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExampleGrammarParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ExampleGrammarParser.SEMICOLON, 0); }
		public List<ExprAllContext> exprAll() {
			return getRuleContexts(ExprAllContext.class);
		}
		public ExprAllContext exprAll(int i) {
			return getRuleContext(ExprAllContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExampleGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExampleGrammarParser.COMMA, i);
		}
		public FuncCallContext(AtomStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputContext extends AtomStmtContext {
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ExampleGrammarParser.SEMICOLON, 0); }
		public InputContext(AtomStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends AtomStmtContext {
		public ExprAllContext exprAll() {
			return getRuleContext(ExprAllContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExampleGrammarParser.SEMICOLON, 0); }
		public ReturnContext(AtomStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomStmtContext atomStmt() throws RecognitionException {
		AtomStmtContext _localctx = new AtomStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atomStmt);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__5);
				setState(167);
				match(IDENTIFIER);
				setState(168);
				match(SEMICOLON);
				}
				break;
			case T__6:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__6);
				setState(170);
				exprAll();
				setState(171);
				match(SEMICOLON);
				}
				break;
			case T__7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(T__7);
				setState(174);
				exprAll();
				setState(175);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(IDENTIFIER);
				setState(178);
				match(LPAREN);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << LPAREN) | (1L << LCURL) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
					{
					setState(179);
					((FuncCallContext)_localctx).exprAll = exprAll();
					((FuncCallContext)_localctx).args.add(((FuncCallContext)_localctx).exprAll);
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(180);
						match(COMMA);
						setState(181);
						((FuncCallContext)_localctx).exprAll = exprAll();
						((FuncCallContext)_localctx).args.add(((FuncCallContext)_localctx).exprAll);
						}
						}
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(189);
				match(RPAREN);
				setState(190);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(ExampleGrammarParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(ExampleGrammarParser.RCURL, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclArrContext> declArr() {
			return getRuleContexts(DeclArrContext.class);
		}
		public DeclArrContext declArr(int i) {
			return getRuleContext(DeclArrContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LCURL);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(194);
					decl();
					}
					break;
				case 2:
					{
					setState(195);
					declArr();
					}
					break;
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << INC) | (1L << DEC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(201);
				stmt();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(RCURL);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ControlStmtContext controlStmt() {
			return getRuleContext(ControlStmtContext.class,0);
		}
		public AtomStmtContext atomStmt() {
			return getRuleContext(AtomStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				assignStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				controlStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				atomStmt();
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

	public static class UnknownExprContext extends ParserRuleContext {
		public UnknownExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownExpr; }
	 
		public UnknownExprContext() { }
		public void copyFrom(UnknownExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownIdContext extends UnknownExprContext {
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public UnknownIdContext(UnknownExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterUnknownId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitUnknownId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitUnknownId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnknownIdAsArrContext extends UnknownExprContext {
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LSQ() { return getToken(ExampleGrammarParser.LSQ, 0); }
		public ExprAllContext exprAll() {
			return getRuleContext(ExprAllContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(ExampleGrammarParser.RSQ, 0); }
		public UnknownIdAsArrContext(UnknownExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterUnknownIdAsArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitUnknownIdAsArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitUnknownIdAsArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnknownFuncCallContext extends UnknownExprContext {
		public ExprAllContext exprAll;
		public List<ExprAllContext> args = new ArrayList<ExprAllContext>();
		public TerminalNode IDENTIFIER() { return getToken(ExampleGrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ExampleGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExampleGrammarParser.RPAREN, 0); }
		public List<ExprAllContext> exprAll() {
			return getRuleContexts(ExprAllContext.class);
		}
		public ExprAllContext exprAll(int i) {
			return getRuleContext(ExprAllContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExampleGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExampleGrammarParser.COMMA, i);
		}
		public UnknownFuncCallContext(UnknownExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterUnknownFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitUnknownFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitUnknownFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenUnknownContext extends UnknownExprContext {
		public TerminalNode LPAREN() { return getToken(ExampleGrammarParser.LPAREN, 0); }
		public UnknownExprContext unknownExpr() {
			return getRuleContext(UnknownExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExampleGrammarParser.RPAREN, 0); }
		public ParenUnknownContext(UnknownExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterParenUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitParenUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitParenUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownExprContext unknownExpr() throws RecognitionException {
		UnknownExprContext _localctx = new UnknownExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unknownExpr);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new UnknownIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new UnknownIdAsArrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(IDENTIFIER);
				setState(216);
				match(LSQ);
				setState(217);
				exprAll();
				setState(218);
				match(RSQ);
				}
				break;
			case 3:
				_localctx = new UnknownFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(IDENTIFIER);
				setState(221);
				match(LPAREN);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << LPAREN) | (1L << LCURL) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFIER) | (1L << STRING))) != 0)) {
					{
					setState(222);
					((UnknownFuncCallContext)_localctx).exprAll = exprAll();
					((UnknownFuncCallContext)_localctx).args.add(((UnknownFuncCallContext)_localctx).exprAll);
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(223);
						match(COMMA);
						setState(224);
						((UnknownFuncCallContext)_localctx).exprAll = exprAll();
						((UnknownFuncCallContext)_localctx).args.add(((UnknownFuncCallContext)_localctx).exprAll);
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(232);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ParenUnknownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(LPAREN);
				setState(234);
				unknownExpr();
				setState(235);
				match(RPAREN);
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

	public static class ExprAllContext extends ParserRuleContext {
		public UnknownExprContext unknownExpr() {
			return getRuleContext(UnknownExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprArrContext exprArr() {
			return getRuleContext(ExprArrContext.class,0);
		}
		public ExprAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterExprAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitExprAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitExprAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAllContext exprAll() throws RecognitionException {
		ExprAllContext _localctx = new ExprAllContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprAll);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				unknownExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				exprArr();
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

	public static class ExprArrContext extends ParserRuleContext {
		public UnknownExprContext unknownExpr() {
			return getRuleContext(UnknownExprContext.class,0);
		}
		public FloatExprArrContext floatExprArr() {
			return getRuleContext(FloatExprArrContext.class,0);
		}
		public BoolExprArrContext boolExprArr() {
			return getRuleContext(BoolExprArrContext.class,0);
		}
		public StringExprArrContext stringExprArr() {
			return getRuleContext(StringExprArrContext.class,0);
		}
		public ExprArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterExprArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitExprArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitExprArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprArrContext exprArr() throws RecognitionException {
		ExprArrContext _localctx = new ExprArrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprArr);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				unknownExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				floatExprArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				boolExprArr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				stringExprArr();
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

	public static class FloatExprArrContext extends ParserRuleContext {
		public FloatExprContext floatExpr;
		public List<FloatExprContext> elements = new ArrayList<FloatExprContext>();
		public TerminalNode LCURL() { return getToken(ExampleGrammarParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(ExampleGrammarParser.RCURL, 0); }
		public List<FloatExprContext> floatExpr() {
			return getRuleContexts(FloatExprContext.class);
		}
		public FloatExprContext floatExpr(int i) {
			return getRuleContext(FloatExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExampleGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExampleGrammarParser.COMMA, i);
		}
		public FloatExprArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatExprArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterFloatExprArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitFloatExprArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitFloatExprArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatExprArrContext floatExprArr() throws RecognitionException {
		FloatExprArrContext _localctx = new FloatExprArrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_floatExprArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(LCURL);
			setState(251);
			((FloatExprArrContext)_localctx).floatExpr = floatExpr(0);
			((FloatExprArrContext)_localctx).elements.add(((FloatExprArrContext)_localctx).floatExpr);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(252);
				match(COMMA);
				setState(253);
				((FloatExprArrContext)_localctx).floatExpr = floatExpr(0);
				((FloatExprArrContext)_localctx).elements.add(((FloatExprArrContext)_localctx).floatExpr);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(RCURL);
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

	public static class BoolExprArrContext extends ParserRuleContext {
		public BoolExprContext boolExpr;
		public List<BoolExprContext> elements = new ArrayList<BoolExprContext>();
		public TerminalNode LCURL() { return getToken(ExampleGrammarParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(ExampleGrammarParser.RCURL, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExampleGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExampleGrammarParser.COMMA, i);
		}
		public BoolExprArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExprArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterBoolExprArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitBoolExprArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitBoolExprArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprArrContext boolExprArr() throws RecognitionException {
		BoolExprArrContext _localctx = new BoolExprArrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolExprArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(LCURL);
			setState(262);
			((BoolExprArrContext)_localctx).boolExpr = boolExpr(0);
			((BoolExprArrContext)_localctx).elements.add(((BoolExprArrContext)_localctx).boolExpr);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				((BoolExprArrContext)_localctx).boolExpr = boolExpr(0);
				((BoolExprArrContext)_localctx).elements.add(((BoolExprArrContext)_localctx).boolExpr);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(RCURL);
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

	public static class StringExprArrContext extends ParserRuleContext {
		public StringExprContext stringExpr;
		public List<StringExprContext> elements = new ArrayList<StringExprContext>();
		public TerminalNode LCURL() { return getToken(ExampleGrammarParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(ExampleGrammarParser.RCURL, 0); }
		public List<StringExprContext> stringExpr() {
			return getRuleContexts(StringExprContext.class);
		}
		public StringExprContext stringExpr(int i) {
			return getRuleContext(StringExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExampleGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExampleGrammarParser.COMMA, i);
		}
		public StringExprArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExprArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterStringExprArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitStringExprArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitStringExprArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprArrContext stringExprArr() throws RecognitionException {
		StringExprArrContext _localctx = new StringExprArrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringExprArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LCURL);
			setState(273);
			((StringExprArrContext)_localctx).stringExpr = stringExpr(0);
			((StringExprArrContext)_localctx).elements.add(((StringExprArrContext)_localctx).stringExpr);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(274);
				match(COMMA);
				setState(275);
				((StringExprArrContext)_localctx).stringExpr = stringExpr(0);
				((StringExprArrContext)_localctx).elements.add(((StringExprArrContext)_localctx).stringExpr);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(RCURL);
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

	public static class ExprContext extends ParserRuleContext {
		public UnknownExprContext unknownExpr() {
			return getRuleContext(UnknownExprContext.class,0);
		}
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				unknownExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				floatExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				boolExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				stringExpr(0);
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

	public static class FloatExprContext extends ParserRuleContext {
		public FloatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatExpr; }
	 
		public FloatExprContext() { }
		public void copyFrom(FloatExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatContext extends FloatExprContext {
		public TerminalNode FLOAT() { return getToken(ExampleGrammarParser.FLOAT, 0); }
		public FloatContext(FloatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatUnknownContext extends FloatExprContext {
		public UnknownExprContext unknownExpr() {
			return getRuleContext(UnknownExprContext.class,0);
		}
		public FloatUnknownContext(FloatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterFloatUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitFloatUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitFloatUnknown(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenFloatContext extends FloatExprContext {
		public TerminalNode LPAREN() { return getToken(ExampleGrammarParser.LPAREN, 0); }
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExampleGrammarParser.RPAREN, 0); }
		public ParenFloatContext(FloatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterParenFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitParenFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitParenFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends FloatExprContext {
		public TerminalNode INT() { return getToken(ExampleGrammarParser.INT, 0); }
		public IntContext(FloatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatArithContext extends FloatExprContext {
		public Token op;
		public List<FloatExprContext> floatExpr() {
			return getRuleContexts(FloatExprContext.class);
		}
		public FloatExprContext floatExpr(int i) {
			return getRuleContext(FloatExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExampleGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExampleGrammarParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(ExampleGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExampleGrammarParser.DIV, 0); }
		public FloatArithContext(FloatExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterFloatArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitFloatArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitFloatArith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatExprContext floatExpr() throws RecognitionException {
		return floatExpr(0);
	}

	private FloatExprContext floatExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FloatExprContext _localctx = new FloatExprContext(_ctx, _parentState);
		FloatExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_floatExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(290);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(FLOAT);
				}
				break;
			case 3:
				{
				_localctx = new FloatUnknownContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				unknownExpr();
				}
				break;
			case 4:
				{
				_localctx = new ParenFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(LPAREN);
				setState(294);
				floatExpr(0);
				setState(295);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FloatArithContext(new FloatExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_floatExpr);
					setState(299);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(300);
					((FloatArithContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB))) != 0)) ) {
						((FloatArithContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(301);
					floatExpr(6);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExprFloatOpContext extends BoolExprContext {
		public Token op;
		public List<FloatExprContext> floatExpr() {
			return getRuleContexts(FloatExprContext.class);
		}
		public FloatExprContext floatExpr(int i) {
			return getRuleContext(FloatExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(ExampleGrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(ExampleGrammarParser.LE, 0); }
		public TerminalNode GT() { return getToken(ExampleGrammarParser.GT, 0); }
		public TerminalNode GE() { return getToken(ExampleGrammarParser.GE, 0); }
		public TerminalNode EQEQ() { return getToken(ExampleGrammarParser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(ExampleGrammarParser.NEQ, 0); }
		public BoolExprFloatOpContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterBoolExprFloatOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitBoolExprFloatOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitBoolExprFloatOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenBoolExprContext extends BoolExprContext {
		public TerminalNode LPAREN() { return getToken(ExampleGrammarParser.LPAREN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExampleGrammarParser.RPAREN, 0); }
		public ParenBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterParenBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitParenBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitParenBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprBoolOpContext extends BoolExprContext {
		public Token op;
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ExampleGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExampleGrammarParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ExampleGrammarParser.XOR, 0); }
		public BoolExprBoolOpContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterBoolExprBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitBoolExprBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitBoolExprBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotBoolExprContext extends BoolExprContext {
		public TerminalNode NOT() { return getToken(ExampleGrammarParser.NOT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NotBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterNotBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitNotBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitNotBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolUnknownContext extends BoolExprContext {
		public UnknownExprContext unknownExpr() {
			return getRuleContext(UnknownExprContext.class,0);
		}
		public BoolUnknownContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterBoolUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitBoolUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitBoolUnknown(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprFalseContext extends BoolExprContext {
		public TerminalNode FALSE() { return getToken(ExampleGrammarParser.FALSE, 0); }
		public BoolExprFalseContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterBoolExprFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitBoolExprFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitBoolExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprTrueContext extends BoolExprContext {
		public TerminalNode TRUE() { return getToken(ExampleGrammarParser.TRUE, 0); }
		public BoolExprTrueContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterBoolExprTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitBoolExprTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitBoolExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new NotBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(308);
				match(NOT);
				setState(309);
				boolExpr(6);
				}
				break;
			case 2:
				{
				_localctx = new BoolExprFloatOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				floatExpr(0);
				setState(311);
				((BoolExprFloatOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQEQ) | (1L << NEQ))) != 0)) ) {
					((BoolExprFloatOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				floatExpr(0);
				}
				break;
			case 3:
				{
				_localctx = new BoolExprTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(TRUE);
				}
				break;
			case 4:
				{
				_localctx = new BoolExprFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(FALSE);
				}
				break;
			case 5:
				{
				_localctx = new BoolUnknownContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				unknownExpr();
				}
				break;
			case 6:
				{
				_localctx = new ParenBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(LPAREN);
				setState(318);
				boolExpr(0);
				setState(319);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprBoolOpContext(new BoolExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(323);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(324);
					((BoolExprBoolOpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
						((BoolExprBoolOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(325);
					boolExpr(8);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class StringExprContext extends ParserRuleContext {
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
	 
		public StringExprContext() { }
		public void copyFrom(StringExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrContext extends StringExprContext {
		public TerminalNode STRING() { return getToken(ExampleGrammarParser.STRING, 0); }
		public StrContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenStrContext extends StringExprContext {
		public TerminalNode LPAREN() { return getToken(ExampleGrammarParser.LPAREN, 0); }
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExampleGrammarParser.RPAREN, 0); }
		public ParenStrContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterParenStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitParenStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitParenStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrCatContext extends StringExprContext {
		public List<StringExprContext> stringExpr() {
			return getRuleContexts(StringExprContext.class);
		}
		public StringExprContext stringExpr(int i) {
			return getRuleContext(StringExprContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(ExampleGrammarParser.CONCAT, 0); }
		public StrCatContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterStrCat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitStrCat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitStrCat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrUnknownContext extends StringExprContext {
		public UnknownExprContext unknownExpr() {
			return getRuleContext(UnknownExprContext.class,0);
		}
		public StrUnknownContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).enterStrUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExampleGrammarListener ) ((ExampleGrammarListener)listener).exitStrUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExampleGrammarVisitor ) return ((ExampleGrammarVisitor<? extends T>)visitor).visitStrUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		return stringExpr(0);
	}

	private StringExprContext stringExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringExprContext _localctx = new StringExprContext(_ctx, _parentState);
		StringExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_stringExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(332);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new StrUnknownContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				unknownExpr();
				}
				break;
			case 3:
				{
				_localctx = new ParenStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				match(LPAREN);
				setState(335);
				stringExpr(0);
				setState(336);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StrCatContext(new StringExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
					setState(340);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(341);
					match(CONCAT);
					setState(342);
					stringExpr(5);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return floatExpr_sempred((FloatExprContext)_localctx, predIndex);
		case 19:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 20:
			return stringExpr_sempred((StringExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean floatExpr_sempred(FloatExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean stringExpr_sempred(StringExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\6\2\65\n\2\r\2\16\2\66\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\4\3\4\3\5\3\5\3\5\5\5O\n\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6V\n\6\3\6\3\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\5\6"+
		"b\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t"+
		"\3\t\3\t\5\t\u0096\n\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00a7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b9\n\n\f\n\16\n\u00bc\13\n\5\n\u00be"+
		"\n\n\3\n\3\n\5\n\u00c2\n\n\3\13\3\13\3\13\7\13\u00c7\n\13\f\13\16\13\u00ca"+
		"\13\13\3\13\7\13\u00cd\n\13\f\13\16\13\u00d0\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\5\f\u00d7\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e4"+
		"\n\r\f\r\16\r\u00e7\13\r\5\r\u00e9\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f0\n"+
		"\r\3\16\3\16\3\16\5\16\u00f5\n\16\3\17\3\17\3\17\3\17\5\17\u00fb\n\17"+
		"\3\20\3\20\3\20\3\20\7\20\u0101\n\20\f\20\16\20\u0104\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u0122\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u012c\n\24\3\24\3\24\3\24\7\24\u0131\n\24\f\24\16\24\u0134"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0144\n\25\3\25\3\25\3\25\7\25\u0149\n\25\f\25\16\25\u014c"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0155\n\26\3\26\3\26\3"+
		"\26\7\26\u015a\n\26\f\26\16\26\u015d\13\26\3\26\2\5&(*\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\33\36\3\2\17\24\4\2\25\26\30"+
		"\30\2\u0184\2\60\3\2\2\2\48\3\2\2\2\6@\3\2\2\2\bK\3\2\2\2\nR\3\2\2\2\f"+
		"\u0080\3\2\2\2\16\u0082\3\2\2\2\20\u00a6\3\2\2\2\22\u00c1\3\2\2\2\24\u00c3"+
		"\3\2\2\2\26\u00d6\3\2\2\2\30\u00ef\3\2\2\2\32\u00f4\3\2\2\2\34\u00fa\3"+
		"\2\2\2\36\u00fc\3\2\2\2 \u0107\3\2\2\2\"\u0112\3\2\2\2$\u0121\3\2\2\2"+
		"&\u012b\3\2\2\2(\u0143\3\2\2\2*\u0154\3\2\2\2,/\5\4\3\2-/\5\6\4\2.,\3"+
		"\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\63\65\5\n\6\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\3\3\2\2\289\7\13\2\29<\7*\2\2:;\7\37\2\2;=\5\32\16\2<:"+
		"\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7 \2\2?\5\3\2\2\2@A\7\13\2\2AB\7*\2\2B"+
		"C\7\"\2\2CD\5$\23\2DG\7#\2\2EF\7\37\2\2FH\5\34\17\2GE\3\2\2\2GH\3\2\2"+
		"\2HI\3\2\2\2IJ\7 \2\2J\7\3\2\2\2KN\7\13\2\2LM\7\"\2\2MO\7#\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OP\3\2\2\2PQ\7*\2\2Q\t\3\2\2\2RU\7\13\2\2ST\7\"\2\2TV\7#\2"+
		"\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7*\2\2Xa\7$\2\2Y^\5\b\5\2Z[\7!\2\2"+
		"[]\5\b\5\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2aY\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7%\2\2de\5\24\13\2e\13\3\2\2\2fg\7"+
		"*\2\2gh\7\37\2\2h\u0081\5\32\16\2ij\7*\2\2jk\7\"\2\2kl\5$\23\2lm\7#\2"+
		"\2mn\7\37\2\2no\5$\23\2o\u0081\3\2\2\2pq\7\31\2\2q\u0081\7*\2\2rs\7\31"+
		"\2\2st\7*\2\2tu\7\"\2\2uv\5$\23\2vw\7#\2\2w\u0081\3\2\2\2xy\7\32\2\2y"+
		"\u0081\7*\2\2z{\7\32\2\2{|\7*\2\2|}\7\"\2\2}~\5$\23\2~\177\7#\2\2\177"+
		"\u0081\3\2\2\2\u0080f\3\2\2\2\u0080i\3\2\2\2\u0080p\3\2\2\2\u0080r\3\2"+
		"\2\2\u0080x\3\2\2\2\u0080z\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083\5\f\7\2"+
		"\u0083\u0084\7 \2\2\u0084\17\3\2\2\2\u0085\u0086\7\3\2\2\u0086\u0087\5"+
		"(\25\2\u0087\u0088\5\24\13\2\u0088\u0089\7\4\2\2\u0089\u008a\5\24\13\2"+
		"\u008a\u00a7\3\2\2\2\u008b\u008c\7\5\2\2\u008c\u0091\7$\2\2\u008d\u008e"+
		"\7\13\2\2\u008e\u008f\7*\2\2\u008f\u0090\7\37\2\2\u0090\u0092\5$\23\2"+
		"\u0091\u008d\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095"+
		"\7 \2\2\u0094\u0096\5(\25\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\7 \2\2\u0098\u009a\5\f\7\2\u0099\u0098\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7%\2\2\u009c"+
		"\u00a7\5\24\13\2\u009d\u009e\7\6\2\2\u009e\u009f\5(\25\2\u009f\u00a0\5"+
		"\24\13\2\u00a0\u00a7\3\2\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\5\24\13\2"+
		"\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5(\25\2\u00a5\u00a7\3\2\2\2\u00a6\u0085"+
		"\3\2\2\2\u00a6\u008b\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7"+
		"\21\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\7*\2\2\u00aa\u00c2\7 \2\2"+
		"\u00ab\u00ac\7\t\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\7 \2\2\u00ae\u00c2"+
		"\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b1\5\32\16\2\u00b1\u00b2\7 \2\2"+
		"\u00b2\u00c2\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4\u00bd\7$\2\2\u00b5\u00ba"+
		"\5\32\16\2\u00b6\u00b7\7!\2\2\u00b7\u00b9\5\32\16\2\u00b8\u00b6\3\2\2"+
		"\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\7%\2\2\u00c0\u00c2\7 \2\2\u00c1\u00a8\3\2\2"+
		"\2\u00c1\u00ab\3\2\2\2\u00c1\u00af\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c2\23"+
		"\3\2\2\2\u00c3\u00c8\7&\2\2\u00c4\u00c7\5\4\3\2\u00c5\u00c7\5\6\4\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cd\5\26\f\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\7\'\2\2\u00d2\25\3\2\2\2\u00d3\u00d7\5\16\b\2\u00d4\u00d7\5\20"+
		"\t\2\u00d5\u00d7\5\22\n\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00f0\7*\2\2\u00d9\u00da\7*\2\2"+
		"\u00da\u00db\7\"\2\2\u00db\u00dc\5\32\16\2\u00dc\u00dd\7#\2\2\u00dd\u00f0"+
		"\3\2\2\2\u00de\u00df\7*\2\2\u00df\u00e8\7$\2\2\u00e0\u00e5\5\32\16\2\u00e1"+
		"\u00e2\7!\2\2\u00e2\u00e4\5\32\16\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3"+
		"\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00f0\7%\2\2\u00eb\u00ec\7$\2\2\u00ec\u00ed\5\30\r\2\u00ed"+
		"\u00ee\7%\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00d8\3\2\2\2\u00ef\u00d9\3\2"+
		"\2\2\u00ef\u00de\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\31\3\2\2\2\u00f1\u00f5"+
		"\5\30\r\2\u00f2\u00f5\5$\23\2\u00f3\u00f5\5\34\17\2\u00f4\u00f1\3\2\2"+
		"\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\33\3\2\2\2\u00f6\u00fb"+
		"\5\30\r\2\u00f7\u00fb\5\36\20\2\u00f8\u00fb\5 \21\2\u00f9\u00fb\5\"\22"+
		"\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\35\3\2\2\2\u00fc\u00fd\7&\2\2\u00fd\u0102\5&\24\2\u00fe"+
		"\u00ff\7!\2\2\u00ff\u0101\5&\24\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\7\'\2\2\u0106\37\3\2\2\2\u0107\u0108\7&\2\2"+
		"\u0108\u010d\5(\25\2\u0109\u010a\7!\2\2\u010a\u010c\5(\25\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\'\2\2\u0111!\3\2\2\2"+
		"\u0112\u0113\7&\2\2\u0113\u0118\5*\26\2\u0114\u0115\7!\2\2\u0115\u0117"+
		"\5*\26\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\'"+
		"\2\2\u011c#\3\2\2\2\u011d\u0122\5\30\r\2\u011e\u0122\5&\24\2\u011f\u0122"+
		"\5(\25\2\u0120\u0122\5*\26\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122%\3\2\2\2\u0123\u0124\b\24\1\2"+
		"\u0124\u012c\7(\2\2\u0125\u012c\7)\2\2\u0126\u012c\5\30\r\2\u0127\u0128"+
		"\7$\2\2\u0128\u0129\5&\24\2\u0129\u012a\7%\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0123\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2"+
		"\2\2\u012c\u0132\3\2\2\2\u012d\u012e\f\7\2\2\u012e\u012f\t\2\2\2\u012f"+
		"\u0131\5&\24\b\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\'\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136"+
		"\b\25\1\2\u0136\u0137\7\27\2\2\u0137\u0144\5(\25\b\u0138\u0139\5&\24\2"+
		"\u0139\u013a\t\3\2\2\u013a\u013b\5&\24\2\u013b\u0144\3\2\2\2\u013c\u0144"+
		"\7\f\2\2\u013d\u0144\7\r\2\2\u013e\u0144\5\30\r\2\u013f\u0140\7$\2\2\u0140"+
		"\u0141\5(\25\2\u0141\u0142\7%\2\2\u0142\u0144\3\2\2\2\u0143\u0135\3\2"+
		"\2\2\u0143\u0138\3\2\2\2\u0143\u013c\3\2\2\2\u0143\u013d\3\2\2\2\u0143"+
		"\u013e\3\2\2\2\u0143\u013f\3\2\2\2\u0144\u014a\3\2\2\2\u0145\u0146\f\t"+
		"\2\2\u0146\u0147\t\4\2\2\u0147\u0149\5(\25\n\u0148\u0145\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b)\3\2\2\2"+
		"\u014c\u014a\3\2\2\2\u014d\u014e\b\26\1\2\u014e\u0155\7+\2\2\u014f\u0155"+
		"\5\30\r\2\u0150\u0151\7$\2\2\u0151\u0152\5*\26\2\u0152\u0153\7%\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u014d\3\2\2\2\u0154\u014f\3\2\2\2\u0154\u0150\3\2"+
		"\2\2\u0155\u015b\3\2\2\2\u0156\u0157\f\6\2\2\u0157\u0158\7\16\2\2\u0158"+
		"\u015a\5*\26\7\u0159\u0156\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c+\3\2\2\2\u015d\u015b\3\2\2\2&.\60\66<G"+
		"NU^a\u0080\u0091\u0095\u0099\u00a6\u00ba\u00bd\u00c1\u00c6\u00c8\u00ce"+
		"\u00d6\u00e5\u00e8\u00ef\u00f4\u00fa\u0102\u010d\u0118\u0121\u012b\u0132"+
		"\u0143\u014a\u0154\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}