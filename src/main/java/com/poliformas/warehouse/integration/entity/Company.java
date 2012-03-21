package com.poliformas.warehouse.integration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity 
@Table(name="WAREHOUSE_COMPANY")

public class Company {
	
	@Id
	@Column(name="ID_Company")
	private int idCompany;
	
	@Column(name="Name")
	private String name;

	public int getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
