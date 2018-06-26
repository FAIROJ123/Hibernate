package com.bridgeit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
 private int id;
 private String name;
 private Department department;
 public Student()
 {
	 
 }
 @Id
 @GeneratedValue
 @Column(name="id")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@OneToOne(cascade = CascadeType.ALL)
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
 
}
