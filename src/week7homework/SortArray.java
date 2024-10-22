package week7homework;

import java.util.Arrays;

/**
 * Program to sort a numeric array and a string array.
 */

public class SortArray {
    public static void main(String[] args) {
        // Numeric array
        int[] numArray = {5, 2, 8, 3, 1};
        // String array
        String[] strArray = {"banana", "apple", "cherry", "date"};

        // Sort the numeric array
        Arrays.sort(numArray);
        // Sort the string array
        Arrays.sort(strArray);

        // Print the sorted numeric array
        System.out.println("Sorted numeric array: " + Arrays.toString(numArray));
        // Print the sorted string array
        System.out.println("Sorted string array: " + Arrays.toString(strArray));
    }

}
