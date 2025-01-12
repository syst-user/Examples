package com.company.other.defaultmethod2;

public class MyClass implements Interface1, Interface2 {

    //из-за конфликта дефолтных методов у интерфейсов необходимо переопределить реализацию
    @Override
    public void commonMethod() {
        System.out.println("MyClass commonMethod implementation");
    }
}
