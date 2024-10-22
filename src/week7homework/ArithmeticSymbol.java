package week7homework;

import java.util.Scanner;

/**
 * program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 *  (using if else)
 */


public class ArithmeticSymbol {
    public static void main(String[] args) {


        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to enter a symbol
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform the calculation based on the operator
        double result;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("The result is: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("The result is: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("The result is: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator.");
    }

    // Close the scanner
        scanner.close();
}
    }


