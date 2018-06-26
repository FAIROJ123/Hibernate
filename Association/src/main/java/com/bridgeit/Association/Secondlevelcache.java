package com.bridgeit.Association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Employee;

public class Secondlevelcache {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("employee.cfg.xml");  
		SessionFactory factory=cfg.buildSessionFactory();  
		      
		    Session session1=factory.openSession();  
		    
		    Employee e =(Employee)session1.load(Employee.class,121);  
		    e.setName("Fairoj");
		    e.setSalary("150000");
		    System.out.println("");
		    System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());  

		    
		    Session session2=factory.openSession(); 
		    Employee emp2 =(Employee)session1.load(Employee.class,121); 
		    e.setName("Fairoj");
		    e.setSalary("150000");
		    System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());  

		    
	}

}
