package com.cetpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personinfo")
public class Person 
{
	@Id
	@Column(name="person_id")
	private int pid;
	@Column(name="person_name")
	private String name;
	@Column(name="person_city")
	private String city;
	@Column(name="person_phone")
	private String phone;
	@Column(name="person_age")
	private int age;
	public Person() {}
	public Person(int pid, String name, String city, String phone, int age)
	{
		this.pid = pid;
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.age = age;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() 
	{
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + ", phone=" + phone + ", age=" + age + "]";
	}
	
}
