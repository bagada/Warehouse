package com.poliformas.warehouse.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WAREHOUSE_ADDRESS")
public class Address {
	
	@Id
	@Column(name = "ID_Address")
	@GeneratedValue
	private int idAddress;
	
	@Column (name = "State")
	private String state;
	
	@Column (name = "City")
	private String city;
	
	@Column (name = "Street")
	private String street;
	
	@Column (name = "Phone_Number")
	private String phoneNumber;

	public int getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
