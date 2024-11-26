package com.company.array;

import java.util.Arrays;
import java.util.Random;

public class Main4 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 6},
                {5, 6, 7, 8, 1},
                {9, 0, 1, 2, 5}
        };

        System.out.println(Arrays.deepToString(matrix));

        for (int[] arr : matrix) {
            int sum = 0;
            for (int x : arr) {
                sum += x;
                System.out.print(x + "  ");
            }
            System.out.println("| sum: " + sum);
        }
        System.out.println("------------------------------");


        //---Example2
        int rows = 5;
        int columns = 10;
        int[][] matrix2 = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                int max = matrix2[i][0];
                int count = 0;
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix2[i][j] + "  ");
                    if (matrix2[i][j] == max)
                        count++;
                    if (matrix2[i][j] > max) {
                        max = matrix2[i][j];
                        count = 1;
                    }
                }
                System.out.printf("| max: %d count: %d", max, count);
            } else {
                int min = matrix2[i][0];
                int count = 0;
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix2[i][j] + "  ");
                    if (matrix2[i][j] == min)
                        count++;
                    if (matrix2[i][j] < min) {
                        min = matrix2[i][j];
                        count = 1;
                    }
                }
                System.out.printf("| min: %d count: %d", min, count);
            }
            System.out.println();
        }
    }
}
