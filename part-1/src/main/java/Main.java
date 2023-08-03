import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        save
        Book book = new Book("B001", "Hobbit", "Mr.ABC");
        session.persist(book);

//        search
        Book book1 = session.get(Book.class, "B001");
        System.out.println(book1.getBookId());
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());

//        update
        Book book2 = session.get(Book.class , "B001");
        book2.setTitle("Hobbit 1");
        book2.setAuthor("Mr.ABCD");

//        delete
        Book book3 = session.get(Book.class , "B001");
        session.remove(book3);

        transaction.commit();
        session.close();

    }

}
