package com.faisal;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App 
{
	public void saveEmp(String ename,double salary,long phone,java.sql.Date date_joining) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		Employeeex emp =new Employeeex();
		emp.setEname(ename);
		emp.setPhone(phone);
		emp.setDate_joining(date_joining);
		session.save(emp);
		t.commit();
		System.out.println("record inserted");
	}
	public static void main(String args[]) {
		App a = new App();
		a.saveEmp("faisal", 100.5, 900547654, new Date(2021,10,10));
		a.saveEmp("ali", 190.5, 709117410, new Date(2021-06-20));
	}
	
}
 