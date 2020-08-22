package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("author1", (short) 10);
        Author author2 = new Author("author2", (short) 20);
        Author author3 = new Author("author3", (short) 30);
        Author author4 = new Author("author4", (short) 40);
        Author author5 = new Author("author5", (short) 50);

        Book book1 = new Book("book1", 100);
        Book book2 = new Book("book2", 200);
        Book book3 = new Book("book3", 300);
        Book book4 = new Book("book4", 400);
        Book book5 = new Book("book5", 500);

        Author[] authors = new Author[5];
        authors[0] = author1;
        authors[1] = author2;
        authors[2] = author3;
        authors[3] = author4;
        authors[4] = author5;

        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;

        author1.setBooks(Arrays.asList(book2));
        author2.setBooks(Arrays.asList(book3, book4));
        author3.setBooks(Arrays.asList(book1,book3));
        author4.setBooks(Arrays.asList(book1));
        author5.setBooks(Arrays.asList(book3, book5));

        book1.setAuthors(Arrays.asList(author3, author4));
        book2.setAuthors(Arrays.asList(author1));
        book3.setAuthors(Arrays.asList(author2, author3,author5));
        book4.setAuthors(Arrays.asList(author2));
        book5.setAuthors(Arrays.asList(author5));

       // System.out.println(book1.getNumberOfPages());
        Arrays.stream(books)
               .filter( (n) -> n.getNumberOfPages() > 200)
                //.forEach(System.out::println);
                .forEach((from) -> System.out.println("Book with number of pages more 200 :" + from.getTitle()));

        Arrays.stream(books)
                .filter( (n) -> n.getNumberOfPages() > 200)
                //.forEach(System.out::println);
                .forEach((from) -> System.out.println("Book with number of pages more 200 :" + from.getTitle()));







    }
}
