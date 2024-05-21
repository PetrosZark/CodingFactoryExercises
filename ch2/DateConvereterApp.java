package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts user's date input to
 * DD/MM/YY format
 */
public class DateConvereterApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please enter date:");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        year %= 100;

        System.out.printf("%02d/%02d/%d", day, month, year);
    }
}
