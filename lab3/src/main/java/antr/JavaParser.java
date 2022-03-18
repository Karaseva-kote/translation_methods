// Generated from D:/study/5sem/MT/lab3/src/main/java\Java.g4 by ANTLR 4.9.2
package antr;

	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DO=3, PACKAGE=4, IMPORT=5, PUBLIC=6, PRIVATE=7, PROTECTED=8, 
		STATIC=9, CLASS=10, INTERFACE=11, EXTENDS=12, IMPLEMENTS=13, THROWS=14, 
		VOID=15, INT=16, STRING=17, BOOL=18, LONG=19, DOUBLE=20, FLOAT=21, CHAR=22, 
		NULL=23, IF=24, ELSE=25, FOR=26, WHILE=27, RETURN=28, INTEGER_NUM=29, 
		DOUBLE_NUM=30, BOOLEAN_VALUE=31, CHAR_VALUE=32, STRING_VALUE=33, WORD=34, 
		WS=35, TAB=36, R=37, NEWLINE=38, COMMA=39, DOT=40, OP_BRACKET=41, CL_BRACKET=42, 
		OP_BRACE=43, CL_BRACE=44, INIT=45, QUOTE=46, DOUBLE_QOUTE=47, SEMICOLON=48, 
		PLUS=49, MINUS=50, DIV=51, MUL=52, MOD=53, OR=54, AND=55, LESS=56, GREATER=57, 
		EQ=58;
	public static final int
		RULE_start = 0, RULE_parsePackage = 1, RULE_packageName = 2, RULE_parseImport = 3, 
		RULE_importName = 4, RULE_code = 5, RULE_parseClass = 6, RULE_classPiece = 7, 
		RULE_classMethod = 8, RULE_classMethodReturnOrFeild = 9, RULE_statement = 10, 
		RULE_parseIf = 11, RULE_parseFor = 12, RULE_parseWhile = 13, RULE_parseDoWhile = 14, 
		RULE_extend = 15, RULE_implement = 16, RULE_parseInterface = 17, RULE_interfacePiece = 18, 
		RULE_modifier = 19, RULE_type = 20, RULE_interfaceMethod = 21, RULE_arg = 22, 
		RULE_interfaceMethodOrFeild = 23, RULE_varInit = 24, RULE_data = 25, RULE_expr = 26, 
		RULE_condition = 27, RULE_word = 28, RULE_space = 29, RULE_tab = 30, RULE_newline = 31, 
		RULE_ws = 32, RULE_comma = 33, RULE_dot = 34, RULE_op_bracket = 35, RULE_cl_bracket = 36, 
		RULE_op_brace = 37, RULE_cl_brace = 38, RULE_init = 39, RULE_semicolon = 40, 
		RULE_plus = 41, RULE_minus = 42, RULE_div = 43, RULE_mul = 44, RULE_mod = 45, 
		RULE_or = 46, RULE_and = 47, RULE_less = 48, RULE_greater = 49, RULE_eq = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "parsePackage", "packageName", "parseImport", "importName", 
			"code", "parseClass", "classPiece", "classMethod", "classMethodReturnOrFeild", 
			"statement", "parseIf", "parseFor", "parseWhile", "parseDoWhile", "extend", 
			"implement", "parseInterface", "interfacePiece", "modifier", "type", 
			"interfaceMethod", "arg", "interfaceMethodOrFeild", "varInit", "data", 
			"expr", "condition", "word", "space", "tab", "newline", "ws", "comma", 
			"dot", "op_bracket", "cl_bracket", "op_brace", "cl_brace", "init", "semicolon", 
			"plus", "minus", "div", "mul", "mod", "or", "and", "less", "greater", 
			"eq"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'L'", "'F'", "'do'", "'package'", "'import'", "'public'", "'private'", 
			"'protected'", "'static'", "'class'", "'interface'", "'extends'", "'implements'", 
			"'throws'", "'void'", "'int'", "'String'", "'boolean'", "'long'", "'double'", 
			"'float'", "'char'", "'null'", "'if'", "'else'", "'for'", "'while'", 
			"'return'", null, null, null, null, null, null, "' '", "'\t'", "'\r'", 
			"'\n'", "','", "'.'", "'('", "')'", "'{'", "'}'", "'='", "'''", "'\"'", 
			"';'", "'+'", "'-'", "'/'", "'*'", "'%'", "'||'", "'&&'", "'<'", "'>'", 
			"'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DO", "PACKAGE", "IMPORT", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "THROWS", "VOID", 
			"INT", "STRING", "BOOL", "LONG", "DOUBLE", "FLOAT", "CHAR", "NULL", "IF", 
			"ELSE", "FOR", "WHILE", "RETURN", "INTEGER_NUM", "DOUBLE_NUM", "BOOLEAN_VALUE", 
			"CHAR_VALUE", "STRING_VALUE", "WORD", "WS", "TAB", "R", "NEWLINE", "COMMA", 
			"DOT", "OP_BRACKET", "CL_BRACKET", "OP_BRACE", "CL_BRACE", "INIT", "QUOTE", 
			"DOUBLE_QOUTE", "SEMICOLON", "PLUS", "MINUS", "DIV", "MUL", "MOD", "OR", 
			"AND", "LESS", "GREATER", "EQ"
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
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public StringBuilder html = new StringBuilder("<html>\n\t<head>\n\t\t<title>Code</title>\n" +
	    "\t\t<style>\n\t\t\tbody {\n\t\t\t\tfont: normal normal 18px courier;\n\t\t\t}\n" +
	    "\t\t\t.highlight  {\n\t\t\t\tcolor: darkorange;\n\t\t\t}\n" +
	    "\t\t\t.number {\n\t\t\t\tcolor: darkseagreen;\n\t\t\t}\n" +
	    "\t\t\t.string {\n\t\t\t\tcolor: olivedrab;\n\t\t\t}\n" +
	    "\t\t\t.types {\n\t\t\t\tcolor: darkgoldenrod;\n\t\t\t}\n\t\t</style>\n\t</head>\n" +
	    "\t<body text=\"#ffe4c4\" bgcolor=\"#282923\">\n\t\t");
	    private void highlight (String s) {
	        html.append("<span class=\"highlight\">").append(s).append("</span>");
	    }
	    private void number (String s) {
	        html.append("<span class=\"number\">").append(s).append("</span>");
	    }
	    private void string (String s) {
	        html.append("<span class=\"string\">").append(s).append("</span>");
	    }
	    private void types (String s) {
	        html.append("<span class=\"types\">").append(s).append("</span>");
	    }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ParsePackageContext parsePackage() {
			return getRuleContext(ParsePackageContext.class,0);
		}
		public List<ParseImportContext> parseImport() {
			return getRuleContexts(ParseImportContext.class);
		}
		public ParseImportContext parseImport(int i) {
			return getRuleContext(ParseImportContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(102);
				ws();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(105);
				parsePackage();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(108);
				parseImport();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			code();
			setState(115);
			match(EOF);

			        html.append("<br>\n\t</body>\n</html>");
			    
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

	public static class ParsePackageContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public ParsePackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parsePackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParsePackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParsePackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParsePackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParsePackageContext parsePackage() throws RecognitionException {
		ParsePackageContext _localctx = new ParsePackageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parsePackage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(118);
			match(PACKAGE);
			highlight("package");
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(121);
				ws();
				}
			}

			setState(124);
			packageName();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(125);
				ws();
				}
			}

			setState(128);
			semicolon();
			setState(129);
			ws();
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

	public static class PackageNameContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<DotContext> dot() {
			return getRuleContexts(DotContext.class);
		}
		public DotContext dot(int i) {
			return getRuleContext(DotContext.class,i);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			word();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					dot();
					setState(133);
					word();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ParseImportContext extends ParserRuleContext {
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public ParseImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParseImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParseImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParseImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseImportContext parseImport() throws RecognitionException {
		ParseImportContext _localctx = new ParseImportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parseImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			match(IMPORT);
			highlight("import");
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(143);
				ws();
				}
			}

			setState(146);
			importName();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(147);
				ws();
				}
			}

			setState(150);
			semicolon();
			setState(151);
			ws();
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

	public static class ImportNameContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			packageName();
			setState(154);
			dot();
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(155);
				mul();
				}
				break;
			case WORD:
				{
				setState(156);
				word();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CodeContext extends ParserRuleContext {
		public ParseClassContext parseClass() {
			return getRuleContext(ParseClassContext.class,0);
		}
		public ParseInterfaceContext parseInterface() {
			return getRuleContext(ParseInterfaceContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				{
				setState(159);
				match(PUBLIC);
				highlight("public");
				}
				setState(162);
				ws();
				}
			}

			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(165);
				parseClass();
				}
				break;
			case INTERFACE:
				{
				setState(166);
				parseInterface();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParseClassContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Op_braceContext op_brace() {
			return getRuleContext(Op_braceContext.class,0);
		}
		public Cl_braceContext cl_brace() {
			return getRuleContext(Cl_braceContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExtendContext extend() {
			return getRuleContext(ExtendContext.class,0);
		}
		public ImplementContext implement() {
			return getRuleContext(ImplementContext.class,0);
		}
		public List<ClassPieceContext> classPiece() {
			return getRuleContexts(ClassPieceContext.class);
		}
		public ClassPieceContext classPiece(int i) {
			return getRuleContext(ClassPieceContext.class,i);
		}
		public ParseClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParseClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParseClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParseClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseClassContext parseClass() throws RecognitionException {
		ParseClassContext _localctx = new ParseClassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parseClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			match(CLASS);
			highlight("class");
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(172);
				ws();
				}
			}

			setState(175);
			word();
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(176);
					ws();
					}
				}

				setState(179);
				extend();
				}
				break;
			}
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(182);
					ws();
					}
				}

				setState(185);
				implement();
				}
				break;
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(188);
				ws();
				}
			}

			setState(191);
			op_brace();
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(192);
				ws();
				}
				break;
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << CLASS) | (1L << INTERFACE) | (1L << VOID) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
				{
				{
				setState(195);
				classPiece();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(201);
				ws();
				}
			}

			setState(204);
			cl_brace();
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(205);
				ws();
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

	public static class ClassPieceContext extends ParserRuleContext {
		public ParseClassContext parseClass() {
			return getRuleContext(ParseClassContext.class,0);
		}
		public ParseInterfaceContext parseInterface() {
			return getRuleContext(ParseInterfaceContext.class,0);
		}
		public ClassMethodContext classMethod() {
			return getRuleContext(ClassMethodContext.class,0);
		}
		public Cl_braceContext cl_brace() {
			return getRuleContext(Cl_braceContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassMethodReturnOrFeildContext classMethodReturnOrFeild() {
			return getRuleContext(ClassMethodReturnOrFeildContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public ClassPieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPiece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassPiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPieceContext classPiece() throws RecognitionException {
		ClassPieceContext _localctx = new ClassPieceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classPiece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(208);
				modifier();
				setState(209);
				ws();
				}
			}

			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				{
				setState(213);
				match(STATIC);
				highlight("static");
				}
				setState(216);
				ws();
				}
			}

			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(219);
				parseClass();
				}
				break;
			case INTERFACE:
				{
				setState(220);
				parseInterface();
				}
				break;
			case VOID:
				{
				{
				setState(221);
				match(VOID);
				types("void");
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(224);
					ws();
					}
				}

				setState(227);
				classMethod();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(228);
					ws();
					}
				}

				setState(231);
				cl_brace();
				}
				break;
			case INT:
			case STRING:
			case BOOL:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case CHAR:
				{
				setState(233);
				type();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(234);
					ws();
					}
				}

				setState(237);
				classMethodReturnOrFeild();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(241);
				ws();
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

	public static class ClassMethodContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Op_bracketContext op_bracket() {
			return getRuleContext(Op_bracketContext.class,0);
		}
		public Cl_bracketContext cl_bracket() {
			return getRuleContext(Cl_bracketContext.class,0);
		}
		public Op_braceContext op_brace() {
			return getRuleContext(Op_braceContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public ClassMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodContext classMethod() throws RecognitionException {
		ClassMethodContext _localctx = new ClassMethodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classMethod);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			word();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(245);
				ws();
				}
			}

			setState(248);
			op_bracket();
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(249);
				ws();
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
				{
				setState(252);
				arg();
				}
			}

			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(255);
				ws();
				}
			}

			setState(258);
			cl_bracket();
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(259);
					ws();
					}
				}

				{
				setState(262);
				match(THROWS);
				highlight("throws");
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(265);
					ws();
					}
				}

				setState(268);
				word();
				}
				break;
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(271);
				ws();
				}
			}

			setState(274);
			op_brace();
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(275);
				ws();
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					statement();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(284);
				ws();
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

	public static class ClassMethodReturnOrFeildContext extends ParserRuleContext {
		public ClassMethodContext classMethod() {
			return getRuleContext(ClassMethodContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public Cl_braceContext cl_brace() {
			return getRuleContext(Cl_braceContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public VarInitContext varInit() {
			return getRuleContext(VarInitContext.class,0);
		}
		public ClassMethodReturnOrFeildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodReturnOrFeild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassMethodReturnOrFeild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassMethodReturnOrFeild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassMethodReturnOrFeild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodReturnOrFeildContext classMethodReturnOrFeild() throws RecognitionException {
		ClassMethodReturnOrFeildContext _localctx = new ClassMethodReturnOrFeildContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classMethodReturnOrFeild);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				classMethod();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(288);
					ws();
					}
				}

				{
				setState(291);
				match(RETURN);
				highlight("return");
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(294);
					ws();
					}
				}

				setState(297);
				data();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(298);
					ws();
					}
				}

				setState(301);
				semicolon();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(302);
					ws();
					}
				}

				setState(305);
				cl_brace();
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(306);
					ws();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				varInit();
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

	public static class StatementContext extends ParserRuleContext {
		public ParseIfContext parseIf() {
			return getRuleContext(ParseIfContext.class,0);
		}
		public ParseWhileContext parseWhile() {
			return getRuleContext(ParseWhileContext.class,0);
		}
		public ParseForContext parseFor() {
			return getRuleContext(ParseForContext.class,0);
		}
		public ParseDoWhileContext parseDoWhile() {
			return getRuleContext(ParseDoWhileContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public VarInitContext varInit() {
			return getRuleContext(VarInitContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(312);
				ws();
				}
			}

			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case BOOL:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case WORD:
				{
				{
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
					{
					setState(315);
					type();
					setState(316);
					ws();
					}
				}

				setState(320);
				varInit();
				}
				}
				break;
			case IF:
				{
				setState(321);
				parseIf();
				}
				break;
			case WHILE:
				{
				setState(322);
				parseWhile();
				}
				break;
			case FOR:
				{
				setState(323);
				parseFor();
				}
				break;
			case DO:
				{
				setState(324);
				parseDoWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(327);
				ws();
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

	public static class ParseIfContext extends ParserRuleContext {
		public Op_bracketContext op_bracket() {
			return getRuleContext(Op_bracketContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Cl_bracketContext cl_bracket() {
			return getRuleContext(Cl_bracketContext.class,0);
		}
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Op_braceContext> op_brace() {
			return getRuleContexts(Op_braceContext.class);
		}
		public Op_braceContext op_brace(int i) {
			return getRuleContext(Op_braceContext.class,i);
		}
		public List<Cl_braceContext> cl_brace() {
			return getRuleContexts(Cl_braceContext.class);
		}
		public Cl_braceContext cl_brace(int i) {
			return getRuleContext(Cl_braceContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public ParseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseIfContext parseIf() throws RecognitionException {
		ParseIfContext _localctx = new ParseIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parseIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(330);
			match(IF);
			highlight("if");
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(333);
				ws();
				}
			}

			setState(336);
			op_bracket();
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(337);
				ws();
				}
				break;
			}
			setState(340);
			condition();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(341);
				ws();
				}
			}

			setState(344);
			cl_bracket();
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(345);
				ws();
				}
				break;
			}
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(348);
					ws();
					}
					break;
				}
				setState(351);
				statement();
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(352);
					ws();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(355);
					ws();
					}
				}

				setState(358);
				op_brace();
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(359);
					ws();
					}
					break;
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362);
						statement();
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(368);
					ws();
					}
				}

				setState(371);
				cl_brace();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(372);
					ws();
					}
					break;
				}
				}
				break;
			}
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(377);
				ws();
				}
				break;
			}
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				{
				setState(380);
				match(ELSE);
				highlight("else");
				}
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(383);
					ws();
					}
					break;
				}
				setState(395);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DO:
				case INT:
				case STRING:
				case BOOL:
				case LONG:
				case DOUBLE:
				case FLOAT:
				case CHAR:
				case IF:
				case FOR:
				case WHILE:
				case WORD:
				case WS:
				case TAB:
				case NEWLINE:
					{
					setState(386);
					statement();
					}
					break;
				case OP_BRACE:
					{
					setState(387);
					op_brace();
					setState(389); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(388);
						statement();
						}
						}
						setState(391); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WORD) | (1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0) );
					setState(393);
					cl_brace();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ParseForContext extends ParserRuleContext {
		public Op_bracketContext op_bracket() {
			return getRuleContext(Op_bracketContext.class,0);
		}
		public List<SemicolonContext> semicolon() {
			return getRuleContexts(SemicolonContext.class);
		}
		public SemicolonContext semicolon(int i) {
			return getRuleContext(SemicolonContext.class,i);
		}
		public Cl_bracketContext cl_bracket() {
			return getRuleContext(Cl_bracketContext.class,0);
		}
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Op_braceContext op_brace() {
			return getRuleContext(Op_braceContext.class,0);
		}
		public Cl_braceContext cl_brace() {
			return getRuleContext(Cl_braceContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public ParseForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParseFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParseFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParseFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseForContext parseFor() throws RecognitionException {
		ParseForContext _localctx = new ParseForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parseFor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(399);
			match(FOR);
			highlight("for");
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(402);
				ws();
				}
			}

			setState(405);
			op_bracket();
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(406);
				ws();
				}
				break;
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
				{
				setState(409);
				type();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(410);
					ws();
					}
				}

				setState(413);
				word();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(414);
					ws();
					}
				}

				setState(417);
				init();
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(418);
					ws();
					}
					break;
				}
				setState(421);
				expr();
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
							{
							setState(422);
							ws();
							}
						}

						setState(425);
						comma();
						setState(427);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
							{
							setState(426);
							ws();
							}
						}

						setState(429);
						type();
						setState(431);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
							{
							setState(430);
							ws();
							}
						}

						setState(433);
						word();
						setState(435);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
							{
							setState(434);
							ws();
							}
						}

						setState(437);
						init();
						setState(439);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(438);
							ws();
							}
							break;
						}
						setState(441);
						expr();
						setState(443);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(442);
							ws();
							}
							break;
						}
						}
						} 
					}
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
			}

			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(452);
				ws();
				}
			}

			setState(455);
			semicolon();
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(456);
				ws();
				}
				break;
			}
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(459);
				condition();
				setState(461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(460);
					ws();
					}
					break;
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(464);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
							{
							setState(463);
							ws();
							}
						}

						setState(466);
						comma();
						setState(468);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(467);
							ws();
							}
							break;
						}
						setState(470);
						condition();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
				break;
			}
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(479);
				ws();
				}
			}

			setState(482);
			semicolon();
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(483);
				ws();
				}
				break;
			}
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(486);
				word();
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(487);
					ws();
					}
				}

				setState(490);
				init();
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(491);
					ws();
					}
					break;
				}
				setState(494);
				expr();
				}
			}

			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(498);
				ws();
				}
			}

			setState(501);
			cl_bracket();
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(502);
				ws();
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
			case INT:
			case STRING:
			case BOOL:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case IF:
			case FOR:
			case WHILE:
			case WORD:
			case WS:
			case TAB:
			case NEWLINE:
				{
				setState(505);
				statement();
				}
				break;
			case OP_BRACE:
				{
				setState(506);
				op_brace();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WORD) | (1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(507);
					statement();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(513);
				cl_brace();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParseWhileContext extends ParserRuleContext {
		public Op_bracketContext op_bracket() {
			return getRuleContext(Op_bracketContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Cl_bracketContext cl_bracket() {
			return getRuleContext(Cl_bracketContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Op_braceContext op_brace() {
			return getRuleContext(Op_braceContext.class,0);
		}
		public Cl_braceContext cl_brace() {
			return getRuleContext(Cl_braceContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ParseWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParseWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParseWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParseWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseWhileContext parseWhile() throws RecognitionException {
		ParseWhileContext _localctx = new ParseWhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parseWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(517);
			match(WHILE);
			highlight("while");
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(520);
				ws();
				}
			}

			setState(523);
			op_bracket();
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(524);
				ws();
				}
				break;
			}
			setState(527);
			condition();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(528);
				ws();
				}
			}

			setState(531);
			cl_bracket();
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(532);
				ws();
				}
				break;
			}
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
			case INT:
			case STRING:
			case BOOL:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case IF:
			case FOR:
			case WHILE:
			case WORD:
			case WS:
			case TAB:
			case NEWLINE:
				{
				setState(535);
				statement();
				}
				break;
			case OP_BRACE:
				{
				setState(536);
				op_brace();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WORD) | (1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(537);
					statement();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(543);
				cl_brace();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParseDoWhileContext extends ParserRuleContext {
		public Op_bracketContext op_bracket() {
			return getRuleContext(Op_bracketContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Cl_bracketContext cl_bracket() {
			return getRuleContext(Cl_bracketContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Op_braceContext op_brace() {
			return getRuleContext(Op_braceContext.class,0);
		}
		public Cl_braceContext cl_brace() {
			return getRuleContext(Cl_braceContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ParseDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParseDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParseDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParseDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseDoWhileContext parseDoWhile() throws RecognitionException {
		ParseDoWhileContext _localctx = new ParseDoWhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parseDoWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(547);
			match(DO);
			highlight("do");
			}
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(550);
				ws();
				}
				break;
			}
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
			case INT:
			case STRING:
			case BOOL:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case IF:
			case FOR:
			case WHILE:
			case WORD:
			case WS:
			case TAB:
			case NEWLINE:
				{
				setState(553);
				statement();
				}
				break;
			case OP_BRACE:
				{
				setState(554);
				op_brace();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WORD) | (1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(555);
					statement();
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(561);
				cl_brace();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(565);
				ws();
				}
			}

			{
			setState(568);
			match(WHILE);
			highlight("while");
			}
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(571);
				ws();
				}
			}

			setState(574);
			op_bracket();
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(575);
				ws();
				}
				break;
			}
			setState(578);
			condition();
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(579);
				ws();
				}
			}

			setState(582);
			cl_bracket();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(583);
				ws();
				}
			}

			setState(586);
			semicolon();
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(587);
				ws();
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

	public static class ExtendContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExtend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExtend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExtend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendContext extend() throws RecognitionException {
		ExtendContext _localctx = new ExtendContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_extend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(590);
			match(EXTENDS);
			highlight("extends");
			}
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(593);
				ws();
				}
			}

			setState(596);
			word();
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

	public static class ImplementContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ImplementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImplement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImplement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitImplement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementContext implement() throws RecognitionException {
		ImplementContext _localctx = new ImplementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_implement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(598);
			match(IMPLEMENTS);
			highlight("implements");
			}
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(601);
				ws();
				}
			}

			setState(604);
			word();
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

	public static class ParseInterfaceContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Op_braceContext op_brace() {
			return getRuleContext(Op_braceContext.class,0);
		}
		public Cl_braceContext cl_brace() {
			return getRuleContext(Cl_braceContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExtendContext extend() {
			return getRuleContext(ExtendContext.class,0);
		}
		public List<InterfacePieceContext> interfacePiece() {
			return getRuleContexts(InterfacePieceContext.class);
		}
		public InterfacePieceContext interfacePiece(int i) {
			return getRuleContext(InterfacePieceContext.class,i);
		}
		public ParseInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParseInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParseInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParseInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseInterfaceContext parseInterface() throws RecognitionException {
		ParseInterfaceContext _localctx = new ParseInterfaceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parseInterface);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(606);
			match(INTERFACE);
			highlight("interface");
			}
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(609);
				ws();
				}
			}

			setState(612);
			word();
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(613);
				ws();
				setState(614);
				extend();
				}
				break;
			}
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(618);
				ws();
				}
			}

			setState(621);
			op_brace();
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(622);
				ws();
				}
				break;
			}
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					interfacePiece();
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(631);
				ws();
				}
			}

			setState(634);
			cl_brace();
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

	public static class InterfacePieceContext extends ParserRuleContext {
		public ParseInterfaceContext parseInterface() {
			return getRuleContext(ParseInterfaceContext.class,0);
		}
		public InterfaceMethodContext interfaceMethod() {
			return getRuleContext(InterfaceMethodContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InterfaceMethodOrFeildContext interfaceMethodOrFeild() {
			return getRuleContext(InterfaceMethodOrFeildContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public InterfacePieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacePiece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfacePiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfacePiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfacePiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePieceContext interfacePiece() throws RecognitionException {
		InterfacePieceContext _localctx = new InterfacePieceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfacePiece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(636);
				ws();
				}
			}

			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(639);
				modifier();
				setState(640);
				ws();
				}
			}

			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				{
				setState(644);
				match(STATIC);
				highlight("static");
				}
				setState(647);
				ws();
				}
			}

			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				{
				setState(650);
				parseInterface();
				}
				break;
			case VOID:
				{
				{
				setState(651);
				match(VOID);
				types("void");
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(654);
					ws();
					}
				}

				setState(657);
				interfaceMethod();
				}
				break;
			case INT:
			case STRING:
			case BOOL:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case CHAR:
				{
				setState(658);
				type();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(659);
					ws();
					}
				}

				setState(662);
				interfaceMethodOrFeild();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			        if (_localctx != null) highlight(_localctx.getText());
			    
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(JavaParser.BOOL, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(JavaParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LONG:
			case DOUBLE:
			case FLOAT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        if (_localctx != null) types(_localctx.getText());
				   
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				match(STRING);

				        if (_localctx != null) html.append(_localctx.getText());
				   
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

	public static class InterfaceMethodContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Op_bracketContext op_bracket() {
			return getRuleContext(Op_bracketContext.class,0);
		}
		public Cl_bracketContext cl_bracket() {
			return getRuleContext(Cl_bracketContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public InterfaceMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodContext interfaceMethod() throws RecognitionException {
		InterfaceMethodContext _localctx = new InterfaceMethodContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interfaceMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			word();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(676);
				ws();
				}
			}

			setState(679);
			op_bracket();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(680);
				ws();
				}
			}

			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0)) {
				{
				setState(683);
				arg();
				}
			}

			setState(686);
			cl_bracket();
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(687);
					ws();
					}
				}

				{
				setState(690);
				match(THROWS);
				highlight("throws");
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(693);
					ws();
					}
				}

				setState(696);
				word();
				}
				break;
			}
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(699);
				ws();
				}
			}

			setState(702);
			semicolon();
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(703);
				ws();
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

	public static class ArgContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			type();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(707);
				ws();
				}
			}

			setState(710);
			word();
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(711);
				ws();
				}
				break;
			}
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(714);
				comma();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(715);
					ws();
					}
				}

				setState(718);
				type();
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(719);
					ws();
					}
				}

				setState(722);
				word();
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(723);
					ws();
					}
					break;
				}
				}
				}
				setState(730);
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

	public static class InterfaceMethodOrFeildContext extends ParserRuleContext {
		public InterfaceMethodContext interfaceMethod() {
			return getRuleContext(InterfaceMethodContext.class,0);
		}
		public VarInitContext varInit() {
			return getRuleContext(VarInitContext.class,0);
		}
		public InterfaceMethodOrFeildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFeild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodOrFeild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodOrFeild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodOrFeild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFeildContext interfaceMethodOrFeild() throws RecognitionException {
		InterfaceMethodOrFeildContext _localctx = new InterfaceMethodOrFeildContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interfaceMethodOrFeild);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				interfaceMethod();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				varInit();
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

	public static class VarInitContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVarInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInitContext varInit() throws RecognitionException {
		VarInitContext _localctx = new VarInitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			word();
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(736);
				ws();
				}
				break;
			}
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT) {
				{
				setState(739);
				init();
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(740);
					ws();
					}
					break;
				}
				setState(743);
				expr();
				}
			}

			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(747);
				ws();
				}
			}

			setState(750);
			semicolon();
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(751);
				ws();
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(JavaParser.INTEGER_NUM, 0); }
		public TerminalNode DOUBLE_NUM() { return getToken(JavaParser.DOUBLE_NUM, 0); }
		public TerminalNode STRING_VALUE() { return getToken(JavaParser.STRING_VALUE, 0); }
		public TerminalNode CHAR_VALUE() { return getToken(JavaParser.CHAR_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(JavaParser.BOOLEAN_VALUE, 0); }
		public TerminalNode NULL() { return getToken(JavaParser.NULL, 0); }
		public TerminalNode WORD() { return getToken(JavaParser.WORD, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_data);
		int _la;
		try {
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUM:
			case DOUBLE_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(754);
					match(INTEGER_NUM);
					}
					break;
				case 2:
					{
					setState(755);
					match(INTEGER_NUM);
					setState(756);
					match(T__0);
					}
					break;
				case 3:
					{
					setState(757);
					match(DOUBLE_NUM);
					}
					break;
				case 4:
					{
					setState(758);
					match(DOUBLE_NUM);
					setState(759);
					match(T__1);
					}
					break;
				}

				        if (_localctx != null) number(_localctx.getText());
				    
				}
				break;
			case CHAR_VALUE:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				_la = _input.LA(1);
				if ( !(_la==CHAR_VALUE || _la==STRING_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        if (_localctx != null) string(_localctx.getText());
				    
				}
				break;
			case NULL:
			case BOOLEAN_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==BOOLEAN_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        if (_localctx != null) highlight(_localctx.getText());
				    
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				match(WORD);

				        if (_localctx != null) html.append(_localctx.getText());
				    
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

	public static class ExprContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr);
		int _la;
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(771);
					ws();
					}
				}

				setState(774);
				data();
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(775);
					ws();
					}
				}

				setState(778);
				plus();
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(779);
					ws();
					}
					break;
				}
				setState(782);
				expr();
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(783);
					ws();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(786);
					ws();
					}
				}

				setState(789);
				data();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(790);
					ws();
					}
				}

				setState(793);
				minus();
				setState(795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(794);
					ws();
					}
					break;
				}
				setState(797);
				expr();
				setState(799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(798);
					ws();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(801);
					ws();
					}
				}

				setState(804);
				data();
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(805);
					ws();
					}
				}

				setState(808);
				div();
				setState(810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(809);
					ws();
					}
					break;
				}
				setState(812);
				expr();
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(813);
					ws();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(816);
					ws();
					}
				}

				setState(819);
				data();
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(820);
					ws();
					}
				}

				setState(823);
				mul();
				setState(825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(824);
					ws();
					}
					break;
				}
				setState(827);
				expr();
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(828);
					ws();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(831);
					ws();
					}
				}

				setState(834);
				data();
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(835);
					ws();
					}
				}

				setState(838);
				mod();
				setState(840);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(839);
					ws();
					}
					break;
				}
				setState(842);
				expr();
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(843);
					ws();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(846);
					ws();
					}
				}

				setState(849);
				data();
				setState(851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(850);
					ws();
					}
					break;
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition);
		int _la;
		try {
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(855);
					ws();
					}
					break;
				}
				setState(858);
				expr();
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(859);
					ws();
					}
				}

				setState(862);
				less();
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(863);
					ws();
					}
					break;
				}
				setState(866);
				condition();
				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(867);
					ws();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(870);
					ws();
					}
					break;
				}
				setState(873);
				expr();
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(874);
					ws();
					}
				}

				setState(877);
				greater();
				setState(879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(878);
					ws();
					}
					break;
				}
				setState(881);
				condition();
				setState(883);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(882);
					ws();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(885);
					ws();
					}
					break;
				}
				setState(888);
				expr();
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(889);
					ws();
					}
				}

				setState(892);
				and();
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(893);
					ws();
					}
					break;
				}
				setState(896);
				condition();
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(897);
					ws();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(900);
					ws();
					}
					break;
				}
				setState(903);
				expr();
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(904);
					ws();
					}
				}

				setState(907);
				or();
				setState(909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(908);
					ws();
					}
					break;
				}
				setState(911);
				condition();
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(912);
					ws();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(916);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(915);
					ws();
					}
					break;
				}
				setState(918);
				expr();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
					{
					setState(919);
					ws();
					}
				}

				setState(922);
				eq();
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(923);
					ws();
					}
					break;
				}
				setState(926);
				condition();
				setState(928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(927);
					ws();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(931);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(930);
					ws();
					}
					break;
				}
				setState(933);
				expr();
				setState(935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(934);
					ws();
					}
					break;
				}
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

	public static class WordContext extends ParserRuleContext {
		public Token WORD;
		public TerminalNode WORD() { return getToken(JavaParser.WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			((WordContext)_localctx).WORD = match(WORD);
			html.append((((WordContext)_localctx).WORD!=null?((WordContext)_localctx).WORD.getText():null));
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

	public static class SpaceContext extends ParserRuleContext {
		public Token WS;
		public TerminalNode WS() { return getToken(JavaParser.WS, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			((SpaceContext)_localctx).WS = match(WS);

			        html.append((((SpaceContext)_localctx).WS!=null?((SpaceContext)_localctx).WS.getText():null));
			    
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

	public static class TabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(JavaParser.TAB, 0); }
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(TAB);
			html.append("&nbsp;&nbsp;&nbsp;&nbsp;");
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(JavaParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(NEWLINE);
			html.append("<br>\n\t\t");
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

	public static class WsContext extends ParserRuleContext {
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(954); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(954);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WS:
						{
						setState(951);
						space();
						}
						break;
					case NEWLINE:
						{
						setState(952);
						newline();
						}
						break;
					case TAB:
						{
						setState(953);
						tab();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(956); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(COMMA);
			html.append(",");
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

	public static class DotContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(DOT);
			html.append(".");
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

	public static class Op_bracketContext extends ParserRuleContext {
		public TerminalNode OP_BRACKET() { return getToken(JavaParser.OP_BRACKET, 0); }
		public Op_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterOp_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitOp_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitOp_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_bracketContext op_bracket() throws RecognitionException {
		Op_bracketContext _localctx = new Op_bracketContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(OP_BRACKET);
			html.append("(");
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

	public static class Cl_bracketContext extends ParserRuleContext {
		public TerminalNode CL_BRACKET() { return getToken(JavaParser.CL_BRACKET, 0); }
		public Cl_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cl_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCl_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCl_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCl_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cl_bracketContext cl_bracket() throws RecognitionException {
		Cl_bracketContext _localctx = new Cl_bracketContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cl_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(CL_BRACKET);
			html.append(")");
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

	public static class Op_braceContext extends ParserRuleContext {
		public TerminalNode OP_BRACE() { return getToken(JavaParser.OP_BRACE, 0); }
		public Op_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterOp_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitOp_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitOp_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_braceContext op_brace() throws RecognitionException {
		Op_braceContext _localctx = new Op_braceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(OP_BRACE);
			html.append("{");
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

	public static class Cl_braceContext extends ParserRuleContext {
		public TerminalNode CL_BRACE() { return getToken(JavaParser.CL_BRACE, 0); }
		public Cl_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cl_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCl_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCl_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCl_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cl_braceContext cl_brace() throws RecognitionException {
		Cl_braceContext _localctx = new Cl_braceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cl_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(CL_BRACE);
			html.append("}");
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(JavaParser.INIT, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(INIT);
			html.append("=");
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

	public static class SemicolonContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(JavaParser.SEMICOLON, 0); }
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(SEMICOLON);
			html.append(";");
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

	public static class PlusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(JavaParser.PLUS, 0); }
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(PLUS);
			html.append("+");
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

	public static class MinusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(JavaParser.MINUS, 0); }
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(MINUS);
			html.append("-");
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(DIV);
			html.append("/");
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

	public static class MulContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(MUL);
			html.append("*");
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

	public static class ModContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(MOD);
			html.append("%");
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

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(OR);
			html.append("||");
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(AND);
			html.append("&&");
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

	public static class LessContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(JavaParser.LESS, 0); }
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(LESS);
			html.append("<");
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

	public static class GreaterContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(JavaParser.GREATER, 0); }
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(GREATER);
			html.append(">");
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

	public static class EqContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(JavaParser.EQ, 0); }
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(EQ);
			html.append("==");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u03f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\5\2j\n\2\3\2\5\2m\n\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3}\n\3\3\3\3\3\5\3\u0081\n\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\7\4\u008a\n\4\f\4\16\4\u008d\13\4\3\5\3\5\3\5\3\5\5\5\u0093"+
		"\n\5\3\5\3\5\5\5\u0097\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3"+
		"\7\3\7\3\7\3\7\5\7\u00a6\n\7\3\7\3\7\5\7\u00aa\n\7\3\b\3\b\3\b\3\b\5\b"+
		"\u00b0\n\b\3\b\3\b\5\b\u00b4\n\b\3\b\5\b\u00b7\n\b\3\b\5\b\u00ba\n\b\3"+
		"\b\5\b\u00bd\n\b\3\b\5\b\u00c0\n\b\3\b\3\b\5\b\u00c4\n\b\3\b\7\b\u00c7"+
		"\n\b\f\b\16\b\u00ca\13\b\3\b\5\b\u00cd\n\b\3\b\3\b\5\b\u00d1\n\b\3\t\3"+
		"\t\3\t\5\t\u00d6\n\t\3\t\3\t\3\t\3\t\5\t\u00dc\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00e4\n\t\3\t\3\t\5\t\u00e8\n\t\3\t\3\t\3\t\3\t\5\t\u00ee\n\t"+
		"\3\t\3\t\5\t\u00f2\n\t\3\t\5\t\u00f5\n\t\3\n\3\n\5\n\u00f9\n\n\3\n\3\n"+
		"\5\n\u00fd\n\n\3\n\5\n\u0100\n\n\3\n\5\n\u0103\n\n\3\n\3\n\5\n\u0107\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u010d\n\n\3\n\5\n\u0110\n\n\3\n\5\n\u0113\n\n\3"+
		"\n\3\n\5\n\u0117\n\n\3\n\7\n\u011a\n\n\f\n\16\n\u011d\13\n\3\n\5\n\u0120"+
		"\n\n\3\13\3\13\5\13\u0124\n\13\3\13\3\13\3\13\3\13\5\13\u012a\n\13\3\13"+
		"\3\13\5\13\u012e\n\13\3\13\3\13\5\13\u0132\n\13\3\13\3\13\5\13\u0136\n"+
		"\13\3\13\5\13\u0139\n\13\3\f\5\f\u013c\n\f\3\f\3\f\3\f\5\f\u0141\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0148\n\f\3\f\5\f\u014b\n\f\3\r\3\r\3\r\3\r\5\r"+
		"\u0151\n\r\3\r\3\r\5\r\u0155\n\r\3\r\3\r\5\r\u0159\n\r\3\r\3\r\5\r\u015d"+
		"\n\r\3\r\5\r\u0160\n\r\3\r\3\r\5\r\u0164\n\r\3\r\5\r\u0167\n\r\3\r\3\r"+
		"\5\r\u016b\n\r\3\r\7\r\u016e\n\r\f\r\16\r\u0171\13\r\3\r\5\r\u0174\n\r"+
		"\3\r\3\r\5\r\u0178\n\r\5\r\u017a\n\r\3\r\5\r\u017d\n\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0183\n\r\3\r\3\r\3\r\6\r\u0188\n\r\r\r\16\r\u0189\3\r\3\r\5\r\u018e"+
		"\n\r\5\r\u0190\n\r\3\16\3\16\3\16\3\16\5\16\u0196\n\16\3\16\3\16\5\16"+
		"\u019a\n\16\3\16\3\16\5\16\u019e\n\16\3\16\3\16\5\16\u01a2\n\16\3\16\3"+
		"\16\5\16\u01a6\n\16\3\16\3\16\5\16\u01aa\n\16\3\16\3\16\5\16\u01ae\n\16"+
		"\3\16\3\16\5\16\u01b2\n\16\3\16\3\16\5\16\u01b6\n\16\3\16\3\16\5\16\u01ba"+
		"\n\16\3\16\3\16\5\16\u01be\n\16\7\16\u01c0\n\16\f\16\16\16\u01c3\13\16"+
		"\5\16\u01c5\n\16\3\16\5\16\u01c8\n\16\3\16\3\16\5\16\u01cc\n\16\3\16\3"+
		"\16\5\16\u01d0\n\16\3\16\5\16\u01d3\n\16\3\16\3\16\5\16\u01d7\n\16\3\16"+
		"\3\16\7\16\u01db\n\16\f\16\16\16\u01de\13\16\5\16\u01e0\n\16\3\16\5\16"+
		"\u01e3\n\16\3\16\3\16\5\16\u01e7\n\16\3\16\3\16\5\16\u01eb\n\16\3\16\3"+
		"\16\5\16\u01ef\n\16\3\16\3\16\5\16\u01f3\n\16\3\16\5\16\u01f6\n\16\3\16"+
		"\3\16\5\16\u01fa\n\16\3\16\3\16\3\16\7\16\u01ff\n\16\f\16\16\16\u0202"+
		"\13\16\3\16\3\16\5\16\u0206\n\16\3\17\3\17\3\17\3\17\5\17\u020c\n\17\3"+
		"\17\3\17\5\17\u0210\n\17\3\17\3\17\5\17\u0214\n\17\3\17\3\17\5\17\u0218"+
		"\n\17\3\17\3\17\3\17\7\17\u021d\n\17\f\17\16\17\u0220\13\17\3\17\3\17"+
		"\5\17\u0224\n\17\3\20\3\20\3\20\3\20\5\20\u022a\n\20\3\20\3\20\3\20\7"+
		"\20\u022f\n\20\f\20\16\20\u0232\13\20\3\20\3\20\5\20\u0236\n\20\3\20\5"+
		"\20\u0239\n\20\3\20\3\20\3\20\3\20\5\20\u023f\n\20\3\20\3\20\5\20\u0243"+
		"\n\20\3\20\3\20\5\20\u0247\n\20\3\20\3\20\5\20\u024b\n\20\3\20\3\20\5"+
		"\20\u024f\n\20\3\21\3\21\3\21\3\21\5\21\u0255\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u025d\n\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0265\n"+
		"\23\3\23\3\23\3\23\3\23\5\23\u026b\n\23\3\23\5\23\u026e\n\23\3\23\3\23"+
		"\5\23\u0272\n\23\3\23\7\23\u0275\n\23\f\23\16\23\u0278\13\23\3\23\5\23"+
		"\u027b\n\23\3\23\3\23\3\24\5\24\u0280\n\24\3\24\3\24\3\24\5\24\u0285\n"+
		"\24\3\24\3\24\3\24\3\24\5\24\u028b\n\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0292\n\24\3\24\3\24\3\24\5\24\u0297\n\24\3\24\3\24\5\24\u029b\n\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u02a4\n\26\3\27\3\27\5\27\u02a8"+
		"\n\27\3\27\3\27\5\27\u02ac\n\27\3\27\5\27\u02af\n\27\3\27\3\27\5\27\u02b3"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u02b9\n\27\3\27\5\27\u02bc\n\27\3\27\5"+
		"\27\u02bf\n\27\3\27\3\27\5\27\u02c3\n\27\3\30\3\30\5\30\u02c7\n\30\3\30"+
		"\3\30\5\30\u02cb\n\30\3\30\3\30\5\30\u02cf\n\30\3\30\3\30\5\30\u02d3\n"+
		"\30\3\30\3\30\5\30\u02d7\n\30\7\30\u02d9\n\30\f\30\16\30\u02dc\13\30\3"+
		"\31\3\31\5\31\u02e0\n\31\3\32\3\32\5\32\u02e4\n\32\3\32\3\32\5\32\u02e8"+
		"\n\32\3\32\3\32\5\32\u02ec\n\32\3\32\5\32\u02ef\n\32\3\32\3\32\5\32\u02f3"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02fb\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0304\n\33\3\34\5\34\u0307\n\34\3\34\3\34\5\34\u030b"+
		"\n\34\3\34\3\34\5\34\u030f\n\34\3\34\3\34\5\34\u0313\n\34\3\34\5\34\u0316"+
		"\n\34\3\34\3\34\5\34\u031a\n\34\3\34\3\34\5\34\u031e\n\34\3\34\3\34\5"+
		"\34\u0322\n\34\3\34\5\34\u0325\n\34\3\34\3\34\5\34\u0329\n\34\3\34\3\34"+
		"\5\34\u032d\n\34\3\34\3\34\5\34\u0331\n\34\3\34\5\34\u0334\n\34\3\34\3"+
		"\34\5\34\u0338\n\34\3\34\3\34\5\34\u033c\n\34\3\34\3\34\5\34\u0340\n\34"+
		"\3\34\5\34\u0343\n\34\3\34\3\34\5\34\u0347\n\34\3\34\3\34\5\34\u034b\n"+
		"\34\3\34\3\34\5\34\u034f\n\34\3\34\5\34\u0352\n\34\3\34\3\34\5\34\u0356"+
		"\n\34\5\34\u0358\n\34\3\35\5\35\u035b\n\35\3\35\3\35\5\35\u035f\n\35\3"+
		"\35\3\35\5\35\u0363\n\35\3\35\3\35\5\35\u0367\n\35\3\35\5\35\u036a\n\35"+
		"\3\35\3\35\5\35\u036e\n\35\3\35\3\35\5\35\u0372\n\35\3\35\3\35\5\35\u0376"+
		"\n\35\3\35\5\35\u0379\n\35\3\35\3\35\5\35\u037d\n\35\3\35\3\35\5\35\u0381"+
		"\n\35\3\35\3\35\5\35\u0385\n\35\3\35\5\35\u0388\n\35\3\35\3\35\5\35\u038c"+
		"\n\35\3\35\3\35\5\35\u0390\n\35\3\35\3\35\5\35\u0394\n\35\3\35\5\35\u0397"+
		"\n\35\3\35\3\35\5\35\u039b\n\35\3\35\3\35\5\35\u039f\n\35\3\35\3\35\5"+
		"\35\u03a3\n\35\3\35\5\35\u03a6\n\35\3\35\3\35\5\35\u03aa\n\35\5\35\u03ac"+
		"\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\6\""+
		"\u03bd\n\"\r\"\16\"\u03be\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3"+
		"/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\6\3\2\b\n\4\2\22\22\24\30"+
		"\3\2\"#\4\2\31\31!!\2\u0499\2i\3\2\2\2\4x\3\2\2\2\6\u0085\3\2\2\2\b\u008e"+
		"\3\2\2\2\n\u009b\3\2\2\2\f\u00a5\3\2\2\2\16\u00ab\3\2\2\2\20\u00d5\3\2"+
		"\2\2\22\u00f6\3\2\2\2\24\u0138\3\2\2\2\26\u013b\3\2\2\2\30\u014c\3\2\2"+
		"\2\32\u0191\3\2\2\2\34\u0207\3\2\2\2\36\u0225\3\2\2\2 \u0250\3\2\2\2\""+
		"\u0258\3\2\2\2$\u0260\3\2\2\2&\u027f\3\2\2\2(\u029c\3\2\2\2*\u02a3\3\2"+
		"\2\2,\u02a5\3\2\2\2.\u02c4\3\2\2\2\60\u02df\3\2\2\2\62\u02e1\3\2\2\2\64"+
		"\u0303\3\2\2\2\66\u0357\3\2\2\28\u03ab\3\2\2\2:\u03ad\3\2\2\2<\u03b0\3"+
		"\2\2\2>\u03b3\3\2\2\2@\u03b6\3\2\2\2B\u03bc\3\2\2\2D\u03c0\3\2\2\2F\u03c3"+
		"\3\2\2\2H\u03c6\3\2\2\2J\u03c9\3\2\2\2L\u03cc\3\2\2\2N\u03cf\3\2\2\2P"+
		"\u03d2\3\2\2\2R\u03d5\3\2\2\2T\u03d8\3\2\2\2V\u03db\3\2\2\2X\u03de\3\2"+
		"\2\2Z\u03e1\3\2\2\2\\\u03e4\3\2\2\2^\u03e7\3\2\2\2`\u03ea\3\2\2\2b\u03ed"+
		"\3\2\2\2d\u03f0\3\2\2\2f\u03f3\3\2\2\2hj\5B\"\2ih\3\2\2\2ij\3\2\2\2jl"+
		"\3\2\2\2km\5\4\3\2lk\3\2\2\2lm\3\2\2\2mq\3\2\2\2np\5\b\5\2on\3\2\2\2p"+
		"s\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\5\f\7\2uv\7\2\2\3"+
		"vw\b\2\1\2w\3\3\2\2\2xy\7\6\2\2yz\b\3\1\2z|\3\2\2\2{}\5B\"\2|{\3\2\2\2"+
		"|}\3\2\2\2}~\3\2\2\2~\u0080\5\6\4\2\177\u0081\5B\"\2\u0080\177\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\5R*\2\u0083\u0084"+
		"\5B\"\2\u0084\5\3\2\2\2\u0085\u008b\5:\36\2\u0086\u0087\5F$\2\u0087\u0088"+
		"\5:\36\2\u0088\u008a\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\7\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008e\u008f\7\7\2\2\u008f\u0090\b\5\1\2\u0090\u0092\3\2\2\2\u0091\u0093"+
		"\5B\"\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\5\n\6\2\u0095\u0097\5B\"\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5R*\2\u0099\u009a\5B\"\2\u009a\t"+
		"\3\2\2\2\u009b\u009c\5\6\4\2\u009c\u009f\5F$\2\u009d\u00a0\5Z.\2\u009e"+
		"\u00a0\5:\36\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\13\3\2\2"+
		"\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\b\7\1\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6"+
		"\5B\"\2\u00a5\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00aa\5\16\b\2\u00a8\u00aa\5$\23\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\r\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\b\b\1\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00b0\5B\"\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b6\5:\36\2\u00b2\u00b4\5B\"\2\u00b3\u00b2\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\5 \21\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bc\3\2\2\2\u00b8\u00ba\5B"+
		"\"\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\5\"\22\2\u00bc\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3"+
		"\2\2\2\u00be\u00c0\5B\"\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\5L\'\2\u00c2\u00c4\5B\"\2\u00c3\u00c2\3\2\2"+
		"\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7\5\20\t\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\5B\"\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\5N"+
		"(\2\u00cf\u00d1\5B\"\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\17"+
		"\3\2\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\5B\"\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00db\3\2\2\2\u00d7\u00d8\7\13"+
		"\2\2\u00d8\u00d9\b\t\1\2\u00d9\u00da\3\2\2\2\u00da\u00dc\5B\"\2\u00db"+
		"\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00f1\3\2\2\2\u00dd\u00f2\5\16"+
		"\b\2\u00de\u00f2\5$\23\2\u00df\u00e0\7\21\2\2\u00e0\u00e1\b\t\1\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e4\5B\"\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\5\22\n\2\u00e6\u00e8\5B\"\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\5N"+
		"(\2\u00ea\u00f2\3\2\2\2\u00eb\u00ed\5*\26\2\u00ec\u00ee\5B\"\2\u00ed\u00ec"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5\24\13\2"+
		"\u00f0\u00f2\3\2\2\2\u00f1\u00dd\3\2\2\2\u00f1\u00de\3\2\2\2\u00f1\u00df"+
		"\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\5B\"\2\u00f4"+
		"\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\21\3\2\2\2\u00f6\u00f8\5:\36"+
		"\2\u00f7\u00f9\5B\"\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\5H%\2\u00fb\u00fd\5B\"\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\5.\30\2\u00ff\u00fe\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u0103\5B\"\2\u0102"+
		"\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010f\5J"+
		"&\2\u0105\u0107\5B\"\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\7\20\2\2\u0109\u010a\b\n\1\2\u010a\u010c\3\2\2\2"+
		"\u010b\u010d\5B\"\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\5:\36\2\u010f\u0106\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u0113\5B\"\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\5L\'\2\u0115\u0117\5B\"\2\u0116\u0115"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011b\3\2\2\2\u0118\u011a\5\26\f\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5B\"\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\23\3\2\2\2\u0121\u0123\5\22\n"+
		"\2\u0122\u0124\5B\"\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\7\36\2\2\u0126\u0127\b\13\1\2\u0127\u0129\3\2\2\2"+
		"\u0128\u012a\5B\"\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012d\5\64\33\2\u012c\u012e\5B\"\2\u012d\u012c\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\5R*\2\u0130\u0132"+
		"\5B\"\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\5N(\2\u0134\u0136\5B\"\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2"+
		"\2\u0136\u0139\3\2\2\2\u0137\u0139\5\62\32\2\u0138\u0121\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\25\3\2\2\2\u013a\u013c\5B\"\2\u013b\u013a\3\2\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u0147\3\2\2\2\u013d\u013e\5*\26\2\u013e\u013f"+
		"\5B\"\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0148\5\62\32\2\u0143\u0148\5\30\r\2\u0144\u0148"+
		"\5\34\17\2\u0145\u0148\5\32\16\2\u0146\u0148\5\36\20\2\u0147\u0140\3\2"+
		"\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0146\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\5B\"\2\u014a\u0149\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\27\3\2\2\2\u014c\u014d\7\32\2\2\u014d\u014e"+
		"\b\r\1\2\u014e\u0150\3\2\2\2\u014f\u0151\5B\"\2\u0150\u014f\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\5H%\2\u0153\u0155\5B\""+
		"\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158"+
		"\58\35\2\u0157\u0159\5B\"\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015c\5J&\2\u015b\u015d\5B\"\2\u015c\u015b\3\2\2"+
		"\2\u015c\u015d\3\2\2\2\u015d\u0179\3\2\2\2\u015e\u0160\5B\"\2\u015f\u015e"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\5\26\f\2"+
		"\u0162\u0164\5B\"\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u017a"+
		"\3\2\2\2\u0165\u0167\5B\"\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016a\5L\'\2\u0169\u016b\5B\"\2\u016a\u0169\3\2\2"+
		"\2\u016a\u016b\3\2\2\2\u016b\u016f\3\2\2\2\u016c\u016e\5\26\f\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\5B\"\2\u0173"+
		"\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\5N"+
		"(\2\u0176\u0178\5B\"\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a"+
		"\3\2\2\2\u0179\u015f\3\2\2\2\u0179\u0166\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u017d\5B\"\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u018f\3\2"+
		"\2\2\u017e\u017f\7\33\2\2\u017f\u0180\b\r\1\2\u0180\u0182\3\2\2\2\u0181"+
		"\u0183\5B\"\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u018d\3\2"+
		"\2\2\u0184\u018e\5\26\f\2\u0185\u0187\5L\'\2\u0186\u0188\5\26\f\2\u0187"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5N(\2\u018c\u018e\3\2\2\2\u018d\u0184"+
		"\3\2\2\2\u018d\u0185\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u017e\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\31\3\2\2\2\u0191\u0192\7\34\2\2\u0192\u0193\b\16"+
		"\1\2\u0193\u0195\3\2\2\2\u0194\u0196\5B\"\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\5H%\2\u0198\u019a\5B\""+
		"\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01c4\3\2\2\2\u019b\u019d"+
		"\5*\26\2\u019c\u019e\5B\"\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\5:\36\2\u01a0\u01a2\5B\"\2\u01a1\u01a0\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\5P)\2\u01a4\u01a6"+
		"\5B\"\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01c1\5\66\34\2\u01a8\u01aa\5B\"\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3"+
		"\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\5D#\2\u01ac\u01ae\5B\"\2\u01ad"+
		"\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\5*"+
		"\26\2\u01b0\u01b2\5B\"\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\5:\36\2\u01b4\u01b6\5B\"\2\u01b5\u01b4\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\5P)\2\u01b8\u01ba"+
		"\5B\"\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bd\5\66\34\2\u01bc\u01be\5B\"\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01a9\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u019b\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01c8\5B\"\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cb\5R*\2\u01ca\u01cc\5B\"\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01df\3\2\2\2\u01cd\u01cf\58\35\2\u01ce\u01d0\5B\"\2\u01cf"+
		"\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01dc\3\2\2\2\u01d1\u01d3\5B"+
		"\"\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d6\5D#\2\u01d5\u01d7\5B\"\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2"+
		"\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\58\35\2\u01d9\u01db\3\2\2\2\u01da\u01d2"+
		"\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01cd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\5B\"\2\u01e2\u01e1\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\5R*\2\u01e5\u01e7\5B\""+
		"\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f2\3\2\2\2\u01e8\u01ea"+
		"\5:\36\2\u01e9\u01eb\5B\"\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ee\5P)\2\u01ed\u01ef\5B\"\2\u01ee\u01ed\3\2\2"+
		"\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\5\66\34\2\u01f1"+
		"\u01f3\3\2\2\2\u01f2\u01e8\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2"+
		"\2\2\u01f4\u01f6\5B\"\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f9\5J&\2\u01f8\u01fa\5B\"\2\u01f9\u01f8\3\2\2"+
		"\2\u01f9\u01fa\3\2\2\2\u01fa\u0205\3\2\2\2\u01fb\u0206\5\26\f\2\u01fc"+
		"\u0200\5L\'\2\u01fd\u01ff\5\26\f\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0204\5N(\2\u0204\u0206\3\2\2\2\u0205\u01fb\3\2\2"+
		"\2\u0205\u01fc\3\2\2\2\u0206\33\3\2\2\2\u0207\u0208\7\35\2\2\u0208\u0209"+
		"\b\17\1\2\u0209\u020b\3\2\2\2\u020a\u020c\5B\"\2\u020b\u020a\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\5H%\2\u020e\u0210\5B\""+
		"\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213"+
		"\58\35\2\u0212\u0214\5B\"\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0217\5J&\2\u0216\u0218\5B\"\2\u0217\u0216\3\2\2"+
		"\2\u0217\u0218\3\2\2\2\u0218\u0223\3\2\2\2\u0219\u0224\5\26\f\2\u021a"+
		"\u021e\5L\'\2\u021b\u021d\5\26\f\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2"+
		"\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0221\u0222\5N(\2\u0222\u0224\3\2\2\2\u0223\u0219\3\2\2"+
		"\2\u0223\u021a\3\2\2\2\u0224\35\3\2\2\2\u0225\u0226\7\5\2\2\u0226\u0227"+
		"\b\20\1\2\u0227\u0229\3\2\2\2\u0228\u022a\5B\"\2\u0229\u0228\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u0235\3\2\2\2\u022b\u0236\5\26\f\2\u022c\u0230\5"+
		"L\'\2\u022d\u022f\5\26\f\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0233\u0234\5N(\2\u0234\u0236\3\2\2\2\u0235\u022b\3\2\2\2\u0235\u022c"+
		"\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0239\5B\"\2\u0238\u0237\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7\35\2\2\u023b\u023c\b"+
		"\20\1\2\u023c\u023e\3\2\2\2\u023d\u023f\5B\"\2\u023e\u023d\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\5H%\2\u0241\u0243\5B\""+
		"\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246"+
		"\58\35\2\u0245\u0247\5B\"\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024a\5J&\2\u0249\u024b\5B\"\2\u024a\u0249\3\2\2"+
		"\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\5R*\2\u024d\u024f"+
		"\5B\"\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\37\3\2\2\2\u0250"+
		"\u0251\7\16\2\2\u0251\u0252\b\21\1\2\u0252\u0254\3\2\2\2\u0253\u0255\5"+
		"B\"\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0257\5:\36\2\u0257!\3\2\2\2\u0258\u0259\7\17\2\2\u0259\u025a\b\22\1"+
		"\2\u025a\u025c\3\2\2\2\u025b\u025d\5B\"\2\u025c\u025b\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\5:\36\2\u025f#\3\2\2\2\u0260"+
		"\u0261\7\r\2\2\u0261\u0262\b\23\1\2\u0262\u0264\3\2\2\2\u0263\u0265\5"+
		"B\"\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u026a\5:\36\2\u0267\u0268\5B\"\2\u0268\u0269\5 \21\2\u0269\u026b\3\2"+
		"\2\2\u026a\u0267\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c"+
		"\u026e\5B\"\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2"+
		"\2\2\u026f\u0271\5L\'\2\u0270\u0272\5B\"\2\u0271\u0270\3\2\2\2\u0271\u0272"+
		"\3\2\2\2\u0272\u0276\3\2\2\2\u0273\u0275\5&\24\2\u0274\u0273\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2"+
		"\2\2\u0278\u0276\3\2\2\2\u0279\u027b\5B\"\2\u027a\u0279\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\5N(\2\u027d%\3\2\2\2\u027e"+
		"\u0280\5B\"\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0284\3\2"+
		"\2\2\u0281\u0282\5(\25\2\u0282\u0283\5B\"\2\u0283\u0285\3\2\2\2\u0284"+
		"\u0281\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u028a\3\2\2\2\u0286\u0287\7\13"+
		"\2\2\u0287\u0288\b\24\1\2\u0288\u0289\3\2\2\2\u0289\u028b\5B\"\2\u028a"+
		"\u0286\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u029a\3\2\2\2\u028c\u029b\5$"+
		"\23\2\u028d\u028e\7\21\2\2\u028e\u028f\b\24\1\2\u028f\u0291\3\2\2\2\u0290"+
		"\u0292\5B\"\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u029b\5,\27\2\u0294\u0296\5*\26\2\u0295\u0297\5B\"\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\5\60"+
		"\31\2\u0299\u029b\3\2\2\2\u029a\u028c\3\2\2\2\u029a\u028d\3\2\2\2\u029a"+
		"\u0294\3\2\2\2\u029b\'\3\2\2\2\u029c\u029d\t\2\2\2\u029d\u029e\b\25\1"+
		"\2\u029e)\3\2\2\2\u029f\u02a0\t\3\2\2\u02a0\u02a4\b\26\1\2\u02a1\u02a2"+
		"\7\23\2\2\u02a2\u02a4\b\26\1\2\u02a3\u029f\3\2\2\2\u02a3\u02a1\3\2\2\2"+
		"\u02a4+\3\2\2\2\u02a5\u02a7\5:\36\2\u02a6\u02a8\5B\"\2\u02a7\u02a6\3\2"+
		"\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\5H%\2\u02aa\u02ac"+
		"\5B\"\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad"+
		"\u02af\5.\30\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2"+
		"\2\2\u02b0\u02bb\5J&\2\u02b1\u02b3\5B\"\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\7\20\2\2\u02b5\u02b6\b\27\1\2"+
		"\u02b6\u02b8\3\2\2\2\u02b7\u02b9\5B\"\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\5:\36\2\u02bb\u02b2\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bf\5B\"\2\u02be\u02bd\3\2"+
		"\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\5R*\2\u02c1\u02c3"+
		"\5B\"\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3-\3\2\2\2\u02c4\u02c6"+
		"\5*\26\2\u02c5\u02c7\5B\"\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02ca\5:\36\2\u02c9\u02cb\5B\"\2\u02ca\u02c9\3\2"+
		"\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02da\3\2\2\2\u02cc\u02ce\5D#\2\u02cd\u02cf"+
		"\5B\"\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d2\5*\26\2\u02d1\u02d3\5B\"\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\5:\36\2\u02d5\u02d7\5B\"\2\u02d6"+
		"\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02cc\3\2"+
		"\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"/\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02e0\5,\27\2\u02de\u02e0\5\62\32"+
		"\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0\61\3\2\2\2\u02e1\u02e3"+
		"\5:\36\2\u02e2\u02e4\5B\"\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02eb\3\2\2\2\u02e5\u02e7\5P)\2\u02e6\u02e8\5B\"\2\u02e7\u02e6\3\2\2"+
		"\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\5\66\34\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02e5\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2"+
		"\2\2\u02ed\u02ef\5B\"\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f2\5R*\2\u02f1\u02f3\5B\"\2\u02f2\u02f1\3\2\2"+
		"\2\u02f2\u02f3\3\2\2\2\u02f3\63\3\2\2\2\u02f4\u02fb\7\37\2\2\u02f5\u02f6"+
		"\7\37\2\2\u02f6\u02fb\7\3\2\2\u02f7\u02fb\7 \2\2\u02f8\u02f9\7 \2\2\u02f9"+
		"\u02fb\7\4\2\2\u02fa\u02f4\3\2\2\2\u02fa\u02f5\3\2\2\2\u02fa\u02f7\3\2"+
		"\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0304\b\33\1\2\u02fd"+
		"\u02fe\t\4\2\2\u02fe\u0304\b\33\1\2\u02ff\u0300\t\5\2\2\u0300\u0304\b"+
		"\33\1\2\u0301\u0302\7$\2\2\u0302\u0304\b\33\1\2\u0303\u02fa\3\2\2\2\u0303"+
		"\u02fd\3\2\2\2\u0303\u02ff\3\2\2\2\u0303\u0301\3\2\2\2\u0304\65\3\2\2"+
		"\2\u0305\u0307\5B\"\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308"+
		"\3\2\2\2\u0308\u030a\5\64\33\2\u0309\u030b\5B\"\2\u030a\u0309\3\2\2\2"+
		"\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\5T+\2\u030d\u030f"+
		"\5B\"\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0312\5\66\34\2\u0311\u0313\5B\"\2\u0312\u0311\3\2\2\2\u0312\u0313\3"+
		"\2\2\2\u0313\u0358\3\2\2\2\u0314\u0316\5B\"\2\u0315\u0314\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\5\64\33\2\u0318\u031a\5"+
		"B\"\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031d\5V,\2\u031c\u031e\5B\"\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2"+
		"\2\u031e\u031f\3\2\2\2\u031f\u0321\5\66\34\2\u0320\u0322\5B\"\2\u0321"+
		"\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0358\3\2\2\2\u0323\u0325\5B"+
		"\"\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0328\5\64\33\2\u0327\u0329\5B\"\2\u0328\u0327\3\2\2\2\u0328\u0329\3"+
		"\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\5X-\2\u032b\u032d\5B\"\2\u032c"+
		"\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\5\66"+
		"\34\2\u032f\u0331\5B\"\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0358\3\2\2\2\u0332\u0334\5B\"\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334\u0335\3\2\2\2\u0335\u0337\5\64\33\2\u0336\u0338\5B\"\2\u0337"+
		"\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\5Z"+
		".\2\u033a\u033c\5B\"\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d"+
		"\3\2\2\2\u033d\u033f\5\66\34\2\u033e\u0340\5B\"\2\u033f\u033e\3\2\2\2"+
		"\u033f\u0340\3\2\2\2\u0340\u0358\3\2\2\2\u0341\u0343\5B\"\2\u0342\u0341"+
		"\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\5\64\33\2"+
		"\u0345\u0347\5B\"\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348"+
		"\3\2\2\2\u0348\u034a\5\\/\2\u0349\u034b\5B\"\2\u034a\u0349\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\5\66\34\2\u034d\u034f\5"+
		"B\"\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0358\3\2\2\2\u0350"+
		"\u0352\5B\"\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353\u0355\5\64\33\2\u0354\u0356\5B\"\2\u0355\u0354\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0306\3\2\2\2\u0357\u0315\3\2"+
		"\2\2\u0357\u0324\3\2\2\2\u0357\u0333\3\2\2\2\u0357\u0342\3\2\2\2\u0357"+
		"\u0351\3\2\2\2\u0358\67\3\2\2\2\u0359\u035b\5B\"\2\u035a\u0359\3\2\2\2"+
		"\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\5\66\34\2\u035d\u035f"+
		"\5B\"\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0362\5b\62\2\u0361\u0363\5B\"\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u0366\58\35\2\u0365\u0367\5B\"\2\u0366"+
		"\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u03ac\3\2\2\2\u0368\u036a\5B"+
		"\"\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036d\5\66\34\2\u036c\u036e\5B\"\2\u036d\u036c\3\2\2\2\u036d\u036e\3"+
		"\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\5d\63\2\u0370\u0372\5B\"\2\u0371"+
		"\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\58"+
		"\35\2\u0374\u0376\5B\"\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u03ac\3\2\2\2\u0377\u0379\5B\"\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2"+
		"\2\2\u0379\u037a\3\2\2\2\u037a\u037c\5\66\34\2\u037b\u037d\5B\"\2\u037c"+
		"\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\5`"+
		"\61\2\u037f\u0381\5B\"\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382\u0384\58\35\2\u0383\u0385\5B\"\2\u0384\u0383\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u03ac\3\2\2\2\u0386\u0388\5B\"\2\u0387"+
		"\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\5\66"+
		"\34\2\u038a\u038c\5B\"\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038d\u038f\5^\60\2\u038e\u0390\5B\"\2\u038f\u038e\3\2"+
		"\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\58\35\2\u0392"+
		"\u0394\5B\"\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u03ac\3\2"+
		"\2\2\u0395\u0397\5B\"\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397"+
		"\u0398\3\2\2\2\u0398\u039a\5\66\34\2\u0399\u039b\5B\"\2\u039a\u0399\3"+
		"\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\5f\64\2\u039d"+
		"\u039f\5B\"\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u03a2\58\35\2\u03a1\u03a3\5B\"\2\u03a2\u03a1\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03ac\3\2\2\2\u03a4\u03a6\5B\"\2\u03a5\u03a4\3\2"+
		"\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\5\66\34\2\u03a8"+
		"\u03aa\5B\"\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2"+
		"\2\2\u03ab\u035a\3\2\2\2\u03ab\u0369\3\2\2\2\u03ab\u0378\3\2\2\2\u03ab"+
		"\u0387\3\2\2\2\u03ab\u0396\3\2\2\2\u03ab\u03a5\3\2\2\2\u03ac9\3\2\2\2"+
		"\u03ad\u03ae\7$\2\2\u03ae\u03af\b\36\1\2\u03af;\3\2\2\2\u03b0\u03b1\7"+
		"%\2\2\u03b1\u03b2\b\37\1\2\u03b2=\3\2\2\2\u03b3\u03b4\7&\2\2\u03b4\u03b5"+
		"\b \1\2\u03b5?\3\2\2\2\u03b6\u03b7\7(\2\2\u03b7\u03b8\b!\1\2\u03b8A\3"+
		"\2\2\2\u03b9\u03bd\5<\37\2\u03ba\u03bd\5@!\2\u03bb\u03bd\5> \2\u03bc\u03b9"+
		"\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bfC\3\2\2\2\u03c0\u03c1\7)\2\2\u03c1"+
		"\u03c2\b#\1\2\u03c2E\3\2\2\2\u03c3\u03c4\7*\2\2\u03c4\u03c5\b$\1\2\u03c5"+
		"G\3\2\2\2\u03c6\u03c7\7+\2\2\u03c7\u03c8\b%\1\2\u03c8I\3\2\2\2\u03c9\u03ca"+
		"\7,\2\2\u03ca\u03cb\b&\1\2\u03cbK\3\2\2\2\u03cc\u03cd\7-\2\2\u03cd\u03ce"+
		"\b\'\1\2\u03ceM\3\2\2\2\u03cf\u03d0\7.\2\2\u03d0\u03d1\b(\1\2\u03d1O\3"+
		"\2\2\2\u03d2\u03d3\7/\2\2\u03d3\u03d4\b)\1\2\u03d4Q\3\2\2\2\u03d5\u03d6"+
		"\7\62\2\2\u03d6\u03d7\b*\1\2\u03d7S\3\2\2\2\u03d8\u03d9\7\63\2\2\u03d9"+
		"\u03da\b+\1\2\u03daU\3\2\2\2\u03db\u03dc\7\64\2\2\u03dc\u03dd\b,\1\2\u03dd"+
		"W\3\2\2\2\u03de\u03df\7\65\2\2\u03df\u03e0\b-\1\2\u03e0Y\3\2\2\2\u03e1"+
		"\u03e2\7\66\2\2\u03e2\u03e3\b.\1\2\u03e3[\3\2\2\2\u03e4\u03e5\7\67\2\2"+
		"\u03e5\u03e6\b/\1\2\u03e6]\3\2\2\2\u03e7\u03e8\78\2\2\u03e8\u03e9\b\60"+
		"\1\2\u03e9_\3\2\2\2\u03ea\u03eb\79\2\2\u03eb\u03ec\b\61\1\2\u03eca\3\2"+
		"\2\2\u03ed\u03ee\7:\2\2\u03ee\u03ef\b\62\1\2\u03efc\3\2\2\2\u03f0\u03f1"+
		"\7;\2\2\u03f1\u03f2\b\63\1\2\u03f2e\3\2\2\2\u03f3\u03f4\7<\2\2\u03f4\u03f5"+
		"\b\64\1\2\u03f5g\3\2\2\2\u00c5ilq|\u0080\u008b\u0092\u0096\u009f\u00a5"+
		"\u00a9\u00af\u00b3\u00b6\u00b9\u00bc\u00bf\u00c3\u00c8\u00cc\u00d0\u00d5"+
		"\u00db\u00e3\u00e7\u00ed\u00f1\u00f4\u00f8\u00fc\u00ff\u0102\u0106\u010c"+
		"\u010f\u0112\u0116\u011b\u011f\u0123\u0129\u012d\u0131\u0135\u0138\u013b"+
		"\u0140\u0147\u014a\u0150\u0154\u0158\u015c\u015f\u0163\u0166\u016a\u016f"+
		"\u0173\u0177\u0179\u017c\u0182\u0189\u018d\u018f\u0195\u0199\u019d\u01a1"+
		"\u01a5\u01a9\u01ad\u01b1\u01b5\u01b9\u01bd\u01c1\u01c4\u01c7\u01cb\u01cf"+
		"\u01d2\u01d6\u01dc\u01df\u01e2\u01e6\u01ea\u01ee\u01f2\u01f5\u01f9\u0200"+
		"\u0205\u020b\u020f\u0213\u0217\u021e\u0223\u0229\u0230\u0235\u0238\u023e"+
		"\u0242\u0246\u024a\u024e\u0254\u025c\u0264\u026a\u026d\u0271\u0276\u027a"+
		"\u027f\u0284\u028a\u0291\u0296\u029a\u02a3\u02a7\u02ab\u02ae\u02b2\u02b8"+
		"\u02bb\u02be\u02c2\u02c6\u02ca\u02ce\u02d2\u02d6\u02da\u02df\u02e3\u02e7"+
		"\u02eb\u02ee\u02f2\u02fa\u0303\u0306\u030a\u030e\u0312\u0315\u0319\u031d"+
		"\u0321\u0324\u0328\u032c\u0330\u0333\u0337\u033b\u033f\u0342\u0346\u034a"+
		"\u034e\u0351\u0355\u0357\u035a\u035e\u0362\u0366\u0369\u036d\u0371\u0375"+
		"\u0378\u037c\u0380\u0384\u0387\u038b\u038f\u0393\u0396\u039a\u039e\u03a2"+
		"\u03a5\u03a9\u03ab\u03bc\u03be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}