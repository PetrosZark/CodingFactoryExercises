package gr.aueb.cf.ch6;

/**
 * Checks an array for a given key and
 * returns the lowest position and the highest
 * position of the key if the array contains
 * more than one
 */
public class arrayIndexApp {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 7;

        int[] result = getLowAndHighIndexOf(arr, key);
        System.out.println("Low : " + result[0]);
        System.out.println("High : " + result[1]);
    }

    /**
     * Finds the min and max position of an int in
     * an array
     * @param arr   the array to search
     * @param key   the int to search for
     * @return      an array with the min and max
     *              position of the key
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = -1;
        int high = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                low = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = 0;
        end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                high = mid;
                start = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        } return new int[] {low, high};
    }

}

