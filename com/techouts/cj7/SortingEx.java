package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class Book implements Comparable<Book> {
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String name;
    int id;

    public int compareTo(Book b) {
        return this.name.compareTo(b.name);
    }
}

public class SortingEx {
    private static final Logger logger = Logger.getLogger(SortingEx.class.getName());

    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Book book = new Book(1, "Book3");
        Book book1 = new Book(2, "Book2");
        Book book2 = new Book(3, "book1");
        list.add(book);
        list.add(book1);
        list.add(book2);
        Collections.sort(list);
        for (Book b : list) {
            logger.log(Level.INFO, "Book name : {0} Book id : {1}", new Object[]{b.name, b.id});
        }
    }
}
