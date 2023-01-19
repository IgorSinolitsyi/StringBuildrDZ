package model;

public class FindWordInString {
    public static int findWordInString(String inputString, String findWord) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        int count = 0;
        int indexWordStart = stringBuilder.indexOf(findWord, 0);
        while (indexWordStart > -1) {
            count = ++count;
            indexWordStart = stringBuilder.indexOf(findWord, indexWordStart + findWord.length());
        }
        return count;
    }
}
