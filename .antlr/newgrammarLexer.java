// Generated from /home/srmaia/Documentos/GitHub/Compiler-LL1-Simple/newgrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class newgrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		IGNORE=39, WHITESPACE=40, COMMENTLINES=41, COMMENTLINE=42, RESERVEDWORDS=43, 
		NUMBER=44, OPERATORSPOINTING=45, ID=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "IGNORE", "WHITESPACE", 
			"COMMENTLINES", "COMMENTLINE", "RESERVEDWORDS", "NUMBER", "OPERATORSPOINTING", 
			"ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "'return'", 
			"','", "'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'='", "'&&'", "'<'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'true'", "'false'", "'new'", "'.'", "'length'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IGNORE", "WHITESPACE", "COMMENTLINES", "COMMENTLINE", 
			"RESERVEDWORDS", "NUMBER", "OPERATORSPOINTING", "ID"
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


	public newgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "newgrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u0108\n"+
		"(\3(\3(\3)\3)\3*\3*\3*\3*\7*\u0112\n*\f*\16*\u0115\13*\3*\3*\3*\3+\3+"+
		"\3+\3+\7+\u011e\n+\f+\16+\u0121\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u018e\n,\3-\6-\u0191\n-\r-\16-\u0192\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u019e\n.\3/\5/\u01a1\n/\3/\7/\u01a4\n/\f/\16/\u01a7\13/\4\u0113"+
		"\u011f\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\t\5\2\n\f\17\17"+
		"\"\"\3\2\f\f\3\2\62;\n\2*+..\60\60=?]]__}}\177\177\5\2,-//\61\61\4\2C"+
		"\\c|\7\2//\62;C\\aac|\2\u01c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\3_\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\tn\3\2\2\2\13u\3\2\2\2"+
		"\rz\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23\u0088\3\2\2\2\25\u008a"+
		"\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0098\3"+
		"\2\2\2\37\u009a\3\2\2\2!\u00a1\3\2\2\2#\u00a3\3\2\2\2%\u00a7\3\2\2\2\'"+
		"\u00af\3\2\2\2)\u00b2\3\2\2\2+\u00b7\3\2\2\2-\u00bd\3\2\2\2/\u00d0\3\2"+
		"\2\2\61\u00d2\3\2\2\2\63\u00d5\3\2\2\2\65\u00d7\3\2\2\2\67\u00da\3\2\2"+
		"\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e1\3\2\2\2?\u00e3\3\2\2\2A\u00e5"+
		"\3\2\2\2C\u00e7\3\2\2\2E\u00ec\3\2\2\2G\u00f2\3\2\2\2I\u00f6\3\2\2\2K"+
		"\u00f8\3\2\2\2M\u00ff\3\2\2\2O\u0107\3\2\2\2Q\u010b\3\2\2\2S\u010d\3\2"+
		"\2\2U\u0119\3\2\2\2W\u018d\3\2\2\2Y\u0190\3\2\2\2[\u019d\3\2\2\2]\u01a0"+
		"\3\2\2\2_`\7e\2\2`a\7n\2\2ab\7c\2\2bc\7u\2\2cd\7u\2\2d\4\3\2\2\2ef\7}"+
		"\2\2f\6\3\2\2\2gh\7r\2\2hi\7w\2\2ij\7d\2\2jk\7n\2\2kl\7k\2\2lm\7e\2\2"+
		"m\b\3\2\2\2no\7u\2\2op\7v\2\2pq\7c\2\2qr\7v\2\2rs\7k\2\2st\7e\2\2t\n\3"+
		"\2\2\2uv\7x\2\2vw\7q\2\2wx\7k\2\2xy\7f\2\2y\f\3\2\2\2z{\7o\2\2{|\7c\2"+
		"\2|}\7k\2\2}~\7p\2\2~\16\3\2\2\2\177\u0080\7*\2\2\u0080\20\3\2\2\2\u0081"+
		"\u0082\7U\2\2\u0082\u0083\7v\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2"+
		"\u0085\u0086\7p\2\2\u0086\u0087\7i\2\2\u0087\22\3\2\2\2\u0088\u0089\7"+
		"]\2\2\u0089\24\3\2\2\2\u008a\u008b\7_\2\2\u008b\26\3\2\2\2\u008c\u008d"+
		"\7+\2\2\u008d\30\3\2\2\2\u008e\u008f\7\177\2\2\u008f\32\3\2\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7z\2\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2"+
		"\u0094\u0095\7p\2\2\u0095\u0096\7f\2\2\u0096\u0097\7u\2\2\u0097\34\3\2"+
		"\2\2\u0098\u0099\7=\2\2\u0099\36\3\2\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7v\2\2\u009d\u009e\7w\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7.\2\2\u00a2\"\3\2\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6$\3\2\2\2\u00a7"+
		"\u00a8\7d\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7n\2\2"+
		"\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae&\3\2\2"+
		"\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7"+
		"g\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2\2\u00b6*"+
		"\3\2\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7k\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc,\3\2\2\2\u00bd\u00be\7U\2\2\u00be"+
		"\u00bf\7{\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2\u00c3\7o\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\7r\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2\2"+
		"\u00cd\u00ce\7n\2\2\u00ce\u00cf\7p\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7?\2"+
		"\2\u00d1\60\3\2\2\2\u00d2\u00d3\7(\2\2\u00d3\u00d4\7(\2\2\u00d4\62\3\2"+
		"\2\2\u00d5\u00d6\7>\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7?\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9\66\3\2\2\2\u00da\u00db\7#\2\2\u00db\u00dc\7?\2\2\u00dc8"+
		"\3\2\2\2\u00dd\u00de\7-\2\2\u00de:\3\2\2\2\u00df\u00e0\7/\2\2\u00e0<\3"+
		"\2\2\2\u00e1\u00e2\7,\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4@\3"+
		"\2\2\2\u00e5\u00e6\7#\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7t\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7g\2\2\u00ebD\3\2\2\2\u00ec\u00ed"+
		"\7h\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7y\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7\60\2\2\u00f7J\3\2\2\2\u00f8"+
		"\u00f9\7n\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7i\2\2"+
		"\u00fc\u00fd\7v\2\2\u00fd\u00fe\7j\2\2\u00feL\3\2\2\2\u00ff\u0100\7v\2"+
		"\2\u0100\u0101\7j\2\2\u0101\u0102\7k\2\2\u0102\u0103\7u\2\2\u0103N\3\2"+
		"\2\2\u0104\u0108\5Q)\2\u0105\u0108\5U+\2\u0106\u0108\5S*\2\u0107\u0104"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\b(\2\2\u010aP\3\2\2\2\u010b\u010c\t\2\2\2\u010cR\3\2\2\2\u010d"+
		"\u010e\7\61\2\2\u010e\u010f\7,\2\2\u010f\u0113\3\2\2\2\u0110\u0112\13"+
		"\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7,"+
		"\2\2\u0117\u0118\7\61\2\2\u0118T\3\2\2\2\u0119\u011a\7\61\2\2\u011a\u011b"+
		"\7\61\2\2\u011b\u011f\3\2\2\2\u011c\u011e\13\2\2\2\u011d\u011c\3\2\2\2"+
		"\u011e\u0121\3\2\2\2\u011f\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\t\3\2\2\u0123V\3\2\2\2\u0124"+
		"\u0125\7d\2\2\u0125\u0126\7q\2\2\u0126\u0127\7q\2\2\u0127\u0128\7n\2\2"+
		"\u0128\u0129\7g\2\2\u0129\u012a\7c\2\2\u012a\u018e\7p\2\2\u012b\u012c"+
		"\7e\2\2\u012c\u012d\7n\2\2\u012d\u012e\7c\2\2\u012e\u012f\7u\2\2\u012f"+
		"\u018e\7u\2\2\u0130\u0131\7g\2\2\u0131\u0132\7z\2\2\u0132\u0133\7v\2\2"+
		"\u0133\u0134\7g\2\2\u0134\u0135\7p\2\2\u0135\u0136\7f\2\2\u0136\u018e"+
		"\7u\2\2\u0137\u0138\7r\2\2\u0138\u0139\7w\2\2\u0139\u013a\7d\2\2\u013a"+
		"\u013b\7n\2\2\u013b\u013c\7k\2\2\u013c\u018e\7e\2\2\u013d\u013e\7u\2\2"+
		"\u013e\u013f\7v\2\2\u013f\u0140\7c\2\2\u0140\u0141\7v\2\2\u0141\u0142"+
		"\7k\2\2\u0142\u018e\7e\2\2\u0143\u0144\7x\2\2\u0144\u0145\7q\2\2\u0145"+
		"\u0146\7k\2\2\u0146\u018e\7f\2\2\u0147\u0148\7o\2\2\u0148\u0149\7c\2\2"+
		"\u0149\u014a\7k\2\2\u014a\u018e\7p\2\2\u014b\u014c\7U\2\2\u014c\u014d"+
		"\7v\2\2\u014d\u014e\7t\2\2\u014e\u014f\7k\2\2\u014f\u0150\7p\2\2\u0150"+
		"\u018e\7i\2\2\u0151\u0152\7t\2\2\u0152\u0153\7g\2\2\u0153\u0154\7v\2\2"+
		"\u0154\u0155\7w\2\2\u0155\u0156\7t\2\2\u0156\u018e\7p\2\2\u0157\u0158"+
		"\7k\2\2\u0158\u0159\7p\2\2\u0159\u018e\7v\2\2\u015a\u015b\7k\2\2\u015b"+
		"\u018e\7h\2\2\u015c\u015d\7g\2\2\u015d\u015e\7n\2\2\u015e\u015f\7u\2\2"+
		"\u015f\u018e\7g\2\2\u0160\u0161\7y\2\2\u0161\u0162\7j\2\2\u0162\u0163"+
		"\7k\2\2\u0163\u0164\7n\2\2\u0164\u018e\7g\2\2\u0165\u0166\7U\2\2\u0166"+
		"\u0167\7{\2\2\u0167\u0168\7u\2\2\u0168\u0169\7v\2\2\u0169\u016a\7g\2\2"+
		"\u016a\u016b\7o\2\2\u016b\u016c\7\60\2\2\u016c\u016d\7q\2\2\u016d\u016e"+
		"\7w\2\2\u016e\u016f\7v\2\2\u016f\u0170\7\60\2\2\u0170\u0171\7r\2\2\u0171"+
		"\u0172\7t\2\2\u0172\u0173\7k\2\2\u0173\u0174\7p\2\2\u0174\u0175\7v\2\2"+
		"\u0175\u0176\7n\2\2\u0176\u018e\7p\2\2\u0177\u0178\7n\2\2\u0178\u0179"+
		"\7g\2\2\u0179\u017a\7p\2\2\u017a\u017b\7i\2\2\u017b\u017c\7v\2\2\u017c"+
		"\u018e\7j\2\2\u017d\u017e\7v\2\2\u017e\u017f\7t\2\2\u017f\u0180\7w\2\2"+
		"\u0180\u018e\7g\2\2\u0181\u0182\7h\2\2\u0182\u0183\7c\2\2\u0183\u0184"+
		"\7n\2\2\u0184\u0185\7u\2\2\u0185\u018e\7g\2\2\u0186\u0187\7v\2\2\u0187"+
		"\u0188\7j\2\2\u0188\u0189\7k\2\2\u0189\u018e\7u\2\2\u018a\u018b\7p\2\2"+
		"\u018b\u018c\7g\2\2\u018c\u018e\7y\2\2\u018d\u0124\3\2\2\2\u018d\u012b"+
		"\3\2\2\2\u018d\u0130\3\2\2\2\u018d\u0137\3\2\2\2\u018d\u013d\3\2\2\2\u018d"+
		"\u0143\3\2\2\2\u018d\u0147\3\2\2\2\u018d\u014b\3\2\2\2\u018d\u0151\3\2"+
		"\2\2\u018d\u0157\3\2\2\2\u018d\u015a\3\2\2\2\u018d\u015c\3\2\2\2\u018d"+
		"\u0160\3\2\2\2\u018d\u0165\3\2\2\2\u018d\u0177\3\2\2\2\u018d\u017d\3\2"+
		"\2\2\u018d\u0181\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u018a\3\2\2\2\u018e"+
		"X\3\2\2\2\u018f\u0191\t\4\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2"+
		"\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193Z\3\2\2\2\u0194\u019e\t"+
		"\5\2\2\u0195\u0196\7?\2\2\u0196\u019e\7?\2\2\u0197\u0198\7#\2\2\u0198"+
		"\u019e\7?\2\2\u0199\u019e\t\6\2\2\u019a\u019b\7(\2\2\u019b\u019e\7(\2"+
		"\2\u019c\u019e\7#\2\2\u019d\u0194\3\2\2\2\u019d\u0195\3\2\2\2\u019d\u0197"+
		"\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019a\3\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\\\3\2\2\2\u019f\u01a1\t\7\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a5\3\2\2\2"+
		"\u01a2\u01a4\t\b\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6^\3\2\2\2\u01a7\u01a5\3\2\2\2\f\2\u0107"+
		"\u0113\u011f\u018d\u0192\u019d\u01a0\u01a3\u01a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}