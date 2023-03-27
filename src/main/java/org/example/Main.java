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
        String language = "Python";
        CharStream in = CharStreams.fromFileName("src/INPUT_JAVA.cc");
        String split [] = in.toString().split("[(]",2);
        switch (language) {
            case "Java" -> {
                /**
                 * Generate JAVA code
                 *
                 */
                JavaLexer lexer = new JavaLexer(in);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                JavaParser parser = new JavaParser(tokens);
                ParseTree tree = switch (split[0]) {
                    case "Seq" -> parser.seq();
                    case "Branch" -> parser.branch();
                    case "Concur" -> parser.concur();
                    case "Cond" -> parser.cond();
                    case "Para" -> parser.para();
                    case "Loop" -> parser.loop();
                    case "Choice" -> parser.choice();
                    case "SeqSeq" -> parser.seqSeq();
                    case "Repeat" -> parser.repeat();
                    default -> throw new IllegalStateException("Unexpected value: " + split[0]);
                };
                ParseTreeWalker javaWalker = new ParseTreeWalker();
                JavaLikeParser listener = new JavaLikeParser();
                javaWalker.walk(listener, tree);
            }
            case "Python" -> {



                PythonLexer lexerPython = new PythonLexer(in);
                CommonTokenStream tokensPython = new CommonTokenStream(lexerPython);
                PythonParser parserPython = new PythonParser(tokensPython);
                ParseTree treePython = switch (split[0]) {
                    case "Seq" -> parserPython.seq();
                    case "Branch" -> parserPython.branch();
                    case "Concur" -> parserPython.concur();
                    case "Cond" -> parserPython.cond();
                    case "Para" -> parserPython.para();
                    case "Loop" -> parserPython.loop();
                    case "Choice" -> parserPython.choice();
                    case "SeqSeq" -> parserPython.seqSeq();
                    case "Repeat" -> parserPython.repeat();
                    default -> throw new IllegalStateException("Unexpected value: " + split[0]);
                };
                ParseTreeWalker walkerPython = new ParseTreeWalker();
                PythonLikeParser listenerPython = new PythonLikeParser();
                walkerPython.walk(listenerPython, treePython);
            }
            default -> System.out.println("Not valid language!");
        }





    }

}
