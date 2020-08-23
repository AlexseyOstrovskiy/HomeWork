package com.company;

import java.util.List;

public class Book {
    private String title;
    private int numberOfPages;
    private List<Author> authors;

    public Book(String title, int numberOfPages){
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public static int compare (Book book1, Book book2){
        if(book1.getNumberOfPages() > book2.getNumberOfPages())
            return 1;
        return -1;
    }
}
