package com.poliformas.warehouse.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poliformas.warehouse.integration.dao.EquipmentDAO;
import com.poliformas.warehouse.integration.entity.Equipment;

public class EquipmentDAOImpl extends HibernateDaoSupport implements EquipmentDAO {

	public void saveEquipment(Equipment equipment) {
		getHibernateTemplate().save(equipment);
		
	}

	public void updateEquipment(Equipment equipment) {
		getHibernateTemplate().update(equipment);
		
	}

	public void deleteEquipment(Equipment equipment) {
		getHibernateTemplate().delete(equipment);
	}

	public Equipment findEquipment(Equipment equipment) {
		return  (Equipment) getHibernateTemplate().find(String.valueOf(equipment.getIdEquipment())).get(0);
	}
	

}
