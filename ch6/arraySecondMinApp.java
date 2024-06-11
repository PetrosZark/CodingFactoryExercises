package gr.aueb.cf.ch6;

public class arraySecondMinApp {
    /**
     * Returns the second smallest value in a source array
     * @param arr       the source array
     * @param low       the starting position in the array
     * @param high      the ending position in the array
     * @return          the position in the array containing the maximum value
     */
    public static int getSecondMinPosition(int[] arr, int low, int high) {
        int minValue;
        int secondMinValue = 0;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array dimensions");
            return -1;
        }

        minValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] < minValue) {
                secondMinValue = minValue;
                minValue = arr[i];
            }
        }

        return secondMinValue;
    }
}
