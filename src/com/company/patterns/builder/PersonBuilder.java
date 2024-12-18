package com.company.patterns.builder;

public interface PersonBuilder {

    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(int salary);
    // и т.д.
    Person build();
}
