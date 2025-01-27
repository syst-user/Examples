package com.company.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main5 {

    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 2, 3, 1, 5, 5, 1};
        Map<Integer, Integer> groupedMap = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!groupedMap.containsKey(arr[i])) {
                groupedMap.put(arr[i], 1);
            } else {
                groupedMap.put(arr[i], groupedMap.get(arr[i]) + 1);
            }
        }

        int value = arr[0];
        int count = groupedMap.get(arr[0]);
        for (Map.Entry<Integer, Integer> entry : groupedMap.entrySet()) {
            if (entry.getValue() < count) {
                value = entry.getKey();
                count = entry.getValue();
            }
        }

        System.out.printf("Первое самое редкое значение: %d количество раз: %d %n", value, count);
    }
}
