package com.poliformas.warehouse.service;

import com.poliformas.warehouse.integration.entity.UserPassword;

public interface UserPasswordService {

	public UserPassword findByUserAndPasword(final String username, final String password);
	public void saveUserPassword(UserPassword userPassword);
}
