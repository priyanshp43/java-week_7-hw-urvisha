package week7homework;

/**
 *Program to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print a salary slip in format.
 */

import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Input Employee details
        System.out.println("Enter Employee ID: ");
        int employeeID = scanner.nextInt();

        System.out.println("Enter Employee Name: ");
        scanner.nextLine(); // Consume the nextline character
        String employeeName = scanner.nextLine();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // CAlculate HRA,DA,TA,PF and Gross Salary
        double HRA = basicSalary * 0.10;
        double DA = basicSalary * 0.08 ;
        double TA = basicSalary * 0.09 ;
        double PF = basicSalary * 0.20;
        double grossSalary = basicSalary + HRA + DA + TA - PF;

        // Print the salary slip

        System.out.println("_______________________________");
        System.out.println("| Salary Slip                  |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id   : " + employeeID + "            |");
        System.out.println("| Employee Name : " + employeeName + "         |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary  : " + basicSalary + "         |");
        System.out.println("| HRA 10%       : " + HRA + "          |");
        System.out.println("| DA 8%         : " + DA + "          |");
        System.out.println("| TA 9%         : " + TA + "          |");
        System.out.println("| PF - 20%      : " + PF + "          |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary  : " + grossSalary + "        |");
        System.out.println("|==============================|");
        }


}
