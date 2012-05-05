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
	@Column(name="ID_EQUIPMENT")
	@GeneratedValue
	private int IdEquipment;
	
	@Column(name="ID_DEPARTMENT")
	private int IdDepartment;
	
	@Column(name="ID_BRANCH")
	private int IdBranch;
	
	@Column(name="ID_MARK")
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
