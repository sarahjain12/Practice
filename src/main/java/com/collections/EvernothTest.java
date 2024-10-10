package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvernothTest {

    /*
    Given a list of numbers, determine the most repeated number -
input = {12, 14, 3, 12, 14, 56, 14, 3, 78, 34, 56}, output = 14
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 14, 3, 12, 14, 56, 14, 3, 78, 34, 56);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int max = 0, value = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                value = entry.getKey();
            }
        }

        System.out.println(value);
    }
}
