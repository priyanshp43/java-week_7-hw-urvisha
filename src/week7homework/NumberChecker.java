package week7homework;

import java.util.Scanner;

/**
 * Program to check if enter number is “POSITIVE”, “NEGATIVE” or
    “ZERO”
 */
public class NumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number " + number + " is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

        // Close the scanner
        scanner.close();
    }
}
