import java.util.Scanner;

public class Main {
    private static boolean isRUN = true;
    private static final String SEPAR_STR = ", ";
    private static final String DEL_WORD_HARD = "onion";
    private static final String CHOOSE_EX_VIEW = """
            Choose an exercise:
            1 - fix words 
            2 - delete words
            3 - search and count
            4 - exit
            """;
    private static final String CHOOSE_ACTION_VIEW = """
            Choose an action:
            1 - beck to menu 
            2 - exit
            """;

    public static void main(String[] args) {
        do {
            filterExerciseNumber(getExerciseNumber());
            filterActionNumber(getActionNumber());
        } while (isRUN);
    }

    private static int getExerciseNumber() {
        return Integer.parseInt(getDataScanner(CHOOSE_EX_VIEW));
    }

    private static int getActionNumber() {
        return Integer.parseInt(getDataScanner(CHOOSE_ACTION_VIEW));
    }

    private static void viewResult(String resultString, String inputString) {
        System.out.println("String before editing: " + "\n" + inputString + "\n" + "\n" +
                "String after editing: " + "\n" + resultString + "\n");
    }
    private static void viewResultFind(int count, String inputString, String name) {
        System.out.println("String with Names: " + "\n" + inputString + "\n" + "\n" +
                "Found " + count + " persons with Name " + name + "\n");
    }
    private static void filterActionNumber(int option) {
        switch (option) {
            case 1 -> {
            }
            case 2 -> {
                isRUN = !isRUN;
            }
        }
    }

    private static void filterExerciseNumber(int option) {
        switch (option) {
            case 1 -> {
                viewResult(parsingString(fixWords(getDataHard(option))), getDataHard(option));
            }
            case 2 -> {
                viewResult(parsingString(deleteWordFromString(getDataHard(option), DEL_WORD_HARD)), getDataHard(option));
            }
            case 3 -> {
                String nameToFind = getDataScanner("Enter Name: ");
                viewResultFind(findWordInString(getDataHard(option), nameToFind), getDataHard(option), nameToFind);
            }
        }
    }

    private static String getDataHard(int exerciseNum) {
        switch (exerciseNum) {

            case 1 -> {
                return "brange, plum, tomato, onibn, grape";
            }
            case 2 -> {
                return "orange, plum, tomato, onion, grape, onion";
            }
            case 3 -> {
                return "Bob, Alice, Tom, Lucy, Bob, Lisa";
            }
            default -> {
                System.out.println("Wrong input!!!");
                return "";
            }

        }
    }

    private static String getDataScanner(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }

    private static int findWordInString(String inputString, String findWord) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        int count = 0;
        int indexWordStart = stringBuilder.indexOf(findWord, 0);
        while (indexWordStart > -1) {
            count = ++count;
            indexWordStart = stringBuilder.indexOf(findWord, indexWordStart + findWord.length());
        }
        return count;
    }

    private static String deleteWordFromString(String inputString, String delWord) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        int indexWordStart = stringBuilder.indexOf(delWord, 0);

        if (indexWordStart == 0) {
            stringBuilder.delete(indexWordStart + SEPAR_STR.length(), indexWordStart + delWord.length());
            indexWordStart = stringBuilder.indexOf(delWord, indexWordStart + delWord.length());
        }

        while (indexWordStart != -1) {
            stringBuilder.delete(indexWordStart - SEPAR_STR.length(), indexWordStart + delWord.length());
            indexWordStart = stringBuilder.indexOf(delWord, indexWordStart + delWord.length());
        }
        return stringBuilder.toString();
    }

    private static String fixWords(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.replace(0, 1, "o");
        stringBuilder.replace(25, 26, "o");
        return stringBuilder.toString();
    }

    private static String parsingString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        int indexWordStart = 0;
        int lineCounter = 1;
        int indexWordEnd = stringBuilder.indexOf(SEPAR_STR, indexWordStart);

        String outputString = "";
        while (indexWordEnd != -1) {

            outputString = outputString + lineCounter + ". "
                    + stringBuilder.substring(indexWordStart, indexWordEnd).trim() + "\n";
            lineCounter = ++lineCounter;
            indexWordStart = indexWordEnd + 1;
            indexWordEnd = stringBuilder.indexOf(SEPAR_STR, indexWordStart);
        }

        if (inputString.length() > 0 && indexWordStart != inputString.length()) {
            outputString = outputString + lineCounter + ". "
                    + stringBuilder.substring(indexWordStart, inputString.length()).trim();
        }


        return outputString;
    }
}