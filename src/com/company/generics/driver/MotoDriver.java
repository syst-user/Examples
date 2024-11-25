package com.company.generics.driver;

import com.company.generics.transport.Moto;

public class MotoDriver<T extends Moto> extends Driver<T> {

    public MotoDriver(T transport) {
        super(transport);
    }

    @Override
    public void drive() {
        System.out.println("MotoDrive: " + transport.getClass().getName());
    }
}
