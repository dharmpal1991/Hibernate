package com.associationMapping.OTM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class OneToManyTestDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernateOTM.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Vechile vechile = new Vechile();
		UserDetail user = new UserDetail();
		Vechile vechile2 = new Vechile();
		
		vechile.setVechileName("HONDA");
		user.setUserName("DHARMPAL");
		vechile2.setVechileName("AUDI");
		user.getVechile().add(vechile);
		user.getVechile().add(vechile2);
		
		vechile.setUser(user);
		vechile2.setUser(user);
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
