package com.company.lambdaExpressions;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        System.out.println(changeString(s -> s.toUpperCase(), "Hello"));
        System.out.println(changeString(s -> s.toLowerCase(), "Hello"));
    }


    private static String changeString(Function<String, String> function, String string) {
        return "[" + function.apply(string) + "]";
    }
}
