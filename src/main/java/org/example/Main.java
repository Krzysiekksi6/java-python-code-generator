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
import org.example.io.DataReader;
import org.example.parsers.JavaLikeParser;
import org.example.parsers.PythonLikeParser;

import java.io.IOException;

import static org.example.functions.GenJava.GenJava;
import static org.example.functions.GenPython.GenPython;

/**
 * The Code Parser program implements an application that
 * generate Java and Python code from patterns
 *
 * @author  Kacper Dworak
 * @author  Daniel Sikora
 * @author  Krzysztof Ksiazek
 * @version 4.20
 * @since   2023-02-27
 */
public class Main {
    public static void main(String[] arg) throws IOException {
        final int EXIT = 0;
        final int JAVA = 1;
        final int PYTHON = 2;
        DataReader dataReader = new DataReader();

        int option;
        do {
            printOptions();
            option = dataReader.getInt();

            System.out.println("\n\n\n\n");
            switch (option) {
                case JAVA -> {

                    GenJava(null);
                }
                case PYTHON -> {
                    GenPython(null);
                }

                case EXIT -> {
                    dataReader.close();
                    System.out.println("Bye, Bye!");
                }
                default -> System.out.println("Not valid language!");
            }
            System.out.println("\n\n\n\n");
        }while(option != EXIT);


    }

    private static void printOptions() {
        System.out.println("Select options: ");
        System.out.println("1 -> Java");
        System.out.println("2 -> Python");
        System.out.println("0 -> Exit");
    }


}
