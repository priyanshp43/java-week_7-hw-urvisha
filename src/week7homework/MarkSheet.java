package week7homework;

/**
 * java program to input student Name, roll No, and three subjects Math, Science and
   English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
   Input, Marks should between 0 to 100”) and find out total, percentage and result.
   If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
   %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        // Input marks for three subjects and validate input
        System.out.print("Enter Math marks: ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter Science marks: ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }


        System.out.print("Enter English marks: ");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        // Calculate total, percentage, and result
        int total = mathMarks + scienceMarks + englishMarks;
        double percentage = total / 3.0;
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;

        // Determine grade based on percentage
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }

        ;


        // Print the mark sheet
        System.out.println("___________________________________");
        System.out.println("|                                  |");
        System.out.println("|        Mark Sheet                |");
        System.out.println("|__________________________________|");
        System.out.println("| Name          : " + name + "        |");
        System.out.println("| Roll No       : " + rollNo + "      |");
        System.out.println("|__________________________________|");
        System.out.println("| Subjects      : Marks            |");
        System.out.println("|__________________________________|");
        System.out.println("| Math          : " + mathMarks + "   |");
        System.out.println("| Science       : " + scienceMarks + "|");
        System.out.println("| English       : " + englishMarks + "|");
        System.out.println("|__________________________________|");
        System.out.println("| Total         : " + total + "       |");
        System.out.println("|__________________________________|");
        System.out.println("| Percentage    : " + percentage + "  |");
        System.out.println("| Result        : " + result + "      |");
        System.out.println("| Grade         : " + grade + "       |");
        System.out.println("|_____________________________|");

        // Close the scanner
        scanner.close();


    }
}
