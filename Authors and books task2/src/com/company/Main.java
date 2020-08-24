package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("author1", (short) 10);
        Author author2 = new Author("author2", (short) 20);
        Author author3 = new Author("author3", (short) 30);
        Author author4 = new Author("author4", (short) 40);
        Author author5 = new Author("author5", (short) 50);

        Book book1 = new Book("tBook5", 300);
        Book book2 = new Book("tBook4", 200);
        Book book3 = new Book("tBook3", 100);
        Book book4 = new Book("tBook2", 400);
        Book book5 = new Book("tBook1", 500);

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

        Arrays.stream(books)
               .filter( (n) -> n.getNumberOfPages() > 200)
                //.forEach(System.out::println);
                .forEach((from) -> System.out.println("Book with number of pages more 200 :" + from.getTitle()));

        Book min = Arrays.stream(books).min(Book::compare).get();
        System.out.println("Минимальное количество страниц в книге " + min.getTitle() + ". Количество страниц " + min.getNumberOfPages());

        Book max = Arrays.stream(books).max(Book::compare).get();
        System.out.println("Максимальное количество страниц в книге " + max.getTitle() + ". Количество страниц " + max.getNumberOfPages());

        Arrays.stream(books)
                .filter( (n) -> n.getAuthors().size() == 1)
               // .forEach(System.out::println);
                .forEach((from) -> System.out.println("Book with single authors :" + from.getTitle() + from.getAuthors()));

       System.out.println("Sort the books by number of pages");
        Stream<Book> slist = Arrays.stream(books).sorted(Comparator.comparing(Book::getNumberOfPages));
        slist.forEach(e -> System.out.println(e.getTitle() + " " + e.getNumberOfPages()));

        System.out.println("Sort the books by title");
        Stream<Book> slistTitle = Arrays.stream(books).sorted(Comparator.comparing(Book::getTitle));
        slistTitle.forEach(e -> System.out.println(e.getTitle() + " " + e.getNumberOfPages()));

        System.out.println("Get list of all titles");
        Arrays.stream(books)
                .forEach(e -> System.out.println(e.getTitle()));

        System.out.println("Distinct of all authors");
        Object[] authorList = Arrays.stream(books)
                .map(x -> x.getAuthors())
                .toArray();
              // .forEach((from) -> System.out.println());
        for (int i = 0; i <authorList.length ; i++) {
            System.out.println(authorList[i]);
        }


       // System.out.println(authorList);
        //System.out.println(authorList.length);

        //min and max number of array
        int [] myArray;
        myArray = new int [5];
        myArray[0] = 854;
        myArray[1] = 34;
        myArray[2] = 54;
        myArray[3] = 3645;
        myArray[4] = 16;
//Ьинимальное значение методом перебора
       /* int min = myArray[0] + 1;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] < min){
                min = myArray[i];
            }
        }
        System.out.println("min = " + min);*/
//Максимальное значение методом перебора
       /* int max = myArray[0] - 1;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("max = " + max);
*/
//Запускаем Stream
       IntStream stream =  Arrays.stream(myArray);

//Максимальное значение при помощи stream
              Integer varMax =
                      Arrays.stream(myArray).max().getAsInt();
//Mинимальное значение при помощи stream
        Integer varMin =
                Arrays.stream(myArray).min().getAsInt();

        System.out.println("varMax = " + varMax + "  varMin = " + varMin);

               // stream.sorted().forEach(x -> System.out.println(x));
        System.out.println("************");


       // IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
        //        .limit(3).forEach(System.out::print);












    }
}
