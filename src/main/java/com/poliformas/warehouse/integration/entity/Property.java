package com.poliformas.warehouse.integration.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "WHAREHOUSE_WHAREHOUSE")

public class Property { 
	@Id
	@Column(name ="ID_PROPERTIES")
	@GeneratedValue
	private  int idproperties;

	@Column(name ="ID_EQUIPMENT")
	private  int idequipment;
	
	@Column(name ="CODE")
	private   String code;
	
	@Column(name ="DATE_BUY")
	private  Date datebuy;
	
	@Column(name ="DATE_WARRANTY")
	private  Date datewarranty;
	
	@Column(name ="SERIE")
	private  int serie;

	public int getIdproperties() {
		return idproperties;
	}

	public void setIdproperties(int idproperties) {
		this.idproperties = idproperties;
	}

	public int getIdequipment() {
		return idequipment;
	}

	public void setIdequipment(int idequipment) {
		this.idequipment = idequipment;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDatebuy() {
		return datebuy;
	}

	public void setDatebuy(Date datebuy) {
		this.datebuy = datebuy;
	}

	public Date getDatewarranty() {
		return datewarranty;
	}

	public void setDatewarranty(Date datewarranty) {
		this.datewarranty = datewarranty;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}
}
