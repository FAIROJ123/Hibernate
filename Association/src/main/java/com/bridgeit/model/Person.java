package com.bridgeit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	
	private int uid;
	private String name;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	@Column(name="UID")
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Column(name="Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	public Lands getLand() {
		return land;
	}
	
	
	public void setLand(Lands land) {
		this.land = land;
	}
	private Lands land;

}
