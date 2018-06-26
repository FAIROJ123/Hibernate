package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("NewEmplolyee")
public class NewEmployee extends Emp_heirarchy{

	@Column(name="designation")
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
		
	
}
