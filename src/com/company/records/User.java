package com.company.records;

//Записи появились в java 16
public record User(String name, int age, String city) implements Printable {

    // все поля по умолчанию final

    // Автоматически генерится:
    // конструктор на все поля
    // геттеры для всех полей
    // .equals() hashCode() toString() (Можно переопределить)

    //Можно создать кастомный конструктор
    public User(String name, int age) {
        this(name, age, "");
    }

    @Override
    public void print() { //Можно реализовывать интерфейсы но нету наследовани
        System.out.printf("Name: %s age: %d city: %s %n", name(), age(), city());
    }
}
