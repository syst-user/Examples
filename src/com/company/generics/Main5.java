package com.company.generics;

import com.company.generics.driver.Driver;
import com.company.generics.transport.Auto;
import com.company.generics.transport.Moto;
import com.company.generics.transport.Suzuki;
import com.company.generics.transport.Toyota;

public class Main5 {

    //Пример Wildcards
    public static void main(String[] args) {
        Auto auto = new Toyota();
        Driver<? extends Auto> driver1 = new Driver<>(auto);
        drive(driver1);
        driveAuto(driver1);

        Moto moto = new Suzuki();
        Driver<? extends Moto> driver2 = new Driver<>(moto);
        drive(driver2);
        driveMoto(driver2);

        Driver<? super Moto> driver3 = new Driver<Moto>(moto);
        driveSuperMoto(new Driver<Moto>(moto));

        Driver<? super Auto> driver4 = new Driver<Auto>(auto);
        driveSuperAuto(new Driver<Auto>(auto));
    }

    private static void drive(Driver<?> driver) {
        driver.drive();
    }

    private static void driveMoto(Driver<? extends Moto> motoDriver) {
        motoDriver.drive();
    }

    private static void driveAuto(Driver<? extends Auto> autoDriver) {
        autoDriver.drive();
    }

    private static void driveSuperMoto(Driver<? super Moto> driver) {
        driver.drive();
    }

    private static void driveSuperAuto(Driver<? super Auto> driver) {
        driver.drive();
    }
}
