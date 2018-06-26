package com.bridgeit.Association;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Course;
import com.bridgeit.model.Student;
import com.mysql.cj.xdevapi.SessionFactory;

public class ManytoMany {
	public static void main(String[] args) {

		Session session = new Configuration().configure("manytomany.cfg.xml").buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();
		
		Student st =new Student();
		st.setStudentName("Fairoj");
		
		Course c = new Course();
		c.setCourseName("CSE");
		
		Set<Course> course = new HashSet<Course>();
		course.add(c);

		st.setCourses(course);
		session.save(st);
		t.commit();
		session.close();
		System.out.println("Success ");
		
		}

}
