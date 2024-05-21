package gr.aueb.cf.ch6;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Finds the maximum number of cars in a
 * parking lot depending on their arrival
 * and departure times in a 2D array.
 */
public class carApp {

    public static void main(String[] args) {
        int[][] arr = { {1012, 1136}, {1317, 1417}, {1015, 1020} };
        int[][] arr2 = new int[6][2];
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[2 * i + j][0] = arr[i][j];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) {
                arr2[i][1] = 1;
            } else arr2[i][1] = 0;
        }

        Arrays.sort(arr2, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i][1] == 1) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                }
            } else count--;
        }

        System.out.println("Max cars: " + maxcount);



    }
}


