// Generated from D:/study/5sem/MT/lab3/src/main/java\Java.g4 by ANTLR 4.9.2
package antr;

	import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JavaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JavaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parsePackage}.
	 * @param ctx the parse tree
	 */
	void enterParsePackage(JavaParser.ParsePackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parsePackage}.
	 * @param ctx the parse tree
	 */
	void exitParsePackage(JavaParser.ParsePackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JavaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JavaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parseImport}.
	 * @param ctx the parse tree
	 */
	void enterParseImport(JavaParser.ParseImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parseImport}.
	 * @param ctx the parse tree
	 */
	void exitParseImport(JavaParser.ParseImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(JavaParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(JavaParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(JavaParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(JavaParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parseClass}.
	 * @param ctx the parse tree
	 */
	void enterParseClass(JavaParser.ParseClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parseClass}.
	 * @param ctx the parse tree
	 */
	void exitParseClass(JavaParser.ParseClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classPiece}.
	 * @param ctx the parse tree
	 */
	void enterClassPiece(JavaParser.ClassPieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classPiece}.
	 * @param ctx the parse tree
	 */
	void exitClassPiece(JavaParser.ClassPieceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassMethod(JavaParser.ClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassMethod(JavaParser.ClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classMethodReturnOrFeild}.
	 * @param ctx the parse tree
	 */
	void enterClassMethodReturnOrFeild(JavaParser.ClassMethodReturnOrFeildContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classMethodReturnOrFeild}.
	 * @param ctx the parse tree
	 */
	void exitClassMethodReturnOrFeild(JavaParser.ClassMethodReturnOrFeildContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parseIf}.
	 * @param ctx the parse tree
	 */
	void enterParseIf(JavaParser.ParseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parseIf}.
	 * @param ctx the parse tree
	 */
	void exitParseIf(JavaParser.ParseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parseFor}.
	 * @param ctx the parse tree
	 */
	void enterParseFor(JavaParser.ParseForContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parseFor}.
	 * @param ctx the parse tree
	 */
	void exitParseFor(JavaParser.ParseForContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parseWhile}.
	 * @param ctx the parse tree
	 */
	void enterParseWhile(JavaParser.ParseWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parseWhile}.
	 * @param ctx the parse tree
	 */
	void exitParseWhile(JavaParser.ParseWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parseDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterParseDoWhile(JavaParser.ParseDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parseDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitParseDoWhile(JavaParser.ParseDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#extend}.
	 * @param ctx the parse tree
	 */
	void enterExtend(JavaParser.ExtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#extend}.
	 * @param ctx the parse tree
	 */
	void exitExtend(JavaParser.ExtendContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#implement}.
	 * @param ctx the parse tree
	 */
	void enterImplement(JavaParser.ImplementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#implement}.
	 * @param ctx the parse tree
	 */
	void exitImplement(JavaParser.ImplementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parseInterface}.
	 * @param ctx the parse tree
	 */
	void enterParseInterface(JavaParser.ParseInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parseInterface}.
	 * @param ctx the parse tree
	 */
	void exitParseInterface(JavaParser.ParseInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfacePiece}.
	 * @param ctx the parse tree
	 */
	void enterInterfacePiece(JavaParser.InterfacePieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfacePiece}.
	 * @param ctx the parse tree
	 */
	void exitInterfacePiece(JavaParser.InterfacePieceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethod}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethod(JavaParser.InterfaceMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethod}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethod(JavaParser.InterfaceMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(JavaParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(JavaParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodOrFeild}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFeild(JavaParser.InterfaceMethodOrFeildContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodOrFeild}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFeild(JavaParser.InterfaceMethodOrFeildContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#varInit}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(JavaParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#varInit}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(JavaParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(JavaParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(JavaParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(JavaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(JavaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(JavaParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(JavaParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(JavaParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(JavaParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(JavaParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(JavaParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(JavaParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(JavaParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(JavaParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(JavaParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(JavaParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(JavaParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(JavaParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(JavaParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#op_bracket}.
	 * @param ctx the parse tree
	 */
	void enterOp_bracket(JavaParser.Op_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#op_bracket}.
	 * @param ctx the parse tree
	 */
	void exitOp_bracket(JavaParser.Op_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#cl_bracket}.
	 * @param ctx the parse tree
	 */
	void enterCl_bracket(JavaParser.Cl_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#cl_bracket}.
	 * @param ctx the parse tree
	 */
	void exitCl_bracket(JavaParser.Cl_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#op_brace}.
	 * @param ctx the parse tree
	 */
	void enterOp_brace(JavaParser.Op_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#op_brace}.
	 * @param ctx the parse tree
	 */
	void exitOp_brace(JavaParser.Op_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#cl_brace}.
	 * @param ctx the parse tree
	 */
	void enterCl_brace(JavaParser.Cl_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#cl_brace}.
	 * @param ctx the parse tree
	 */
	void exitCl_brace(JavaParser.Cl_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(JavaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(JavaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(JavaParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(JavaParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(JavaParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(JavaParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(JavaParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(JavaParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(JavaParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(JavaParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(JavaParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(JavaParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(JavaParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(JavaParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(JavaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(JavaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(JavaParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(JavaParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#less}.
	 * @param ctx the parse tree
	 */
	void enterLess(JavaParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#less}.
	 * @param ctx the parse tree
	 */
	void exitLess(JavaParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(JavaParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(JavaParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(JavaParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(JavaParser.EqContext ctx);
}