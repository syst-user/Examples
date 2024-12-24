package com.company.patterns.proxy;

public class RealExpensiveObject implements ExpensiveObject {

    public RealExpensiveObject() {
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
