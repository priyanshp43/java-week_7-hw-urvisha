package week7homework;

/**
 * Program to calculate the average value of array elements.
 */

public class AverageOfArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array and add each value to the sum
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the average
        System.out.println("The average value of the array elements is: " + average);

    }
}
