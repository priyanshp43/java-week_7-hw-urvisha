package week7homework;

import java.util.Scanner;

/**
 *  Program to input any year like (ex.2007) and find out if it is leap year or
       not?
 */


public class LeapYear {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        //Ask user to enter a year in number
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        // Checks if the year is leap year or not
        boolean isLeapYear = (year %4 == 0) &&  (year % 100 != 0) || (year % 400 == 0);

        // Print the result
        if(isLeapYear){
            System.out.println( year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }


        // Close the scanner
        scanner.close();
    }


}
