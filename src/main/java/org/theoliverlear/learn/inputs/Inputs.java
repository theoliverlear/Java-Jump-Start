package org.theoliverlear.learn.inputs;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Inputs {
    //============================-Variables-=================================
    static final String DIVIDER = "-".repeat(50);
    //===============================-Main-===================================
    public static void main(String[] args) throws IOException {
        //----------------------Input-From-User-------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(DIVIDER);
        //----------------------Input-From-File-------------------------------
        String filePath = "src/main/java/org/theoliverlear/complete/inputs/movies.txt";
        Scanner fileScanner = new Scanner(Path.of(filePath));
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
    }
}
