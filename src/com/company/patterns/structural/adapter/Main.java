package com.company.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        ListProcessor listProcessor = new ArrayToListAdapter(arrayProcessor);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = listProcessor.sumList(numbers);
        System.out.println("Сумма элементов: " + sum);
    }
}
