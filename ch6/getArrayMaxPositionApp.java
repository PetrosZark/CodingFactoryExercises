package gr.aueb.cf.ch6;

public class getArrayMaxPositionApp {
    /**
     * Returns the position of the max value in a source array
     * @param arr       the source array
     * @param low       the starting position in the array
     * @param high      the ending position in the array
     * @return          the position in the array containing the maximum value
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array dimensions");
            return -1;
        }

        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}
