package gr.aueb.cf.ch4;

import java.util.Scanner;

public class ReverseTriangleStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please insert a number");
        stars = in.nextInt();

        for (int i = stars; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
