package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] subStr;
        subStr = sentence.toLowerCase().split("[\\s,.!?:']");
        for (int i = 0; i < subStr.length; i++) {
            if (!map.containsKey(subStr[i]) && !Objects.equals(subStr[i], "")) {
                int sum = 1;
                for (int j = i + 1; j < subStr.length; j++) {
                    if (Objects.equals(subStr[i], subStr[j])) {
                        sum++;
                    }
                }
                map.put(subStr[i], sum);
            }
        }
        return map;
    }
}
