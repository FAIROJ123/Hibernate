package com.bridgeit.HQL;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Applicant;

public class SelectQuary {
	public static void main(String[] args) {
		Session session = new Configuration().configure("hql.cfg.xml").buildSessionFactory().openSession();
		session.beginTransaction();
		
		@SuppressWarnings("rawtypes")
        Query query = session.createQuery("from Applicant");
        @SuppressWarnings("unchecked")
		List<Applicant> list = query.getResultList();
        System.out.println("Number of Applicants present--> "+list.size());
        for (Applicant applicant : list) {
           
            System.out.println(applicant.getId());
            System.out.println(applicant.getFirstname());
        }
       
        session.close();
    }
	

}
