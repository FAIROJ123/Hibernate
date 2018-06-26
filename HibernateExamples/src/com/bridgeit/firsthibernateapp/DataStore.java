package com.bridgeit.firsthibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DataStore {
	
	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    
	    
	    cfg.configure("hibernate.config.xml");//populates the data of the configuration file  
	     
	    //creating seession factory object  
	    
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    Employee e1=new Employee();  
	    e1.setId(115);  
	    e1.setFirstname("sonoo");  
	    e1.setLastname("jaiswal");  
	      
	    session.persist(e1);//persisting the object  
	      
	    t.commit();//transaction is commited  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	      
	}  
	

}
