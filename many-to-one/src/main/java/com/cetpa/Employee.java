package com.cetpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee 
{
	@Id
	private int eid;
	private String name;
	private int salary;
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
	public Employee() {}
	public Employee(int eid, String name, int salary, Department department) 
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
