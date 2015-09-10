package com.ashish.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UniversityDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config =new Configuration();
		config.configure("University.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		College col1 = new College();
		col1.setId(1);
		col1.setCname("SRPCE");
		
		College col2 = new College();
		col1.setCname("YCCE");
		
		College col3 = new College();
		col1.setCname("NYSS");
		
        List<College> colleges = new ArrayList<College>();
        colleges.add(col1);
        colleges.add(col2);
        colleges.add(col3);
        
        University university = new University();
        university.setUid(1);
        university.setUname("RTMNU");
        university.setCollege(colleges);
        
        session.save(university);
        tx.commit();
        session.close();
	}

}
