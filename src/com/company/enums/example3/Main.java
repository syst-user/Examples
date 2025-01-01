package com.company.enums.example3;

public class Main {

    public static void main(String[] args) {
        Counter firstInstance = Counter.INSTANCE;
        firstInstance.setValue(5);
        firstInstance.process();

        Counter secondInstance = Counter.INSTANCE;
        secondInstance.setValue(7);
        secondInstance.process();

        firstInstance.process();
    }
}
