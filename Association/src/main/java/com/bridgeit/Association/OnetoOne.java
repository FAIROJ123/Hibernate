package com.bridgeit.Association;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Address;
import com.bridgeit.model.Employee;

public class OnetoOne {

	public static void main(String[] args) {
		 Session session=new Configuration().configure("emp.cfg.xml")  
                 .buildSessionFactory().openSession(); 

		 Transaction t = session.beginTransaction();
		 
		 Employee e = new Employee();
		 e.setName("Fairoj");
		 e.setEmail("Fairoj@gmail.com");
		 
		 Address ad = new Address();
		 
		 ad.setStreet("b.c.colony");
		 ad.setCity("Chittor");
		 ad.setDist("Hyderabad");
		 
		 e.setAddress(ad);
		 ad.setEmployee(e);
		 
		 session.persist(e);
		 session.persist(ad);
		 
		 t.commit();
		 session.close();
		 System.out.println("Success");
		 
		 }

}
