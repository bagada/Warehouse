package com.poliformas.warehouse.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poliformas.warehouse.integration.dao.AddressDAO;
import com.poliformas.warehouse.integration.entity.Address;

public class AddressDAOImpl extends HibernateDaoSupport implements AddressDAO {

	public void saveAddress(Address address) {
		getHibernateTemplate().save(address);
		
	}

	public void updateAddress(Address address) {
		getHibernateTemplate().update(address);
		
	}

	public void deleteAddress(Address address) {
		getHibernateTemplate().delete(address);
		
	}

	public Address findAddress(Address address) {
		return (Address)getHibernateTemplate().get(Address.class,address.getIdAddress());
	}

}
