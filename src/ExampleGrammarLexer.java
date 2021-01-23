// Generated from C:/Users/Evilcorez/Desktop/FOPL ANTLAR PROFRAMS/Task2gG/src\ExampleGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExampleGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "TYPE", 
			"TRUE", "FALSE", "CONCAT", "LT", "LE", "GT", "GE", "EQEQ", "NEQ", "AND", 
			"OR", "NOT", "XOR", "INC", "DEC", "MUL", "DIV", "ADD", "SUB", "EQ", "SEMICOLON", 
			"COMMA", "LSQ", "RSQ", "LPAREN", "RPAREN", "LCURL", "RCURL", "INT", "FLOAT", 
			"IDENTIFIER", "STRING", "NONDIGIT", "DIGIT", "CHAR", "WS", "COMMENT"
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


	public ExampleGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExampleGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\6\'\u00e5\n\'\r\'\16\'\u00e6\3"+
		"(\6(\u00ea\n(\r(\16(\u00eb\3(\3(\6(\u00f0\n(\r(\16(\u00f1\3)\3)\6)\u00f6"+
		"\n)\r)\16)\u00f7\3*\3*\7*\u00fc\n*\f*\16*\u00ff\13*\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\6.\u010a\n.\r.\16.\u010b\3.\3.\3/\3/\3/\3/\7/\u0114\n/\f/\16"+
		"/\u0117\13/\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y\2[,]-\3\2\7\5"+
		"\2C\\aac|\3\2\62;\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2"+
		"\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5b\3\2\2\2\7g\3\2\2\2\tk\3\2\2"+
		"\2\13q\3\2\2\2\rt\3\2\2\2\17z\3\2\2\2\21\u0080\3\2\2\2\23\u0099\3\2\2"+
		"\2\25\u009b\3\2\2\2\27\u00a0\3\2\2\2\31\u00a6\3\2\2\2\33\u00a9\3\2\2\2"+
		"\35\u00ab\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b3\3\2\2\2%\u00b6"+
		"\3\2\2\2\'\u00b9\3\2\2\2)\u00bc\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2"+
		"/\u00c3\3\2\2\2\61\u00c6\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67"+
		"\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d1\3\2\2\2=\u00d3\3\2\2\2?\u00d5\3\2"+
		"\2\2A\u00d7\3\2\2\2C\u00d9\3\2\2\2E\u00db\3\2\2\2G\u00dd\3\2\2\2I\u00df"+
		"\3\2\2\2K\u00e1\3\2\2\2M\u00e4\3\2\2\2O\u00e9\3\2\2\2Q\u00f5\3\2\2\2S"+
		"\u00f9\3\2\2\2U\u0102\3\2\2\2W\u0104\3\2\2\2Y\u0106\3\2\2\2[\u0109\3\2"+
		"\2\2]\u010f\3\2\2\2_`\7k\2\2`a\7h\2\2a\4\3\2\2\2bc\7g\2\2cd\7n\2\2de\7"+
		"u\2\2ef\7g\2\2f\6\3\2\2\2gh\7h\2\2hi\7q\2\2ij\7t\2\2j\b\3\2\2\2kl\7y\2"+
		"\2lm\7j\2\2mn\7k\2\2no\7n\2\2op\7g\2\2p\n\3\2\2\2qr\7f\2\2rs\7q\2\2s\f"+
		"\3\2\2\2tu\7k\2\2uv\7p\2\2vw\7r\2\2wx\7w\2\2xy\7v\2\2y\16\3\2\2\2z{\7"+
		"r\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177\20\3\2\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083\u0084\7w\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7p\2\2\u0086\22\3\2\2\2\u0087\u0088\7h\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7q\2\2\u008a\u008b\7c\2\2\u008b\u009a\7v\2\2"+
		"\u008c\u008d\7d\2\2\u008d\u008e\7q\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7g\2\2\u0091\u0092\7c\2\2\u0092\u009a\7p\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2"+
		"\u0097\u0098\7p\2\2\u0098\u009a\7i\2\2\u0099\u0087\3\2\2\2\u0099\u008c"+
		"\3\2\2\2\u0099\u0093\3\2\2\2\u009a\24\3\2\2\2\u009b\u009c\7v\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7w\2\2\u009e\u009f\7g\2\2\u009f\26\3\2\2\2\u00a0"+
		"\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2"+
		"\u00a4\u00a5\7g\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7%\2\2\u00a7\u00a8\7"+
		"%\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\34\3\2\2\2\u00ab\u00ac"+
		"\7>\2\2\u00ac\u00ad\7?\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7@\2\2\u00af "+
		"\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7?\2\2\u00b2\"\3\2\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\u00b5\7?\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8"+
		"\7?\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7(\2\2\u00ba\u00bb\7(\2\2\u00bb(\3"+
		"\2\2\2\u00bc\u00bd\7~\2\2\u00bd\u00be\7~\2\2\u00be*\3\2\2\2\u00bf\u00c0"+
		"\7#\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7`\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7"+
		"-\2\2\u00c4\u00c5\7-\2\2\u00c5\60\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7\u00c8"+
		"\7/\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\64\3\2\2\2\u00cb\u00cc"+
		"\7\61\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce8\3\2\2\2\u00cf\u00d0"+
		"\7/\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7?\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7"+
		"=\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7.\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7]"+
		"\2\2\u00d8B\3\2\2\2\u00d9\u00da\7_\2\2\u00daD\3\2\2\2\u00db\u00dc\7*\2"+
		"\2\u00dcF\3\2\2\2\u00dd\u00de\7+\2\2\u00deH\3\2\2\2\u00df\u00e0\7}\2\2"+
		"\u00e0J\3\2\2\2\u00e1\u00e2\7\177\2\2\u00e2L\3\2\2\2\u00e3\u00e5\5W,\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7N\3\2\2\2\u00e8\u00ea\5W,\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\7\60\2\2\u00ee\u00f0\5W,\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2P\3\2\2\2\u00f3\u00f6"+
		"\5W,\2\u00f4\u00f6\5U+\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8R\3\2\2\2"+
		"\u00f9\u00fd\7$\2\2\u00fa\u00fc\5Y-\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\7$\2\2\u0101T\3\2\2\2\u0102\u0103\t\2\2\2\u0103"+
		"V\3\2\2\2\u0104\u0105\t\3\2\2\u0105X\3\2\2\2\u0106\u0107\n\4\2\2\u0107"+
		"Z\3\2\2\2\u0108\u010a\t\5\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\b.\2\2\u010e\\\3\2\2\2\u010f\u0110\7\61\2\2\u0110\u0111\7\61\2\2\u0111"+
		"\u0115\3\2\2\2\u0112\u0114\n\6\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0119\b/\2\2\u0119^\3\2\2\2\f\2\u0099\u00e6\u00eb"+
		"\u00f1\u00f5\u00f7\u00fd\u010b\u0115\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}