package gr.aueb.cf.ch14;

public class ValidationUtils {

    public static boolean isValidLength(String string) {
        if (string == null) {
            throw new IllegalArgumentException("String is null");
        }
        int length = string.length();
        return length >= 1 && length <= 31;
    }

    public static boolean isValidNum(int num) {
        return num >= 1 && num <=10;
    }
}
