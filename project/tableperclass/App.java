package com.faisal;
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
e.setEmp_name("azim");
e.setDept("IT");

PayrollEmp p = new PayrollEmp();
p.setEmp_name("Ramu");
p.setDept("IT");
p.setFixed_salary(12434.23);
p.setIncrement(3000);


ContractEmp c = new ContractEmp();
c.setEmp_name("sameer");
c.setDept("Admin");
c.setContract_period("10 hrs");
c.setSalary_perhour(1200);

	ses.save(e);
	ses.save(p);
	ses.save(c);
	t.commit();
	ses.close();
	
	System.out.println("success");

    }
}