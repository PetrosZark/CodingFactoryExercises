package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts user's temperature input in Farenheit
 * to Celsius
 */
public class TemperatureConverterApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int farenheit = 0;

        System.out.println("Please enter temperature in Farenheit:");
        farenheit = in.nextInt();
        celsius = 5 * (farenheit - 32) / 9;

        System.out.println("the temperature in Celsius is:" + celsius);
    }
}
