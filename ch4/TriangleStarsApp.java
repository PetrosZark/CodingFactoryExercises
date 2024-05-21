package gr.aueb.cf.ch4;

import java.util.Scanner;

public class TriangleStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please insert a number");
        stars = in.nextInt();

        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
