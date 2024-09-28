package com.cetpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	@Column(length = 50,unique = true)
	private String name;
	private String head;
	public Department() {}
	public Department(String name, String head) 
	{
		this.name = name;
		this.head = head;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	
}
