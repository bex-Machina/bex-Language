import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.HashMap;
import java.util.Map;

public class Worker extends ExampleGrammarBaseVisitor<ST> {

    private static final STGroup group = new STGroupFile("./JavaScript.stg");


    @Override
    public ST visitPrgm(ExampleGrammarParser.PrgmContext ctx) {
        ST mainProgram = group.getInstanceOf("program");

        int n = ctx.getChildCount();

        for(int i = 0; i < n; ++i) {
            ParseTree c = ctx.getChild(i);
            mainProgram.add("statement", c.accept(this));
        }

        return mainProgram;
    }

    @Override public ST visitDecl(ExampleGrammarParser.DeclContext ctx)
    {
        ST st = group.getInstanceOf("decl");
        st.add("id", ctx.IDENTIFIER().getText());
        st.add("exprAll", ctx.exprAll().getText());
        return st;
    }

    @Override
    public ST visitDeclArr(ExampleGrammarParser.DeclArrContext ctx) {
        ST st;
        st = group.getInstanceOf("declarr");
        st.add("id", ctx.IDENTIFIER().getText());
        //st.add("expr1", visit(ctx.expr()));
        st.add("exprArr", visit(ctx.exprArr()));

        return st;
    }



        @Override public ST visitDeclFunc(ExampleGrammarParser.DeclFuncContext ctx) {
        //ST st ;
        ST st = group.getInstanceOf("declFunc");
        //st = group.getInstanceOf("declFunc");
        st.add("id", ctx.IDENTIFIER().getText());
        if (!ctx.params.isEmpty()) {
            //String temp = "";
            for (int i = 0; i < ctx.params.size(); i++) {
                st.add("params", visit(ctx.params.get(i)));
                if (i < ctx.params.size() - 1) {
                    st.add("params", ",");
                }
            }
        }

        st.add("block", visit(ctx.block()));
        //st.add("block", ctx.block().getText());
        return st;
    }



  @Override public ST visitParam(ExampleGrammarParser.ParamContext ctx)
  {
      ST st ;
      st = group.getInstanceOf("param");
      st.add("id", ctx.IDENTIFIER().getText());
      return st;

  }

    @Override public ST visitBlock(ExampleGrammarParser.BlockContext ctx)
    {
    ST stProgram = group.getInstanceOf("program");

    int n = ctx.getChildCount();

    for(int i = 0; i < n; ++i) {
        ParseTree c = ctx.getChild(i);
        stProgram.add("statement", c.accept(this));
    }

    ST st = group.getInstanceOf("block");
    st.add("program", stProgram);
    return st;
     //ST stProgram = group.getInstanceOf("program");

     // int n = ctx.getChildCount();

     // for(int i = 0; i < n; ++i) {
     //     //ParseTree c = ctx.getChild(i);
     //    // ST c = visit(ctx.getChild(i));
     //    // stProgram.add("statement", c);
     //     ParseTree c = ctx.getChild(i);
     //     stProgram.add("statement", c.accept(this));
     // }

    }




    public ST visitExprArr(ExampleGrammarParser.ExprArrContext ctx)
    {
        return visit(ctx.children.get(0));
    }

    public ST visitFloatExprArr(ExampleGrammarParser.FloatExprArrContext ctx)
    {
        ST st = group.getInstanceOf("exprArr");
       //for(int i = 0; i < ctx.children.size();i++)
       //{
       //    st.add("elements", ctx.children.get(i));
       //}

        if (!ctx.elements.isEmpty()) {
            //String temp = "";
            for (int i = 0; i < ctx.elements.size(); i++) {
                st.add("elements", visit(ctx.elements.get(i)));
                if (i < ctx.elements.size() - 1) {
                    st.add("elements", ",");
                }
            }
        }

        //st.add("elements", ctx.elements.getText());
        //st.add("elements", ctx.elements.getText());

        return st;
    }

    public ST visitBoolExprArr(ExampleGrammarParser.BoolExprArrContext ctx)
    {
        ST st = group.getInstanceOf("exprArr");
        if (!ctx.elements.isEmpty()) {
            //String temp = "";
            for (int i = 0; i < ctx.elements.size(); i++) {
                st.add("elements", visit(ctx.elements.get(i)));
                if (i < ctx.elements.size() - 1) {
                    st.add("elements", ",");
                }
            }
        }

        return st;
    }

    public ST visitStringExprArr(ExampleGrammarParser.StringExprArrContext ctx)
    {
        ST st = group.getInstanceOf("exprArr");
        if (!ctx.elements.isEmpty()) {
            //String temp = "";
            for (int i = 0; i < ctx.elements.size(); i++) {
                st.add("elements", visit(ctx.elements.get(i)));
                if (i < ctx.elements.size() - 1) {
                    st.add("elements", ",");
                }
            }
        }

        return st;
    }


