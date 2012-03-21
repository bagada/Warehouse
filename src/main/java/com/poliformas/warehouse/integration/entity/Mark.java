package com.poliformas.warehouse.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WAREHOUSE_MARKS")
public class Mark {
	
	@Id
	@Column(name="ID_Mark")
	@GeneratedValue
	private int id_mark;
	
	@Column(name="Name")
	private String name;

	public int getId_mark() {
		return id_mark;
	}

	public void setId_mark(int id_mark) {
		this.id_mark = id_mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
