import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Author author = new Author("A001" , "Senura" , "Horana" , "0715986235");
        Book book = new Book("B001" , "Personal Bio" , 450 , author );

        Book book1 = new Book("B002" , "Personal Bio" , 480);
        Author author1 = new Author("A002" , "Ransika" , "Panadura" , "0762875394");
        book1.setAuthor(author1);

        session.persist(author);
        session.persist(book);

        session.persist(book1);
        session.persist(author1);

        transaction.commit();
        session.close();

    }

}
