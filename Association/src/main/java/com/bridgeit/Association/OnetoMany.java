package com.bridgeit.Association;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Product;
import com.bridgeit.model.Shop;

public class OnetoMany {

	public static void main(String[] args) {
		
		Session session=new Configuration().configure("onetomany.cfg.xml")  
                .buildSessionFactory().openSession(); 

		 Transaction t = session.beginTransaction();
		 
		 
		 Shop sh = new Shop();
		 sh.setName("vinayaka");
		 sh.setId(111);
		 
		 
		 Product p1=new Product();
		 p1.setName("clinic");
		 
		 Product p2=new Product();
		 p2.setName("daud");
		 
		 
		 Set<Product> pro = new HashSet<Product>();
		 pro.add(p1);
		 pro.add(p2);
		
		 
		 session.save(sh);
		
		 
		 t.commit();
		 session.close();
		 System.out.println("Success");
		 
	}

}
