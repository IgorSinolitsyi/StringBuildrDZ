package model;

import utils.Setting;

public class ParsingString {
    public static String parsingString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        int indexWordStart = 0;
        int lineCounter = 1;
        int indexWordEnd = stringBuilder.indexOf(Setting.SEPAR_STR, indexWordStart);

        String outputString = "";
        while (indexWordEnd != -1) {

            outputString = outputString + lineCounter + ". "
                    + stringBuilder.substring(indexWordStart, indexWordEnd).trim() + "\n";
            lineCounter = ++lineCounter;
            indexWordStart = indexWordEnd + 1;
            indexWordEnd = stringBuilder.indexOf(Setting.SEPAR_STR, indexWordStart);
        }

        if (inputString.length() > 0 && indexWordStart != inputString.length()) {
            outputString = outputString + lineCounter + ". "
                    + stringBuilder.substring(indexWordStart, inputString.length()).trim();
        }
        return outputString;
    }
}
