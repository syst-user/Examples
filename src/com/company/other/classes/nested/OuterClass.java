package com.company.other.classes.nested;

public class OuterClass {

    private int outerField = 10;

    public static class NestedClass { // Вложенный класс

        public void nestedMethod() {
            // Так как вложенный класс статический он не имеет доступ к нестатическим полям внешнего класса
            // System.out.println("Outer field value: " + outerField);
            System.out.println("Вложенный метод");
        }
    }
}