    public ST visitAssignStmt(ExampleGrammarParser.AssignStmtContext ctx)
    {
        ST st = group.getInstanceOf("AssignStmt");
        st.add("AssignStmt", ctx.assignment().getText());
        return st;

    }
    @Override
    public ST visitAssignToId(ExampleGrammarParser.AssignToIdContext ctx) {
        ST st = group.getInstanceOf("AssignToId");
        st.add("identifier", ctx.IDENTIFIER().getText());
        st.add("exprall", ctx.exprAll().getText());
        return st;
    }

    @Override
    public ST visitAssignToIdAsArr(ExampleGrammarParser.AssignToIdAsArrContext ctx) {
        ST st = group.getInstanceOf("AssignToIdAsArr");
        st.add("identifier", ctx.IDENTIFIER().getText());
        st.add("expr1", visit(ctx.expr(0)));
        st.add("expr2", visit(ctx.expr(1)));
        return st;
    }

    @Override
    public ST visitIncId(ExampleGrammarParser.IncIdContext ctx) {
        ST st = group.getInstanceOf("IncId");
        st.add("inc", ctx.INC().getText());
        st.add("identifier", ctx.IDENTIFIER().getText());
        return st;

    }

    @Override
    public ST visitIncIdAsArr(ExampleGrammarParser.IncIdAsArrContext ctx) {
        ST st = group.getInstanceOf("IncIdAsArr");
        st.add("inc", ctx.INC().getText());
        st.add("identifier", ctx.IDENTIFIER().getText());
        st.add("expr", ctx.expr().getText());
        return st;
    }

    @Override
    public ST visitDecId(ExampleGrammarParser.DecIdContext ctx){
        ST st = group.getInstanceOf("DecId");
        st.add("dec", ctx.DEC().getText());
        st.add("identifier", ctx.IDENTIFIER().getText());
        return st;
    }

    @Override
    public ST visitDecIdAsArr(ExampleGrammarParser.DecIdAsArrContext ctx){
        ST st = group.getInstanceOf("DecIdAsArr");
        st.add("dec", ctx.DEC().getText());
        st.add("identifier", ctx.IDENTIFIER().getText());
        st.add("expr", ctx.expr().getText());
        return st;
    }

    @Override  //controlStmt
    public ST visitIf(ExampleGrammarParser.IfContext ctx){
        ST st = group.getInstanceOf("ifelse");
        st.add("boolexpr", ctx.boolExpr().getText());
        st.add("block1", visit(ctx.block(0)));
        st.add("block2", visit(ctx.block(1)));
        return st;
    }

    @Override
    public ST visitFor(ExampleGrammarParser.ForContext ctx){
        ST st = group.getInstanceOf("for");
        //st.add("type",ctx.TYPE().getText());
        st.add("id", ctx.IDENTIFIER().getText());
        st.add("expr",ctx.expr().getText());
        st.add("boolexpr", ctx.boolExpr().getText());
        st.add("assign", ctx.assignment().getText());
        st.add("block", visit(ctx.block()));
        return st;
    }


    @Override
    public ST visitWhile(ExampleGrammarParser.WhileContext ctx){
        ST st = group.getInstanceOf("while");
        st.add("boolexpr", ctx.boolExpr().getText());
        st.add("block", visit(ctx.block()));
        return st;
    }

    @Override
    public ST visitDoWhile(ExampleGrammarParser.DoWhileContext ctx){
        ST st = group.getInstanceOf("do");
        st.add("block", visit(ctx.block()));
        st.add("boolexpr", ctx.boolExpr().getText());
        return st;
    }

    @Override  //atomStmt
    public ST visitInput(ExampleGrammarParser.InputContext ctx){
        ST st = group.getInstanceOf("input");
        st.add("identifier", ctx.IDENTIFIER().getText());
        return st;
    }

    @Override
    public ST visitPrint(ExampleGrammarParser.PrintContext ctx){
        ST st = group.getInstanceOf("print");
        st.add("exprall",ctx.exprAll().getText());
        return st;
    }

    @Override
    public ST visitReturn(ExampleGrammarParser.ReturnContext ctx){
        ST st = group.getInstanceOf("return");
        st.add("exprall",ctx.exprAll().getText());
        return st;
    }

    @Override
    public ST visitFuncCall(ExampleGrammarParser.FuncCallContext ctx){
        ST st = group.getInstanceOf("FuncCall");
        st.add("identifier", ctx.IDENTIFIER().getText());
        st.add("exprall1", visit(ctx.exprAll(0)));
        st.add("exprall2", visit(ctx.exprAll(1)));
        return st;
    }

    @Override  //unknownExpr
    public ST visitUnknownId(ExampleGrammarParser.UnknownIdContext ctx) {
        ST st = group.getInstanceOf("UnknownId");
        st.add("identifier", ctx.IDENTIFIER().getText());
        return st;
    }

    @Override
    public ST visitUnknownIdAsArr(ExampleGrammarParser.UnknownIdAsArrContext ctx) {
        ST st = group.getInstanceOf("UnknownIdAsArr");
        st.add("identifier", ctx.IDENTIFIER().getText());
        st.add("exprall", ctx.exprAll().getText());
        return st;
    }

