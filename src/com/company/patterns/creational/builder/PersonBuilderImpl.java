package com.company.patterns.creational.builder;

public class PersonBuilderImpl implements PersonBuilder {

    private Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setSalary(int salary) {
        person.setSalary(salary);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
