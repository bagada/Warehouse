package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.Address;

public interface AddressDAO {
	
	public void saveAddress(Address address);
	public void updateAddress(Address address);
	public void deleteAddress(Address address);
	public Address findAddress(Address address);
}
