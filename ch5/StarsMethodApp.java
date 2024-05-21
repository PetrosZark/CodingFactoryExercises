package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * User enters a number of stars and
 * chooses from a menu how the stars
 * will be displayed
 */
public class StarsMethodApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int stars = 0;

        do {
            printMenu();
            choice = in.nextInt();

            if (choice < 1 || choice > 6){
                System.out.println("Λάθος Επιλογή");
                continue;
            }

            switch (choice) {
                case 1:
                    stars = getUserChoice();
                    horizontal(stars);
                    System.out.println();
                    break;
                case 2:
                    stars = getUserChoice();
                    vertical(stars);
                    System.out.println();
                    break;
                case 3:
                    stars = getUserChoice();
                    square(stars);
                    System.out.println();
                    break;
                case 4:
                    stars = getUserChoice();
                    triangle(stars);
                    System.out.println();
                    break;
                case 5:
                    stars = getUserChoice();
                    reverseTriangle(stars);
                    System.out.println();
                    break;
                default:
                    System.out.println("Επιλέξατε έξοδο.");
            }

        } while (choice != 6);
        System.out.println("Bye");
    }


    /**
     * Prints a menu
     */
    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }

    /**
     * Prints stars horizontally
     *
     * @param n  the number of stars
     */
    public static void horizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    /**
     * Prints stars vertically
     *
     * @param n  the number of stars
     */
    public static void vertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Prints stars in a square shape
     *
     * @param n  the number of stars in
     *           each side of the square
     */
    public static void square(int n) {
        for (int i = 1; i <= n; i++) {
            horizontal(n);
            System.out.println();
        }
    }

    /**
     * Prints stars in a triangle shape
     *
     * @param n  the number of stars that
     *           consist the height of the
     *           triangle
     */
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            horizontal(i);
            System.out.println();
        }
    }

    /**
     * Prints stars in a reverse triangle shape
     *
     * @param n  the number of stars that
     *           consist the height of the
     *           triangle
     */
    public static void reverseTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            horizontal(n - i);
            System.out.println();
        }

    }

    /**
     * Prints a message for the user and
     * asks for input
     *
     * @return  the user's input
     */
    public static int getUserChoice() {
        System.out.println("Παρακαλώ εισάγετε αριθμό αστεριών:");
        return in.nextInt();
    }
}
