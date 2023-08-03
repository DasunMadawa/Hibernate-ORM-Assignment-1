import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Author author1 = new Author("A001" , "Senura" , "Horana" , "0785986327" );
        Author author2 = new Author("A002" , "Ransika" , "Panadura" , "0762398651" );

        Book book1 = new Book("B001" , "Basic Concepts of chemistry" , 400 );
        Book book2 = new Book("B002" , "Basic Concepts of physics" , 380 );
        Book book3 = new Book("B003" , "Basic Concepts of combined maths" , 405 );
        Book book4 = new Book("B004" , "Basic Concepts of bio" , 300 );
        Book book5 = new Book("B005" , "Basic Concepts of tec" , 338 );

        List<Author> authorList1 = new ArrayList<>();
        authorList1.add(author1);
        authorList1.add(author2);

        List<Author> authorList2 = new ArrayList<>();
        authorList2.add(author1);

        List<Author> authorList3 = new ArrayList<>();
        authorList3.add(author2);

        List<Book> bookList1 = new ArrayList<>();
        bookList1.add(book1);
        bookList1.add(book2);
        bookList1.add(book3);

        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(book4);
        bookList2.add(book5);

        author1.setBooks(bookList1);
        author1.setBooks(bookList2);

        book1.setAuthors(authorList1);
        book2.setAuthors(authorList2);
        book3.setAuthors(authorList3);
        book4.setAuthors(authorList1);
        book5.setAuthors(authorList2);

        session.persist(author1);
        session.persist(author2);

        session.persist(book1);
        session.persist(book2);
        session.persist(book3);
        session.persist(book4);
        session.persist(book5);

        transaction.commit();
        session.close();


    }

}
