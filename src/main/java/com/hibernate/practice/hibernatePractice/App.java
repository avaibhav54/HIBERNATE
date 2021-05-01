package com.hibernate.practice.hibernatePractice;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    public static void main( String[] args ) throws IOException
    {
    	
    	SessionFactory  factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	student st=new student();
    	st.setId(1686);
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
    	FileInputStream fis=new FileInputStream("src/main/java/com/hibernate/practice/hibernatePractice/Screenshot from 2021-04-26 07-55-49.png");
    	byte[] data =new byte[fis.available()];
    	fis.read(data);
    	ad.setImage(data);
    	
    	Session session=factory.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(st);
    	session.save(ad);
    	tx.commit();
    	
    	session.close();
    	
    	
    	
    }
}
