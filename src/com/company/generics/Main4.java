package com.company.generics;

import com.company.generics.driver.AutoDriver;
import com.company.generics.driver.MotoDriver;
import com.company.generics.transport.Auto;
import com.company.generics.transport.Moto;
import com.company.generics.transport.Suzuki;
import com.company.generics.transport.Toyota;

public class Main4 {

    //Пример Bounds - границы
    public static void main(String[] args) {
        Auto auto1 = new Toyota();
        AutoDriver<Auto> driver1 = new AutoDriver<>(auto1);
        driveAuto(driver1);

        Moto moto1 = new Suzuki();
        MotoDriver<Moto> driver2 = new MotoDriver<>(moto1);
        driveMoto(driver2);

    }

    private static void driveAuto(AutoDriver<Auto> autoDriver) {
        autoDriver.drive();
    }

    private static void driveMoto(MotoDriver<Moto> motoDriver) {
        motoDriver.drive();
    }
}
