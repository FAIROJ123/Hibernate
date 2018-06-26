package com.bridgeit.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.bridgeit.model.Employee1;




public class Test {
	public static void main(String[] args) {  
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
	    Session session=sessionFactory.openSession();  
	      
	    Transaction t=session.beginTransaction();  
	      
	    Employee1 e1=new Employee1();  
	    e1.setId(1005);  
	    e1.setFirstName("sonoo");  
	    e1.setLastName("jaiswal");  
	      
	    Employee1 e2=new Employee1();  
	    e2.setId(1006);  
	    e2.setFirstName("vimal");  
	    e2.setLastName("jaiswal");  
	      
	    session.persist(e1);  
	    session.persist(e2);  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("successfully saved");  
	}  
}
