package com.cetpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SimCard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String operator;
	private String phoneNo;
	public SimCard() {}
	public SimCard(String operator, String phoneNo)
	{
		this.operator = operator;
		this.phoneNo = phoneNo;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
