package com.cetpa;

import javax.persistence.Entity;

@Entity
public class NonTeachingStaff extends Staff 
{
	private String skill;
	public NonTeachingStaff() {}
	public NonTeachingStaff(int staffid, String name, String address, String phone, String emailid, String skill) 
	{
		super(staffid, name, address, phone, emailid);
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}
