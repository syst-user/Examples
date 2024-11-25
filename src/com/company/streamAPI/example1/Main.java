package com.company.streamAPI.example1;

import com.company.streamAPI.example1.dto.Book;
import com.company.streamAPI.example1.utils.TestData;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Book> books = TestData.createTestBooks();

        books.stream()
                .forEach(System.out::println);
        System.out.println("--------------------------");

        books.stream()
                .filter(book -> book.getCount() > 10)
                .forEach(System.out::println);
        System.out.println("--------------------------");

        books.stream()
                .map(book -> book.getAuthor())
                .collect(Collectors.toSet())
                .stream()
                .forEach(System.out::println);
        System.out.println("--------------------------");

        books.stream()
                .map(book -> book.getAuthor())
                .collect(Collectors.toSet())
                .stream()
                .filter(author -> author.getAge() > 35)
                .forEach(System.out::println);
        System.out.println("--------------------------");

        System.out.println("names: " + books.stream()
                .map(book -> book.getName())
                .collect(Collectors.joining(":")));
        System.out.println("--------------------------");


    }
}
