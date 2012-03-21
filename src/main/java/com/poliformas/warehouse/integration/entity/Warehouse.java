package com.poliformas.warehouse.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "WHAREHOUSE_WHAREHOUSE")

public class Warehouse {
	@Id
	@Column(name ="ID_WAREHOUSE")
	@GeneratedValue
	private  int idwarehouse;
	
	@Column(name ="ID_COMPONENT")
	private  int idcomponent;
	
	@Column(name ="ID_EQUIPMENT")
	private  int idequipment;
	
	@Column(name ="ID_ADDRESS")
	private  int idaddress;
	
	@Column(name ="STATUS")
	private  String status;

	public int getIdwarehouse() {
		return idwarehouse;
	}

	public void setIdwarehouse(int idwarehouse) {
		this.idwarehouse = idwarehouse;
	}

	public int getIdcomponent() {
		return idcomponent;
	}

	public void setIdcomponent(int idcomponent) {
		this.idcomponent = idcomponent;
	}

	public int getIdequipment() {
		return idequipment;
	}

	public void setIdequipment(int idequipment) {
		this.idequipment = idequipment;
	}

	public int getIdaddress() {
		return idaddress;
	}

	public void setIdaddress(int idaddress) {
		this.idaddress = idaddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
