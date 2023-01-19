package controller;

import model.DeleteWordFromString;
import model.GetDataHard;
import model.ParsingString;
import view.ViewResult;

public class DeleteWordFromStringController {
    public static void DeleteWordFromString(int option){
        ViewResult.viewResult(ParsingString.parsingString(DeleteWordFromString.deleteWordFromString
                (GetDataHard.getDataHard(option))), GetDataHard.getDataHard(option));}
}

