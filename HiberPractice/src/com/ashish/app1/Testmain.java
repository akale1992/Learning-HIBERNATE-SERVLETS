package com.ashish.app1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration confg = new AnnotationConfiguration();
		confg.configure("hibernate.cfg.xml");
		SessionFactory ssf = confg.buildSessionFactory();
		Session session =ssf.openSession();
		Transaction tt = session.beginTransaction();
		
		Student st1 = new Student();
		st1.setFname("Ashish");
		st1.setLname("Kale");
		Student st2 = new Student();
		st2.setFname("Mangesh");
		st2.setLname("Kale");
		Student st3 = new Student();
		st3.setFname("Nandu");
		st3.setLname("Kale");

		session.save(st1);
		session.save(st2);
		session.save(st3);
		tt.commit();
		
		session.close();
		
		

	}

}
