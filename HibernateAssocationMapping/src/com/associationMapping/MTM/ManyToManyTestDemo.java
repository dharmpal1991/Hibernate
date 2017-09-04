package com.associationMapping.MTM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ManyToManyTestDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernateMTM.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		UserDetail user1 = new UserDetail();
		UserDetail user2 = new UserDetail();
		user1.setUserName("Dharmpal");
		user2.setUserName("Kansujia");
		
		Vechile vechile1 = new Vechile();
		Vechile vechile2 = new Vechile();
		vechile1.setVechileName("BIKE");
		vechile2.setVechileName("AUDI");
		
		vechile1.getUser().add(user1);
		vechile1.getUser().add(user2);
		
		vechile2.getUser().add(user2);
		vechile2.getUser().add(user1);
		
		user1.getVechile().add(vechile1);
		user1.getVechile().add(vechile1);
		
		user2.getVechile().add(vechile2);
		user2.getVechile().add(vechile2);
		
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
	}
}
