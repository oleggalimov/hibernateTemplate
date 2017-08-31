package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibernateUtil {
    private static final SessionFactory ourSessionFactory = buildSessionFactory();

    public static SessionFactory buildSessionFactory () {
        try {
            SessionFactory sf = new Configuration().configure().buildSessionFactory();

            return sf;


        } catch (Throwable ex) {
            System.out.printf("Ошибка создания CF: "+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory () {
        return ourSessionFactory;
    }
}
