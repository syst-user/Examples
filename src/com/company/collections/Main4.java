package com.company.collections;

import com.company.collections.comparator.SortPairByAge;
import com.company.collections.comparator.SortPersonByAge;
import com.company.collections.entitie.Person;
import com.company.collections.entitie.PersonComparable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main4 {
    public static void main(String[] args) {
        Map<Person, Person> pairs = new HashMap<>(CollectionUtils.getMapPairs());
        pairs.entrySet().stream()
                .sorted((Map.Entry<Person, Person> p1, Map.Entry<Person, Person> p2) ->
                        -p1.getKey().getName().compareTo(p2.getKey().getName()))
                .forEach(System.out::println);
        System.out.println("------------------------------------------------");

        Map<Person, Person> pairs1 = new HashMap<>(CollectionUtils.getMapPairs());
        pairs1.entrySet().stream().sorted(new SortPairByAge()).forEach(System.out::println);
        System.out.println("------------------------------------------------");

        Map<Person, Person> pairs2 = new TreeMap<>(new SortPersonByAge());
        pairs2.putAll(CollectionUtils.getMapPairs());
        pairs2.entrySet().stream().forEach(System.out::println);
        System.out.println("------------------------------------------------");

        Map<Person, Person> pairs3 = new TreeMap<>((Person p1, Person p2) -> -p1.getName().compareTo(p2.getName()));
        pairs3.putAll(CollectionUtils.getMapPairs());
        pairs3.entrySet().stream().forEach(System.out::println);
        System.out.println("------------------------------------------------");

        Map<PersonComparable, Person> pairs4 = new TreeMap<>();
        pairs4.putAll(CollectionUtils.getMapPairsWithComparable());
        pairs4.entrySet().stream().forEach(System.out::println);
        System.out.println("------------------------------------------------");
    }
}
