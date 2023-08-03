package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    private String authorId;
    private String name;
    private String address;
    private String contactNo;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author(String authorId, String name, String address, String contactNo, List<Book> books) {
        this.authorId = authorId;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.books = books;
    }

    public Author(String authorId, String name, String address, String contactNo) {
        this.authorId = authorId;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }

    public Author() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
