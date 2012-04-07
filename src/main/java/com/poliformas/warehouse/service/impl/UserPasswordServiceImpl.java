package com.poliformas.warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.dao.UserPasswordDAO;
import com.poliformas.warehouse.integration.entity.UserPassword;
import com.poliformas.warehouse.service.UserPasswordService;

public class UserPasswordServiceImpl implements UserPasswordService{

	@Autowired
	private UserPasswordDAO userPasswordDAO;
	
	public UserPassword findByUserAndPasword(String username, String password) {
		return userPasswordDAO.findByUserAndPasword(username, password);
	}

	public void saveUserPassword(UserPassword userPassword) {
		userPasswordDAO.saveUserPassword(userPassword);
	}

}
