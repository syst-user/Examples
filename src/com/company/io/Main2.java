package com.company.io;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;

public class Main2 {

//        %s - String
//        %d - целое число: int, long, …
//        %f - вещественное число: float, double
//        %b - boolean
//        %c - char
//        %t - Date
//        %% - Символ %

    public static void main(String[] args) {
        String stringValue = "Ivan";
        System.out.printf("Hello, %s %n", stringValue);

        int intValue = 145;
        System.out.printf("intValue: %d %s %n", intValue, intValue);

        double doubleValue = 51.346236;
        double doubleValue2 = 2;
        System.out.printf("doubleValue: %f %s %n", doubleValue, doubleValue); //%f - разделитель запятая, %s - разделитель точка

        System.out.printf("doubleValue: %.2f %.3f %n", doubleValue, doubleValue);
        System.out.printf("doubleValue2: %f %.2f %s %n", doubleValue2, doubleValue2, doubleValue2);

        System.out.printf("doubleValue2: %1$f %1$.2f %1$s %n", doubleValue); //1$ - обращается к первому параметру

        Date dateValue = new Date(); //текущая дата
        System.out.printf("dateValue: %td %tB %tY %n", dateValue, dateValue, dateValue); // %t - имеет различные маркеры
        System.out.printf(Locale.ENGLISH, "dateValue: %tB %n", dateValue);
        System.out.printf("dateValue: %tD %n", dateValue); //в формате  %tm/%td/%ty (пример: 02/01/25)
        System.out.printf("dateValue: %tT %n", dateValue); //в формате  %tH/%tM/%tS (пример: 20:17:24)

        String result = String.format("String.format(): %s %d %.1f -- %tc %n",
                stringValue, intValue, doubleValue, dateValue);
        System.out.println(result);

        //DecimalFormat - для форматирования чисел (целых и дробных)
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println("DF: " + decimalFormat.format(73.12357));
        decimalFormat.applyPattern("#.#"); //Можно поменять формат
        System.out.println("DF: " + decimalFormat.format(73.12357));

        System.out.println("DF: " + new DecimalFormat("#.###").format(72.2258));
        System.out.println("DF: " + new DecimalFormat("#.###").format(234.3)); //не дополняет нулями
        System.out.println("DF: " + new DecimalFormat("0.000").format(234.3)); //дополняет нулями

        //String.format() - всегда будет печатать конечные нули для double и float, даже если нет дробной части
        //DecimalFormat - можно управлять конечными нулями
    }
}
