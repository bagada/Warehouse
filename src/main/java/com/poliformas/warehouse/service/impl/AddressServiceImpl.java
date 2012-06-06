package com.poliformas.warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.dao.AddressDAO;
import com.poliformas.warehouse.integration.entity.Address;
import com.poliformas.warehouse.service.AddressService;

public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDAO addressDAO;

	public void saveAddress(Address address) {
		addressDAO.saveAddress(address);
		
	}

	public void updateAddress(Address address) {
		addressDAO.updateAddress(address);
		
	}

	public void deleteAddress(Address address) {
		addressDAO.deleteAddress(address);
		
	}

	public Address findAddress(Address address) {

		return addressDAO.findAddress(address);
	}
		
}
