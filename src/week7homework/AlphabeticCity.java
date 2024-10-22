package week7homework;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class AlphabeticCity {

    public static void main(String[] args) {


        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an alphabet
        System.out.println("Enter an alphabet (A-F): ");
        char alphabet = scanner.next().charAt(0);

        // Determine and print the corresponding city name
        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("A is for Amsterdam");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("B is for Barcelona");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("C is for Chicago");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("D is for Dubai");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("E is for Edinburgh");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("F is for Florence");
        } else {
            System.out.println("Invalid entry");
        }

        // Close the scanner
        scanner.close();
    }


}
