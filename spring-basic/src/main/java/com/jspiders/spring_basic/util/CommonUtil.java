package com.jspiders.spring_basic.util;

public class CommonUtil {
	
	public int add(int a,int b) {
		if(a<0||b<0) {
			return 5;
		}
		
		return a+b;
	}
	
	public String check(String name,String address) {
		return "name"+" "+"address";
		
	}

}

//public int add(int a,int b) {
//	if(a<0||b<0) {
//		return 0;
//	}
//	return a+b;
//}
