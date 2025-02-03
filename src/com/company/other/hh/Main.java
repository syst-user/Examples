package com.company.other.hh;

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
}
