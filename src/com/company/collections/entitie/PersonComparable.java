package com.company.collections.entitie;

public class PersonComparable extends Person implements Comparable<PersonComparable>{

    public PersonComparable(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(PersonComparable person) {
        if (getAge() < person.getAge()) {
            return -1;
        } else if (getAge() > person.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
