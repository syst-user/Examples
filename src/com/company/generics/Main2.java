package com.company.generics;

public class Main2 {

    //Пример наследования с дженериками
    public static void main(String[] args) {

    }

    class Parent {}
    class GenParent<T> extends Parent {}

    class Child extends GenParent {}
    class Child2 extends GenParent<String> {}
    class Child3<T> extends GenParent<T> {}
    class Child4<X,T,Y> extends GenParent<T> {}
    class Child5<X,T,Y> extends GenParent {}
    class Child6<X,T,Y> extends Child5<String, T, String> {}


    interface GenericInterface<T> {
        T getT();
    }
    class One implements GenericInterface {
        @Override
        public Object getT() {
            return null;
        }
    }
    class Two implements GenericInterface<String> {
        @Override
        public String getT() {
            return null;
        }
    }
    class Three<T> implements GenericInterface<T> {
        @Override
        public T getT() {
            return null;
        }
    }

    class Four<T,X> implements GenericInterface<T> {
        @Override
        public T getT() {
            return null;
        }
    }
}
