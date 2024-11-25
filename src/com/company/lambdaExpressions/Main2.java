package com.company.lambdaExpressions;

public class Main2 {

    public static void main(String[] args) {
        WrapString wrapString = (string) -> "[" + string + "]";
        System.out.println(fun(wrapString, "Hello"));
    }

    private static String fun(WrapString wrapString, String string) {
        return wrapString.wrap(string.toUpperCase());
    }
}
