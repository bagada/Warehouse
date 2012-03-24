package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.Equipment;

public interface EquipmentDAO {

	public void saveEquipment(Equipment equipment);
	public void updateEquipment(Equipment equipment);
	public void deleteEquipment(Equipment equipment);
	public Equipment findEquipment(Equipment equipment);
} 