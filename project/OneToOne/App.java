package com.faisal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory s=new Configuration().configure().buildSessionFactory();
	     Session ses =s.openSession();
	     Transaction t=ses.beginTransaction();
	     Employee e=new Employee();
	     e.setName("faisal");
	     Employee e1=new Employee();
	     e1.setName("Alam");
	     
	     Address a=new Address();
	     a.setHouseno("Naya tola");
	     a.setCity("Phulwari sharif");
	     a.setState("Patna");
	     a.setCountry("India");
	     a.setPincode(801505);

	     Address a1=new Address();
	     a1.setHouseno("121-e");
	     a1.setCity("Patna");
	     a1.setState("Bihar");
	     a1.setCountry("India");
	     a1.setPincode(801505);
	     
	     e.setAddress(a);
	     e1.setAddress(a1);
	     a.setEmployee(e);
	     a1.setEmployee(e1);
	     ses.save(e);
	     ses.save(e1);
	     t.commit();
	     ses.close();
	     System.out.println("data added successfully");
	     
	     
	     
	     
	     
    }
}