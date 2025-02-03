package com.ju.simpleprograms.BookManage;

public class Book {

    private String bookName;
    private String publisher;
    private String author;


    public Book() { // (매개변수 있는 생성자 추가시 명시적으로 선언 필요)

    }

    public Book(String bookName, String publisher, String author) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
