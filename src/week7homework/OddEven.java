package week7homework;

/**
 * Program that tells us that Input number is odd or even?
 * Used ternary operator (? :)
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Cteate a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("Enter a number");
        int number=scanner.nextInt();

        // Determine if the number is odd or even
        String result = (number %2 == 0) ? "even" : "odd" ;

        // Print the result with concatination
        System.out.println("The number " + number + " is " + result + ".");

        // Close the scanner
        scanner.close();

    }
}
