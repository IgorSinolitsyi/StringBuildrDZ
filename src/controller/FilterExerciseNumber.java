package controller;

import utils.Setting;

public class FilterExerciseNumber {
    public static void filterExerciseNumber(int option) {
        switch (option) {
            case 1 -> {
                FixWordsController.FixWords(option);
            }
            case 2 -> {
                DeleteWordFromStringController.DeleteWordFromString(option);
            }
            case 3 -> {
                FindWordInStringController.FindWordInString(option);
            }
        }
    }
}
