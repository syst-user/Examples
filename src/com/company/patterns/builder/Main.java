package com.company.patterns.builder;

public class Main {

    public static void main(String[] args) {
        Person person1 = new PersonBuilderImpl().setName("Ivan").setAge(30).setSalary(100).build();
        Person person2 = new PersonBuilderImpl().setName("Vasili").setAge(35).build();
        Person person3 = new PersonBuilderImpl().setName("Vova").setSalary(123).build();

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);
    }
}
