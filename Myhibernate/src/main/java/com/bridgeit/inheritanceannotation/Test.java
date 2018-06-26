package com.bridgeit.inheritanceannotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Emp_heirarchy;
import com.bridgeit.model.NewEmployee;
import com.bridgeit.model.Regular_Emp2;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure("heirarchy_annotation.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();

		Transaction t = session.beginTransaction();
	 
		Emp_heirarchy e1=new Emp_heirarchy();
		e1.setName("vani");
		
		
		NewEmployee e2 = new NewEmployee();
		e2.setName("rani");
		e2.setDesignation("JavaDEveloper");
		
		Regular_Emp2 e3 = new Regular_Emp2();
		e3.setName("veena");
		e3.setSalary(15000);
		
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		t.commit();
		session.close();
		
		System.err.println("Success");
	}

}
