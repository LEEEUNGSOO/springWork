package com.multi.di.di5;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "bookstore2")
public class BookStore2 {

    @Resource(name = "book2")
    private Book book;

    public BookStore2() {
    }

    public BookStore2(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
    @Resource(name = "book1")
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookStore2{" +
                "book=" + book +
                '}';
    }
}
