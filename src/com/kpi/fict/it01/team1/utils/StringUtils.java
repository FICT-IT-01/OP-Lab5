package com.kpi.fict.it01.team1.utils;

import com.kpi.fict.it01.team1.Constants;

public class StringUtils {
    public static String removeAllDelimiters(String inputString) {
        for (String d : Constants.DELIMITERS) {
            inputString = inputString.replace(d, "");
        }

        return inputString;
    }
}
