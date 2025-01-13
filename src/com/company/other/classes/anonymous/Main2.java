package com.company.other.classes.anonymous;

public class Main2 {

    public static void main(String[] args) {
        MyAbstractClass anonymous = new MyAbstractClass() {
            @Override
            void myMethod() {
                System.out.println("Метод в анонимном классе");
            }
        };
        anonymous.myMethod();


        // Абстрактный класс не может быть реализован спомощью лямбды
        //MyAbstractClass anonymous2 = () -> System.out.println("Метод в анонимном классе из лямбды");
        //anonymous2.myMethod();
    }
}
