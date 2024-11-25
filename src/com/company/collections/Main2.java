package com.company.collections;

import com.company.collections.comparator.SortPersonByAge;
import com.company.collections.comparator.SortPersonByName;
import com.company.collections.entitie.Person;
import com.company.collections.entitie.PersonComparable;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>(new SortPersonByAge());
        people.addAll(CollectionUtils.getListPeople());
        people.stream().forEach(System.out::println);
        System.out.println("------------------------------");

        Set<PersonComparable> people2 = new TreeSet<>(CollectionUtils.getListPeopleWithComparable());
        people2.stream().forEach(System.out::println);
        System.out.println("------------------------------");

        Set<Person> people3 = new TreeSet<>(new SortPersonByName());
        people3.addAll(CollectionUtils.getListPeople());
        people3.stream().forEach(System.out::println);
        System.out.println("------------------------------");

        Set<Person> people4 = new TreeSet<>((Person p1, Person p2) -> -p1.getName().compareTo(p2.getName()));
        people4.addAll(CollectionUtils.getListPeople());
        people4.stream().forEach(System.out::println);
        System.out.println("------------------------------");

    }
}
