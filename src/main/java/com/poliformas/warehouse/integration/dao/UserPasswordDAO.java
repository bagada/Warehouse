package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.UserPassword;

public interface UserPasswordDAO {
	
	public UserPassword findByUserAndPasword(final String username, final String password);

}
