package com.company.io;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main3 {

    public static void main(String[] args) {
        // Math
        int intValue = Math.round(14.45f); //округление до целого
        System.out.println("intValue: " + intValue);

        intValue = Math.round(14.51f);
        System.out.println("intValue: " + intValue);

        double doubleValue = Math.ceil(4.2); //округление до большего целого
        System.out.println("doubleValue: " + doubleValue);

        doubleValue = Math.floor(4.7); //округление до меньшего целого
        System.out.println("doubleValue: " + doubleValue);

        // BigDecimal
        BigDecimal bigDecimal = BigDecimal.valueOf(Math.PI);
        System.out.println("bigDecimal: " + bigDecimal);
        System.out.println(bigDecimal.setScale(3, RoundingMode.HALF_UP)); //округление не изменяет bigDecimal
        System.out.println(bigDecimal.setScale(3, RoundingMode.FLOOR));
        System.out.println(bigDecimal.setScale(1, RoundingMode.CEILING));

        // BigDecimal + MathContext
        MathContext mathContext = new MathContext(5, RoundingMode.HALF_UP);
        BigDecimal bigDecimal2 = new BigDecimal(Math.PI, mathContext); //bigDecimal2 хранит округленное значение
        System.out.println("bigDecimal2: " + bigDecimal2);
    }
}
