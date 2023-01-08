package com.storingtodb.entity;

public class Register {
	
	private String name;
	private String email;
	private String pass;
	private Long mob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Long getMob() {
		return mob;
	}
	public void setMob(Long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", email=" + email + ", pass=" + pass + ", mob=" + mob + "]";
	}

}
