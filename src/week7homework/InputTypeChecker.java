package week7homework;

/**
 * Program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class InputTypeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        // Check if the input is a digit
        if (Character.isDigit(input)) {
            System.out.println(input + " is a number.");
        }
        // Check if the input is a letter
        else if (Character.isLetter(input)) {
            System.out.println(input + " is an alphabet.");
        }
        // If not a digit or letter, it is a symbol
        else {
            System.out.println(input + " is a symbol.");
        }

        // Close the scanner
        scanner.close();
    }
}

