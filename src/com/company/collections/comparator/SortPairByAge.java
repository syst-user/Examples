package com.company.collections.comparator;

import com.company.collections.entitie.Person;

import java.util.Comparator;
import java.util.Map;

public class SortPairByAge implements Comparator<Map.Entry<Person, Person>> {

    @Override
    public int compare(Map.Entry<Person, Person> p1, Map.Entry<Person, Person> p2) {
        if (p1.getKey().getAge() < p2.getKey().getAge()) {
            return -1;
        } else if (p1.getKey().getAge() > p2.getKey().getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
