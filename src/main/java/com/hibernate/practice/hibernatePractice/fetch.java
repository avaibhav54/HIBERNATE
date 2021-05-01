package com.hibernate.practice.hibernatePractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetch {

	  public static void main( String[] args ) throws IOException
	    {
	    	
	    	SessionFactory  factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    	
	    	Session session=factory.openSession();
	    	
	    	student st= session.get(student.class,1686);
	    	address ad=session.get(address.class,1);
	    	System.out.println(st);
	    	System.out.println(ad.getStreet());
	    	session.close();
	    	factory.close();
	    	
	    	
	    }
}
