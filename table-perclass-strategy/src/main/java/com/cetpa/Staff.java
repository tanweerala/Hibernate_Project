package com.cetpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Staff 
{
	@Id
	private int staffid;
	private String name;
	private String address;
	private String phone;
	private String emailid;
	public Staff() {}
	public Staff(int staffid, String name, String address, String phone, String emailid) 
	{
		this.staffid = staffid;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.emailid = emailid;
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
