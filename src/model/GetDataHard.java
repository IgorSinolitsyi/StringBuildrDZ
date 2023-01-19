package model;

public class GetDataHard {
    public static String getDataHard(int exerciseNum) {
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

}
