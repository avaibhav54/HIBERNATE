package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_JOIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		Query q=s.createQuery("select q.question,q.qid,a.aid,a.answer from questions q INNER JOIN q.ans a");
		
		List<Object[]>lis=q.getResultList();
		for(Object[] ar:lis)
		{
			System.out.println(Arrays.toString(ar));
		}
		s.close();
		factory.close();
	}

}
