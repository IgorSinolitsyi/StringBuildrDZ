package view;

import utils.GetDataScanner;
import utils.Setting;

public class GetExerciseNumber {
    public static int getExerciseNumber() {
        return Integer.parseInt(GetDataScanner.getDataScanner(Setting.CHOOSE_EX_VIEW));
    }
}
