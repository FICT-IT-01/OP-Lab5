package com.kpi.fict.it01.team1;

import java.io.IOException;

import com.kpi.fict.it01.team1.utils.FileUtils;
import com.kpi.fict.it01.team1.utils.MapUtils;

import com.kpi.fict.it01.team1.processors.FirstTaskProcessor;

public class Main {
    public static void main(String[] args) {
        var inputText = "";

        try {
            inputText = FileUtils.readFile(Constants.FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

        var wordsUsageFrequencyMapByDescending =
                MapUtils.orderMapByValueIncreasing(FirstTaskProcessor.groupWords(inputText));

        System.out.println(wordsUsageFrequencyMapByDescending.entrySet().iterator().next().getKey());
    }

}
