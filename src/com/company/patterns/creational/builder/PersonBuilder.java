package com.company.patterns.creational.builder;

public interface PersonBuilder {

    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(int salary);
    // и т.д.
    Person build();
}
