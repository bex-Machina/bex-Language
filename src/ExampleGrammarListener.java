// Generated from C:/Users/Evilcorez/Desktop/FOPL ANTLAR PROFRAMS/Task2gG/src\ExampleGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExampleGrammarParser}.
 */
public interface ExampleGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#prgm}.
	 * @param ctx the parse tree
	 */
	void enterPrgm(ExampleGrammarParser.PrgmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#prgm}.
	 * @param ctx the parse tree
	 */
	void exitPrgm(ExampleGrammarParser.PrgmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ExampleGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ExampleGrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#declArr}.
	 * @param ctx the parse tree
	 */
	void enterDeclArr(ExampleGrammarParser.DeclArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#declArr}.
	 * @param ctx the parse tree
	 */
	void exitDeclArr(ExampleGrammarParser.DeclArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ExampleGrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ExampleGrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#declFunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclFunc(ExampleGrammarParser.DeclFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#declFunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclFunc(ExampleGrammarParser.DeclFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignToId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignToId(ExampleGrammarParser.AssignToIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignToId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignToId(ExampleGrammarParser.AssignToIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignToIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignToIdAsArr(ExampleGrammarParser.AssignToIdAsArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignToIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignToIdAsArr(ExampleGrammarParser.AssignToIdAsArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterIncId(ExampleGrammarParser.IncIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitIncId(ExampleGrammarParser.IncIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterIncIdAsArr(ExampleGrammarParser.IncIdAsArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitIncIdAsArr(ExampleGrammarParser.IncIdAsArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDecId(ExampleGrammarParser.DecIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecId}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDecId(ExampleGrammarParser.DecIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDecIdAsArr(ExampleGrammarParser.DecIdAsArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDecIdAsArr(ExampleGrammarParser.DecIdAsArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(ExampleGrammarParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(ExampleGrammarParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(ExampleGrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(ExampleGrammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void enterFor(ExampleGrammarParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void exitFor(ExampleGrammarParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ExampleGrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ExampleGrammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(ExampleGrammarParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link ExampleGrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(ExampleGrammarParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 */
	void enterInput(ExampleGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 */
	void exitInput(ExampleGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ExampleGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ExampleGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ExampleGrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ExampleGrammarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(ExampleGrammarParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ExampleGrammarParser#atomStmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(ExampleGrammarParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExampleGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExampleGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ExampleGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ExampleGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnknownId}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnknownId(ExampleGrammarParser.UnknownIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnknownId}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnknownId(ExampleGrammarParser.UnknownIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnknownIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnknownIdAsArr(ExampleGrammarParser.UnknownIdAsArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnknownIdAsArr}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnknownIdAsArr(ExampleGrammarParser.UnknownIdAsArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnknownFuncCall}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnknownFuncCall(ExampleGrammarParser.UnknownFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnknownFuncCall}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnknownFuncCall(ExampleGrammarParser.UnknownFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenUnknown(ExampleGrammarParser.ParenUnknownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#unknownExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenUnknown(ExampleGrammarParser.ParenUnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#exprAll}.
	 * @param ctx the parse tree
	 */
	void enterExprAll(ExampleGrammarParser.ExprAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#exprAll}.
	 * @param ctx the parse tree
	 */
	void exitExprAll(ExampleGrammarParser.ExprAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#exprArr}.
	 * @param ctx the parse tree
	 */
	void enterExprArr(ExampleGrammarParser.ExprArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#exprArr}.
	 * @param ctx the parse tree
	 */
	void exitExprArr(ExampleGrammarParser.ExprArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#floatExprArr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExprArr(ExampleGrammarParser.FloatExprArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#floatExprArr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExprArr(ExampleGrammarParser.FloatExprArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#boolExprArr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprArr(ExampleGrammarParser.BoolExprArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#boolExprArr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprArr(ExampleGrammarParser.BoolExprArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#stringExprArr}.
	 * @param ctx the parse tree
	 */
	void enterStringExprArr(ExampleGrammarParser.StringExprArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#stringExprArr}.
	 * @param ctx the parse tree
	 */
	void exitStringExprArr(ExampleGrammarParser.StringExprArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExampleGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExampleGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExampleGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExampleGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(ExampleGrammarParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(ExampleGrammarParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatUnknown(ExampleGrammarParser.FloatUnknownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatUnknown(ExampleGrammarParser.FloatUnknownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenFloat}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenFloat(ExampleGrammarParser.ParenFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenFloat}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenFloat(ExampleGrammarParser.ParenFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExampleGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExampleGrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatArith}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatArith(ExampleGrammarParser.FloatArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatArith}
	 * labeled alternative in {@link ExampleGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatArith(ExampleGrammarParser.FloatArithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExprFloatOp}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprFloatOp(ExampleGrammarParser.BoolExprFloatOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExprFloatOp}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprFloatOp(ExampleGrammarParser.BoolExprFloatOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenBoolExpr}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenBoolExpr(ExampleGrammarParser.ParenBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenBoolExpr}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenBoolExpr(ExampleGrammarParser.ParenBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExprBoolOp}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprBoolOp(ExampleGrammarParser.BoolExprBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExprBoolOp}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprBoolOp(ExampleGrammarParser.BoolExprBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotBoolExpr}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotBoolExpr(ExampleGrammarParser.NotBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotBoolExpr}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotBoolExpr(ExampleGrammarParser.NotBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolUnknown(ExampleGrammarParser.BoolUnknownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolUnknown(ExampleGrammarParser.BoolUnknownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExprFalse}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprFalse(ExampleGrammarParser.BoolExprFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExprFalse}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprFalse(ExampleGrammarParser.BoolExprFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExprTrue}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprTrue(ExampleGrammarParser.BoolExprTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExprTrue}
	 * labeled alternative in {@link ExampleGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprTrue(ExampleGrammarParser.BoolExprTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Str}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStr(ExampleGrammarParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Str}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStr(ExampleGrammarParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenStr}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenStr(ExampleGrammarParser.ParenStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenStr}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenStr(ExampleGrammarParser.ParenStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrCat}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStrCat(ExampleGrammarParser.StrCatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrCat}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStrCat(ExampleGrammarParser.StrCatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStrUnknown(ExampleGrammarParser.StrUnknownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrUnknown}
	 * labeled alternative in {@link ExampleGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStrUnknown(ExampleGrammarParser.StrUnknownContext ctx);
}