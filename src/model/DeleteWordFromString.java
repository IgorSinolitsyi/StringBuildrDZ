package model;

import utils.Setting;

public class DeleteWordFromString {
    public static String deleteWordFromString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        int indexWordStart = stringBuilder.indexOf(Setting.DEL_WORD_HARD, 0);

        if (indexWordStart == 0) {
            stringBuilder.delete(indexWordStart + Setting.SEPAR_STR.length(), indexWordStart + Setting.DEL_WORD_HARD.length());
            indexWordStart = stringBuilder.indexOf(Setting.DEL_WORD_HARD, indexWordStart + Setting.DEL_WORD_HARD.length());
        }

        while (indexWordStart != -1) {
            stringBuilder.delete(indexWordStart - Setting.SEPAR_STR.length(), indexWordStart + Setting.DEL_WORD_HARD.length());
            indexWordStart = stringBuilder.indexOf(Setting.DEL_WORD_HARD, indexWordStart + Setting.DEL_WORD_HARD.length());
        }
        return stringBuilder.toString();
    }
}
