package com.poliformas.warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.dao.EquipmentDAO;
import com.poliformas.warehouse.integration.entity.Equipment;
import com.poliformas.warehouse.service.EquipmetService;



public class EquipmentServiceImpl  implements EquipmetService{
	
	@Autowired
	private EquipmentDAO equipmentDAO;

	
	public void saveEquipment(Equipment equipment) {
		
		equipmentDAO.saveEquipment(equipment);
	}

	public void updateEquipment(Equipment equipment) {
		equipmentDAO.updateEquipment(equipment);
		
	}

	public void deleteEquipment(Equipment equipment) {
		equipmentDAO.deleteEquipment(equipment);
		
	}

	public Equipment findEquipment(Equipment equipment) {
		
		return  equipmentDAO.findEquipment(equipment);
	}


	

}
