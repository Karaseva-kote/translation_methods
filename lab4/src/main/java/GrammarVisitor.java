// Generated from D:/study/5sem/MT/lab4/src/main/java\Grammar.g4 by ANTLR 4.9.2

	import java.util.regex.Pattern;
	import java.util.Set;
	import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parseGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseGrammar(GrammarParser.ParseGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(GrammarParser.RegexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonterm(GrammarParser.NontermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexElems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexElems(GrammarParser.LexElemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElems(GrammarParser.ElemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(GrammarParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(GrammarParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GrammarParser.StringContext ctx);
}