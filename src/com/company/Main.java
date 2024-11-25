package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        System.out.println(String.format("Привет, %s. Ваш возраст: %d", name, age));

        //----------Example 2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя: ");
        String name2 = reader.readLine();

        System.out.print("Введите ваш возраст: ");
        int age2 = reader.read();

        System.out.printf("Привет, %s. Ваш возраст: %d", name2, age2);
        System.out.println();

        //----------Example 3
        System.out.print("Введите 2 числа через пробел: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.printf("Сумма %d и %d равна %d", x, y, x+y);
        System.out.println();

        //----------Example 4
        System.out.println("Введите фигуру и величину через пробел: ");
        scanner.nextLine();
        String[] arrStr = scanner.nextLine().split(" ");
        String f = arrStr[0];
        Integer l = Integer.valueOf(arrStr[1]);
        if ("квадрат".equals(f)) {
            System.out.printf("Периметр: %d площадь: %d", l*4, l*l);
        }
        if ("круг".equals(f)) {
            System.out.printf("Окружность: %f площадь: %f", 2 * Math.PI * l, Math.PI * (l * l));
        }
    }
}
