package com.poliformas.warehouse.service;

import com.poliformas.warehouse.integration.entity.Property;

public interface PropertyService {
	
	public void saveProperty(Property property);
	public void updateProperty(Property property);
	public void deleteProperty(Property property);
	public Property findProperty(Property property);

}
