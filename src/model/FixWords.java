package model;

import utils.Setting;

public class FixWords {
    public static String fixWords(String inputString) {

        StringBuilder stringBuilder = new StringBuilder(inputString);
        int indexOfBrange = stringBuilder.indexOf("brange", 0);
        stringBuilder.replace(indexOfBrange, indexOfBrange+"orange".length(), "orange");
        int indexOfOnibn = stringBuilder.indexOf("onibn", 0);
        stringBuilder.replace(indexOfOnibn, indexOfOnibn+"onion".length(), "onion");
        return stringBuilder.toString();
    }
}
