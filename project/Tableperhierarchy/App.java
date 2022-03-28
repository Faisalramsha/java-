package com.faisal;

import org.hibernate.Session;

import com.faisal.entity.Employee;
 
public class App{
	public static void main(String[] args) {
		SessionFactory s = new Configuration().configure().buildSessionFactory()};
		Session ses = s.openSession();
		Transaction t = ses.beginTransaction();
		
		Employee e = new employee();
		e.setEmp_name=("Ravi");
		e.set_Dep=("IT");
		
		
		PayrollEmp p = new PayrollEmp();
		p.setEmp_name("Modassir");
		p.setDep("IT");
		p.setFixed_salary(35332.43);
		p.setIncrement(500);
		
	
		ContractEmp c = new ContractEmp();
		c.setEmp_name("Faisal");
		c.setDep("Admin");
		c.setSalary_perhour(1200);
		c.setContract_period("11 hours");
		
		ses.save(p);
		ses.save(c);
		ses.save(e);
		
		t.commit();
		ses.close();
	System.out.println("Success");	

		
		
		
	}
