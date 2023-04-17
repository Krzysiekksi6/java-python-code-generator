package org.example;
import org.example.io.DataReader;
import java.io.IOException;
import java.util.Scanner;

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

            System.out.println("\n");
            System.out.print("Enter UUID: ");
            switch (option) {
                case JAVA -> {
                    Scanner scanner = new Scanner(System.in);
                    String UUID = scanner.nextLine();
                    System.out.print("\n");
                    GenJava(null,UUID);

                }
                case PYTHON -> {
                    Scanner scanner = new Scanner(System.in);
                    String UUID = scanner.nextLine();
                    System.out.print("\n");
                    GenPython(null,UUID);

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