package util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibernateUtil {
    private static final SessionFactory ourSessionFactory = buildSessionFactory();

    public static SessionFactory buildSessionFactory () {
        try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");


            return configuration.buildSessionFactory( new StandardServiceRegistryBuilder().applySettings( configuration.getProperties() ).build() );


        } catch (Throwable ex) {
            System.out.printf("Ошибка создания CF: "+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory () {
        return ourSessionFactory;
    }
}
