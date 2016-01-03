package SJ8Parse;

// Generated from Java8.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AT=3, MD=4, CD=5, ClassRef=6, FinalFieldRef=7, FinalVarRef=8, 
		CommonFieldRef=9, CommonVarRef=10, NoDeclaredType=11, CodeHole=12, ElseStatement=13, 
		ASSERT=14, BOOLEAN=15, BREAK=16, BYTE=17, CASE=18, CATCH=19, CHAR=20, 
		CLASS=21, CONTINUE=22, DEFAULT=23, DO=24, DOUBLE=25, ELSE=26, FINAL=27, 
		FINALLY=28, FLOAT=29, FOR=30, IF=31, GOTO=32, INSTANCEOF=33, INT=34, INTERFACE=35, 
		LONG=36, NEW=37, RETURN=38, SHORT=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRY=46, WHILE=47, NumberLiteral=48, BooleanLiteral=49, 
		CharacterLiteral=50, StringLiteral=51, NullLiteral=52, LPAREN=53, RPAREN=54, 
		LBRACE=55, RBRACE=56, LBRACK=57, RBRACK=58, COMMA=59, DOT=60, ASSIGN=61, 
		GT=62, LT=63, BANG=64, TILDE=65, QUESTION=66, COLON=67, EQUAL=68, LE=69, 
		GE=70, NOTEQUAL=71, AND=72, OR=73, INC=74, DEC=75, ADD=76, SUB=77, MUL=78, 
		DIV=79, BITAND=80, BITOR=81, CARET=82, MOD=83, ARROW=84, COLONCOLON=85, 
		ADD_ASSIGN=86, SUB_ASSIGN=87, MUL_ASSIGN=88, DIV_ASSIGN=89, AND_ASSIGN=90, 
		OR_ASSIGN=91, XOR_ASSIGN=92, MOD_ASSIGN=93, LSHIFT_ASSIGN=94, RSHIFT_ASSIGN=95, 
		URSHIFT_ASSIGN=96, Identifier=97, WS=98;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "AT", "MD", "CD", "ClassRef", "FinalFieldRef", "FinalVarRef", 
		"CommonFieldRef", "CommonVarRef", "NoDeclaredType", "CodeHole", "ElseStatement", 
		"ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FINALLY", "FLOAT", 
		"FOR", "IF", "GOTO", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NEW", 
		"RETURN", "SHORT", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRY", "WHILE", "NumberLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
		"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
		"ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'extends'", "'void'", "'@'", "'MD'", "'CD'", null, null, null, 
		null, null, null, null, null, "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'continue'", "'default'", "'do'", 
		"'double'", null, "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'instanceof'", "'int'", "'interface'", "'long'", "'new'", "'return'", 
		"'short'", "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", 
		"'throws'", "'try'", "'while'", null, null, null, null, null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", 
		"'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "AT", "MD", "CD", "ClassRef", "FinalFieldRef", "FinalVarRef", 
		"CommonFieldRef", "CommonVarRef", "NoDeclaredType", "CodeHole", "ElseStatement", 
		"ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FINALLY", "FLOAT", 
		"FOR", "IF", "GOTO", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NEW", 
		"RETURN", "SHORT", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRY", "WHILE", "NumberLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
		"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
		"ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "WS"
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


	public Java8Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 97:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 98:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2d\u02be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\6\7\u00e5"+
		"\n\7\r\7\16\7\u00e6\3\7\3\7\6\7\u00eb\n\7\r\7\16\7\u00ec\3\b\3\b\3\b\3"+
		"\b\6\b\u00f3\n\b\r\b\16\b\u00f4\3\b\3\b\6\b\u00f9\n\b\r\b\16\b\u00fa\3"+
		"\t\3\t\3\t\3\t\6\t\u0101\n\t\r\t\16\t\u0102\3\t\3\t\6\t\u0107\n\t\r\t"+
		"\16\t\u0108\3\n\3\n\3\n\3\n\6\n\u010f\n\n\r\n\16\n\u0110\3\n\3\n\6\n\u0115"+
		"\n\n\r\n\16\n\u0116\3\13\3\13\3\13\3\13\6\13\u011d\n\13\r\13\16\13\u011e"+
		"\3\13\3\13\6\13\u0123\n\13\r\13\16\13\u0124\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0217\n\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3"+
		"G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3N\3N\3O\3"+
		"O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3"+
		"Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3_\3_\3"+
		"`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\7b\u029b\nb\fb\16b\u029e\13b\3b\3b\3b"+
		"\3b\3b\3b\5b\u02a6\nb\3c\3c\3c\3c\3c\3c\5c\u02ae\nc\3d\3d\3d\3d\3d\3d"+
		"\5d\u02b6\nd\3e\6e\u02b9\ne\re\16e\u02ba\3e\3e\2\2f\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7"+
		"U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb"+
		"_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5\2\u00c7\2\u00c9d\3\2\t\3\2\62;\6\2"+
		"&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2"+
		"&&\62;C\\aac|\5\2\"\"%%))\u02d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c9\3\2\2\2\3\u00cb\3\2\2\2\5\u00d3"+
		"\3\2\2\2\7\u00d8\3\2\2\2\t\u00da\3\2\2\2\13\u00dd\3\2\2\2\r\u00e0\3\2"+
		"\2\2\17\u00ee\3\2\2\2\21\u00fc\3\2\2\2\23\u010a\3\2\2\2\25\u0118\3\2\2"+
		"\2\27\u0126\3\2\2\2\31\u012a\3\2\2\2\33\u012e\3\2\2\2\35\u0133\3\2\2\2"+
		"\37\u013a\3\2\2\2!\u0142\3\2\2\2#\u0148\3\2\2\2%\u014d\3\2\2\2\'\u0152"+
		"\3\2\2\2)\u0158\3\2\2\2+\u015d\3\2\2\2-\u0163\3\2\2\2/\u016c\3\2\2\2\61"+
		"\u0174\3\2\2\2\63\u0177\3\2\2\2\65\u017e\3\2\2\2\67\u0183\3\2\2\29\u0189"+
		"\3\2\2\2;\u0191\3\2\2\2=\u0197\3\2\2\2?\u019b\3\2\2\2A\u019e\3\2\2\2C"+
		"\u01a3\3\2\2\2E\u01ae\3\2\2\2G\u01b2\3\2\2\2I\u01bc\3\2\2\2K\u01c1\3\2"+
		"\2\2M\u01c5\3\2\2\2O\u01cc\3\2\2\2Q\u01d2\3\2\2\2S\u01d8\3\2\2\2U\u01df"+
		"\3\2\2\2W\u01ec\3\2\2\2Y\u01f1\3\2\2\2[\u01f7\3\2\2\2]\u01fe\3\2\2\2_"+
		"\u0202\3\2\2\2a\u0208\3\2\2\2c\u0216\3\2\2\2e\u0218\3\2\2\2g\u021d\3\2"+
		"\2\2i\u0222\3\2\2\2k\u0227\3\2\2\2m\u0229\3\2\2\2o\u022b\3\2\2\2q\u022d"+
		"\3\2\2\2s\u022f\3\2\2\2u\u0231\3\2\2\2w\u0233\3\2\2\2y\u0235\3\2\2\2{"+
		"\u0237\3\2\2\2}\u0239\3\2\2\2\177\u023b\3\2\2\2\u0081\u023d\3\2\2\2\u0083"+
		"\u023f\3\2\2\2\u0085\u0241\3\2\2\2\u0087\u0243\3\2\2\2\u0089\u0245\3\2"+
		"\2\2\u008b\u0248\3\2\2\2\u008d\u024b\3\2\2\2\u008f\u024e\3\2\2\2\u0091"+
		"\u0251\3\2\2\2\u0093\u0254\3\2\2\2\u0095\u0257\3\2\2\2\u0097\u025a\3\2"+
		"\2\2\u0099\u025d\3\2\2\2\u009b\u025f\3\2\2\2\u009d\u0261\3\2\2\2\u009f"+
		"\u0263\3\2\2\2\u00a1\u0265\3\2\2\2\u00a3\u0267\3\2\2\2\u00a5\u0269\3\2"+
		"\2\2\u00a7\u026b\3\2\2\2\u00a9\u026d\3\2\2\2\u00ab\u0270\3\2\2\2\u00ad"+
		"\u0273\3\2\2\2\u00af\u0276\3\2\2\2\u00b1\u0279\3\2\2\2\u00b3\u027c\3\2"+
		"\2\2\u00b5\u027f\3\2\2\2\u00b7\u0282\3\2\2\2\u00b9\u0285\3\2\2\2\u00bb"+
		"\u0288\3\2\2\2\u00bd\u028b\3\2\2\2\u00bf\u028f\3\2\2\2\u00c1\u0293\3\2"+
		"\2\2\u00c3\u02a5\3\2\2\2\u00c5\u02ad\3\2\2\2\u00c7\u02b5\3\2\2\2\u00c9"+
		"\u02b8\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7z\2\2\u00cd\u00ce\7v\2"+
		"\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2"+
		"\7u\2\2\u00d2\4\3\2\2\2\u00d3\u00d4\7x\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6"+
		"\7k\2\2\u00d6\u00d7\7f\2\2\u00d7\6\3\2\2\2\u00d8\u00d9\7B\2\2\u00d9\b"+
		"\3\2\2\2\u00da\u00db\7O\2\2\u00db\u00dc\7F\2\2\u00dc\n\3\2\2\2\u00dd\u00de"+
		"\7E\2\2\u00de\u00df\7F\2\2\u00df\f\3\2\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2"+
		"\7M\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\t\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\7A\2\2\u00e9\u00eb\t\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\16\3\2\2"+
		"\2\u00ee\u00ef\7&\2\2\u00ef\u00f0\7F\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3"+
		"\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\7A\2\2\u00f7\u00f9\t\2"+
		"\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\20\3\2\2\2\u00fc\u00fd\7&\2\2\u00fd\u00fe\7Z\2\2"+
		"\u00fe\u0100\3\2\2\2\u00ff\u0101\t\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\7A\2\2\u0105\u0107\t\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\22\3\2\2\2\u010a\u010b"+
		"\7&\2\2\u010b\u010c\7H\2\2\u010c\u010e\3\2\2\2\u010d\u010f\t\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0114\7A\2\2\u0113\u0115\t\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\24\3\2\2\2\u0118\u0119\7&\2\2\u0119\u011a\7E\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u011d\t\2\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\7A"+
		"\2\2\u0121\u0123\t\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\26\3\2\2\2\u0126\u0127\5\7\4"+
		"\2\u0127\u0128\7P\2\2\u0128\u0129\7V\2\2\u0129\30\3\2\2\2\u012a\u012b"+
		"\5\7\4\2\u012b\u012c\7J\2\2\u012c\u012d\7Q\2\2\u012d\32\3\2\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7n\2\2\u0130\u0131\7u\2\2\u0131\u0132\7g\2\2"+
		"\u0132\34\3\2\2\2\u0133\u0134\7c\2\2\u0134\u0135\7u\2\2\u0135\u0136\7"+
		"u\2\2\u0136\u0137\7g\2\2\u0137\u0138\7t\2\2\u0138\u0139\7v\2\2\u0139\36"+
		"\3\2\2\2\u013a\u013b\7d\2\2\u013b\u013c\7q\2\2\u013c\u013d\7q\2\2\u013d"+
		"\u013e\7n\2\2\u013e\u013f\7g\2\2\u013f\u0140\7c\2\2\u0140\u0141\7p\2\2"+
		"\u0141 \3\2\2\2\u0142\u0143\7d\2\2\u0143\u0144\7t\2\2\u0144\u0145\7g\2"+
		"\2\u0145\u0146\7c\2\2\u0146\u0147\7m\2\2\u0147\"\3\2\2\2\u0148\u0149\7"+
		"d\2\2\u0149\u014a\7{\2\2\u014a\u014b\7v\2\2\u014b\u014c\7g\2\2\u014c$"+
		"\3\2\2\2\u014d\u014e\7e\2\2\u014e\u014f\7c\2\2\u014f\u0150\7u\2\2\u0150"+
		"\u0151\7g\2\2\u0151&\3\2\2\2\u0152\u0153\7e\2\2\u0153\u0154\7c\2\2\u0154"+
		"\u0155\7v\2\2\u0155\u0156\7e\2\2\u0156\u0157\7j\2\2\u0157(\3\2\2\2\u0158"+
		"\u0159\7e\2\2\u0159\u015a\7j\2\2\u015a\u015b\7c\2\2\u015b\u015c\7t\2\2"+
		"\u015c*\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f\7n\2\2\u015f\u0160\7c\2"+
		"\2\u0160\u0161\7u\2\2\u0161\u0162\7u\2\2\u0162,\3\2\2\2\u0163\u0164\7"+
		"e\2\2\u0164\u0165\7q\2\2\u0165\u0166\7p\2\2\u0166\u0167\7v\2\2\u0167\u0168"+
		"\7k\2\2\u0168\u0169\7p\2\2\u0169\u016a\7w\2\2\u016a\u016b\7g\2\2\u016b"+
		".\3\2\2\2\u016c\u016d\7f\2\2\u016d\u016e\7g\2\2\u016e\u016f\7h\2\2\u016f"+
		"\u0170\7c\2\2\u0170\u0171\7w\2\2\u0171\u0172\7n\2\2\u0172\u0173\7v\2\2"+
		"\u0173\60\3\2\2\2\u0174\u0175\7f\2\2\u0175\u0176\7q\2\2\u0176\62\3\2\2"+
		"\2\u0177\u0178\7f\2\2\u0178\u0179\7q\2\2\u0179\u017a\7w\2\2\u017a\u017b"+
		"\7d\2\2\u017b\u017c\7n\2\2\u017c\u017d\7g\2\2\u017d\64\3\2\2\2\u017e\u017f"+
		"\7g\2\2\u017f\u0180\7n\2\2\u0180\u0181\7u\2\2\u0181\u0182\7g\2\2\u0182"+
		"\66\3\2\2\2\u0183\u0184\7h\2\2\u0184\u0185\7k\2\2\u0185\u0186\7p\2\2\u0186"+
		"\u0187\7c\2\2\u0187\u0188\7n\2\2\u01888\3\2\2\2\u0189\u018a\7h\2\2\u018a"+
		"\u018b\7k\2\2\u018b\u018c\7p\2\2\u018c\u018d\7c\2\2\u018d\u018e\7n\2\2"+
		"\u018e\u018f\7n\2\2\u018f\u0190\7{\2\2\u0190:\3\2\2\2\u0191\u0192\7h\2"+
		"\2\u0192\u0193\7n\2\2\u0193\u0194\7q\2\2\u0194\u0195\7c\2\2\u0195\u0196"+
		"\7v\2\2\u0196<\3\2\2\2\u0197\u0198\7h\2\2\u0198\u0199\7q\2\2\u0199\u019a"+
		"\7t\2\2\u019a>\3\2\2\2\u019b\u019c\7k\2\2\u019c\u019d\7h\2\2\u019d@\3"+
		"\2\2\2\u019e\u019f\7i\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7v\2\2\u01a1"+
		"\u01a2\7q\2\2\u01a2B\3\2\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5\7p\2\2\u01a5"+
		"\u01a6\7u\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9\7p\2\2"+
		"\u01a9\u01aa\7e\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad"+
		"\7h\2\2\u01adD\3\2\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1"+
		"\7v\2\2\u01b1F\3\2\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5"+
		"\7v\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7t\2\2\u01b7\u01b8\7h\2\2\u01b8"+
		"\u01b9\7c\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7g\2\2\u01bbH\3\2\2\2\u01bc"+
		"\u01bd\7n\2\2\u01bd\u01be\7q\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7i\2\2"+
		"\u01c0J\3\2\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7y\2"+
		"\2\u01c4L\3\2\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8\7"+
		"v\2\2\u01c8\u01c9\7w\2\2\u01c9\u01ca\7t\2\2\u01ca\u01cb\7p\2\2\u01cbN"+
		"\3\2\2\2\u01cc\u01cd\7u\2\2\u01cd\u01ce\7j\2\2\u01ce\u01cf\7q\2\2\u01cf"+
		"\u01d0\7t\2\2\u01d0\u01d1\7v\2\2\u01d1P\3\2\2\2\u01d2\u01d3\7u\2\2\u01d3"+
		"\u01d4\7w\2\2\u01d4\u01d5\7r\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7t\2\2"+
		"\u01d7R\3\2\2\2\u01d8\u01d9\7u\2\2\u01d9\u01da\7y\2\2\u01da\u01db\7k\2"+
		"\2\u01db\u01dc\7v\2\2\u01dc\u01dd\7e\2\2\u01dd\u01de\7j\2\2\u01deT\3\2"+
		"\2\2\u01df\u01e0\7u\2\2\u01e0\u01e1\7{\2\2\u01e1\u01e2\7p\2\2\u01e2\u01e3"+
		"\7e\2\2\u01e3\u01e4\7j\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7q\2\2\u01e6"+
		"\u01e7\7p\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7|\2\2\u01e9\u01ea\7g\2\2"+
		"\u01ea\u01eb\7f\2\2\u01ebV\3\2\2\2\u01ec\u01ed\7v\2\2\u01ed\u01ee\7j\2"+
		"\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7u\2\2\u01f0X\3\2\2\2\u01f1\u01f2\7"+
		"v\2\2\u01f2\u01f3\7j\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7q\2\2\u01f5\u01f6"+
		"\7y\2\2\u01f6Z\3\2\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7j\2\2\u01f9\u01fa"+
		"\7t\2\2\u01fa\u01fb\7q\2\2\u01fb\u01fc\7y\2\2\u01fc\u01fd\7u\2\2\u01fd"+
		"\\\3\2\2\2\u01fe\u01ff\7v\2\2\u01ff\u0200\7t\2\2\u0200\u0201\7{\2\2\u0201"+
		"^\3\2\2\2\u0202\u0203\7y\2\2\u0203\u0204\7j\2\2\u0204\u0205\7k\2\2\u0205"+
		"\u0206\7n\2\2\u0206\u0207\7g\2\2\u0207`\3\2\2\2\u0208\u0209\5\7\4\2\u0209"+
		"\u020a\7P\2\2\u020a\u020b\7W\2\2\u020b\u020c\7D\2\2\u020cb\3\2\2\2\u020d"+
		"\u020e\7v\2\2\u020e\u020f\7t\2\2\u020f\u0210\7w\2\2\u0210\u0217\7g\2\2"+
		"\u0211\u0212\7h\2\2\u0212\u0213\7c\2\2\u0213\u0214\7n\2\2\u0214\u0215"+
		"\7u\2\2\u0215\u0217\7g\2\2\u0216\u020d\3\2\2\2\u0216\u0211\3\2\2\2\u0217"+
		"d\3\2\2\2\u0218\u0219\5\7\4\2\u0219\u021a\7E\2\2\u021a\u021b\7J\2\2\u021b"+
		"\u021c\7T\2\2\u021cf\3\2\2\2\u021d\u021e\5\7\4\2\u021e\u021f\7U\2\2\u021f"+
		"\u0220\7V\2\2\u0220\u0221\7T\2\2\u0221h\3\2\2\2\u0222\u0223\5\7\4\2\u0223"+
		"\u0224\7P\2\2\u0224\u0225\7W\2\2\u0225\u0226\7N\2\2\u0226j\3\2\2\2\u0227"+
		"\u0228\7*\2\2\u0228l\3\2\2\2\u0229\u022a\7+\2\2\u022an\3\2\2\2\u022b\u022c"+
		"\7}\2\2\u022cp\3\2\2\2\u022d\u022e\7\177\2\2\u022er\3\2\2\2\u022f\u0230"+
		"\7]\2\2\u0230t\3\2\2\2\u0231\u0232\7_\2\2\u0232v\3\2\2\2\u0233\u0234\7"+
		".\2\2\u0234x\3\2\2\2\u0235\u0236\7\60\2\2\u0236z\3\2\2\2\u0237\u0238\7"+
		"?\2\2\u0238|\3\2\2\2\u0239\u023a\7@\2\2\u023a~\3\2\2\2\u023b\u023c\7>"+
		"\2\2\u023c\u0080\3\2\2\2\u023d\u023e\7#\2\2\u023e\u0082\3\2\2\2\u023f"+
		"\u0240\7\u0080\2\2\u0240\u0084\3\2\2\2\u0241\u0242\7A\2\2\u0242\u0086"+
		"\3\2\2\2\u0243\u0244\7<\2\2\u0244\u0088\3\2\2\2\u0245\u0246\7?\2\2\u0246"+
		"\u0247\7?\2\2\u0247\u008a\3\2\2\2\u0248\u0249\7>\2\2\u0249\u024a\7?\2"+
		"\2\u024a\u008c\3\2\2\2\u024b\u024c\7@\2\2\u024c\u024d\7?\2\2\u024d\u008e"+
		"\3\2\2\2\u024e\u024f\7#\2\2\u024f\u0250\7?\2\2\u0250\u0090\3\2\2\2\u0251"+
		"\u0252\7(\2\2\u0252\u0253\7(\2\2\u0253\u0092\3\2\2\2\u0254\u0255\7~\2"+
		"\2\u0255\u0256\7~\2\2\u0256\u0094\3\2\2\2\u0257\u0258\7-\2\2\u0258\u0259"+
		"\7-\2\2\u0259\u0096\3\2\2\2\u025a\u025b\7/\2\2\u025b\u025c\7/\2\2\u025c"+
		"\u0098\3\2\2\2\u025d\u025e\7-\2\2\u025e\u009a\3\2\2\2\u025f\u0260\7/\2"+
		"\2\u0260\u009c\3\2\2\2\u0261\u0262\7,\2\2\u0262\u009e\3\2\2\2\u0263\u0264"+
		"\7\61\2\2\u0264\u00a0\3\2\2\2\u0265\u0266\7(\2\2\u0266\u00a2\3\2\2\2\u0267"+
		"\u0268\7~\2\2\u0268\u00a4\3\2\2\2\u0269\u026a\7`\2\2\u026a\u00a6\3\2\2"+
		"\2\u026b\u026c\7\'\2\2\u026c\u00a8\3\2\2\2\u026d\u026e\7/\2\2\u026e\u026f"+
		"\7@\2\2\u026f\u00aa\3\2\2\2\u0270\u0271\7<\2\2\u0271\u0272\7<\2\2\u0272"+
		"\u00ac\3\2\2\2\u0273\u0274\7-\2\2\u0274\u0275\7?\2\2\u0275\u00ae\3\2\2"+
		"\2\u0276\u0277\7/\2\2\u0277\u0278\7?\2\2\u0278\u00b0\3\2\2\2\u0279\u027a"+
		"\7,\2\2\u027a\u027b\7?\2\2\u027b\u00b2\3\2\2\2\u027c\u027d\7\61\2\2\u027d"+
		"\u027e\7?\2\2\u027e\u00b4\3\2\2\2\u027f\u0280\7(\2\2\u0280\u0281\7?\2"+
		"\2\u0281\u00b6\3\2\2\2\u0282\u0283\7~\2\2\u0283\u0284\7?\2\2\u0284\u00b8"+
		"\3\2\2\2\u0285\u0286\7`\2\2\u0286\u0287\7?\2\2\u0287\u00ba\3\2\2\2\u0288"+
		"\u0289\7\'\2\2\u0289\u028a\7?\2\2\u028a\u00bc\3\2\2\2\u028b\u028c\7>\2"+
		"\2\u028c\u028d\7>\2\2\u028d\u028e\7?\2\2\u028e\u00be\3\2\2\2\u028f\u0290"+
		"\7@\2\2\u0290\u0291\7@\2\2\u0291\u0292\7?\2\2\u0292\u00c0\3\2\2\2\u0293"+
		"\u0294\7@\2\2\u0294\u0295\7@\2\2\u0295\u0296\7@\2\2\u0296\u0297\7?\2\2"+
		"\u0297\u00c2\3\2\2\2\u0298\u029c\5\u00c5c\2\u0299\u029b\5\u00c7d\2\u029a"+
		"\u0299\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u02a6\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a6\5\27\f\2\u02a0"+
		"\u02a6\5\r\7\2\u02a1\u02a6\5\17\b\2\u02a2\u02a6\5\21\t\2\u02a3\u02a6\5"+
		"\23\n\2\u02a4\u02a6\5\25\13\2\u02a5\u0298\3\2\2\2\u02a5\u029f\3\2\2\2"+
		"\u02a5\u02a0\3\2\2\2\u02a5\u02a1\3\2\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a3"+
		"\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6\u00c4\3\2\2\2\u02a7\u02ae\t\3\2\2\u02a8"+
		"\u02a9\n\4\2\2\u02a9\u02ae\6c\2\2\u02aa\u02ab\t\5\2\2\u02ab\u02ac\t\6"+
		"\2\2\u02ac\u02ae\6c\3\2\u02ad\u02a7\3\2\2\2\u02ad\u02a8\3\2\2\2\u02ad"+
		"\u02aa\3\2\2\2\u02ae\u00c6\3\2\2\2\u02af\u02b6\t\7\2\2\u02b0\u02b1\n\4"+
		"\2\2\u02b1\u02b6\6d\4\2\u02b2\u02b3\t\5\2\2\u02b3\u02b4\t\6\2\2\u02b4"+
		"\u02b6\6d\5\2\u02b5\u02af\3\2\2\2\u02b5\u02b0\3\2\2\2\u02b5\u02b2\3\2"+
		"\2\2\u02b6\u00c8\3\2\2\2\u02b7\u02b9\t\b\2\2\u02b8\u02b7\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bc\u02bd\be\2\2\u02bd\u00ca\3\2\2\2\23\2\u00e6\u00ec\u00f4\u00fa"+
		"\u0102\u0108\u0110\u0116\u011e\u0124\u0216\u029c\u02a5\u02ad\u02b5\u02ba"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}