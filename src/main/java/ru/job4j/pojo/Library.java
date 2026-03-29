package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book effectiveJava = new Book("Effective Java", 452);
        Book cleanCode = new Book("Clean Code", 464);
        Book coreJava = new Book("Core Java", 864);
        Book algorithms = new Book("Algorithms", 848);
        Book[] books = new Book[4];
        books[0] = effectiveJava;
        books[1] = cleanCode;
        books[2] = coreJava;
        books[3] = algorithms;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        System.out.println("Replace Effective Java to Algorithms:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        System.out.println("Shown only Clean Code!");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (Objects.equals(book.getTitle(), "Clean Code")) {
                System.out.println(book.getTitle() + " - " + book.getPages());
            }
        }
    }
}
