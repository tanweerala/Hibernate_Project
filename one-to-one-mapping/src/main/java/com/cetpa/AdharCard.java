package com.cetpa;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AdharCard 
{
	@Id
	private int aid;
	private String cardNo;
	private LocalDate dateOfIssue;
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	public AdharCard() {}
	public AdharCard(int aid, String cardNo, LocalDate dateOfIssue, Person person) 
	{
		this.aid = aid;
		this.cardNo = cardNo;
		this.dateOfIssue = dateOfIssue;
		this.person = person;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public LocalDate getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(LocalDate dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
