package com.bridgeit.model;

public class Address {
	
	private int aid;
	private String Street;
	private String City;
	private String Dist;
	private Employee employee;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDist() {
		return Dist;
	}
	public void setDist(String dist) {
		Dist = dist;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
