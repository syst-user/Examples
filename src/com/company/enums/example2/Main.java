package com.company.enums.example2;

public class Main {

    public static void main(String[] args) {
        Status status = Status.START;
        someLogic(status);
        someLogic(Status.STOP);
    }

    private static void someLogic(Status status) {
        System.out.println(status.getDescription());
    }
}
