package com.kpi.fict.it01.team1.utils;

import java.util.*;

public class MapUtils {
    public static <K, V extends Comparable<? super V>> Map<K, V> orderMapByValueIncreasing(Map<K, V> map) {
        List<Map.Entry<K, V>> mapEntrySet = new ArrayList<>(map.entrySet());
        mapEntrySet.sort(Map.Entry.comparingByValue());

        Map<K, V> orderedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : mapEntrySet) {
            orderedMap.put(entry.getKey(), entry.getValue());
        }

        return orderedMap;
    }


    public static <K, V extends Comparable<? super V>> Map<K, V> orderMapByValueDescending(Map<K, V> map) {
        List<Map.Entry<K, V>> mapEntrySet = new ArrayList<>(map.entrySet());
        mapEntrySet.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<K, V> orderedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : mapEntrySet) {
            orderedMap.put(entry.getKey(), entry.getValue());
        }

        return orderedMap;
    }
}
