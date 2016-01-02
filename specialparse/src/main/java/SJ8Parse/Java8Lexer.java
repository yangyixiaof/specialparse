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
		LBRACE=55, RBRACE=56, LBRACK=57, RBRACK=58, SEMI=59, COMMA=60, DOT=61, 
		ASSIGN=62, GT=63, LT=64, BANG=65, TILDE=66, QUESTION=67, COLON=68, EQUAL=69, 
		LE=70, GE=71, NOTEQUAL=72, AND=73, OR=74, INC=75, DEC=76, ADD=77, SUB=78, 
		MUL=79, DIV=80, BITAND=81, BITOR=82, CARET=83, MOD=84, ARROW=85, COLONCOLON=86, 
		ADD_ASSIGN=87, SUB_ASSIGN=88, MUL_ASSIGN=89, DIV_ASSIGN=90, AND_ASSIGN=91, 
		OR_ASSIGN=92, XOR_ASSIGN=93, MOD_ASSIGN=94, LSHIFT_ASSIGN=95, RSHIFT_ASSIGN=96, 
		URSHIFT_ASSIGN=97, Identifier=98, WS=99;
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
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
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
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='"
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
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
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
		case 98:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 99:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2e\u02c2\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\6\7\u00e7\n\7\r\7\16\7\u00e8\3\7\3\7\6\7\u00ed\n\7\r\7\16\7\u00ee\3\b"+
		"\3\b\3\b\3\b\6\b\u00f5\n\b\r\b\16\b\u00f6\3\b\3\b\6\b\u00fb\n\b\r\b\16"+
		"\b\u00fc\3\t\3\t\3\t\3\t\6\t\u0103\n\t\r\t\16\t\u0104\3\t\3\t\6\t\u0109"+
		"\n\t\r\t\16\t\u010a\3\n\3\n\3\n\3\n\6\n\u0111\n\n\r\n\16\n\u0112\3\n\3"+
		"\n\6\n\u0117\n\n\r\n\16\n\u0118\3\13\3\13\3\13\3\13\6\13\u011f\n\13\r"+
		"\13\16\13\u0120\3\13\3\13\6\13\u0125\n\13\r\13\16\13\u0126\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0219\n\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3"+
		"E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3"+
		"M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3V\3W\3W\3"+
		"W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3"+
		"_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\3b\3b\3c\3c\7c\u029f\nc\fc\16"+
		"c\u02a2\13c\3c\3c\3c\3c\3c\3c\5c\u02aa\nc\3d\3d\3d\3d\3d\3d\5d\u02b2\n"+
		"d\3e\3e\3e\3e\3e\3e\5e\u02ba\ne\3f\6f\u02bd\nf\rf\16f\u02be\3f\3f\2\2"+
		"g\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5"+
		"\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7\2\u00c9"+
		"\2\u00cbe\3\2\t\3\2\62;\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\"\"%%))\u02d6\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00cb\3\2\2\2\3\u00cd\3\2\2\2\5\u00d5\3\2\2\2\7\u00da\3\2\2"+
		"\2\t\u00dc\3\2\2\2\13\u00df\3\2\2\2\r\u00e2\3\2\2\2\17\u00f0\3\2\2\2\21"+
		"\u00fe\3\2\2\2\23\u010c\3\2\2\2\25\u011a\3\2\2\2\27\u0128\3\2\2\2\31\u012c"+
		"\3\2\2\2\33\u0130\3\2\2\2\35\u0135\3\2\2\2\37\u013c\3\2\2\2!\u0144\3\2"+
		"\2\2#\u014a\3\2\2\2%\u014f\3\2\2\2\'\u0154\3\2\2\2)\u015a\3\2\2\2+\u015f"+
		"\3\2\2\2-\u0165\3\2\2\2/\u016e\3\2\2\2\61\u0176\3\2\2\2\63\u0179\3\2\2"+
		"\2\65\u0180\3\2\2\2\67\u0185\3\2\2\29\u018b\3\2\2\2;\u0193\3\2\2\2=\u0199"+
		"\3\2\2\2?\u019d\3\2\2\2A\u01a0\3\2\2\2C\u01a5\3\2\2\2E\u01b0\3\2\2\2G"+
		"\u01b4\3\2\2\2I\u01be\3\2\2\2K\u01c3\3\2\2\2M\u01c7\3\2\2\2O\u01ce\3\2"+
		"\2\2Q\u01d4\3\2\2\2S\u01da\3\2\2\2U\u01e1\3\2\2\2W\u01ee\3\2\2\2Y\u01f3"+
		"\3\2\2\2[\u01f9\3\2\2\2]\u0200\3\2\2\2_\u0204\3\2\2\2a\u020a\3\2\2\2c"+
		"\u0218\3\2\2\2e\u021a\3\2\2\2g\u021f\3\2\2\2i\u0224\3\2\2\2k\u0229\3\2"+
		"\2\2m\u022b\3\2\2\2o\u022d\3\2\2\2q\u022f\3\2\2\2s\u0231\3\2\2\2u\u0233"+
		"\3\2\2\2w\u0235\3\2\2\2y\u0237\3\2\2\2{\u0239\3\2\2\2}\u023b\3\2\2\2\177"+
		"\u023d\3\2\2\2\u0081\u023f\3\2\2\2\u0083\u0241\3\2\2\2\u0085\u0243\3\2"+
		"\2\2\u0087\u0245\3\2\2\2\u0089\u0247\3\2\2\2\u008b\u0249\3\2\2\2\u008d"+
		"\u024c\3\2\2\2\u008f\u024f\3\2\2\2\u0091\u0252\3\2\2\2\u0093\u0255\3\2"+
		"\2\2\u0095\u0258\3\2\2\2\u0097\u025b\3\2\2\2\u0099\u025e\3\2\2\2\u009b"+
		"\u0261\3\2\2\2\u009d\u0263\3\2\2\2\u009f\u0265\3\2\2\2\u00a1\u0267\3\2"+
		"\2\2\u00a3\u0269\3\2\2\2\u00a5\u026b\3\2\2\2\u00a7\u026d\3\2\2\2\u00a9"+
		"\u026f\3\2\2\2\u00ab\u0271\3\2\2\2\u00ad\u0274\3\2\2\2\u00af\u0277\3\2"+
		"\2\2\u00b1\u027a\3\2\2\2\u00b3\u027d\3\2\2\2\u00b5\u0280\3\2\2\2\u00b7"+
		"\u0283\3\2\2\2\u00b9\u0286\3\2\2\2\u00bb\u0289\3\2\2\2\u00bd\u028c\3\2"+
		"\2\2\u00bf\u028f\3\2\2\2\u00c1\u0293\3\2\2\2\u00c3\u0297\3\2\2\2\u00c5"+
		"\u02a9\3\2\2\2\u00c7\u02b1\3\2\2\2\u00c9\u02b9\3\2\2\2\u00cb\u02bc\3\2"+
		"\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7z\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7u\2\2\u00d4"+
		"\4\3\2\2\2\u00d5\u00d6\7x\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7f\2\2\u00d9\6\3\2\2\2\u00da\u00db\7B\2\2\u00db\b\3\2\2\2\u00dc"+
		"\u00dd\7O\2\2\u00dd\u00de\7F\2\2\u00de\n\3\2\2\2\u00df\u00e0\7E\2\2\u00e0"+
		"\u00e1\7F\2\2\u00e1\f\3\2\2\2\u00e2\u00e3\7&\2\2\u00e3\u00e4\7M\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e7\t\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\7A\2\2\u00eb\u00ed\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\16\3\2\2\2\u00f0\u00f1"+
		"\7&\2\2\u00f1\u00f2\7F\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\t\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\7A\2\2\u00f9\u00fb\t\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\20\3\2\2\2\u00fe\u00ff\7&\2\2\u00ff\u0100\7Z\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u0103\t\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\7A"+
		"\2\2\u0107\u0109\t\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\22\3\2\2\2\u010c\u010d\7&\2\2"+
		"\u010d\u010e\7H\2\2\u010e\u0110\3\2\2\2\u010f\u0111\t\2\2\2\u0110\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0116\7A\2\2\u0115\u0117\t\2\2\2\u0116\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\24\3\2\2\2\u011a\u011b\7&\2\2\u011b\u011c\7E\2\2\u011c\u011e\3\2\2\2"+
		"\u011d\u011f\t\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\7A\2\2\u0123"+
		"\u0125\t\2\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\26\3\2\2\2\u0128\u0129\5\7\4\2\u0129\u012a"+
		"\7P\2\2\u012a\u012b\7V\2\2\u012b\30\3\2\2\2\u012c\u012d\5\7\4\2\u012d"+
		"\u012e\7J\2\2\u012e\u012f\7Q\2\2\u012f\32\3\2\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7n\2\2\u0132\u0133\7u\2\2\u0133\u0134\7g\2\2\u0134\34\3\2\2\2\u0135"+
		"\u0136\7c\2\2\u0136\u0137\7u\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2"+
		"\u0139\u013a\7t\2\2\u013a\u013b\7v\2\2\u013b\36\3\2\2\2\u013c\u013d\7"+
		"d\2\2\u013d\u013e\7q\2\2\u013e\u013f\7q\2\2\u013f\u0140\7n\2\2\u0140\u0141"+
		"\7g\2\2\u0141\u0142\7c\2\2\u0142\u0143\7p\2\2\u0143 \3\2\2\2\u0144\u0145"+
		"\7d\2\2\u0145\u0146\7t\2\2\u0146\u0147\7g\2\2\u0147\u0148\7c\2\2\u0148"+
		"\u0149\7m\2\2\u0149\"\3\2\2\2\u014a\u014b\7d\2\2\u014b\u014c\7{\2\2\u014c"+
		"\u014d\7v\2\2\u014d\u014e\7g\2\2\u014e$\3\2\2\2\u014f\u0150\7e\2\2\u0150"+
		"\u0151\7c\2\2\u0151\u0152\7u\2\2\u0152\u0153\7g\2\2\u0153&\3\2\2\2\u0154"+
		"\u0155\7e\2\2\u0155\u0156\7c\2\2\u0156\u0157\7v\2\2\u0157\u0158\7e\2\2"+
		"\u0158\u0159\7j\2\2\u0159(\3\2\2\2\u015a\u015b\7e\2\2\u015b\u015c\7j\2"+
		"\2\u015c\u015d\7c\2\2\u015d\u015e\7t\2\2\u015e*\3\2\2\2\u015f\u0160\7"+
		"e\2\2\u0160\u0161\7n\2\2\u0161\u0162\7c\2\2\u0162\u0163\7u\2\2\u0163\u0164"+
		"\7u\2\2\u0164,\3\2\2\2\u0165\u0166\7e\2\2\u0166\u0167\7q\2\2\u0167\u0168"+
		"\7p\2\2\u0168\u0169\7v\2\2\u0169\u016a\7k\2\2\u016a\u016b\7p\2\2\u016b"+
		"\u016c\7w\2\2\u016c\u016d\7g\2\2\u016d.\3\2\2\2\u016e\u016f\7f\2\2\u016f"+
		"\u0170\7g\2\2\u0170\u0171\7h\2\2\u0171\u0172\7c\2\2\u0172\u0173\7w\2\2"+
		"\u0173\u0174\7n\2\2\u0174\u0175\7v\2\2\u0175\60\3\2\2\2\u0176\u0177\7"+
		"f\2\2\u0177\u0178\7q\2\2\u0178\62\3\2\2\2\u0179\u017a\7f\2\2\u017a\u017b"+
		"\7q\2\2\u017b\u017c\7w\2\2\u017c\u017d\7d\2\2\u017d\u017e\7n\2\2\u017e"+
		"\u017f\7g\2\2\u017f\64\3\2\2\2\u0180\u0181\7g\2\2\u0181\u0182\7n\2\2\u0182"+
		"\u0183\7u\2\2\u0183\u0184\7g\2\2\u0184\66\3\2\2\2\u0185\u0186\7h\2\2\u0186"+
		"\u0187\7k\2\2\u0187\u0188\7p\2\2\u0188\u0189\7c\2\2\u0189\u018a\7n\2\2"+
		"\u018a8\3\2\2\2\u018b\u018c\7h\2\2\u018c\u018d\7k\2\2\u018d\u018e\7p\2"+
		"\2\u018e\u018f\7c\2\2\u018f\u0190\7n\2\2\u0190\u0191\7n\2\2\u0191\u0192"+
		"\7{\2\2\u0192:\3\2\2\2\u0193\u0194\7h\2\2\u0194\u0195\7n\2\2\u0195\u0196"+
		"\7q\2\2\u0196\u0197\7c\2\2\u0197\u0198\7v\2\2\u0198<\3\2\2\2\u0199\u019a"+
		"\7h\2\2\u019a\u019b\7q\2\2\u019b\u019c\7t\2\2\u019c>\3\2\2\2\u019d\u019e"+
		"\7k\2\2\u019e\u019f\7h\2\2\u019f@\3\2\2\2\u01a0\u01a1\7i\2\2\u01a1\u01a2"+
		"\7q\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7q\2\2\u01a4B\3\2\2\2\u01a5\u01a6"+
		"\7k\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7u\2\2\u01a8\u01a9\7v\2\2\u01a9"+
		"\u01aa\7c\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7e\2\2\u01ac\u01ad\7g\2\2"+
		"\u01ad\u01ae\7q\2\2\u01ae\u01af\7h\2\2\u01afD\3\2\2\2\u01b0\u01b1\7k\2"+
		"\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7v\2\2\u01b3F\3\2\2\2\u01b4\u01b5\7"+
		"k\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9"+
		"\7t\2\2\u01b9\u01ba\7h\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7e\2\2\u01bc"+
		"\u01bd\7g\2\2\u01bdH\3\2\2\2\u01be\u01bf\7n\2\2\u01bf\u01c0\7q\2\2\u01c0"+
		"\u01c1\7p\2\2\u01c1\u01c2\7i\2\2\u01c2J\3\2\2\2\u01c3\u01c4\7p\2\2\u01c4"+
		"\u01c5\7g\2\2\u01c5\u01c6\7y\2\2\u01c6L\3\2\2\2\u01c7\u01c8\7t\2\2\u01c8"+
		"\u01c9\7g\2\2\u01c9\u01ca\7v\2\2\u01ca\u01cb\7w\2\2\u01cb\u01cc\7t\2\2"+
		"\u01cc\u01cd\7p\2\2\u01cdN\3\2\2\2\u01ce\u01cf\7u\2\2\u01cf\u01d0\7j\2"+
		"\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7v\2\2\u01d3P\3\2"+
		"\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7w\2\2\u01d6\u01d7\7r\2\2\u01d7\u01d8"+
		"\7g\2\2\u01d8\u01d9\7t\2\2\u01d9R\3\2\2\2\u01da\u01db\7u\2\2\u01db\u01dc"+
		"\7y\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7v\2\2\u01de\u01df\7e\2\2\u01df"+
		"\u01e0\7j\2\2\u01e0T\3\2\2\2\u01e1\u01e2\7u\2\2\u01e2\u01e3\7{\2\2\u01e3"+
		"\u01e4\7p\2\2\u01e4\u01e5\7e\2\2\u01e5\u01e6\7j\2\2\u01e6\u01e7\7t\2\2"+
		"\u01e7\u01e8\7q\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb"+
		"\7|\2\2\u01eb\u01ec\7g\2\2\u01ec\u01ed\7f\2\2\u01edV\3\2\2\2\u01ee\u01ef"+
		"\7v\2\2\u01ef\u01f0\7j\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2\7u\2\2\u01f2"+
		"X\3\2\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7j\2\2\u01f5\u01f6\7t\2\2\u01f6"+
		"\u01f7\7q\2\2\u01f7\u01f8\7y\2\2\u01f8Z\3\2\2\2\u01f9\u01fa\7v\2\2\u01fa"+
		"\u01fb\7j\2\2\u01fb\u01fc\7t\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe\7y\2\2"+
		"\u01fe\u01ff\7u\2\2\u01ff\\\3\2\2\2\u0200\u0201\7v\2\2\u0201\u0202\7t"+
		"\2\2\u0202\u0203\7{\2\2\u0203^\3\2\2\2\u0204\u0205\7y\2\2\u0205\u0206"+
		"\7j\2\2\u0206\u0207\7k\2\2\u0207\u0208\7n\2\2\u0208\u0209\7g\2\2\u0209"+
		"`\3\2\2\2\u020a\u020b\5\7\4\2\u020b\u020c\7P\2\2\u020c\u020d\7W\2\2\u020d"+
		"\u020e\7D\2\2\u020eb\3\2\2\2\u020f\u0210\7v\2\2\u0210\u0211\7t\2\2\u0211"+
		"\u0212\7w\2\2\u0212\u0219\7g\2\2\u0213\u0214\7h\2\2\u0214\u0215\7c\2\2"+
		"\u0215\u0216\7n\2\2\u0216\u0217\7u\2\2\u0217\u0219\7g\2\2\u0218\u020f"+
		"\3\2\2\2\u0218\u0213\3\2\2\2\u0219d\3\2\2\2\u021a\u021b\5\7\4\2\u021b"+
		"\u021c\7E\2\2\u021c\u021d\7J\2\2\u021d\u021e\7T\2\2\u021ef\3\2\2\2\u021f"+
		"\u0220\5\7\4\2\u0220\u0221\7U\2\2\u0221\u0222\7V\2\2\u0222\u0223\7T\2"+
		"\2\u0223h\3\2\2\2\u0224\u0225\5\7\4\2\u0225\u0226\7P\2\2\u0226\u0227\7"+
		"W\2\2\u0227\u0228\7N\2\2\u0228j\3\2\2\2\u0229\u022a\7*\2\2\u022al\3\2"+
		"\2\2\u022b\u022c\7+\2\2\u022cn\3\2\2\2\u022d\u022e\7}\2\2\u022ep\3\2\2"+
		"\2\u022f\u0230\7\177\2\2\u0230r\3\2\2\2\u0231\u0232\7]\2\2\u0232t\3\2"+
		"\2\2\u0233\u0234\7_\2\2\u0234v\3\2\2\2\u0235\u0236\7=\2\2\u0236x\3\2\2"+
		"\2\u0237\u0238\7.\2\2\u0238z\3\2\2\2\u0239\u023a\7\60\2\2\u023a|\3\2\2"+
		"\2\u023b\u023c\7?\2\2\u023c~\3\2\2\2\u023d\u023e\7@\2\2\u023e\u0080\3"+
		"\2\2\2\u023f\u0240\7>\2\2\u0240\u0082\3\2\2\2\u0241\u0242\7#\2\2\u0242"+
		"\u0084\3\2\2\2\u0243\u0244\7\u0080\2\2\u0244\u0086\3\2\2\2\u0245\u0246"+
		"\7A\2\2\u0246\u0088\3\2\2\2\u0247\u0248\7<\2\2\u0248\u008a\3\2\2\2\u0249"+
		"\u024a\7?\2\2\u024a\u024b\7?\2\2\u024b\u008c\3\2\2\2\u024c\u024d\7>\2"+
		"\2\u024d\u024e\7?\2\2\u024e\u008e\3\2\2\2\u024f\u0250\7@\2\2\u0250\u0251"+
		"\7?\2\2\u0251\u0090\3\2\2\2\u0252\u0253\7#\2\2\u0253\u0254\7?\2\2\u0254"+
		"\u0092\3\2\2\2\u0255\u0256\7(\2\2\u0256\u0257\7(\2\2\u0257\u0094\3\2\2"+
		"\2\u0258\u0259\7~\2\2\u0259\u025a\7~\2\2\u025a\u0096\3\2\2\2\u025b\u025c"+
		"\7-\2\2\u025c\u025d\7-\2\2\u025d\u0098\3\2\2\2\u025e\u025f\7/\2\2\u025f"+
		"\u0260\7/\2\2\u0260\u009a\3\2\2\2\u0261\u0262\7-\2\2\u0262\u009c\3\2\2"+
		"\2\u0263\u0264\7/\2\2\u0264\u009e\3\2\2\2\u0265\u0266\7,\2\2\u0266\u00a0"+
		"\3\2\2\2\u0267\u0268\7\61\2\2\u0268\u00a2\3\2\2\2\u0269\u026a\7(\2\2\u026a"+
		"\u00a4\3\2\2\2\u026b\u026c\7~\2\2\u026c\u00a6\3\2\2\2\u026d\u026e\7`\2"+
		"\2\u026e\u00a8\3\2\2\2\u026f\u0270\7\'\2\2\u0270\u00aa\3\2\2\2\u0271\u0272"+
		"\7/\2\2\u0272\u0273\7@\2\2\u0273\u00ac\3\2\2\2\u0274\u0275\7<\2\2\u0275"+
		"\u0276\7<\2\2\u0276\u00ae\3\2\2\2\u0277\u0278\7-\2\2\u0278\u0279\7?\2"+
		"\2\u0279\u00b0\3\2\2\2\u027a\u027b\7/\2\2\u027b\u027c\7?\2\2\u027c\u00b2"+
		"\3\2\2\2\u027d\u027e\7,\2\2\u027e\u027f\7?\2\2\u027f\u00b4\3\2\2\2\u0280"+
		"\u0281\7\61\2\2\u0281\u0282\7?\2\2\u0282\u00b6\3\2\2\2\u0283\u0284\7("+
		"\2\2\u0284\u0285\7?\2\2\u0285\u00b8\3\2\2\2\u0286\u0287\7~\2\2\u0287\u0288"+
		"\7?\2\2\u0288\u00ba\3\2\2\2\u0289\u028a\7`\2\2\u028a\u028b\7?\2\2\u028b"+
		"\u00bc\3\2\2\2\u028c\u028d\7\'\2\2\u028d\u028e\7?\2\2\u028e\u00be\3\2"+
		"\2\2\u028f\u0290\7>\2\2\u0290\u0291\7>\2\2\u0291\u0292\7?\2\2\u0292\u00c0"+
		"\3\2\2\2\u0293\u0294\7@\2\2\u0294\u0295\7@\2\2\u0295\u0296\7?\2\2\u0296"+
		"\u00c2\3\2\2\2\u0297\u0298\7@\2\2\u0298\u0299\7@\2\2\u0299\u029a\7@\2"+
		"\2\u029a\u029b\7?\2\2\u029b\u00c4\3\2\2\2\u029c\u02a0\5\u00c7d\2\u029d"+
		"\u029f\5\u00c9e\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e"+
		"\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02aa\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3"+
		"\u02aa\5\27\f\2\u02a4\u02aa\5\r\7\2\u02a5\u02aa\5\17\b\2\u02a6\u02aa\5"+
		"\21\t\2\u02a7\u02aa\5\23\n\2\u02a8\u02aa\5\25\13\2\u02a9\u029c\3\2\2\2"+
		"\u02a9\u02a3\3\2\2\2\u02a9\u02a4\3\2\2\2\u02a9\u02a5\3\2\2\2\u02a9\u02a6"+
		"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u00c6\3\2\2\2\u02ab"+
		"\u02b2\t\3\2\2\u02ac\u02ad\n\4\2\2\u02ad\u02b2\6d\2\2\u02ae\u02af\t\5"+
		"\2\2\u02af\u02b0\t\6\2\2\u02b0\u02b2\6d\3\2\u02b1\u02ab\3\2\2\2\u02b1"+
		"\u02ac\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b2\u00c8\3\2\2\2\u02b3\u02ba\t\7"+
		"\2\2\u02b4\u02b5\n\4\2\2\u02b5\u02ba\6e\4\2\u02b6\u02b7\t\5\2\2\u02b7"+
		"\u02b8\t\6\2\2\u02b8\u02ba\6e\5\2\u02b9\u02b3\3\2\2\2\u02b9\u02b4\3\2"+
		"\2\2\u02b9\u02b6\3\2\2\2\u02ba\u00ca\3\2\2\2\u02bb\u02bd\t\b\2\2\u02bc"+
		"\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2"+
		"\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\bf\2\2\u02c1\u00cc\3\2\2\2\23\2\u00e8"+
		"\u00ee\u00f6\u00fc\u0104\u010a\u0112\u0118\u0120\u0126\u0218\u02a0\u02a9"+
		"\u02b1\u02b9\u02be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}