package com.company.array;

import java.util.Arrays;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int[] originalArr = {3, 5, 1, 9, 8};

        int[] newArr1 = increaseArray(originalArr, originalArr.length * 2);
        System.out.println(Arrays.toString(newArr1));

        int[] newArr2 = increaseArray2(originalArr, originalArr.length * 2);
        System.out.println(Arrays.toString(newArr2));

        int[] newArr3 = copyRange(originalArr, 2, 3);
        System.out.println(Arrays.toString(newArr3));

        int[] newArr4 = Arrays.copyOfRange(originalArr, 2, 4); // [from, to)
        System.out.println(Arrays.toString(newArr4));
    }

    private static int[] increaseArray(int[] arr, int size) {
        int[] newArr = new int[size];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        Random random = new Random();
        for (int i = arr.length; i < newArr.length; i++) {
            newArr[i] = random.nextInt(10);
        }
        return newArr;
    }

    private static int[] increaseArray2(int[] arr, int size) {
        int[] newArr = Arrays.copyOf(arr, size);
        Random random = new Random();
        for (int i = arr.length; i < newArr.length; i++) {
            newArr[i] = random.nextInt(10);
        }
        return newArr;
    }

    private static int[] copyRange(int[] arr, int startPos, int length) {
        int[] newArr = new int[length];
        System.arraycopy(arr, startPos, newArr, 0, length);
        return newArr;
    }
}
