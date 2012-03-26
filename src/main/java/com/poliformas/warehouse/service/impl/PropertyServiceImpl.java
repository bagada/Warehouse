package com.poliformas.warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.entity.Property;
import com.poliformas.warehouse.service.PropertyService;

public class PropertyServiceImpl implements PropertyService {

	@Autowired 
	private PropertyService propertyDAO;
	

	public void saveProperty(Property property) {
		propertyDAO.saveProperty(property);
		
	}

	public void updateProperty(Property property) {
		propertyDAO.updateProperty(property);
		
	}

	public void deleteProperty(Property property) {
		propertyDAO.deleteProperty(property);
	}

	public Property findProperty(Property property) {
		return propertyDAO.findProperty(property);
	}

}
