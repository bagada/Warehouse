package com.poliformas.warehouse.service;

import com.poliformas.warehouse.integration.entity.Equipment;

public interface EquipmetService { 
	
	public void saveEquipment(Equipment equipment);
	public void updateEquipment(Equipment equipment);
	public void deleteEquipment(Equipment equipment);
	public Equipment findEquipment(Equipment equipment);

}
