package com.company.collections;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(CollectionUtils.getListNames());
        names.stream()
                //.sorted()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
        System.out.println("------------------------------");

        Set<String> names2 = new TreeSet<>(CollectionUtils.getListNames());
        names2.stream().forEach(System.out::println);
        System.out.println("------------------------------");

        List<String> names3 = new ArrayList<>(CollectionUtils.getListNames());
        Collections.sort(names3);
        names3.stream().forEach(System.out::println);
        System.out.println("------------------------------");
        Collections.sort(names3, Collections.reverseOrder());
        names3.stream().forEach(System.out::println);
        System.out.println("------------------------------");

    }
}
