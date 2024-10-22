package week7homework;

/**
 * Program of input sales id, seller's name, sales amount, and salary basic and
   then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales ID , Saller's name , Sales amount  and Basic salary
        System.out.println("Enter Sales ID: ");
        int salesID = scanner.nextInt();

        System.out.println("Enter Saller's Name: ");
        scanner.nextLine();  // Consume the newline character
        String sellerName =  scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate the sales commission
        double commission;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Print the details
        System.out.println("_______________________________");
        System.out.println("|        Sales Slip           |");
        System.out.println("|______________________________|");
        System.out.println("| Sales ID       : " + salesID + "            |");
        System.out.println("| Seller's Name  : " + sellerName + "         |");
        System.out.println("|______________________________|");
        System.out.println("| Sales Amount   : " + salesAmount + "       |");
        System.out.println("| Basic Salary   : " + basicSalary + "       |");
        System.out.println("| Commission     : " + commission + "       |");



    }

}
