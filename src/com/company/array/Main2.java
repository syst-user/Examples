package com.company.array;

import java.util.Arrays;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("BinarySearch: " + Arrays.binarySearch(arr1, 3)); //массив должен быть отсортирован

        int[] arr2 = {5, 3, 7, 8, 1, 9, 2, 0, 4}; //создание с инициализацией
        int[] arr3 = new int[] {2, 5, 1, 7, 4, 9}; //такой способ может быть полезен при возвращении из метода

        int max = arr2[0];
        for (int x : arr2) { //массивы поддерживают for-each
            if (max < x) {
                max = x;
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("max in arr2: " + max);

        int minIndex = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[minIndex] > arr3[i]) {
                minIndex = i;
            }
        }
        System.out.println(Arrays.toString(arr3));
        System.out.printf("Min value in arr3: %d with index: %d", arr3[minIndex], minIndex);
    }
}
