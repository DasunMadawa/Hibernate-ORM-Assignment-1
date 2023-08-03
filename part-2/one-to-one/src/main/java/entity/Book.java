package entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    private String bookId;
    private String title;
    private int pages;

    @OneToOne
    private Author author;

    public Book(String bookId, String title, int pages, Author author) {
        this.bookId = bookId;
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public Book(String bookId, String title, int pages) {
        this.bookId = bookId;
        this.title = title;
        this.pages = pages;
    }

    public Book() {
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
