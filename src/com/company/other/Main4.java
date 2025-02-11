package com.company.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main4 {

    public static void main(String[] args) {
        //example 1 сгруппировать четные числа слева, нечетные справа
        int[] arr = {8, 6, 1, 7, 3, 2, 5, 1, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] % 2 == 0) { //если заменить 1 на 0 то четные будут справа, нечетные слева
                    int buf = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = buf;
                }
            }
        }
        System.out.println("arr: " + Arrays.toString(arr));

        //example 2 Вывести все значения у которых ключ начинается на "a"
        Map<String, String> map = new HashMap<>();
        map.put("ah", "1");
        map.put("ha", "2");
        map.put("admin", "3");

        map.keySet().stream()
                .filter(key -> key.startsWith("a"))
                .forEach(key -> System.out.println(map.get(key)));
    }
}
