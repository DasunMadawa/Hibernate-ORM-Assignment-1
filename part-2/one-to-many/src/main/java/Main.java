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

        Book book1 = new Book("B001" , "Basic Concepts of chemistry" , 400 , author1);
        Book book2 = new Book("B002" , "Basic Concepts of physics" , 380 , author1);
        Book book3 = new Book("B003" , "Basic Concepts of combined maths" , 405 , author1);
        Book book4 = new Book("B004" , "Basic Concepts of bio" , 300 , author2);
        Book book5 = new Book("B005" , "Basic Concepts of tec" , 338 , author2);



        List<Book> booksList1 = new ArrayList<>();
        booksList1.add(book1);
        booksList1.add(book2);
        booksList1.add(book3);

        List<Book> booksList2 = new ArrayList<>();
        booksList2.add(book4);
        booksList2.add(book5);

        author1.setBooks(booksList1);
        author2.setBooks(booksList2);

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
