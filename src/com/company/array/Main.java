package com.company.array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 20;
        int[] intArr = new int[count];
        for (int i=0; i<intArr.length; i++) {
            intArr[i] = random.nextInt(100); // вернет [0-90]
            //random.nextDouble() вернет от 0 до 1
            //Math.random(); тоже вернет дробное число [0 - 1)
        }
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println("----------------------------------");

        //---Example2
        for (int i=0; i<intArr.length; i++) {
            intArr[i] = getRandomNumber(10, 100);
        }
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println("----------------------------------");

        //---Example3
        for (int i=0; i<intArr.length; i++) {
            intArr[i] = getRandomNumberUsingNextInt(10, 100);
        }
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println("----------------------------------");

    }

    //[min, max)
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    //[min, max)
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
