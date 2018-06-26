package com.bridgeit.tableperheirarchy;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Contract_Employee;
import com.bridgeit.model.Employee;
import com.bridgeit.model.Regular_Employee;

public class MainTest {
	public static void main(String[] args) {  
	    Session session=new Configuration().configure("perheirarchy.cfg.xml")  
	                        .buildSessionFactory().openSession();  
	  
	    Transaction t=session.beginTransaction();  
	      
	    Employee e1=new Employee();  
	    e1.setFirstName("sonoo");
	    e1.setLastName("rani");
	      
	    Regular_Employee e2=new Regular_Employee();  
	    e2.setFirstName("Vivek");
	    e2.setLastName("kumar");
	    e2.setSalary(50000);  
	    e2.setBonus(5);  
	      
	    Contract_Employee e3=new Contract_Employee();  
	    e3.setFirstName("Arjun");
	    e3.setLastName("kumar");
	    e3.setPay_per_hour(1000);  
	    e3.setContract_duration("15 hours");  
	      
	    session.persist(e1);  
	    session.persist(e2);  
	    session.persist(e3);  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("success");  
	}  
}
