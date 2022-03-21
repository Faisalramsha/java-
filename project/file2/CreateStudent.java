package com.faisal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateStudent {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("abc");
		student.setEmail("lmn@gmail.com");
		student.setCourse("cpp");
		student.setPhone(900929455);
		student.setFees(499.55);
		
		// create session factory object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		//getting sesion object from session factory
		Session session = sessionFactory.openSession();
		
		//getting transaction object from session object
		session.beginTransaction();
		
		session.save(student);
		System.out.println("record inserted");
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		}
	}