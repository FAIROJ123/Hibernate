package com.bridgeit.Association;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Address;
import com.bridgeit.model.Person;

public class Bi_onetoone {
	public static void main(String[] args) {
		Session session = new Configuration().configure("bi_onetoone.cfg.xml").buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();
		Person per = new Person();
		per.setName("Phani");
		
		Address ad = new Address();
		ad.setStreet("Nalgonda");
		
		per.setAddress(ad);
		
		session.persist(per);
		session.persist(ad);

		t.commit();
		
		session.close();
		System.out.println("Success");
		
	}

}
