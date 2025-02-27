package com.cetpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person 
{
	@Id
	@GeneratedValue
	private int pid;
	private String name;
	private String address;
	private String phone;
	private String dob;
	public Person() {}
	public Person(String name, String address, String phone, String dob)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
