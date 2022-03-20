package package_faisal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory s = new Configuration().configure().buildSessionFactory();
        Session ses = s.openSession();
        Transaction t = ses.beginTransaction();
        
        Employee e = new Employee();
        e.setId(1);
        e.setFirstName("Samm");
        e.setLastName("khann");
        
        ses.save(e);
        t.commit();
        System.out.println("inserted successfully");
        s.close();
        ses.close();
    }
}
