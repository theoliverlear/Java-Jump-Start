package org.theoliverlear.learn.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RatingInput {
    //------------------------Built-In-Exceptions-----------------------------
    public static void builtInExceptions() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a rating between 1 and 5: ");
            int rating = scanner.nextInt();
            System.out.println("Your rating is: " + rating);
        } catch (NumberFormatException | InputMismatchException exception) {
            System.err.println("Invalid input. Please enter a number between 1 and 5.");
        }
    }
    //-------------------------Custom-Exceptions------------------------------
    public static void customExceptions() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a rating between 1 and 5: ");
            int rating = scanner.nextInt();
            if (rating < 1 || rating > 5) {
                throw new RatingOutOfBounds();
            }
            System.out.println("Your rating is: " + rating);
        } catch (RatingOutOfBounds exception) {
            System.err.println(exception.getMessage());
        } catch (NumberFormatException | InputMismatchException exception) {
            System.err.println("Invalid input. Please enter a number between 1 and 5.");
        }
    }
    //------------------------------Hack-Me-----------------------------------
    public static void hackMe() throws HackingAttemptException {
        // Empty body, we're nice programmers.
    }
    //------------------------Protect-My-Computer-----------------------------
    public static void protectMyComputer() {
        try {
            hackMe();
        } catch (HackingAttemptException exception) {
            System.err.println("Hacking attempt detected! " + exception.getMessage());
        } finally {
            System.out.println("System is safe.");
        }
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        builtInExceptions();
        customExceptions();
        protectMyComputer();
    }
}
