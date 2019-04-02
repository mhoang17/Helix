// Generated from /Users/Maria/Documents/GitHub/Helix/CFG.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CFGLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP=1, ASSIGN=2, BEGIN=3, END=4, SEMI=5, COMMA=6, ETYPE=7, CTYPE=8, PTYPE=9, 
		MEASURE=10, LPAREN=11, RPAREN=12, PLAY=13, SEND=14, REC=15, NUM=16, INT=17, 
		ID=18, NOTE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OP", "ASSIGN", "BEGIN", "END", "SEMI", "COMMA", "ETYPE", "CTYPE", "PTYPE", 
			"MEASURE", "LPAREN", "RPAREN", "PLAY", "SEND", "REC", "NUM", "INT", "ID", 
			"NOTE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'{'", "'}'", "';'", "','", "'num'", "'chord'", null, 
			null, "'('", "')'", "'play'", "'send'", "'receive'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP", "ASSIGN", "BEGIN", "END", "SEMI", "COMMA", "ETYPE", "CTYPE", 
			"PTYPE", "MEASURE", "LPAREN", "RPAREN", "PLAY", "SEND", "REC", "NUM", 
			"INT", "ID", "NOTE", "WS"
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


	public CFGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CFG.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21n\n\21\r\21\16\21o\3"+
		"\21\3\21\6\21t\n\21\r\21\16\21u\5\21x\n\21\3\22\3\22\3\23\6\23}\n\23\r"+
		"\23\16\23~\3\24\3\24\3\24\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\7\4\2,-//\3\2\62;\3\2c|\4\2CIci\5\2\13\f\17\17\"\"\2\u008b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2"+
		"\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21;\3\2\2\2\23"+
		"P\3\2\2\2\25R\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35_\3\2\2\2"+
		"\37d\3\2\2\2!m\3\2\2\2#y\3\2\2\2%|\3\2\2\2\'\u0080\3\2\2\2)\u0083\3\2"+
		"\2\2+,\t\2\2\2,\4\3\2\2\2-.\7?\2\2.\6\3\2\2\2/\60\7}\2\2\60\b\3\2\2\2"+
		"\61\62\7\177\2\2\62\n\3\2\2\2\63\64\7=\2\2\64\f\3\2\2\2\65\66\7.\2\2\66"+
		"\16\3\2\2\2\678\7p\2\289\7w\2\29:\7o\2\2:\20\3\2\2\2;<\7e\2\2<=\7j\2\2"+
		"=>\7q\2\2>?\7t\2\2?@\7f\2\2@\22\3\2\2\2AB\7K\2\2BC\7p\2\2CD\7u\2\2DE\7"+
		"v\2\2EF\7t\2\2FG\7w\2\2GH\7o\2\2HI\7g\2\2IJ\7p\2\2JQ\7v\2\2KL\7G\2\2L"+
		"M\7x\2\2MN\7g\2\2NO\7p\2\2OQ\7v\2\2PA\3\2\2\2PK\3\2\2\2Q\24\3\2\2\2RS"+
		"\5#\22\2ST\7\61\2\2TU\5#\22\2U\26\3\2\2\2VW\7*\2\2W\30\3\2\2\2XY\7+\2"+
		"\2Y\32\3\2\2\2Z[\7r\2\2[\\\7n\2\2\\]\7c\2\2]^\7{\2\2^\34\3\2\2\2_`\7u"+
		"\2\2`a\7g\2\2ab\7p\2\2bc\7f\2\2c\36\3\2\2\2de\7t\2\2ef\7g\2\2fg\7e\2\2"+
		"gh\7g\2\2hi\7k\2\2ij\7x\2\2jk\7g\2\2k \3\2\2\2ln\t\3\2\2ml\3\2\2\2no\3"+
		"\2\2\2om\3\2\2\2op\3\2\2\2pw\3\2\2\2qs\7\60\2\2rt\t\3\2\2sr\3\2\2\2tu"+
		"\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wq\3\2\2\2wx\3\2\2\2x\"\3\2\2\2"+
		"yz\t\3\2\2z$\3\2\2\2{}\t\4\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177&\3\2\2\2\u0080\u0081\t\5\2\2\u0081\u0082\t\3\2\2\u0082(\3\2\2"+
		"\2\u0083\u0084\t\6\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\25\2\2\u0086"+
		"*\3\2\2\2\b\2Pouw~\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}