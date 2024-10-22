package week7homework;

/**
 * Program to sum values of an array.
 */


public class SumOfArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array and add each value to the sum
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum
        System.out.println("The sum of the array values is: " + sum);

    }
}
