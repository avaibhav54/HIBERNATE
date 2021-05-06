package com.SQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		NativeQuery nq = s.createSQLQuery("select * from student");
		
		List<Object[]> list = nq.list();
		for(Object[] st:list)
		{
			System.out.println(Arrays.toString(st));
		}
	}

}
