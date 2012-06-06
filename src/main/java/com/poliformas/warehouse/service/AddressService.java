package com.poliformas.warehouse.service;

import com.poliformas.warehouse.integration.entity.Address;

public interface AddressService {
	
	public void saveAddress(Address address);
	public void updateAddress(Address address);
	public void deleteAddress(Address address);
	public Address findAddress(Address address);
}
