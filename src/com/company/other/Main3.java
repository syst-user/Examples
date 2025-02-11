package com.company.other;

public class Main3 {

    public static void main(String[] args) {
        String a = "fo#o#bar#ba##z"; //fbaz
        String b = "foo##barb#a##z"; //fbaz

        System.out.println(backspaceCompare(a, b));
    }

    public static boolean backspaceCompare(String a, String b) {
        String resA = delete(a);
        String resB = delete(b);
        return resA.equals(resB);
    }

    public static String delete(String input) {
        StringBuilder sb = new StringBuilder(input);
        while (sb.indexOf("#") >= 0) {
            int i = sb.indexOf("#");
            sb.delete(i - 1, i + 1);
        }
        return sb.toString();
    }
}
