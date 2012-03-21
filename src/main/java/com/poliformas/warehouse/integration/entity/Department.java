package com.poliformas.warehouse.integration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name = "WAREHOUSE_DEPARTMENTS")
public class Department {
	
	@Id
	@Column (name = "ID_Department")
	@GeneratedValue
	private int idDepartment;
	
	@Column (name = "ID_Branch")
	private int idBranch;
	
	@Column (name = "Name")
	private String name;

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public int getIdBranch() {
		return idBranch;
	}

	public void setIdBranch(int idBranch) {
		this.idBranch = idBranch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
