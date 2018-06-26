package com.bridgeit.Association;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Department;
import com.bridgeit.model.Student;

public class Annotaion_onetoone {
	public static void main(String[] args) {
		Session session=new Configuration().configure("onetoone_annotation.cfg.xml")  
                .buildSessionFactory().openSession(); 

		 Transaction t = session.beginTransaction();
		 
		 Student s = new Student();
		 s.setName("Rossy");
		 
		 
		 Department d = new Department();
		 d.setName("CSE");
		 
		 s.setDepartment(d);
		 
		 session.persist(s);
		 session.persist(d);
		 t.commit();
		 session.close();
		 System.out.println("Success");
	}

}
