package com.company.streamAPI.example1.utils;

import com.company.streamAPI.example1.dto.Author;
import com.company.streamAPI.example1.dto.Book;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static List<Book> createTestBooks() {
        List<Book> books = new ArrayList<>();

        Author author1 = new Author("Ivan", "Petrov", 40);
        Book book1 = new Book("book1", author1, 10, 2020);
        books.add(book1);

        Author author2 = new Author("Egor", "Maslov", 29);
        Book book2 = new Book("book2", author2, 15, 2018);
        books.add(book2);

        Author author3 = new Author("Svetlana", "Egorova", 34);
        Book book3 = new Book("book3", author3, 9, 2017);
        books.add(book3);
        Book book4 = new Book("book4", author3, 20, 2021);
        books.add(book4);

        Author author4 = new Author("Grigory", "Vasiliev", 36);
        Book book5 = new Book("book5", author4, 16, 2018);
        books.add(book5);

        return books;
    }
}
