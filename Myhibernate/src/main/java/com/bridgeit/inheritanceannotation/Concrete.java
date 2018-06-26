package com.bridgeit.inheritanceannotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.ConcreteEmp;
import com.bridgeit.model.ConcreteRegular;
import com.bridgeit.model.Emp_heirarchy;
import com.bridgeit.model.NewEmployee;
import com.bridgeit.model.Regular_Emp2;

public class Concrete {

	public static void main(String[] args) {

		 Session session=new Configuration().configure("concrete_annotation.cfg.xml")  
                 .buildSessionFactory().openSession();  

Transaction t=session.beginTransaction();  


		ConcreteEmp e1 = new ConcreteEmp();
		e1.setName("Vali");
		
        ConcreteRegular e2 = new ConcreteRegular();
        e2.setName("HaseenaBanu");
        e2.setId(11);
        e2.setSalary(150000);
		session.persist(e1);

		session.persist(e2);

		t.commit();
		session.close();

		System.err.println("Success");
	}

}
