package com.jspiders.spring_basic.javaconf;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public Student() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}

}
