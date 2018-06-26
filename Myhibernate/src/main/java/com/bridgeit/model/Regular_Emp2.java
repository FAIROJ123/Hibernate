package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("regularEmployee")
public class Regular_Emp2 extends Emp_heirarchy {
	
	@Column(name="salary")
	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
