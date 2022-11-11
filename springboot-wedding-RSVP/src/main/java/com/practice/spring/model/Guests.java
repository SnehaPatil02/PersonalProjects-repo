package com.practice.spring.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wedding_rsvp")
public class Guests {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String fullName;
	
	@Column
	private Time time;
	
	@Column
	private int noOfPeople;
	
	@Column
	private long phoneNo;
	
	@Column
	private boolean isComing;
	
	public Guests() {
		super();
	}
	
	public Guests(String fullName, Time time, int noOfPeople, long phoneNo, boolean isComing) {
		super();
		this.fullName = fullName;
		this.time = time;
		this.noOfPeople = noOfPeople;
		this.phoneNo = phoneNo;
		this.isComing = isComing;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isComing() {
		return isComing;
	}

	public void setComing(boolean isComing) {
		this.isComing = isComing;
	}
	
}
