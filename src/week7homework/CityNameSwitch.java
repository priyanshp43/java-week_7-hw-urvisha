package week7homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * Used Switch statement
 */


public class CityNameSwitch {
    public static void main(String[] args) {
        {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter an alphabet
            System.out.print("Enter an alphabet (A-F): ");
            char alphabet = scanner.next().charAt(0);

            // Determine and print the corresponding city name using a switch statement
            switch (alphabet) {
                case 'A':
                case 'a':
                    System.out.println("A is for Amsterdam");
                    break;
                case 'B':
                case 'b':

                    System.out.println("B is for Barcelona");
                    break;
                case 'C':
                case 'c':
                    System.out.println("C is for Chicago");
                    break;
                case 'D':
                case 'd':
                    System.out.println("D is for Dubai");
                    break;
                case 'E':
                case 'e':
                    System.out.println("E is for Edinburgh");
                    break;
                case 'F':
                case 'f':
                    System.out.println("F is for Florence");
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }

            // Close the scanner
            scanner.close();
        }

        }

    }

