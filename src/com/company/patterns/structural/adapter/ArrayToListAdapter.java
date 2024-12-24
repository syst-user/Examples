package com.company.patterns.structural.adapter;

import java.util.List;

public class ArrayToListAdapter implements ListProcessor { //Адаптер

    private final ArrayProcessor arrayProcessor; //Класс которых хотим использовать

    public ArrayToListAdapter(ArrayProcessor arrayProcessor) {
        this.arrayProcessor = arrayProcessor;
    }

    @Override
    public int sumList(List<Integer> list) { //Конвертируем и запускаем нужный метод
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arrayProcessor.sumArray(arr);
    }
}
