package controller;

import model.FixWords;
import model.GetDataHard;
import model.ParsingString;
import view.ViewResult;

public class FixWordsController {
    public static void FixWords(int option){
        ViewResult.viewResult(ParsingString.parsingString(FixWords.fixWords(GetDataHard.getDataHard(option))),
                GetDataHard.getDataHard(option));}
}
