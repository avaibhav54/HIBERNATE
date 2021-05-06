package com.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.practice.hibernatePractice.student;

public class HQLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		String query="from student where city=:x";
		
		Query q=s.createQuery(query);
		q.setParameter("x","amroha"); 

		List<student>list=q.list();
		for(student st:list)
		{
			System.out.println(st.getName()+" "+st.getCert().getCourse());
		}
		
		
		//delete
//		Query q2=s.createQuery("delete from student where city=:c");
//		q2.setParameter("c","moradabad");
//		int isdel=q2.executeUpdate();
//		
		
		//update
		Query q2=s.createQuery("update student set city='chennai' where city=:c");
		q2.setParameter("c","amroha");
		int isdel=q2.executeUpdate();
		 
		
		
		tx.commit();
		
		
		s.close();
	}

}
