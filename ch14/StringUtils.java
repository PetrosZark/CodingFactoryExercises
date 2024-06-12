package gr.aueb.cf.ch14;
import java.lang.String;


public class StringUtils {

    public static String reverseString(String string) {
        if (string == null) {
            throw new IllegalArgumentException("String is null");
        }
        StringBuilder string1 = new StringBuilder();
        string1.append(string);
        string1.reverse();
        return string1.toString();
    }

    public static String stringToUppercase(String string) {
        if (string == null) {
            throw new IllegalArgumentException("String is null");
        }
        string.toUpperCase();
        return string;
    }

    public static boolean isPalindrome(String string) {
        boolean isPalindrome = false;
        StringBuilder string1 = new StringBuilder();

        if (string == null) {
            throw new IllegalArgumentException("String is null");
        }

        string1.append(string);


        if (string.equals(string1.reverse().toString())) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
