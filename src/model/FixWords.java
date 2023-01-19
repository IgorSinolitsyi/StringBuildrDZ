package model;

public class FixWords {
    public static String fixWords(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.replace(0, 1, "o");
        stringBuilder.replace(25, 26, "o");
        return stringBuilder.toString();
    }
}
