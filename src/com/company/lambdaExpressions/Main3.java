package com.company.lambdaExpressions;

public class Main3 {

    public static void main(String[] args) {
        Wrapper<String> wrapperStr = (s -> "[" + s + "]");
        System.out.println(wrap(wrapperStr, "Hello"));
    }

    private static String wrap(Wrapper<String> wrapper, String string) {
        return wrapper.wrap(string.toLowerCase());
    }
}
