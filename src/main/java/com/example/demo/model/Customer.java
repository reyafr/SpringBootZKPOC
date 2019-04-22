package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id; 

@Entity
public class Customer {

	@Id
	private Long customerId;
	private String firstName;
	private String lastName;
	private Date birthDate;
	
	public Customer(Long customerId, String firstName, String lastName, Date birthDate) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
