package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.Property;

public interface PropertyDAO {
	
	public void saveProperty(Property property);
	public void updateProperty(Property property);
	public void deleteProperty(Property property);
	public Property findProperty(Property property);

}
