package com.bridgeit.Association;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Lands;
import com.bridgeit.model.Person;

public class ManytoOne {

	public static void main(String[] args) {
		Session session=new Configuration().configure("manytoone.cfg.xml")  
                .buildSessionFactory().openSession(); 

		 Transaction t = session.beginTransaction();
		 
		 Person p = new Person();
		 p.setName("Fairoj");
		 p.setUid(123);
		 
		 Lands lan = new Lands();
		 lan.setName("Govandi");
		 lan.setLandid(1);
		 
         p.setLand(lan);
         
         session.save(p);
         
         
         
         t.commit();
         session.close();
         System.out.println("Success");
	}

}
