package com.multi.di.di5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookStore {

    @Autowired
    @Qualifier("b1")
    private  Book book;//BookStore는 Book을 의존하는 설계...

    public BookStore() {
    }
    @Autowired
    public BookStore(@org.springframework.beans.factory.annotation.Qualifier("b1") Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "book=" + book +
                '}';
    }
}
