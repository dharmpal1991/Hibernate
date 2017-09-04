package com.associationMapping.MTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class ManyToOneTestDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernateMTO.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		UserDetail user = new UserDetail();
		
		Vechile vechile = new Vechile();
		Vechile vechile2 = new Vechile();
		vechile.setUser(user);
		vechile2.setUser(user);
			
		vechile.setVechileName("BIKE");
		vechile2.setVechileName("RANGROVER");
		user.setUserName("DHARMPAL");
		session.save(vechile);
		session.save(vechile2);
		session.save(user);
		session.beginTransaction().commit();
		session.close();
	}
}
