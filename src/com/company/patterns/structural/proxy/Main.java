package com.company.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        ExpensiveObject proxy = new ExpensiveObjectProxy();
        proxy.processData(); //Объект создался только сейчас

        //Много кода...

        proxy.processData(); //Объект уже создан
    }
}
