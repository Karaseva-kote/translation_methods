// Generated from D:/study/5sem/MT/lab4/src/main/java\Grammar.g4 by ANTLR 4.9.2

	import java.util.regex.Pattern;
	import java.util.Set;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
	import java.util.stream.Collectors;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, GRAMMAR=4, RETURNS=5, NAME=6, PLUS=7, MUL=8, SUB=9, 
		DIV=10, SEMICOLON=11, COLON=12, QUOTE=13, OR=14, NUMPATTERN=15, LETTERPATTERN=16, 
		LB=17, RB=18, LSB=19, RSB=20, LFB=21, RFB=22, COMMA=23, DOT=24, DOLLAR=25, 
		EQUAL=26, DIGIT=27, WS=28;
	public static final int
		RULE_start = 0, RULE_parseGrammar = 1, RULE_header = 2, RULE_term = 3, 
		RULE_regex = 4, RULE_nonterm = 5, RULE_lexElems = 6, RULE_elems = 7, RULE_fun = 8, 
		RULE_args = 9, RULE_returnType = 10, RULE_code = 11, RULE_string = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "parseGrammar", "header", "term", "regex", "nonterm", "lexElems", 
			"elems", "fun", "args", "returnType", "code", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'\"'", "'grammar'", "'returns'", null, "'+'", "'*'", 
			"'-'", "'/'", "';'", "':'", "'''", "'|'", "'[0-9]+'", "'[a-zA-Z]'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "'$'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "GRAMMAR", "RETURNS", "NAME", "PLUS", "MUL", 
			"SUB", "DIV", "SEMICOLON", "COLON", "QUOTE", "OR", "NUMPATTERN", "LETTERPATTERN", 
			"LB", "RB", "LSB", "RSB", "LFB", "RFB", "COMMA", "DOT", "DOLLAR", "EQUAL", 
			"DIGIT", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Set<Character> escapeChars = Set.of('+', '*', '(', ')');

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Grammar g;
		public ParseGrammarContext parseGrammar() {
			return getRuleContext(ParseGrammarContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);

		    ((StartContext)_localctx).g =  new Grammar();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			parseGrammar(_localctx.g);
			setState(27);
			match(EOF);

			        _localctx.g.term.add(new Term("EPS", Pattern.compile("")));
			        _localctx.g.term.add(new Term("EOF", Pattern.compile("")));
			    
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

	public static class ParseGrammarContext extends ParserRuleContext {
		public Grammar g;
		public TermContext term;
		public NontermContext nonterm;
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<NontermContext> nonterm() {
			return getRuleContexts(NontermContext.class);
		}
		public NontermContext nonterm(int i) {
			return getRuleContext(NontermContext.class,i);
		}
		public ParseGrammarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParseGrammarContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_parseGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParseGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParseGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParseGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseGrammarContext parseGrammar(Grammar g) throws RecognitionException {
		ParseGrammarContext _localctx = new ParseGrammarContext(_ctx, getState(), g);
		enterRule(_localctx, 2, RULE_parseGrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			header(_localctx.g);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(31);
					((ParseGrammarContext)_localctx).term = term();

					        _localctx.g.term.add(((ParseGrammarContext)_localctx).term.t);
					    
					}
					break;
				case 2:
					{
					setState(34);
					((ParseGrammarContext)_localctx).nonterm = nonterm();

					        _localctx.g.nonterm.add(((ParseGrammarContext)_localctx).nonterm.nt);
					    
					}
					break;
				}
				}
				setState(41);
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

	public static class HeaderContext extends ParserRuleContext {
		public Grammar g;
		public Token NAME;
		public TerminalNode GRAMMAR() { return getToken(GrammarParser.GRAMMAR, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HeaderContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header(Grammar g) throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState(), g);
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(GRAMMAR);
			setState(43);
			((HeaderContext)_localctx).NAME = match(NAME);
			setState(44);
			match(SEMICOLON);

			        _localctx.g.setName((((HeaderContext)_localctx).NAME!=null?((HeaderContext)_localctx).NAME.getText():null));
			    
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

	public static class TermContext extends ParserRuleContext {
		public Term t;
		public Token NAME;
		public RegexContext regex;
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((TermContext)_localctx).NAME = match(NAME);
			setState(48);
			match(COLON);
			setState(49);
			((TermContext)_localctx).regex = regex();
			setState(50);
			match(SEMICOLON);

			        ((TermContext)_localctx).t =  new Term((((TermContext)_localctx).NAME!=null?((TermContext)_localctx).NAME.getText():null), ((TermContext)_localctx).regex.p);
			    
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

	public static class RegexContext extends ParserRuleContext {
		public Pattern p;
		public StringContext string;
		public Token NUMPATTERN;
		public Token LETTERPATTERN;
		public List<TerminalNode> QUOTE() { return getTokens(GrammarParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(GrammarParser.QUOTE, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NUMPATTERN() { return getToken(GrammarParser.NUMPATTERN, 0); }
		public TerminalNode LETTERPATTERN() { return getToken(GrammarParser.LETTERPATTERN, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_regex);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(53);
				match(QUOTE);
				setState(54);
				((RegexContext)_localctx).string = string();
				setState(55);
				match(QUOTE);

				        ((RegexContext)_localctx).p =  Pattern.compile((((RegexContext)_localctx).string!=null?_input.getText(((RegexContext)_localctx).string.start,((RegexContext)_localctx).string.stop):null).chars().mapToObj(ch -> (char) ch).map(ch -> escapeChars.contains(ch)? "\\" + ch: ch).map(Object::toString).collect(Collectors.joining()));

				    
				}
				}
				break;
			case NUMPATTERN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(58);
				((RegexContext)_localctx).NUMPATTERN = match(NUMPATTERN);

				        ((RegexContext)_localctx).p =  Pattern.compile((((RegexContext)_localctx).NUMPATTERN!=null?((RegexContext)_localctx).NUMPATTERN.getText():null));
				    
				}
				}
				break;
			case LETTERPATTERN:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(60);
				((RegexContext)_localctx).LETTERPATTERN = match(LETTERPATTERN);

				        ((RegexContext)_localctx).p =  Pattern.compile((((RegexContext)_localctx).LETTERPATTERN!=null?((RegexContext)_localctx).LETTERPATTERN.getText():null));
				    
				}
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

	public static class NontermContext extends ParserRuleContext {
		public NonTerm nt;
		public Token NAME;
		public ArgsContext args;
		public ReturnTypeContext returnType;
		public LexElemsContext lexElems;
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public LexElemsContext lexElems() {
			return getRuleContext(LexElemsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public NontermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNonterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NontermContext nonterm() throws RecognitionException {
		NontermContext _localctx = new NontermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nonterm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((NontermContext)_localctx).NAME = match(NAME);
			setState(65);
			((NontermContext)_localctx).args = args();
			setState(66);
			((NontermContext)_localctx).returnType = returnType();
			setState(67);
			match(COLON);
			setState(68);
			((NontermContext)_localctx).lexElems = lexElems();
			setState(69);
			match(SEMICOLON);

			        ((NontermContext)_localctx).nt =  new NonTerm((((NontermContext)_localctx).NAME!=null?((NontermContext)_localctx).NAME.getText():null));
			        _localctx.nt.list = ((NontermContext)_localctx).lexElems.list;
			        _localctx.nt.args = ((NontermContext)_localctx).args.s;
			        _localctx.nt.returnType = ((NontermContext)_localctx).returnType.type;
			    
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

	public static class LexElemsContext extends ParserRuleContext {
		public List<Rule> list;
		public ElemsContext elems;
		public List<ElemsContext> elems() {
			return getRuleContexts(ElemsContext.class);
		}
		public ElemsContext elems(int i) {
			return getRuleContext(ElemsContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}
		public LexElemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexElems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexElems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexElems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexElemsContext lexElems() throws RecognitionException {
		LexElemsContext _localctx = new LexElemsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lexElems);

		    ((LexElemsContext)_localctx).list =  new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((LexElemsContext)_localctx).elems = elems();

			        _localctx.list.add(((LexElemsContext)_localctx).elems.r);
			    
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(74);
				match(OR);
				setState(75);
				((LexElemsContext)_localctx).elems = elems();

				        _localctx.list.add(((LexElemsContext)_localctx).elems.r);
				    
				}
				}
				setState(82);
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

	public static class ElemsContext extends ParserRuleContext {
		public Rule r;
		public FunContext fun;
		public CodeContext code;
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public TerminalNode LFB() { return getToken(GrammarParser.LFB, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RFB() { return getToken(GrammarParser.RFB, 0); }
		public ElemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemsContext elems() throws RecognitionException {
		ElemsContext _localctx = new ElemsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elems);

		    ((ElemsContext)_localctx).r =  new Rule();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				((ElemsContext)_localctx).fun = fun();

				        _localctx.r.lexElems.add(((ElemsContext)_localctx).fun.f);
				    
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LFB) {
				{
				{
				setState(90);
				match(LFB);
				setState(91);
				((ElemsContext)_localctx).code = code();
				setState(92);
				match(RFB);
				}

				        _localctx.r.code = (((ElemsContext)_localctx).code!=null?_input.getText(((ElemsContext)_localctx).code.start,((ElemsContext)_localctx).code.stop):null);
				    
				}
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

	public static class FunContext extends ParserRuleContext {
		public CallLexElement f;
		public Token NAME;
		public CodeContext code;
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode LB() { return getToken(GrammarParser.LB, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RB() { return getToken(GrammarParser.RB, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((FunContext)_localctx).NAME = match(NAME);
			((FunContext)_localctx).f =  new CallLexElement((((FunContext)_localctx).NAME!=null?((FunContext)_localctx).NAME.getText():null));
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				{
				setState(100);
				match(LB);
				setState(101);
				((FunContext)_localctx).code = code();
				setState(102);
				match(RB);
				}
				_localctx.f.args = (((FunContext)_localctx).code!=null?_input.getText(((FunContext)_localctx).code.start,((FunContext)_localctx).code.stop):null);
				}
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

	public static class ArgsContext extends ParserRuleContext {
		public String s;
		public Token type;
		public Token name;
		public TerminalNode LB() { return getToken(GrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(GrammarParser.RB, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);

		    ((ArgsContext)_localctx).s =  "";

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				{
				setState(108);
				match(LB);
				setState(109);
				((ArgsContext)_localctx).type = match(NAME);
				setState(110);
				((ArgsContext)_localctx).name = match(NAME);
				setState(111);
				match(RB);
				}

				        ((ArgsContext)_localctx).s =  ((ArgsContext)_localctx).type.getText() + " " + ((ArgsContext)_localctx).name.getText();
				    
				}
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public String type;
		public StringContext string;
		public TerminalNode RETURNS() { return getToken(GrammarParser.RETURNS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnType);

		    ((ReturnTypeContext)_localctx).type =  "void";

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				{
				setState(116);
				match(RETURNS);
				setState(117);
				((ReturnTypeContext)_localctx).string = string();
				}

				        ((ReturnTypeContext)_localctx).type =  (((ReturnTypeContext)_localctx).string!=null?_input.getText(((ReturnTypeContext)_localctx).string.start,((ReturnTypeContext)_localctx).string.stop):null);
				    
				}
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
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(GrammarParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(GrammarParser.DOLLAR, i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(125);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__1:
					case T__2:
					case NAME:
					case PLUS:
					case MUL:
					case SUB:
					case DIV:
					case SEMICOLON:
					case LB:
					case RB:
					case LFB:
					case COMMA:
					case DOT:
					case EQUAL:
					case DIGIT:
						{
						setState(123);
						string();
						}
						break;
					case DOLLAR:
						{
						setState(124);
						match(DOLLAR);
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
				setState(127); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public List<TerminalNode> LFB() { return getTokens(GrammarParser.LFB); }
		public TerminalNode LFB(int i) {
			return getToken(GrammarParser.LFB, i);
		}
		public List<TerminalNode> LB() { return getTokens(GrammarParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(GrammarParser.LB, i);
		}
		public List<TerminalNode> RB() { return getTokens(GrammarParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(GrammarParser.RB, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(GrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(GrammarParser.PLUS, i);
		}
		public List<TerminalNode> MUL() { return getTokens(GrammarParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(GrammarParser.MUL, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public List<TerminalNode> DIV() { return getTokens(GrammarParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(GrammarParser.DIV, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(GrammarParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(GrammarParser.EQUAL, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(GrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GrammarParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public List<TerminalNode> SUB() { return getTokens(GrammarParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(GrammarParser.SUB, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(129);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << NAME) | (1L << PLUS) | (1L << MUL) | (1L << SUB) | (1L << DIV) | (1L << SEMICOLON) | (1L << LB) | (1L << RB) | (1L << LFB) | (1L << COMMA) | (1L << DOT) | (1L << EQUAL) | (1L << DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bQ\n\b\f\b\16\bT\13\b\3\t\3\t\3"+
		"\t\6\tY\n\t\r\t\16\tZ\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13u\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\6\r\u0080\n\r\r\r\16\r\u0081\3\16\6"+
		"\16\u0085\n\16\r\16\16\16\u0086\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\3\b\2\3\5\b\r\23\24\27\27\31\32\34\35\2\u0088\2\34\3\2\2\2\4"+
		" \3\2\2\2\6,\3\2\2\2\b\61\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2\16J\3\2\2\2\20"+
		"X\3\2\2\2\22d\3\2\2\2\24t\3\2\2\2\26{\3\2\2\2\30\177\3\2\2\2\32\u0084"+
		"\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\37\b\2\1\2\37\3\3\2\2\2 )\5\6"+
		"\4\2!\"\5\b\5\2\"#\b\3\1\2#(\3\2\2\2$%\5\f\7\2%&\b\3\1\2&(\3\2\2\2\'!"+
		"\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2"+
		"\2,-\7\6\2\2-.\7\b\2\2./\7\r\2\2/\60\b\4\1\2\60\7\3\2\2\2\61\62\7\b\2"+
		"\2\62\63\7\16\2\2\63\64\5\n\6\2\64\65\7\r\2\2\65\66\b\5\1\2\66\t\3\2\2"+
		"\2\678\7\17\2\289\5\32\16\29:\7\17\2\2:;\b\6\1\2;A\3\2\2\2<=\7\21\2\2"+
		"=A\b\6\1\2>?\7\22\2\2?A\b\6\1\2@\67\3\2\2\2@<\3\2\2\2@>\3\2\2\2A\13\3"+
		"\2\2\2BC\7\b\2\2CD\5\24\13\2DE\5\26\f\2EF\7\16\2\2FG\5\16\b\2GH\7\r\2"+
		"\2HI\b\7\1\2I\r\3\2\2\2JK\5\20\t\2KR\b\b\1\2LM\7\20\2\2MN\5\20\t\2NO\b"+
		"\b\1\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\17\3\2\2\2T"+
		"R\3\2\2\2UV\5\22\n\2VW\b\t\1\2WY\3\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[b\3\2\2\2\\]\7\27\2\2]^\5\30\r\2^_\7\30\2\2_`\3\2\2\2`a\b\t"+
		"\1\2ac\3\2\2\2b\\\3\2\2\2bc\3\2\2\2c\21\3\2\2\2de\7\b\2\2el\b\n\1\2fg"+
		"\7\23\2\2gh\5\30\r\2hi\7\24\2\2ij\3\2\2\2jk\b\n\1\2km\3\2\2\2lf\3\2\2"+
		"\2lm\3\2\2\2m\23\3\2\2\2no\7\23\2\2op\7\b\2\2pq\7\b\2\2qr\7\24\2\2rs\3"+
		"\2\2\2su\b\13\1\2tn\3\2\2\2tu\3\2\2\2u\25\3\2\2\2vw\7\7\2\2wx\5\32\16"+
		"\2xy\3\2\2\2yz\b\f\1\2z|\3\2\2\2{v\3\2\2\2{|\3\2\2\2|\27\3\2\2\2}\u0080"+
		"\5\32\16\2~\u0080\7\33\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2\u0083\u0085"+
		"\t\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\33\3\2\2\2\16\')@RZblt{\177\u0081\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}