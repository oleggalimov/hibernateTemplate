import dto.record;
import org.hibernate.Session;
import util.hibernateUtil;

public class Main {
    public static void main(String[] args) {

        record r = new record("This message was added with Hibernate 5 and annotations");
        Session s = hibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(r);
        s.getTransaction().commit();
        s.beginTransaction();
        r=s.get(record.class,4);
        System.out.println(r);
        r.setMessage("Измененная строка");
        s.save(r);
        s.getTransaction().commit();
        s.close();

    }
}