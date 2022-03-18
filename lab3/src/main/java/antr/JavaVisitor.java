// Generated from D:/study/5sem/MT/lab3/src/main/java\Java.g4 by ANTLR 4.9.2
package antr;

	import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(JavaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parsePackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParsePackage(JavaParser.ParsePackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(JavaParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parseImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseImport(JavaParser.ParseImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#importName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportName(JavaParser.ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(JavaParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parseClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseClass(JavaParser.ParseClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classPiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPiece(JavaParser.ClassPieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethod(JavaParser.ClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classMethodReturnOrFeild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodReturnOrFeild(JavaParser.ClassMethodReturnOrFeildContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseIf(JavaParser.ParseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parseFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseFor(JavaParser.ParseForContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parseWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseWhile(JavaParser.ParseWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parseDoWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseDoWhile(JavaParser.ParseDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtend(JavaParser.ExtendContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#implement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplement(JavaParser.ImplementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parseInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseInterface(JavaParser.ParseInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfacePiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacePiece(JavaParser.InterfacePieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethod(JavaParser.InterfaceMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(JavaParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMethodOrFeild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodOrFeild(JavaParser.InterfaceMethodOrFeildContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#varInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInit(JavaParser.VarInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(JavaParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JavaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(JavaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(JavaParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(JavaParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#tab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab(JavaParser.TabContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(JavaParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(JavaParser.WsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(JavaParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(JavaParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#op_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_bracket(JavaParser.Op_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#cl_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCl_bracket(JavaParser.Cl_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#op_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_brace(JavaParser.Op_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#cl_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCl_brace(JavaParser.Cl_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(JavaParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(JavaParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(JavaParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(JavaParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(JavaParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(JavaParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(JavaParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(JavaParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(JavaParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(JavaParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#greater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(JavaParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(JavaParser.EqContext ctx);
}