package com.map.manytoone;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.practice.hibernatePractice.address;
import com.hibernate.practice.hibernatePractice.student;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	SessionFactory  factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	questions q1=new questions();
    	q1.setQid(1212);
    	q1.setQuestion("what is java");
    	answers ans=new answers(343,"java is a programming language",q1);
    	answers ans2=new answers(567,"java has many frameworks",q1);
    	answers ans3=new answers(867,"we are using hibernate",q1);
        ArrayList<answers>ls=new ArrayList<answers>();
        ls.add(ans3);
        ls.add(ans2);
        ls.add(ans);
        q1.setAns(ls);
    	Session session=factory.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(q1);
    	session.save(ans3);
    	session.save(ans);
    	session.save(ans2);
    	tx.commit();
    	
  	
   	questions nq=session.get(questions.class,1212);
   	System.out.println(nq.getQid()+":"+nq.getQuestion());
      
   	for(answers a:nq.getAns())
   	{
   		System.out.println(a.getAnswer());
   	}
   	session.close();
    	
    	

	}

}
