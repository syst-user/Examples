package com.company.streamAPI.example1.dto;

public class Book {
    private String name;
    private Author author;
    private int count;
    private int yearOfRelease;

    public Book(String name, Author author, int count, int yearOfRelease) {
        this.name = name;
        this.author = author;
        this.count = count;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", count=" + count +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
