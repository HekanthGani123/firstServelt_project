package com.jspiders.spring_basic.javaconf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Restaurent {
	
	@Value("Hekanth")
	private String name;
	
	@Value("fishfry")
	private String dish;
	
	@Value("bangalore")
	private String place;
	public Restaurent() {
		System.out.println(this.getClass().getSimpleName()+" object created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Restaurent [name=" + name + ", dish=" + dish + ", place=" + place + "]";
	}

}
