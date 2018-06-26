package com.bridgeit.HQL;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Applicant;

public class HQLmain {
	public static void main(String[] args) {
		
		Session session = new Configuration().configure("hql.cfg.xml").buildSessionFactory().openSession();
		session.beginTransaction();
		
		Applicant ap1 = new Applicant();
		ap1.setFirstname("Shaik");
		ap1.setLastname("Fairoj");
		ap1.setEducation("CSE");
		
		Applicant ap2 = new Applicant();
		ap2.setFirstname("Phani");
		ap2.setLastname("kiran");
		ap2.setEducation("B.TECH");
		
		session.save(ap1);
		session.save(ap2);
		session.flush();
		session.getTransaction().commit();
		
		session.close();
		System.out.println("Success");
	}

}
