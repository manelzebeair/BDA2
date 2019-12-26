

import dz.trash.model.Photo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class MainSession {
    public static void main (String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Date d=new Date();
            Photo photo=new Photo(2,"Storage/pp.png",d);
            session.persist(photo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }



    }
}
