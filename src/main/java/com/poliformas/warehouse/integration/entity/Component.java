package com.poliformas.warehouse.integration.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name="WAREHOUSE_COMPONENTS")

public class Component {
	
	@Id
	@Column(name="ID_Component")
	@GeneratedValue
	private int IdComponent;
	
	@Column(name="ID_Mark")
	private int IdMark;
	
	@Column(name="ID_Equipment")
	private int IdEquipment;
	
	@Column(name="ID_Warehouse")
	private int IdWarehouse;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Serie")
	private String serie;
	
	@Column(name="Model")
	private String model;
	
	@Column(name="Date_Buy")
	private Date dateBuy;

	@Column(name="Date_Warranty")
	private Date dateWarranty;
	
	@Column(name="Code")
	private String code;

	public int getIdComponent() {
		return IdComponent;
	}

	public void setIdComponent(int idComponent) {
		IdComponent = idComponent;
	}

	public int getIdMark() {
		return IdMark;
	}

	public void setIdMark(int idMark) {
		IdMark = idMark;
	}

	public int getIdEquipment() {
		return IdEquipment;
	}

	public void setIdEquipment(int idEquipment) {
		IdEquipment = idEquipment;
	}

	public int getIdWarehouse() {
		return IdWarehouse;
	}

	public void setIdWarehouse(int idWarehouse) {
		IdWarehouse = idWarehouse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getDateBuy() {
		return dateBuy;
	}

	public void setDateBuy(Date dateBuy) {
		this.dateBuy = dateBuy;
	}

	public Date getDateWarranty() {
		return dateWarranty;
	}

	public void setDateWarranty(Date dateWarranty) {
		this.dateWarranty = dateWarranty;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
