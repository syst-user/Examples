package com.company.other.hh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String input2 = "1 2 0 2 -1 -3 2";
        System.out.println(calculate(input2));

        System.out.println(calculate2("круг 3"));
        System.out.println(calculate2("квадрат"));
        System.out.println(calculate2("круг 100.111"));

        System.out.println(processLine("Hello World 123"));
        System.out.println(processLine("12345678"));
        System.out.println(processLine("H 1 E 2 L 3 L 4 O 5"));

        System.out.println(processEmployeeData("Иван,28,Инженер;Олег,34,HR;Денис,45,Маркетинг;Анна,30,Инженер;Борис,24,HR"));
        System.out.println(processEmployeeData("Павел,28,Инженер;Елена,34,Маркетинг"));
        System.out.println(processEmployeeData("Павел,1,Инженер;Елена,1,Маркетинг;Степан,2,Маркетинг"));
        System.out.println(processEmployeeData("Павел,5,Инженер;Елена,6,Маркетинг"));
    }

    public static String calculate(String input) { //тестовое задание
        String[] arr = input.split(" ");
        int moreZero = 0, zero = 0, lessZero = 0;
        for (String value : arr) {
            int v = Integer.valueOf(value);
            if (v < 0) {
                lessZero++;
            } else if (v == 0) {
                zero++;
            } else {
                moreZero++;
            }
        }
        return String.format("выше нуля: %d, ниже нуля: %d, равна нулю: %d", moreZero, lessZero, zero);
    }

    public static String calculate2(String input) { //первое задание
        String[] arrStr = input.split(" ");
        String figure = arrStr[0];
        double size = 1.0;
        if (arrStr.length > 1) {
            size = Double.valueOf(arrStr[1]);
        }
        if ("квадрат".equals(figure)) {
            return String.format("%.2f %.2f", size * size, size * 4);
        }
        if ("круг".equals(figure)) {
            return String.format("%.2f %.2f", Math.PI * (size * size), 2 * Math.PI * size);
        }
        return "";
    }

    public static String processLine(String line) { //второне задание
        StringBuilder sb = new StringBuilder(line);
        String line2 = sb.reverse().toString()
                .replaceAll("\\d", "")
                .replaceAll(" ", "_");
        String result = "LOG" + line2;
        return result;
    }

    public static String processEmployeeData(String input) { //третье задание
        String[] people = input.split(";");
        List<Integer> ages = new ArrayList<>();
        for (String person : people) {
            String[] params = person.split(",");
            ages.add(Integer.valueOf(params[1]));
        }

        Collections.sort(ages);
        int min = ages.get(0);
        int max = ages.get(ages.size() - 1);

        long median;
        int size = ages.size();
        if (size % 2 == 0) {
            int mid1 = size / 2 - 1;
            int mid2 = size / 2;
            median = Math.round((ages.get(mid1) + ages.get(mid2)) / 2.0);
        } else {
            int mid = size / 2;
            median = ages.get(mid);
        }
        return String.format("%d %d %d", min, median, max);
    }
}
