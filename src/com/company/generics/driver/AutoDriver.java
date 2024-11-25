package com.company.generics.driver;

import com.company.generics.transport.Auto;

public class AutoDriver<T extends Auto> extends Driver<T> {

    public AutoDriver(T transport) {
        super(transport);
    }

    @Override
    public void drive() {
        System.out.println("AutoDrive: " + transport.getClass().getName());
    }
}
