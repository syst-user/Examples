package com.company.collections;

import com.company.collections.entitie.Person;
import com.company.collections.entitie.PersonComparable;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static List<Person> getListPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("ivan", 30));
        people.add(new Person("vlad", 20));
        people.add(new Person("tanya", 18));
        people.add(new Person("sveta", 25));
        people.add(new Person("avrora", 32));
        people.add(new Person("vasya", 35));
        people.add(new Person("galya", 31));
        return people;
    }

    public static List<PersonComparable> getListPeopleWithComparable() {
        return getListPeople().stream()
                .map(person -> new PersonComparable(person.getName(), person.getAge()))
                .collect(Collectors.toList());
    }

    public static List<String> getListNames() {
        List<String> names = new ArrayList<>();
        names.add("Vlad");
        names.add("Radion");
        names.add("Vasya");
        names.add("Artem");
        names.add("Egor");
        names.add("Agata");
        return names;
    }

    public static Map<Person, Person> getMapPairs() {
        Map<Person, Person> pairs = new HashMap<>();
        pairs.put(new Person("Roman", 40), new Person("Dasha", 40));
        pairs.put(new Person("Dima", 35), new Person("Sveta", 30));
        pairs.put(new Person("Anton", 36), new Person("Tanya", 33));
        pairs.put(new Person("Valera", 39), new Person("Agata", 38));
        return pairs;
    }

    public static Map<PersonComparable, Person> getMapPairsWithComparable() {
        Map<PersonComparable, Person> result = new HashMap<>();
        getMapPairs().entrySet()
                .forEach(pair -> result.put(
                        new PersonComparable(pair.getKey().getName(), pair.getKey().getAge()),
                        pair.getKey()));
        return result;
    }
}
