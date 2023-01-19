package model;

import utils.Setting;

public class DeleteWordFromString {
    public static String deleteWordFromString(String inputString, String delWord) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        int indexWordStart = stringBuilder.indexOf(delWord, 0);

        if (indexWordStart == 0) {
            stringBuilder.delete(indexWordStart + Setting.SEPAR_STR.length(), indexWordStart + delWord.length());
            indexWordStart = stringBuilder.indexOf(delWord, indexWordStart + delWord.length());
        }

        while (indexWordStart != -1) {
            stringBuilder.delete(indexWordStart - Setting.SEPAR_STR.length(), indexWordStart + delWord.length());
            indexWordStart = stringBuilder.indexOf(delWord, indexWordStart + delWord.length());
        }
        return stringBuilder.toString();
    }
}
