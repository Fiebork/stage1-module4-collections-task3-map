package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> map = new HashMap<>();
        for (int i = 0; i <= sourceMap.size(); i++) {
            Integer min = null;
            for (Integer elem : sourceMap.keySet()) {
                if (Objects.equals(sourceMap.get(elem), sourceMap.get(i))) {
                    if (min == null) {
                        min = elem;
                    } else if (elem <= min) {
                        min = elem;
                    }
                }
            }
            if (min != null) {
                map.put(sourceMap.get(i), min);
            }
        }
        return map;
    }
}
