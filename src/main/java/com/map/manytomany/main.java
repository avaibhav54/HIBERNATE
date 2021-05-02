package com.map.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    	SessionFactory  factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    
    	employee e1=new employee();
    	e1.setEid(12);
    	e1.setEname("ram");
    	
    	employee e2=new employee();
    	e2.setEid(13);
    	e2.setEname("shyaam");
    	
    	project p1=new project();
    	project p2=new project();
    	p1.setPid(2);
    	p2.setPid(3);
    	p1.setPname("library managemnt");
    	p2.setPname("airline reservation");
    	List<employee>pl=new ArrayList<employee>();
    	List<project>el=new ArrayList<project>();
    	pl.add(e2);
    	pl.add(e1);
    	el.add(p2);
    	el.add(p1);
    	p2.setEmp(pl);
    	Session s=factory.openSession();
    	Transaction tx=s.beginTransaction();
    	s.save(e1);
    	s.save(e2);
    	s.save(p1);
    	s.save(p2);
    	
    	tx.commit();
    	s.close();
	}

}
