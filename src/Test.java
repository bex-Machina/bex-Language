/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
// import ANTLR's runtime libraries

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;
import java.util.Scanner;

public class Test {
    private static String INPUT;
    private static String SEARCH;

    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input

        //System.out.println("\n Input your language: ");
        String INPUT = JOptionPane.showInputDialog(null, "Input your language: ");
        InputStream targetStream = new ByteArrayInputStream(INPUT.getBytes());
        String name = JOptionPane.showInputDialog(null, "0: prgm\n" +
                "\n" +
                "1: decl\n" +
                "\n" +
                "2: declArr\n" +
                "\n" +
                "3: param\n" +
                "\n" +
                "4: declFunc\n" +
                "\n" +
                "5: assignment\n" +
                "\n" +
                "6: assignStmt\n" +
                "\n" +
                "7: controlStmt\n" +
                "\n" +
                "8: atomStmt\n" +
                "\n" +
                "9: block\n" +
                "\n" +
                "10: stmt\n" +
                "\n" +
                "11: unknownExpr\n" +
                "\n" +
                "12: exprAll\n" +
                "\n" +
                "13: exprArr\n" +
                "\n" +
                "14: floatExprArr\n" +
                "\n" +
                "15: boolExprArr\n" +
                "\n" +
                "16: stringExprArr\n" +
                "\n" +
                "17: expr\n" +
                "\n" +
                "18: floatExpr\n" +
                "\n" +
                "19: boolExpr\n" +
                "\n" +
                "20: stringExpr");

        // create a CharStream that reads from standard input
        //String name = JOptionPane.showInputDialog("Enter your desired search argument: ");
        CharStream input = CharStreams.fromStream(targetStream);
        //CharStream input = CharStreams.fromStream(System.in);


        // create a lexer that feeds off of input CharStream
        ExampleGrammarLexer lexer = new ExampleGrammarLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ExampleGrammarParser parser = new ExampleGrammarParser(tokens);

        ParseTree tree = parser.prgm(); // begin parsing at prgm rule

        Worker worker = new Worker();
        Workers workers = new Workers();
        System.out.println("this the output showing the tree/printing the tree");
        workers.visit(tree);

        System.out.println("this the output from the compiler/ this is the java script that was translated");
        System.out.println(worker.visit(tree).render());


        System.out.println("this the output to what you searched");

        workers.searchRule(name);

        //STGroup group = new STGroupFile("./JavaScript.stg");

        //ST st  = group.getInstanceOf("declFunc");



        //st.add("id","a");

        //st.add("params","a");
        //st.add("params","b");
        //st.add("block","{}");

        //st.add("expr2",7);

        //System.out.println(st.render());
    }
}