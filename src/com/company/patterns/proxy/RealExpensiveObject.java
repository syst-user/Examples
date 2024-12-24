package com.company.patterns.proxy;

public class RealExpensiveObject implements ExpensiveObject { //Исходный объект с "дорогой" инициализацией

    public RealExpensiveObject() { //Конструктор с сложной логикой
        System.out.println("Creating RealExpensiveObject...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RealExpensiveObject created");
    }

    @Override
    public void processData() {
        System.out.println("Processing data in RealExpensiveObject");
    }
}
