package com.hibernate.practice.hibernatePractice;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory  factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	student st=new student();
    	st.setId(1186);
    	st.setName("monark");
    	st.setCity("moradabad");
    	System.out.println(st);
    
    	
    	address ad=new address();
    	ad.setStreet("Street 1");
    	ad.setCity("Amroha");
    	ad.setOpen(true);
    	ad.setAddedDate(new Date());
    	ad.setX(123.21);
    	ad.setAddressId(0);
    	
    	Session session=factory.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(st);
    	session.save(ad);
    	tx.commit();
    	
    	session.close();
    	
    	
    	
    }
}
