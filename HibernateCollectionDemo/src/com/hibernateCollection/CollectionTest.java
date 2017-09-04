package com.hibernateCollection;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class CollectionTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		College college = new College(101, "BMSCE");
		Student student = new Student(1001, "DHARMPAL",101);
		Student student2 = new Student(1002, "kansujia", 101);
		Student student3 = new Student(1003, "JOY",101);
		session.save(college);
		session.save(student);
		session.save(student2);
		session.save(student3);
		session.beginTransaction().commit();
		session.refresh(college);
	}

}
