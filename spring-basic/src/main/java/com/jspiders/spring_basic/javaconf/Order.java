package com.jspiders.spring_basic.javaconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class Order {
	
	@Value("1234")
	private String orderid;
	
	@Value("560087")
	private String pincode;
	
	@Autowired
	private Restaurent restaurent;
	public Order() {
		System.out.println(this.getClass().getSimpleName()+" object created");
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public void setRestaurent(Restaurent restaurent) {
		this.restaurent = restaurent;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", pincode=" + pincode + ", restaurent=" + restaurent + "]";
	}

}
