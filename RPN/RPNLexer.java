// Generated from RPN.g4 by ANTLR 4.5

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RPNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INT=13, AND=14, OR=15, NOT=16, TRUE=17, FALSE=18, 
		WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "INT", "AND", "OR", "NOT", "TRUE", "FALSE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", null, "'&&'", "'||'", "'!'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT", "AND", "OR", "NOT", "TRUE", "FALSE", "WS"
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


	  int val = 0;
	  int a = 0;
	  int b = 0;
	  boolean left, right = false;
	  boolean result = false;
	  Stack<Integer> intStack = new Stack<Integer>();
	  Stack<Boolean> boolStack = new Stack<Boolean>();


	public RPNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RPN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\6\16G\n\16\r\16\16\16H\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24_\n\24\r\24"+
		"\16\24`\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\4\3\2\62;\5\2\13\f"+
		"\17\17\"\"e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2"+
		"\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\23"+
		":\3\2\2\2\25<\3\2\2\2\27?\3\2\2\2\31B\3\2\2\2\33F\3\2\2\2\35J\3\2\2\2"+
		"\37M\3\2\2\2!P\3\2\2\2#R\3\2\2\2%W\3\2\2\2\'^\3\2\2\2)*\7=\2\2*\4\3\2"+
		"\2\2+,\7-\2\2,\6\3\2\2\2-.\7/\2\2.\b\3\2\2\2/\60\7,\2\2\60\n\3\2\2\2\61"+
		"\62\7\61\2\2\62\f\3\2\2\2\63\64\7\'\2\2\64\16\3\2\2\2\65\66\7>\2\2\66"+
		"\20\3\2\2\2\678\7>\2\289\7?\2\29\22\3\2\2\2:;\7@\2\2;\24\3\2\2\2<=\7@"+
		"\2\2=>\7?\2\2>\26\3\2\2\2?@\7?\2\2@A\7?\2\2A\30\3\2\2\2BC\7#\2\2CD\7?"+
		"\2\2D\32\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\34"+
		"\3\2\2\2JK\7(\2\2KL\7(\2\2L\36\3\2\2\2MN\7~\2\2NO\7~\2\2O \3\2\2\2PQ\7"+
		"#\2\2Q\"\3\2\2\2RS\7v\2\2ST\7t\2\2TU\7w\2\2UV\7g\2\2V$\3\2\2\2WX\7h\2"+
		"\2XY\7c\2\2YZ\7n\2\2Z[\7u\2\2[\\\7g\2\2\\&\3\2\2\2]_\t\3\2\2^]\3\2\2\2"+
		"_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\24\2\2c(\3\2\2\2\5\2H`\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}