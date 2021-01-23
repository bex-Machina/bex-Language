// Generated from C:/Users/Evilcorez/Desktop/FOPL ANTLAR PROFRAMS/Task2gG/src\ExampleGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExampleGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExampleGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#prgm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrgm(ExampleGrammarParser.PrgmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ExampleGrammarParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#declArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArr(ExampleGrammarParser.DeclArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ExampleGrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#declFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclFunc(ExampleGrammarParser.DeclFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignToId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignToId(ExampleGrammarParser.AssignToIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignToIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignToIdAsArr(ExampleGrammarParser.AssignToIdAsArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncId(ExampleGrammarParser.IncIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncIdAsArr(ExampleGrammarParser.IncIdAsArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecId(ExampleGrammarParser.DecIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecIdAsArr(ExampleGrammarParser.DecIdAsArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(ExampleGrammarParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ExampleGrammarParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(ExampleGrammarParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ExampleGrammarParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(ExampleGrammarParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ExampleGrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ExampleGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ExampleGrammarParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(ExampleGrammarParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ExampleGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ExampleGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnknownId}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownId(ExampleGrammarParser.UnknownIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnknownIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownIdAsArr(ExampleGrammarParser.UnknownIdAsArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnknownFuncCall}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownFuncCall(ExampleGrammarParser.UnknownFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenUnknown(ExampleGrammarParser.ParenUnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#exprAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAll(ExampleGrammarParser.ExprAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#exprArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArr(ExampleGrammarParser.ExprArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#floatExprArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExprArr(ExampleGrammarParser.FloatExprArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#boolExprArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprArr(ExampleGrammarParser.BoolExprArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#stringExprArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExprArr(ExampleGrammarParser.StringExprArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExampleGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExampleGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(ExampleGrammarParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatUnknown(ExampleGrammarParser.FloatUnknownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenFloat}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenFloat(ExampleGrammarParser.ParenFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ExampleGrammarParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatArith}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatArith(ExampleGrammarParser.FloatArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExprFloatOp}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprFloatOp(ExampleGrammarParser.BoolExprFloatOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenBoolExpr}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenBoolExpr(ExampleGrammarParser.ParenBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExprBoolOp}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprBoolOp(ExampleGrammarParser.BoolExprBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotBoolExpr}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBoolExpr(ExampleGrammarParser.NotBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolUnknown(ExampleGrammarParser.BoolUnknownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExprFalse}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprFalse(ExampleGrammarParser.BoolExprFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExprTrue}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprTrue(ExampleGrammarParser.BoolExprTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Str}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(ExampleGrammarParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenStr}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenStr(ExampleGrammarParser.ParenStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrCat}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrCat(ExampleGrammarParser.StrCatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrUnknown(ExampleGrammarParser.StrUnknownContext ctx);
}