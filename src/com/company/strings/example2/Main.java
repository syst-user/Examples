package com.company.strings.example2;

public class Main {
    public static void main(String[] args) {
        //---Example with String
        System.out.println("---String---");
        String string = "hello world";
        String[] strings = string.split(" ");
        string = strings[0].toUpperCase() + strings[1].toLowerCase();
        System.out.println("result: " + string);

        string = "   " + string + "  ";
        System.out.println("result: " + string);
        string = string.trim();
        System.out.println("result: " + string);

        string = string.concat("!");
        System.out.println("result: " + string);

        string = string.replaceFirst("w", " w");
        System.out.println("result: " + string);

        System.out.println("result: " + string.matches("^[0-9]+$"));
        System.out.println("result: " + string.startsWith("Hello".toUpperCase()));
        System.out.println("result: " + string.endsWith("World!".toLowerCase()));

        //---Example with StringBuilder
        System.out.println("---StringBuilder---");
        StringBuilder stringBuilder = new StringBuilder("Hello world");
        stringBuilder.append("!!!");
        int lastChar = stringBuilder.lastIndexOf("!");
        if (lastChar > 0) {
            stringBuilder.delete(lastChar, lastChar + 1);
        }
        System.out.println("result: " + stringBuilder);

        stringBuilder.insert(stringBuilder.indexOf(" "), "_");
        System.out.println("result: " + stringBuilder);

        String subString = stringBuilder.substring(0, stringBuilder.length() - 1);
        System.out.println("result: " + subString);

        //---Example with StringBuffer
        System.out.println("---StringBuffer---");
        StringBuffer stringBuffer = new StringBuffer("HeLLo WoRld");
        stringBuffer.append("!");
        stringBuffer.replace(0, stringBuffer.length(), stringBuffer.toString().toLowerCase());
        stringBuffer.replace(0, 1, stringBuffer.substring(0, 1).toUpperCase());
        System.out.println("result: " + stringBuffer);
    }
}
