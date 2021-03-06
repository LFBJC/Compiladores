package br.ufpe.cin.if688.minijava.visitor;

// Generated from Minijava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinijavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MainClass=1, ClassDecl=2, VarDecl=3, Type=4, MethodDecl=5, Statement=6, 
		Exp=7, Exp_remainer=8, Identifier=9, IDENTIFIER=10, INTEGER_LITERAL=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"MainClass", "ClassDecl", "VarDecl", "Type", "MethodDecl", "Statement", 
		"Exp", "Exp_remainer", "Identifier", "IDENTIFIER", "INTEGER_LITERAL"
	};


	public MinijavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Minijava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r\u0168\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3["+
		"\n\3\3\3\3\3\7\3_\n\3\f\3\16\3b\13\3\3\3\7\3e\n\3\f\3\16\3h\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0081\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0093\n\6\f\6\16\6\u0096\13\6\5\6\u0098\n"+
		"\6\3\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0\13\6\3\6\7\6\u00a3\n\6\f\6"+
		"\16\6\u00a6\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7\u00b4"+
		"\n\7\f\7\16\7\u00b7\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00fe\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0139\n\b\3\t"+
		"\3\t\3\t\5\t\u013e\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0152\n\t\f\t\16\t\u0155\13\t\5\t\u0157\n"+
		"\t\3\t\3\t\3\t\5\t\u015c\n\t\3\n\3\n\3\13\3\13\3\13\3\f\7\f\u0164\n\f"+
		"\f\f\16\f\u0167\13\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\3\2\6\5\2,-//>>\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\u0188\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3"+
		"\2\2\2\5J\3\2\2\2\7k\3\2\2\2\t\u0080\3\2\2\2\13\u0082\3\2\2\2\r\u00fd"+
		"\3\2\2\2\17\u0138\3\2\2\2\21\u015b\3\2\2\2\23\u015d\3\2\2\2\25\u015f\3"+
		"\2\2\2\27\u0165\3\2\2\2\31\32\7e\2\2\32\33\7n\2\2\33\34\7c\2\2\34\35\7"+
		"u\2\2\35\36\7u\2\2\36\37\3\2\2\2\37 \5\23\n\2 !\7}\2\2!\"\7r\2\2\"#\7"+
		"w\2\2#$\7d\2\2$%\7n\2\2%&\7k\2\2&\'\7e\2\2\'(\3\2\2\2()\7u\2\2)*\7v\2"+
		"\2*+\7c\2\2+,\7v\2\2,-\7k\2\2-.\7e\2\2./\3\2\2\2/\60\7x\2\2\60\61\7q\2"+
		"\2\61\62\7k\2\2\62\63\7f\2\2\63\64\3\2\2\2\64\65\7o\2\2\65\66\7c\2\2\66"+
		"\67\7k\2\2\678\7p\2\289\3\2\2\29:\7*\2\2:;\7U\2\2;<\7v\2\2<=\7t\2\2=>"+
		"\7k\2\2>?\7p\2\2?@\7i\2\2@A\3\2\2\2AB\7]\2\2BC\7_\2\2CD\5\23\n\2DE\7+"+
		"\2\2EF\7}\2\2FG\5\r\7\2GH\7\177\2\2HI\7\177\2\2I\4\3\2\2\2JK\7e\2\2KL"+
		"\7n\2\2LM\7c\2\2MN\7u\2\2NO\7u\2\2OP\3\2\2\2PZ\5\23\n\2QR\7g\2\2RS\7z"+
		"\2\2ST\7v\2\2TU\7g\2\2UV\7p\2\2VW\7f\2\2WX\7u\2\2XY\3\2\2\2Y[\5\23\n\2"+
		"ZQ\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\`\7}\2\2]_\5\7\4\2^]\3\2\2\2_b\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2af\3\2\2\2b`\3\2\2\2ce\5\13\6\2dc\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\177\2\2j\6\3\2\2\2kl"+
		"\5\t\5\2lm\5\23\n\2mn\7=\2\2n\b\3\2\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2rs\3"+
		"\2\2\2st\7]\2\2t\u0081\7_\2\2uv\7d\2\2vw\7q\2\2wx\7q\2\2xy\7n\2\2yz\7"+
		"g\2\2z{\7c\2\2{\u0081\7p\2\2|}\7k\2\2}~\7p\2\2~\u0081\7v\2\2\177\u0081"+
		"\5\23\n\2\u0080o\3\2\2\2\u0080u\3\2\2\2\u0080|\3\2\2\2\u0080\177\3\2\2"+
		"\2\u0081\n\3\2\2\2\u0082\u0083\7r\2\2\u0083\u0084\7w\2\2\u0084\u0085\7"+
		"d\2\2\u0085\u0086\7n\2\2\u0086\u0087\7k\2\2\u0087\u0088\7e\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\5\t\5\2\u008a\u008b\5\23\n\2\u008b\u0097\7*\2\2\u008c"+
		"\u008d\5\t\5\2\u008d\u0094\5\23\n\2\u008e\u008f\7.\2\2\u008f\u0090\5\t"+
		"\5\2\u0090\u0091\5\23\n\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\7+\2\2\u009a\u009e\7}\2\2\u009b\u009d\5\7\4"+
		"\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a4\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\r\7\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7t\2\2"+
		"\u00ac\u00ad\7p\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\17\b\2\u00af\u00b0"+
		"\7\177\2\2\u00b0\f\3\2\2\2\u00b1\u00b5\7}\2\2\u00b2\u00b4\5\r\7\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00fe\7\177\2\2\u00b9"+
		"\u00ba\7y\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd\u00be\7g\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7*\2\2\u00c0\u00c1"+
		"\5\17\b\2\u00c1\u00c2\7+\2\2\u00c2\u00c3\7}\2\2\u00c3\u00c4\5\r\7\2\u00c4"+
		"\u00c5\7\177\2\2\u00c5\u00fe\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7"+
		"h\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cb\5\17\b\2\u00cb"+
		"\u00cc\7+\2\2\u00cc\u00cd\7}\2\2\u00cd\u00ce\5\r\7\2\u00ce\u00cf\7\177"+
		"\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7}\2\2\u00d5\u00d6\5\r\7\2\u00d6"+
		"\u00d7\7\177\2\2\u00d7\u00fe\3\2\2\2\u00d8\u00d9\7U\2\2\u00d9\u00da\7"+
		"{\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7o\2\2\u00de\u00df\7\60\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7w\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7t\2"+
		"\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7n\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7*\2\2\u00ec"+
		"\u00ed\5\17\b\2\u00ed\u00ee\7+\2\2\u00ee\u00ef\7=\2\2\u00ef\u00fe\3\2"+
		"\2\2\u00f0\u00f1\5\23\n\2\u00f1\u00f2\7?\2\2\u00f2\u00f3\5\17\b\2\u00f3"+
		"\u00f4\7=\2\2\u00f4\u00fe\3\2\2\2\u00f5\u00f6\5\23\n\2\u00f6\u00f7\7]"+
		"\2\2\u00f7\u00f8\5\17\b\2\u00f8\u00f9\7_\2\2\u00f9\u00fa\7?\2\2\u00fa"+
		"\u00fb\5\17\b\2\u00fb\u00fc\7=\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00b1\3\2"+
		"\2\2\u00fd\u00b9\3\2\2\2\u00fd\u00c6\3\2\2\2\u00fd\u00d8\3\2\2\2\u00fd"+
		"\u00f0\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fe\16\3\2\2\2\u00ff\u0139\3\2\2"+
		"\2\u0100\u0101\5\27\f\2\u0101\u0102\5\21\t\2\u0102\u0139\3\2\2\2\u0103"+
		"\u0104\7v\2\2\u0104\u0105\7t\2\2\u0105\u0106\7w\2\2\u0106\u0107\7g\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0139\5\21\t\2\u0109\u010a\7h\2\2\u010a\u010b"+
		"\7c\2\2\u010b\u010c\7n\2\2\u010c\u010d\7u\2\2\u010d\u010e\7g\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0139\5\21\t\2\u0110\u0111\5\23\n\2\u0111\u0112\5"+
		"\21\t\2\u0112\u0139\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115\7j\2\2\u0115"+
		"\u0116\7k\2\2\u0116\u0117\7u\2\2\u0117\u0118\3\2\2\2\u0118\u0139\5\21"+
		"\t\2\u0119\u011a\7p\2\2\u011a\u011b\7g\2\2\u011b\u011c\7y\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7v\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\7]\2\2\u0122\u0123\5\17\b\2\u0123\u0124\7_"+
		"\2\2\u0124\u0125\5\21\t\2\u0125\u0139\3\2\2\2\u0126\u0127\7p\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7y\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5\23"+
		"\n\2\u012b\u012c\7*\2\2\u012c\u012d\7+\2\2\u012d\u012e\5\21\t\2\u012e"+
		"\u0139\3\2\2\2\u012f\u0130\7#\2\2\u0130\u0131\5\17\b\2\u0131\u0132\5\21"+
		"\t\2\u0132\u0139\3\2\2\2\u0133\u0134\7*\2\2\u0134\u0135\5\17\b\2\u0135"+
		"\u0136\7+\2\2\u0136\u0137\5\21\t\2\u0137\u0139\3\2\2\2\u0138\u00ff\3\2"+
		"\2\2\u0138\u0100\3\2\2\2\u0138\u0103\3\2\2\2\u0138\u0109\3\2\2\2\u0138"+
		"\u0110\3\2\2\2\u0138\u0113\3\2\2\2\u0138\u0119\3\2\2\2\u0138\u0126\3\2"+
		"\2\2\u0138\u012f\3\2\2\2\u0138\u0133\3\2\2\2\u0139\20\3\2\2\2\u013a\u013b"+
		"\7(\2\2\u013b\u013e\7(\2\2\u013c\u013e\t\2\2\2\u013d\u013a\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u015c\5\17\b\2\u0140\u0141\7"+
		"]\2\2\u0141\u0142\5\17\b\2\u0142\u0143\7_\2\2\u0143\u015c\3\2\2\2\u0144"+
		"\u0145\7\60\2\2\u0145\u0146\7n\2\2\u0146\u0147\7g\2\2\u0147\u0148\7p\2"+
		"\2\u0148\u0149\7i\2\2\u0149\u014a\7v\2\2\u014a\u015c\7j\2\2\u014b\u014c"+
		"\7\60\2\2\u014c\u014d\5\23\n\2\u014d\u0156\7*\2\2\u014e\u0153\5\17\b\2"+
		"\u014f\u0150\7.\2\2\u0150\u0152\5\17\b\2\u0151\u014f\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\7+\2\2\u0159\u015c\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u013d\3\2\2\2\u015b\u0140\3\2\2\2\u015b\u0144\3\2\2\2\u015b\u014b\3\2"+
		"\2\2\u015b\u015a\3\2\2\2\u015c\22\3\2\2\2\u015d\u015e\5\25\13\2\u015e"+
		"\24\3\2\2\2\u015f\u0160\t\3\2\2\u0160\u0161\t\4\2\2\u0161\26\3\2\2\2\u0162"+
		"\u0164\t\5\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\30\3\2\2\2\u0167\u0165\3\2\2\2\23\2Z`f"+
		"\u0080\u0094\u0097\u009e\u00a4\u00b5\u00fd\u0138\u013d\u0153\u0156\u015b"+
		"\u0165\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}