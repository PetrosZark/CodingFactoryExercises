package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User inputs a year and the program
 * finds if it is a leap year or not.
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        do {
            System.out.println("Please enter a year except year 0:");
            year = in.nextInt();
        } while (year == 0);

        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + "is not a leap year.");
        }
    }
}
