package com.cetpa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(generator = "person_seq")
	@SequenceGenerator(name = "person_seq",initialValue = 101,allocationSize = 1)
	private int pid;
	private String name;
	private String city;
	@OneToMany(cascade = CascadeType.ALL)
	private List<SimCard> simCards;
	
	public Person() {}
	public Person(String name, String city, List<SimCard> simCards)
	{
		this.name = name;
		this.city = city;
		this.simCards = simCards;
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

	public List<SimCard> getSimCards() {
		return simCards;
	}

	public void setSimCards(List<SimCard> simCards) {
		this.simCards = simCards;
	}
	
}
