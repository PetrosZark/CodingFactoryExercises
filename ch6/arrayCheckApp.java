package gr.aueb.cf.ch6;

/**
 * An app with methods to check an array
 */
public class arrayCheckApp {
    public static void main(String[] args) {
        int[] arr= {2, 34, 56, 3, 48, 900, 201, 235, 754, 462, 7284, 22};
        int position = -1;
        int doubleArray[] = new int[arr.length];
        boolean evenExists;
        boolean allEvens;

        position = getItem(arr, 900);
        System.out.println(position + 1);

        printEvens(arr);
        System.out.println();

        doubleArray = getDoubleMapping(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();

        evenExists = getIfEvenExists(arr);
        System.out.println("An even number exists in the array: " + evenExists);

        allEvens = getIfAllEvens(arr);
        System.out.println("All the array's items are even numbers: " + allEvens);
    }

    /**
     * Finds the position of an item in an array
     * @param arr       the array to search
     * @param item      the item to search
     * @return          the position of the item
     */
    public static int getItem(int[] arr, int item) {
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                position = i;
            }
        }

        return position;
    }

    /**
     * Prints the even numbers in an array
     * @param arr       the array to search
     */
    public static void printEvens(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Doubles the values of an array
     * @param arr       the array to double
     * @return          a new array with the double values of the first array
     */
    public static int[] getDoubleMapping(int[] arr) {
        int [] doubleArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubleArray[i] = arr[i] * 2;
        }

        return doubleArray;
    }

    /**
     * Checks an array for even values
     * @param arr       the array to check
     * @return          a boolean to show if there are even values
     */
    public static boolean getIfEvenExists(int[] arr) {
        boolean evenExists = false;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                evenExists = true;
                break;
            }
        }

        return evenExists;
    }

    /**
     * Checks if all values in an array are even
     * @param arr       the array to check
     * @return          a boolean to show if all values in an array are even
     */
    public static boolean getIfAllEvens(int[] arr) {
        boolean allEvens = true;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                allEvens = false;
                break;
            }
        }

        return allEvens;
    }
}
