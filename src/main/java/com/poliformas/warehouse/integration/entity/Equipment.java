package com.poliformas.warehouse.integration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column; 

@Entity
@Table(name="WAREHOUSE_EQUIPMENTS")


public class Equipment {

	@Id
	@Column(name="ID_Equipment")
	@GeneratedValue
	private int IdEquipment;
	
	@Column(name="ID_Department")
	private int IdDepartment;
	
	@Column(name="ID_Branch")
	private int IdBranch;
	
	@Column(name="ID_Mark")
	private int IdMark;

	public int getIdEquipment() {
		return IdEquipment;
	}

	public void setIdEquipment(int idEquipment) {
		IdEquipment = idEquipment;
	}

	public int getIdDepartment() {
		return IdDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		IdDepartment = idDepartment;
	}

	public int getIdBranch() {
		return IdBranch;
	}

	public void setIdBranch(int idBranch) {
		IdBranch = idBranch;
	}

	public int getIdMark() {
		return IdMark;
	}

	public void setIdMark(int idMark) {
		IdMark = idMark;
	}
	
	
	
	
}
