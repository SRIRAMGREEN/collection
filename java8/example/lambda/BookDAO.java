package com.java8.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101,"CoreJava",100));
        books.add(new Book(102,"Hibernate",200));
        books.add(new Book(101,"SpringBoot",400));

        return books;
    }

}

