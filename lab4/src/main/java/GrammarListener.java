// Generated from D:/study/5sem/MT/lab4/src/main/java\Grammar.g4 by ANTLR 4.9.2

	import java.util.regex.Pattern;
	import java.util.Set;
	import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parseGrammar}.
	 * @param ctx the parse tree
	 */
	void enterParseGrammar(GrammarParser.ParseGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parseGrammar}.
	 * @param ctx the parse tree
	 */
	void exitParseGrammar(GrammarParser.ParseGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(GrammarParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(GrammarParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 */
	void enterNonterm(GrammarParser.NontermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 */
	void exitNonterm(GrammarParser.NontermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexElems}.
	 * @param ctx the parse tree
	 */
	void enterLexElems(GrammarParser.LexElemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexElems}.
	 * @param ctx the parse tree
	 */
	void exitLexElems(GrammarParser.LexElemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elems}.
	 * @param ctx the parse tree
	 */
	void enterElems(GrammarParser.ElemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elems}.
	 * @param ctx the parse tree
	 */
	void exitElems(GrammarParser.ElemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(GrammarParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(GrammarParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(GrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(GrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarParser.StringContext ctx);
}