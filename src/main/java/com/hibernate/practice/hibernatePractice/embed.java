package com.hibernate.practice.hibernatePractice;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class embed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    	SessionFactory  factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	student st=new student();
    	st.setId(12344);
    	st.setName("vaibhav");
    	st.setCity("amroha");
    	Certificate ct=new Certificate();
    	ct.setCourse("java for beginners");
    	ct.setDuration("3 months");
    	st.setCert(ct);
    	System.out.println(st);
    	student st2=new student();
    	st2.setId(1122333);
    	st2.setName("divyank");
    	st2.setCity("kanpur");
    	st2.setCert(new Certificate("DSA","2 months"));
    	System.out.println(st2);
    
    	
    	Session session=factory.openSession();
    	Transaction tx= session.beginTransaction();
     	session.save(st);
     	session.save(st2);
    	tx.commit();
    	
    	session.close();
    	
		factory.close();
	}

}
