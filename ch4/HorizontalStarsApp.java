package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Prints a number of horizontal stars
 * given by the user
 */
public class HorizontalStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please insert a number");
        stars = in.nextInt();

        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }
}
