package com.poliformas.warehouse.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WAREHOUSE_USERS")
public class User {

	@Id
	@Column(name = "ID_USER")
	@GeneratedValue
	private int idUser;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "ENABLED")
	private Boolean enabled;
	
	@Column(name = "EMAIL")
	private String email;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
