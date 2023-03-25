package org.example;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;
import org.example.gen.JavaLexer;
import org.example.gen.JavaParser;
import org.example.gen.PythonLexer;
import org.example.gen.PythonParser;
import org.example.parsers.JavaLikeParser;
import org.example.parsers.PythonLikeParser;

import java.io.IOException;
/**
 * The Code Parser program implements an application that
 * generate Java and Python code from patterns
 *
 * @author  Kacper Dworak
 * @author  Daniel Sikora
 * @author  Krzysztof Ksiazek
 * @version 10.12
 * @since   2023-02-27
 */
public class Main {
    public static void main(String[] arg) throws IOException {
        /**
         * Generate JAVA code
         *
         */
        CharStream in = CharStreams.fromFileName("src/INPUT_JAVA.cc");
        String split [] = in.toString().split("[(]",2);

        JavaLexer lexer = new JavaLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree;
        switch (split[0]){
            case "Seq":
                tree = parser.seq();
                break;
            case "Branch":
                tree = parser.branch();
                break;
            case "Concur":
                tree = parser.concur();
                break;
            case "Cond":
                tree = parser.cond();
                break;
            case "Para":
                tree = parser.para();
                break;
            case "Loop":
                tree = parser.loop();
                break;
            case "Choice":
                tree = parser.choice();
                break;
            case "SeqSeq":
                tree = parser.seqSeq();
                break;
            case "Repeat":
                tree = parser.repeat();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + split[0]);
        }
        ParseTreeWalker javaWalker = new ParseTreeWalker();
        JavaLikeParser listener = new JavaLikeParser();
        javaWalker.walk(listener, tree);




//        CharStream inp = CharStreams.fromFileName("src/INPUT_PYTHON.cc");
//        PythonLexer lexerPython = new PythonLexer(inp);
//        CommonTokenStream tokensPython = new CommonTokenStream(lexerPython);
//        PythonParser parserPython = new PythonParser(tokensPython);
//        ParseTree treePython = parserPython.cond();
//        ParseTreeWalker walkerPython = new ParseTreeWalker();
//        PythonLikeParser listenerPython = new PythonLikeParser();
//        walkerPython.walk(listenerPython, treePython);


    }

}
