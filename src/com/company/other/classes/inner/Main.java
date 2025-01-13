package com.company.other.classes.inner;

public class Main {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); //Создание объекта внутреннего класса
        inner.innerMethod();
    }
}
