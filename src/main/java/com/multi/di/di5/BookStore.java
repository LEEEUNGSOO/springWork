package com.multi.di.di5;

public class BookStore {

    private  Book book;//BookStore는 Book을 의존하는 설계...

    public BookStore() {
    }
    public BookStore(Book book) {
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
