package com.bitwise.models;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Info student = new Student_Info();
	
		Student myStudent = new Student();
		student.setName("akanksha");
		myStudent.setMobileNo(9090909);
		myStudent.setStudent_Info(student);
		student.setBirthdate(new Date());
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(myStudent);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		

	}

}
