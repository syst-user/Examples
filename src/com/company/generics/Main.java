package com.company.generics;

import com.company.generics.driver.Driver;
import com.company.generics.transport.ITransport;
import com.company.generics.transport.Suzuki;
import com.company.generics.transport.Toyota;

public class Main {

    //Общий пример с дженериками
    public static void main(String[] args) {
        ITransport auto1 = new Toyota();
        Driver<ITransport> driver1 = new Driver<>(auto1);
        drive(driver1);

        ITransport moto1 = new Suzuki();
        Driver<ITransport> driver2 = new Driver<>(moto1);
        drive(driver2);
    }

    private static void drive(Driver<ITransport> driver) {
        driver.drive();
    }
}
