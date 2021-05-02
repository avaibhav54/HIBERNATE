package com.mapping;

import java.io.FileInputStream;
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
    	question q1=new question();
    	q1.setQid(1212);
    	q1.setQuestion("what is java");
    	answer ans=new answer(343,"java is a programming language");
    	q1.setAns(ans);
    	
    	question q2=new question();
    	q2.setQid(2214);
    	q2.setQuestion("what is hibernate");
    	answer ans2=new answer(567,"hibernate is a java framework");
    	q2.setAns(ans2);
    	
    	
    	Session session=factory.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(q1);
    	session.save(q2);
    	session.save(ans);
    	session.save(ans2);
    	tx.commit();
    	
    	
    	question nq=session.get(question.class,1212);
    	System.out.println(nq.getQid()+":"+nq.getQuestion());
    	System.out.println(nq.getAns().getAid()+":"+nq.getAns().getAnswer());
    	session.close();
    	
    	

	}

}
