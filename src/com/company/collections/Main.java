package com.company.collections;

import com.company.collections.entitie.Person;
import com.company.collections.entitie.PersonComparable;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = CollectionUtils.getListPeople();
        //Collections.sort(people, new SortPersonByAge());
        people.stream()
                //.sorted(new SortPersonByAge())
                .sorted((person1, person2) -> {
                    if (person1.getAge() < person2.getAge()) {
                        return -1;
                    } else if (person1.getAge() > person2.getAge()) {
                        return 1;
                    } else {
                        return 0;
                    }
                })
                .forEach(person -> System.out.println(person));
        System.out.println("-------------------------------------------------------------");

        List<PersonComparable> people2 = CollectionUtils.getListPeopleWithComparable();
        people2.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
