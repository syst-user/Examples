package com.company.other.classes.inner;

public class OuterClass {

    private int outerField = 10;

    public class InnerClass { //Внутренний класс

        public void innerMethod() {
            System.out.println("Outer field value: " + outerField);
            OuterClass.this.outerMethod();
        }
    }

    private void outerMethod() {
        System.out.println("Outer method");
    }
}
