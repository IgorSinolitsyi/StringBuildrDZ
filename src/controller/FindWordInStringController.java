package controller;

import model.FindWordInString;
import model.GetDataHard;
import utils.GetDataScanner;
import view.ViewResultFind;

public class FindWordInStringController {
    public static void FindWordInString(int option){
        String nameToFind = GetDataScanner.getDataScanner("Enter Name: ");
        ViewResultFind.viewResultFind(FindWordInString.findWordInString(
                GetDataHard.getDataHard(option), nameToFind), GetDataHard.getDataHard(option), nameToFind);}
}
