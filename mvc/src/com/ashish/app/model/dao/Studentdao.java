package com.ashish.app.model.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.ashish.app.dto.*;

public class Studentdao {

		public Studentdto addStudent (Studentdto dto)
		{
		Configuration configuration=new Configuration().configure();
		 SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction transaction=session.beginTransaction();
		 
		 transaction.begin();
		 
		 
		 session.save(dto);
		 transaction.commit();
		 session.close();
		
		
			return dto;
			
		}

	

}
