package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Encrypts a string
 */
public class encryptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string to encrypt: ");
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int) c;
            ascii +=1;
            System.out.print((char)ascii);
        }
    }
}
