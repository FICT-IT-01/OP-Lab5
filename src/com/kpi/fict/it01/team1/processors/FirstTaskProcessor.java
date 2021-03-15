package com.kpi.fict.it01.team1.processors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FirstTaskProcessor {
    public static HashMap<String, Integer> groupWords(String inputText) {
        var words = new ArrayList<>(Arrays.asList(inputText.split(" ")));

        var hm = new HashMap<String, Integer>();
        words.forEach(word -> hm.put(word, hm.containsKey(word) ? hm.get(word) + 1 : 1));

        return hm;
    }
}
