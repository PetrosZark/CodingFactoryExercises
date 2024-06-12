package gr.aueb.cf.ch14;

public class MathHelper {

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array null or empty");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array null or empty");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array null or empty");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
            }
        return (double) sum / array.length;
    }







}
