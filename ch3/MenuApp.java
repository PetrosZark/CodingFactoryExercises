package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Generates a menu that gives the user
 * choices, checks for error inputs and
 * exits if the user chooses to.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω ή 5 για έξοδο");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Επιτυχής Εισαγωγή\n");
            } else if (choice == 2) {
                System.out.println("Επιτυχής Διαγραφή\n");
            } else if (choice == 3) {
                System.out.println("Επιτυχής Ενημέρωση\n");
            } else if (choice == 4) {
                System.out.println("Επιτυχής Αναζήτηση\n");
            } else if (choice == 5) {
                System.out.println("Επιλέξατε Έξοδο");
            } else {
                System.out.println("Λάθος επιλογή\n");
            }
        } while (choice !=5);

        System.out.println("Goodbye");
    }
}
