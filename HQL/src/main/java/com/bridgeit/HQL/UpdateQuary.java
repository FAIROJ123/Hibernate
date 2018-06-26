package com.bridgeit.HQL;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateQuary {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hql.cfg.xml").buildSessionFactory().openSession();
		
		Query query = session.createQuery("update Applicant set education=:education where firstname=:firstname");
        query.setParameter("education", "B.tech");
        query.setParameter("firstname","Shaik");
        // Begin transaction
        Transaction t = session.beginTransaction();
        int result = query.executeUpdate();
        // Commit the transaction and close the session
        t.commit();
        System.out.println("No of rows updated: "+result);
       
        session.close();
    
	}
}
