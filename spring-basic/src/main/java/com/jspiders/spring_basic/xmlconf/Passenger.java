package com.jspiders.spring_basic.xmlconf;





public class Passenger {
	
	private String  name;
	private String contactNumber;
	private String email;
	
	
	public Passenger() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	public Passenger(String name, String contactNumber, String email) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", contactNumber=" + contactNumber + ", email=" + email + "]";
	}

}
