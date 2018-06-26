package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dept")
public class Department {
	
	private int dptid;
	private String name;
    public Department() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	@Column(name="id")
	public int getDptid() {
		return dptid;
	}
	public void setDptid(int dptid) {
		this.dptid = dptid;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
