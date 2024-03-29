// Generated from c:\Users\ellerbee_james1\Documents\GitHub\Math-Programming-Language\mpl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		SET=18, LET=19, VAR=20, EQU_SIGN=21, STRING=22, INT=23, OPERATOR=24, TERM=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"SET", "LET", "VAR", "EQU_SIGN", "STRING", "INT", "OPERATOR", "TERM"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'display'", "','", "'exist'", "'='", "'solve for'", "'given'", 
		"'when'", "'('", "')'", "'**'", "'*'", "'/'", "'%'", "'+'", "'-'", "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "SET", "LET", "VAR", "EQU_SIGN", "STRING", 
		"INT", "OPERATOR", "TERM"
	};
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


	public mplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mpl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23x\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0080"+
		"\n\24\3\25\3\25\7\25\u0084\n\25\f\25\16\25\u0087\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0090\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u0097"+
		"\n\27\f\27\16\27\u009a\13\27\3\27\3\27\3\30\5\30\u009f\n\30\3\30\6\30"+
		"\u00a2\n\30\r\30\16\30\u00a3\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u00ad"+
		"\n\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\t"+
		"\4\2C\\c|\6\2\62;C\\aac|\4\2>>@@\5\2\62;C\\c|\3\2//\3\2\62;\5\2,-//\61"+
		"\61\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7?\3\2"+
		"\2\2\tA\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17S\3\2\2\2\21Y\3\2\2\2\23^\3\2"+
		"\2\2\25`\3\2\2\2\27b\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37k\3"+
		"\2\2\2!m\3\2\2\2#o\3\2\2\2%w\3\2\2\2\'\177\3\2\2\2)\u0081\3\2\2\2+\u008f"+
		"\3\2\2\2-\u0091\3\2\2\2/\u009e\3\2\2\2\61\u00a5\3\2\2\2\63\u00ac\3\2\2"+
		"\2\65\66\7\60\2\2\66\4\3\2\2\2\678\7f\2\289\7k\2\29:\7u\2\2:;\7r\2\2;"+
		"<\7n\2\2<=\7c\2\2=>\7{\2\2>\6\3\2\2\2?@\7.\2\2@\b\3\2\2\2AB\7g\2\2BC\7"+
		"z\2\2CD\7k\2\2DE\7u\2\2EF\7v\2\2F\n\3\2\2\2GH\7?\2\2H\f\3\2\2\2IJ\7u\2"+
		"\2JK\7q\2\2KL\7n\2\2LM\7x\2\2MN\7g\2\2NO\7\"\2\2OP\7h\2\2PQ\7q\2\2QR\7"+
		"t\2\2R\16\3\2\2\2ST\7i\2\2TU\7k\2\2UV\7x\2\2VW\7g\2\2WX\7p\2\2X\20\3\2"+
		"\2\2YZ\7y\2\2Z[\7j\2\2[\\\7g\2\2\\]\7p\2\2]\22\3\2\2\2^_\7*\2\2_\24\3"+
		"\2\2\2`a\7+\2\2a\26\3\2\2\2bc\7,\2\2cd\7,\2\2d\30\3\2\2\2ef\7,\2\2f\32"+
		"\3\2\2\2gh\7\61\2\2h\34\3\2\2\2ij\7\'\2\2j\36\3\2\2\2kl\7-\2\2l \3\2\2"+
		"\2mn\7/\2\2n\"\3\2\2\2op\7)\2\2p$\3\2\2\2qr\7U\2\2rs\7g\2\2sx\7v\2\2t"+
		"u\7u\2\2uv\7g\2\2vx\7v\2\2wq\3\2\2\2wt\3\2\2\2x&\3\2\2\2yz\7N\2\2z{\7"+
		"g\2\2{\u0080\7v\2\2|}\7n\2\2}~\7g\2\2~\u0080\7v\2\2\177y\3\2\2\2\177|"+
		"\3\2\2\2\u0080(\3\2\2\2\u0081\u0085\t\2\2\2\u0082\u0084\t\3\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086*\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7?\2\2\u0089\u0090"+
		"\7?\2\2\u008a\u008b\7>\2\2\u008b\u0090\7?\2\2\u008c\u008d\7@\2\2\u008d"+
		"\u0090\7?\2\2\u008e\u0090\t\4\2\2\u008f\u0088\3\2\2\2\u008f\u008a\3\2"+
		"\2\2\u008f\u008c\3\2\2\2\u008f\u008e\3\2\2\2\u0090,\3\2\2\2\u0091\u0098"+
		"\7$\2\2\u0092\u0097\t\5\2\2\u0093\u0097\5\61\31\2\u0094\u0097\5\61\31"+
		"\2\u0095\u0097\5+\26\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7$"+
		"\2\2\u009c.\3\2\2\2\u009d\u009f\t\6\2\2\u009e\u009d\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\t\7\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\60\3\2\2"+
		"\2\u00a5\u00a6\t\b\2\2\u00a6\62\3\2\2\2\u00a7\u00ad\5)\25\2\u00a8\u00ad"+
		"\5/\30\2\u00a9\u00aa\5/\30\2\u00aa\u00ab\5)\25\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a7\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\64\3\2\2"+
		"\2\r\2w\177\u0083\u0085\u008f\u0096\u0098\u009e\u00a3\u00ac\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}