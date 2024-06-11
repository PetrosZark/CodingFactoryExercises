package gr.aueb.cf.ch6;

import java.util.Scanner;
/**
 * An app that checks an array that a user creates.
 */
public class userArrayCheckApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        boolean correctInput = true;
        boolean moreThanThreeEvens;
        boolean moreThanThreeOdds;
        boolean moreThanThreeConsecutive;
        boolean moreThanThreeSameEndings;
        boolean moreThanThreeSameStarts;
        

        System.out.println("Please enter 6 ints between 1 and 49: ");
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        arr[2] = in.nextInt();
        arr[3] = in.nextInt();
        arr[4] = in.nextInt();
        arr[5] = in.nextInt();


        for (int item : arr) {
            if (item < 1 || item > 49) {
                System.out.println("Wrong values...");
                correctInput = false;
                break;
            }
        }

        if (correctInput == true) {
            moreThanThreeEvens = moreThanThreeEvens(arr);
            System.out.println("More than three even values: " + moreThanThreeEvens);

            moreThanThreeOdds = moreThanThreeOdds(arr);
            System.out.println("More than three odd values: " + moreThanThreeOdds);

            moreThanThreeConsecutive = moreThanThreeConsecutive(arr);
            System.out.println("More than three consecutive values: " + moreThanThreeConsecutive);

            moreThanThreeSameEndings = moreThanThreeSameEndings(arr);
            System.out.println("More than three values with same ending: " + moreThanThreeSameEndings);

            moreThanThreeSameStarts = moreThanThreeSameStarts(arr);
            System.out.println("More than three values with the same starting number: " + moreThanThreeSameStarts);
        }
    }

    /**
     * Checks if an array contains more than three even values.
     * @param arr       the array to check.
     * @return          true if the array contains more than three
     *                  even values.
     */
    public  static boolean moreThanThreeEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens > 3;
    }

   /**
    * Checks if an array contains more than three odd values
    * @param arr       the array to check.
    * @return          true if the array contains more than three
    *                  odd values.
    */
    public  static boolean moreThanThreeOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds > 3;
    }

    /**
     * Checks if an array contains more than three consecutive
     * values.
     * @param arr       the array to check.
     * @return          true if the array contains more than three
     *                  consecutive values.
     */
    public static boolean moreThanThreeConsecutive(int[] arr) {
        if (arr == null) return false;
        int cons = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i + 1] - 1) && (arr[i] == arr[i + 2] - 2)) {
                cons++;
            }
        }
        return cons >= 1;
    }

    /**
     * Checks if an array contains more than three values
     * with the same ending.
     * @param arr       the array to check.
     * @return          true if the array contains more than three
     *                  values with the same ending.
     */
    public static boolean moreThanThreeSameEndings(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;
    }

    /**
     * Checks if an array contains more than three odd values.
     * @param arr       the array to check.
     * @return          true if the array contains more than three
     *                  values that start with the same number.
     */

    public static boolean moreThanThreeSameStarts(int[] arr) {
        if (arr == null) return false;
        int[] starts = new int[10];
        boolean hasSameStarts = false;

        for (int item : arr) {
            starts[item / 10]++;
        }

        for (int item : starts) {
            if (item >= 3) {
                hasSameStarts = true;
                break;
            }
        }
        return hasSameStarts;
    }

}
