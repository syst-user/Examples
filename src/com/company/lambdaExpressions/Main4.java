package com.company.lambdaExpressions;

public class Main4 {

    public static void main(String[] args) {
        WrapperString<String> wrapperString = s -> {
            if (s == null || s.isEmpty()) {
                throw new EmptyValueException();
            }
            return "[" + s + "]";
        };

        System.out.println(wrap(wrapperString, "Hello"));
//        System.out.println(wrap(wrapperString, null));
//        System.out.println(wrap(wrapperString, ""));
    }

    private static String wrap(WrapperString<String> wrapperString, String string) {
        String result = null;
        try {
            return wrapperString.wrap(string);
        } catch (EmptyValueException e) {
            e.printStackTrace();
        }
        return result;
    }
}
