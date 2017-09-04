package com.associationMapping.OTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class OneToOneTestDemo {
	public static void main(String[] args) {
		UserDetail user = new UserDetail(); 
		Vechile vehicle = new Vechile(); 

		vehicle.setVechileName("BMW Car");
		System.out.println("hello");
		user.setUserName("Dharmpal");
		user.setVechile(vehicle); 
		System.out.println("dee");
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernateOTO.cfg.xml")
				.buildSessionFactory(); 
		Session session = sessionFactory.openSession(); 
		session.beginTransaction();
		session.save(user); 
		session.save(vehicle); 
		session.getTransaction().commit();
		session.close(); 
	}

}
