package com.company.patterns.structural.adapter;

public class ArrayProcessor { //Класс который работает с массивом и мы не можем поменять логику

    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
