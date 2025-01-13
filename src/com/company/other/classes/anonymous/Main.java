package com.company.other.classes.anonymous;

public class Main {

    public interface MyInterface {
        void myMethod();
    }

    public interface MyInterface2 {
        void sum(int a, int b);
    }

    public static void main(String[] args) {
        MyInterface anonymous = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Метод в анонимном классе");
            }
        };
        anonymous.myMethod();

        //интерфейсы с одним методом (функциональные интерфейсы) можно реализовать используя лямбды
        MyInterface anonymous2 = () -> System.out.println("Метод в анонимном классе из лямбды");
        anonymous2.myMethod();

        MyInterface2 anonymous3 = (a, b) -> System.out.println("a + b = " + (a + b));
        anonymous3.sum(5,3);
    }
}
