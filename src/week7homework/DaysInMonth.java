package week7homework;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 */
public class DaysInMonth {
    // Method to check if year is  a leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //Method to get the number of a days in a month for a given year
    public static int DaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10:  // October
            case 12:  // December
                return 31;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11:  // November
                return 30;

            case 2:  // Febuary
                return isLeapYear(year) ? 29 : 28 ;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        //Test the isLeapYear method
        System.out.println(isLeapYear(-1600));// false
        System.out.println(isLeapYear(1600));// true
        System.out.println(isLeapYear(2017));// false
        System.out.println(isLeapYear(2000));// true

        // Test the DaysInMonth method
        System.out.println(DaysInMonth(1 , 2020)); // 31
        System.out.println(DaysInMonth(2 , 2020)); //29
        System.out.println(DaysInMonth(2 , 2018)); //28
        System.out.println(DaysInMonth(-1 , 2020)); //-1
        System.out.println(DaysInMonth(1 , -2020));  //-1



    }

}