    @Override
    public ST visitUnknownFuncCall(ExampleGrammarParser.UnknownFuncCallContext ctx){
        ST st = group.getInstanceOf("UnknownFuncCall");
        st.add("identifier", ctx.IDENTIFIER().getText());
        st.add("exprall1", visit(ctx.exprAll(0)));
        st.add("exprall2", visit(ctx.exprAll(1)));
        return st;
    }

    @Override
    public ST visitParenUnknown(ExampleGrammarParser.ParenUnknownContext ctx){
        ST st = group.getInstanceOf("ParenUnknown");
        st.add("unknownexpr",ctx.unknownExpr().getText());
        return st;
    }

    @Override // floatExpr op needs doing
    public ST  visitFloatArith(ExampleGrammarParser.FloatArithContext ctx){
        ST st = group.getInstanceOf("FloatArith");
        st.add("floatexpr1",visit(ctx.floatExpr(0)));
        st.add("floatexpr2",visit(ctx.floatExpr(1)));
        return st;
    }

    @Override
    public ST visitInt(ExampleGrammarParser.IntContext ctx){
        ST st = group.getInstanceOf("int");
        st.add("int", ctx.INT().getText());
        return st;
    }

    @Override
    public ST visitFloat(ExampleGrammarParser.FloatContext ctx){
        ST st = group.getInstanceOf("Float");
        st.add("float", ctx.FLOAT().getText());
        return st;
    }

    @Override
    public ST visitFloatUnknown(ExampleGrammarParser.FloatUnknownContext ctx){
        ST st = group.getInstanceOf("FloatUnknown");
        st.add("unknownexpr", ctx.unknownExpr().getText());
        return st;
    }

    @Override
    public ST visitParenFloat(ExampleGrammarParser.ParenFloatContext ctx) {
        ST st = group.getInstanceOf("ParenFloat");
        st.add("floatexpr", ctx.floatExpr().getText());
        return st;
    }

    @Override // boolExpr op needs doing
    public ST visitBoolExprBoolOp(ExampleGrammarParser.BoolExprBoolOpContext ctx){
        ST st = group.getInstanceOf("BoolExprBoolOp");
        st.add("boolexpr1", visit(ctx.boolExpr(0)));
        st.add("boolexpr2", visit(ctx.boolExpr(1)));
        return st;
    }

    @Override
    public ST visitNotBoolExpr(ExampleGrammarParser.NotBoolExprContext ctx){
        ST st = group.getInstanceOf("NotBoolExpr");
        st.add("boolexpr",ctx.boolExpr().getText());
        return st;

    }

    @Override // op needs doing
    public ST visitBoolExprFloatOp(ExampleGrammarParser.BoolExprFloatOpContext ctx){
        ST st = group.getInstanceOf("BoolExprFloatOp");
        st.add("floatexpr1",visit(ctx.floatExpr(0)));
        st.add("floatexpr2", visit(ctx.floatExpr(1)));
        return st;
    }

    @Override
    public ST visitBoolExprTrue(ExampleGrammarParser.BoolExprTrueContext ctx){
        ST st = group.getInstanceOf("BoolExprTrue");
        st.add("true",ctx.TRUE().getText());
        return st;
    }

    @Override
    public ST visitBoolExprFalse(ExampleGrammarParser.BoolExprFalseContext ctx){
        ST st = group.getInstanceOf("BoolExprFalse");
        st.add("false", ctx.FALSE().getText());
        return st;
    }

    @Override
    public ST visitBoolUnknown(ExampleGrammarParser.BoolUnknownContext ctx){
        ST st = group.getInstanceOf("BoolUnknown");
        st.add("unknownexpr",ctx.unknownExpr().getText());
        return st;
    }

    @Override
    public ST visitParenBoolExpr(ExampleGrammarParser.ParenBoolExprContext ctx){
        ST st = group.getInstanceOf("ParenBoolExpr");
        st.add("boolexpr",ctx.boolExpr().getText());
        return st;
    }

    @Override // stringExpr
    public ST visitStrCat(ExampleGrammarParser.StrCatContext ctx){
        ST st = group.getInstanceOf("StrCat");
        st.add("stringexpr1",visit(ctx.stringExpr(0)));
        st.add("stringexpr2",visit(ctx.stringExpr(1)));
        return st;
    }

    @Override
    public ST visitStr(ExampleGrammarParser.StrContext ctx){
        ST st = group.getInstanceOf("Str");
        st.add("string",ctx.STRING().getText());
        return st;
    }

    @Override
    public ST visitStrUnknown(ExampleGrammarParser.StrUnknownContext ctx){
        ST st = group.getInstanceOf("StrUnknown");
        st.add("unknownexpr",ctx.unknownExpr().getText());
        return st;
    }

    @Override
    public ST visitParenStr(ExampleGrammarParser.ParenStrContext ctx){
        ST st = group.getInstanceOf("ParenStr");
        st.add("stringexpr",ctx.stringExpr().getText());
        return st;
    }


}

