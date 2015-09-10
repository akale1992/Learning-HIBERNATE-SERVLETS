package com.ashish.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.addResource("Employee.hbm.xml");
		configuration.configure("hibernate.cfg.xml");
		  SessionFactory factory = configuration.buildSessionFactory();
		  Session session = factory.openSession();
		  Transaction transaction = session.beginTransaction();
		  transaction.begin();
		  
		  Employee e1 = new Employee();
//		  e1.setId(1);
		  e1.setName("Ashish");
		  session.save(e1);
		  Employee e2 = (Employee) session.load(Employee.class, 1);
		  System.out.println(e2);
		  System.out.println("============================");
		  Employee e3 = (Employee) session.get(Employee.class, 2);
		  System.out.println(e3);
		  transaction.commit();
		  session.close();

	}

}
