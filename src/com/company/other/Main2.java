package com.company.other;

import java.util.HashSet;
import java.util.Objects;

public class Main2 {

    public static void main(String[] args) {

        HashSet<Person> people = new HashSet<>();
        people.add(new Person("ivan"));
        people.add(new Person("radion"));
        people.add(new Person("ivan"));
        people.add(new Person("petr"));

        people.stream().forEach(person -> System.out.println("hastCode: " + person.hashCode()));

        //Если не определить hashCode() и equals() то будет 4 записи в Set
        System.out.println("size: " + people.size());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
