package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Prints a menu for the user to choose from,
 * exits if the user enters 5 and checks for
 * invalid input.
 */
public class exceptionsApp {

    public static void main(String[] args) {
        int choice = 0;

        while (true) {
            printMenu();
            choice = getChoice(choice);

            try {
                printChoice(choice);
                if (choice == 5) {
                    System.out.println("Bye");
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Enter a choice between 1 and 5");
                System.out.println();
            }
        }

    }

    /**
     * Prints a menu
     */
    public static void printMenu () {
        System.out.println("1. Choice 1");
        System.out.println("2. Choice 2");
        System.out.println("3. Choice 3");
        System.out.println("4. Choice 4");
        System.out.println("5. Exit");
    }

    /**
     * Gets the user's choice and checks if
     * it is valid
     * @param choice    the user's choice
     * @return          valid choice
     */
    public static int getChoice (int choice){
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your choice: ");

            if (in.hasNextInt()) {
                choice = in.nextInt();
                break;
            } else {
                System.out.println("Please enter an int: ");
                in.nextLine();
            }
        }
        return choice;
    }

    /**
     * Prints a response depending on the
     * user's choice
     * @param choice    the user's choice
     * @throws IllegalArgumentException  if
     * the choice is not between 1 and 5
     */
    public static void printChoice ( int choice) throws IllegalArgumentException {
        switch (choice) {
            case 1:
                System.out.println("You chose 1. Choice 1");
                System.out.println();
                break;
            case 2:
                System.out.println("You chose 2. Choice 2");
                System.out.println();
                break;
            case 3:
                System.out.println("You chose 3. Choice 3");
                System.out.println();
                break;
            case 4:
                System.out.println("You chose 4. Choice 4");
                System.out.println();
                break;
            case 5:
                System.out.println("You chose exit...");
                System.out.println();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}






