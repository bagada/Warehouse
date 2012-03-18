package com.poliformas.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;



@Entity
@Table (name = "WAREHOUSE_EMPLOYEES")
public class Employees {
	
	@Id
	@Column (name = "ID_Employees")
	@GeneratedValue
	private int idEmployees;
	
	@Column (name = "Name")
	private String name;

	public int getIdEmployees() {
		return idEmployees;
	}

	public void setIdEmployees(int idEmployees) {
		this.idEmployees = idEmployees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
