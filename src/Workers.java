import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class  Workers extends ExampleGrammarBaseVisitor {

    public HashMap<String, ArrayList<String>> search;


    public void searchRule(String rule){
        if(!search.get(rule).isEmpty()){
            for(String str : search.get(rule)){
                System.out.println(str);
            }
        }else{
            System.out.println("Error: This token does not exist.");
        }

    }

    public Void visitPrgm(ExampleGrammarParser.PrgmContext ctx)
    {
        search = new HashMap<String, ArrayList<String>>();
        System.out.println("program");
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

    public Void visitDecl(ExampleGrammarParser.DeclContext ctx)
    {
        if(!search.containsKey("decl")){
            search.put("decl",new ArrayList<String>());
        }
        search.get("decl").add(ctx.getText());
        System.out.println("decl");
        int n = ctx.getChildCount();
        System.out.println(ctx.TYPE().getText());
        System.out.println(ctx.IDENTIFIER().getText());
        System.out.println(ctx.EQ().getText());
        System.out.println(ctx.exprAll().getText());
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;

    }
    public Void visitDeclArr(ExampleGrammarParser.DeclArrContext ctx)
    {
        if(!search.containsKey("declarr")){
            search.put("declarr",new ArrayList<String>());
        }
        search.get("declarr").add(ctx.getText());
        System.out.println("declarr");
        int n = ctx.getChildCount();
        System.out.println(ctx.TYPE().getText());
        System.out.println(ctx.IDENTIFIER().getText());
        System.out.println(ctx.expr().getText());
        System.out.println(ctx.EQ().getText());
        System.out.println(ctx.exprArr().getText());
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

       return null;
    }



    public Void visitParam(ExampleGrammarParser.ParamContext ctx)
    {
        if(!search.containsKey("param")){
            search.put("param",new ArrayList<String>());
        }
        search.get("param").add(ctx.getText());
        System.out.println("param");
        int n = ctx.getChildCount();
        System.out.println(ctx.TYPE().getText());
        System.out.println(ctx.IDENTIFIER().getText());

        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }

    public Void visitDeclFunc(ExampleGrammarParser.DeclFuncContext ctx)
    {
        if(!search.containsKey("declFunc")){
            search.put("declFunc",new ArrayList<String>());
        }
        search.get("declFunc").add(ctx.getText());
        System.out.println("declFunc");
        int n = ctx.getChildCount();
        System.out.println(ctx.TYPE().getText());
        System.out.println(ctx.IDENTIFIER().getText());
        System.out.println(ctx.LPAREN().getText());
        System.out.println(ctx.RPAREN().getText());


        //System.out.println(ctx.block().getText());
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

    public Void visitFloatExprArr(ExampleGrammarParser.FloatExprArrContext ctx)
    {
        if(!search.containsKey("floatExprArr")){
            search.put("floatExprArr",new ArrayList<String>());
        }
        search.get("floatExprArr").add(ctx.getText());
        System.out.println("floatExprArr");
        int n = ctx.getChildCount();
        for(int i = 0; i < ctx.elements.size();i++)
        {
            System.out.println(ctx.floatExpr(i).getText());
        }
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

    public Void visitBoolExprArr(ExampleGrammarParser.BoolExprArrContext ctx)
    {
        if(!search.containsKey("boolExprArr")){
            search.put("boolExprArr",new ArrayList<String>());
        }
        search.get("boolExprArr").add(ctx.getText());
        System.out.println("boolExprArr");
        int n = ctx.getChildCount();
        for(int i = 0; i < ctx.elements.size();i++)
        {
            System.out.println(ctx.boolExpr(i).getText());
        }
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

    public Void visitStringExprArr(ExampleGrammarParser.StringExprArrContext ctx)
    {
        if(!search.containsKey("stringExprArr")){
            search.put("stringExprArr",new ArrayList<String>());
        }
        search.get("stringExprArr").add(ctx.getText());
        System.out.println("stringExprArr");
        int n = ctx.getChildCount();
        for(int i = 0; i < ctx.elements.size();i++)
        {
            System.out.println(ctx.stringExpr(i).getText());
        }
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;

    }

    public Void visitBlock(ExampleGrammarParser.BlockContext ctx)
    {
        if(!search.containsKey("block")){
            search.put("block",new ArrayList<String>());
        }
        search.get("block").add(ctx.getText());
        System.out.println("block");
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

    public Void visitIf(ExampleGrammarParser.IfContext ctx)
    {
        if(!search.containsKey("IfElse")){
            search.put("IfElse",new ArrayList<String>());
        }
        search.get("IfElse").add(ctx.getText());
        System.out.println("IfElse");
        int n = ctx.getChildCount();
        System.out.println(ctx.boolExpr().getText());

        //System.out.println(ctx.block(0));
        //System.out.println(ctx.block(1));

        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

    public Void visitFor(ExampleGrammarParser.ForContext ctx)
    {
        if(!search.containsKey("For")){
            search.put("For",new ArrayList<String>());
        }
        search.get("For").add(ctx.getText());
        System.out.println("For");
        int n = ctx.getChildCount();
        System.out.println(ctx.TYPE().getText());
        System.out.println(ctx.IDENTIFIER().getText());
        System.out.println(ctx.expr().getText());
        System.out.println(ctx.boolExpr().getText());
        System.out.println(ctx.assignment().getText());
        //System.out.println(ctx.block().getText());


        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

    public Void visitWhile(ExampleGrammarParser.WhileContext ctx)
    {
        if(!search.containsKey("While")){
            search.put("While",new ArrayList<String>());
        }
        search.get("While").add(ctx.getText());
        System.out.println("While");
        int n = ctx.getChildCount();
        System.out.println(ctx.boolExpr().getText());
        //System.out.println(ctx.block().getText());
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

    public Void visitDoWhile(ExampleGrammarParser.DoWhileContext ctx)
    {
        if(!search.containsKey("do")){
            search.put("do",new ArrayList<String>());
        }
        search.get("do").add(ctx.getText());
        System.out.println("do");
        int n = ctx.getChildCount();
        System.out.println(ctx.block().getText());


        if (ctx.boolExpr() != null)
        {
            if(!search.containsKey("while")){
                search.put("while",new ArrayList<String>());
            }
            System.out.println("while");
            System.out.println(ctx.boolExpr().getText());
        }

        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }

     public Void visitPrint(ExampleGrammarParser.PrintContext ctx)
    {
        if(!search.containsKey("print")){
            search.put("print",new ArrayList<String>());
        }
        search.get("print").add(ctx.getText());
        System.out.println("print");
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }
     public Void visitReturn(ExampleGrammarParser.ReturnContext ctx)
    {
        if(!search.containsKey("Return")){
            search.put("Return",new ArrayList<String>());
        }
        search.get("Return").add(ctx.getText());
        System.out.println("Return");
        int n = ctx.getChildCount();
        System.out.println(ctx.exprAll().getText());
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }
     public Void visitInput(ExampleGrammarParser.InputContext ctx)
    {
        if(!search.containsKey("Input")){
            search.put("Input",new ArrayList<String>());
        }
        search.get("Input").add(ctx.getText());
        System.out.println("Input");
        System.out.println(ctx.IDENTIFIER().getText());
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }
     public Void visitFuncCall(ExampleGrammarParser.FuncCallContext ctx)
    {
        if(!search.containsKey("FuncCall")){
            search.put("FuncCall",new ArrayList<String>());
        }
        search.get("FuncCall").add(ctx.getText());
        System.out.println("FuncCall");
        System.out.println(ctx.IDENTIFIER().getText());
      //for (int i = 0; i< ctx.args.size();i++)
      //{
      //    System.out.println(ctx.exprAll(i).getText());
      //}
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }
    public Void visitExprAll(ExampleGrammarParser.ExprAllContext ctx)
    {
        if(!search.containsKey("ExprAll")){
            search.put("ExprAll",new ArrayList<String>());
        }
        search.get("ExprAll").add(ctx.getText());
        System.out.println("ExprAll");
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }
        return null;
    }
    public Void visitExpr(ExampleGrammarParser.ExprContext ctx)
    {
        if(!search.containsKey("Expr")){
            search.put("Expr",new ArrayList<String>());
        }
        search.get("Expr").add(ctx.getText());
        System.out.println("Expr");
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

       return null;
    }
    public Void visitExprArr(ExampleGrammarParser.ExprArrContext ctx)
    {
        if(!search.containsKey("ExprArr")){
            search.put("ExprArr",new ArrayList<String>());
        }
        search.get("ExprArr").add(ctx.getText());
        System.out.println("ExprArr");
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }




    public Void visitAssignToId(ExampleGrammarParser.AssignToIdContext ctx)
    {
        if(!search.containsKey("AssignToId")){
            search.put("AssignToId",new ArrayList<String>());
        }
        search.get("AssignToId").add(ctx.getText());
        System.out.println("AssignToId");
        System.out.println(ctx.IDENTIFIER().getText());
        System.out.println(ctx.exprAll().getText());
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }

    public Void visitAssignToIdAsArr(ExampleGrammarParser.AssignToIdAsArrContext ctx)
    {
        if(!search.containsKey("ToIdAsArr")){
            search.put("ToIdAsArr",new ArrayList<String>());
        }
        search.get("ToIdAsArr").add(ctx.getText());
        System.out.println("ToIdAsArr");
        System.out.println(ctx.IDENTIFIER().getText());
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }

    public Void visitIncId(ExampleGrammarParser.IncIdContext ctx)
    {
        if(!search.containsKey("IncId")){
            search.put("IncId",new ArrayList<String>());
        }
        search.get("IncId").add(ctx.getText());
        System.out.println("IncId");
        System.out.println(ctx.INC().getText()+ctx.IDENTIFIER().getText());
        //System.out.println(ctx.IDENTIFIER().getText());
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }

    public Void visitIncIdAsArr(ExampleGrammarParser.IncIdAsArrContext ctx)
    {
        if(!search.containsKey("IncIdAsArr")){
            search.put("IncIdAsArr",new ArrayList<String>());
        }
        search.get("IncIdAsArr").add(ctx.getText());
        System.out.println("IncIdAsArr");
        System.out.println(ctx.INC().getText()+ctx.IDENTIFIER().getText());
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }

    public Void visitDecId(ExampleGrammarParser.DecIdContext ctx)
    {
        if(!search.containsKey("DecId")){
            search.put("DecId",new ArrayList<String>());
        }
        search.get("DecId").add(ctx.getText());
        System.out.println("DecId");
        System.out.println(ctx.DEC().getText()+ctx.IDENTIFIER().getText());
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }

    public Void visitDecIdAsArr(ExampleGrammarParser.DecIdAsArrContext ctx)
    {
        if(!search.containsKey("DecIdAsArr")){
            search.put("DecIdAsArr",new ArrayList<String>());
        }
        search.get("DecIdAsArr").add(ctx.getText());
        System.out.println("DecIdAsArr");
        System.out.println(ctx.DEC().getText()+ctx.IDENTIFIER().getText());
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }

    public Void visitAssignStmt(ExampleGrammarParser.AssignStmtContext ctx)
    {
        if(!search.containsKey("AssignStmt")){
            search.put("AssignStmt",new ArrayList<String>());
        }
        search.get("AssignStmt").add(ctx.getText());
        System.out.println("AssignStmt");
        System.out.println(ctx.assignment().getText());
        int n = ctx.getChildCount();
        for(int i =0;i<n;i++)
        {
            visit(ctx.getChild(i));
        }

        return null;
    }






     public Void visitStmt(ExampleGrammarParser.StmtContext ctx)
     {
         if(!search.containsKey("Stmt")){
             search.put("Stmt",new ArrayList<String>());
         }
         search.get("Stmt").add(ctx.getText());
         System.out.println("Stmt");
        // System.out.println(ctx.assignStmt().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitUnknownId(ExampleGrammarParser.UnknownIdContext ctx)
     {
         if(!search.containsKey("UnknownId")){
             search.put("UnknownId",new ArrayList<String>());
         }
         search.get("UnknownId").add(ctx.getText());
         System.out.println("UnknownId");
         System.out.println(ctx.IDENTIFIER().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }
     public Void visitUnknownIdAsArr(ExampleGrammarParser.UnknownIdAsArrContext ctx)
     {
         if(!search.containsKey("UnknownIdAsArr")){
             search.put("UnknownIdAsArr",new ArrayList<String>());
         }
         search.get("UnknownIdAsArr").add(ctx.getText());
         System.out.println("UnknownIdAsArr");
         System.out.println(ctx.IDENTIFIER().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }
     public Void visitUnknownFuncCall(ExampleGrammarParser.UnknownFuncCallContext ctx)
     {
         if(!search.containsKey("UnknownFuncCall")){
             search.put("UnknownFuncCall",new ArrayList<String>());
         }
         search.get("UnknownFuncCall").add(ctx.getText());
         System.out.println("UnknownFuncCall");
         System.out.println(ctx.IDENTIFIER().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }

     public Void visitParenUnknown(ExampleGrammarParser.ParenUnknownContext ctx)
     {
         if(!search.containsKey("ParenUnknown")){
             search.put("ParenUnknown",new ArrayList<String>());
         }
         search.get("ParenUnknown").add(ctx.getText());
         System.out.println("ParenUnknown");
         System.out.println(ctx.unknownExpr().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }







     public Void visitFloat(ExampleGrammarParser.FloatContext ctx)
     {
         if(!search.containsKey("Float")){
             search.put("Float",new ArrayList<String>());
         }
         search.get("Float").add(ctx.getText());
         System.out.println("Float");
         System.out.println(ctx.FLOAT().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitFloatUnknown(ExampleGrammarParser.FloatUnknownContext ctx)
     {
         if(!search.containsKey("FloatUnknown")){
             search.put("FloatUnknown",new ArrayList<String>());
         }
         search.get("FloatUnknown").add(ctx.getText());
         System.out.println("FloatUnknown");
         System.out.println(ctx.unknownExpr().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitParenFloat(ExampleGrammarParser.ParenFloatContext ctx)
     {
         if(!search.containsKey("ParenFloat")){
             search.put("ParenFloat",new ArrayList<String>());
         }
         search.get("ParenFloat").add(ctx.getText());
         System.out.println("ParenFloat");
         System.out.println(ctx.floatExpr().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitInt(ExampleGrammarParser.IntContext ctx)
     {
         if(!search.containsKey("Int")){
             search.put("Int",new ArrayList<String>());
         }
         search.get("Int").add(ctx.getText());
         System.out.println("Int");
         System.out.println(ctx.INT().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitFloatArith(ExampleGrammarParser.FloatArithContext ctx)
     {
         if(!search.containsKey("FloatArith")){
             search.put("FloatArith",new ArrayList<String>());
         }
         search.get("FloatArith").add(ctx.getText());
         System.out.println("FloatArith");
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitBoolExprFloatOp(ExampleGrammarParser.BoolExprFloatOpContext ctx)
     {
         if(!search.containsKey("BoolExprFloatOp")){
             search.put("BoolExprFloatOp",new ArrayList<String>());
         }
         search.get("BoolExprFloatOp").add(ctx.getText());
         System.out.println("BoolExprFloatOp");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitParenBoolExpr(ExampleGrammarParser.ParenBoolExprContext ctx)
     {
         if(!search.containsKey("ParenBoolExpr")){
             search.put("ParenBoolExpr",new ArrayList<String>());
         }
         search.get("ParenBoolExpr").add(ctx.getText());
         System.out.println("ParenBoolExpr");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitBoolExprBoolOp(ExampleGrammarParser.BoolExprBoolOpContext ctx)
     {
         if(!search.containsKey("ParenBoolExpr")){
             search.put("ParenBoolExpr",new ArrayList<String>());
         }
         search.get("ParenBoolExpr").add(ctx.getText());
         System.out.println("BoolExprBoolOp");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }

     public Void visitNotBoolExpr(ExampleGrammarParser.NotBoolExprContext ctx)
     {
         if(!search.containsKey("NotBoolExpr")){
             search.put("NotBoolExpr",new ArrayList<String>());
         }
         search.get("NotBoolExpr").add(ctx.getText());
         System.out.println("NotBoolExpr");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }

     public Void visitBoolUnknown(ExampleGrammarParser.BoolUnknownContext ctx)
     {
         if(!search.containsKey("BoolUnknown")){
             search.put("BoolUnknown",new ArrayList<String>());
         }
         search.get("BoolUnknown").add(ctx.getText());
         System.out.println("BoolUnknown");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitBoolExprFalse(ExampleGrammarParser.BoolExprFalseContext ctx)
     {
         if(!search.containsKey("BoolExprFalse")){
             search.put("BoolExprFalse",new ArrayList<String>());
         }
         search.get("BoolExprFalse").add(ctx.getText());
         System.out.println("BoolExprFalse");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }

     public Void visitBoolExprTrue(ExampleGrammarParser.BoolExprTrueContext ctx)
     {
         if(!search.containsKey("BoolExprTrue")){
             search.put("BoolExprTrue",new ArrayList<String>());
         }
         search.get("BoolExprTrue").add(ctx.getText());
         System.out.println("BoolExprTrue");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }

     public Void visitStr(ExampleGrammarParser.StrContext ctx)
     {
         if(!search.containsKey("Str")){
             search.put("Str",new ArrayList<String>());
         }
         search.get("Str").add(ctx.getText());
         System.out.println("Str");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitParenStr(ExampleGrammarParser.ParenStrContext ctx)
     {
         if(!search.containsKey("ParenStr")){
             search.put("ParenStr",new ArrayList<String>());
         }
         search.get("ParenStr").add(ctx.getText());
         System.out.println("ParenStr");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }

     public Void visitStrCat(ExampleGrammarParser.StrCatContext ctx)
     {
         if(!search.containsKey("StrCat")){
             search.put("StrCat",new ArrayList<String>());
         }
         search.get("StrCat").add(ctx.getText());
         System.out.println("StrCat");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }


     public Void visitStrUnknown(ExampleGrammarParser.StrUnknownContext ctx)
     {
         if(!search.containsKey("StrUnknown")){
             search.put("StrUnknown",new ArrayList<String>());
         }
         search.get("StrUnknown").add(ctx.getText());
         System.out.println("StrUnknown");
         //System.out.println(ctx.assignment().getText());
         int n = ctx.getChildCount();
         for(int i =0;i<n;i++)
         {
             visit(ctx.getChild(i));
         }

         return null;
     }

}
