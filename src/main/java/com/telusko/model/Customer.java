package com.telusko.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;

private String firstname;

private String lastName;

private String city;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Customer(Integer id, String firstname, String lastName, String city) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastName = lastName;
	this.city = city;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", city=" + city + "]";
}

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


}
