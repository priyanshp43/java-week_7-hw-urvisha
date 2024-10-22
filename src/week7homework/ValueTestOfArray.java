package week7homework;

import java.util.Scanner;

/**
 * Program to test if an array contains a specific value.
 */

public class ValueTestOfArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value to search for
        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        // Variable to track if the value is found
        boolean found = false;

        // Loop through the array to check for the target value
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("The array contains the value " + target + ".");
        } else {
            System.out.println("The array does not contain the value " + target + ".");
        }

        // Close the scanner
        scanner.close();

    }
}
