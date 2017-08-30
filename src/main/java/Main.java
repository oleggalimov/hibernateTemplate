import dto.record;
import org.hibernate.Session;
import util.hibernateUtil;

public class Main {
    public static void main(String[] args) {
        record r = new record("test");
        Session s = hibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(r);
        s.getTransaction().commit();
        
        s.close();

    }
}