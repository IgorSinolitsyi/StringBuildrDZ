import controller.FilterActionNumber;
import controller.FilterExerciseNumber;
import utils.Setting;
import view.GetActionNumber;
import view.GetExerciseNumber;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        while (true) {
            FilterExerciseNumber.filterExerciseNumber(GetExerciseNumber.getExerciseNumber());
            FilterActionNumber.filterActionNumber(GetActionNumber.getActionNumber());
        }
    }








}