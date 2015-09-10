package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Employeedao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure("Employee.cfg.xml");
//		config.addResource("Employee.hbm.xml");
//		config.addResource("Address.hbm.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		
		Address add = new Address();
//		add.setAdd_id(1);
		add.setCity("Nagpur");
		add.setState("MH");
		
		Address add1 = new Address();
//		add.setAdd_id(1);
		add.setCity("Bangalore");
		add.setState("KA");
		
		session.save(add);
		session.save(add1);
		tx.commit();
		session.close();
		
		session = factory.openSession();
		tx = session.beginTransaction();
		tx.begin();
		Employee emp = new Employee();
//		emp.setId(1);
		emp.setName("Ashish Kale");
		emp.setEmail("a@gmail.com");
		emp.setDob("12-May-1993");
		emp.setAddress(add);
		emp.setAddress(add1);
		session.save(emp);
		tx.commit();
		session.close();
		

	}

}
