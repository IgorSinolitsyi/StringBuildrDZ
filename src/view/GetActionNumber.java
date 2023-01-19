package view;

import utils.GetDataScanner;
import utils.Setting;

public class GetActionNumber {
    public static int getActionNumber() {
        return Integer.parseInt(GetDataScanner.getDataScanner(Setting.CHOOSE_ACTION_VIEW));
    }
}
