package com.poliformas.warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.dao.UserDAO;
import com.poliformas.warehouse.integration.entity.User;
import com.poliformas.warehouse.service.UserService;

public class UserServiceImpl  implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}

	public void updateUser(User user) {
		userDAO.updateUser(user);
		
	}

	public User findUser(String username, String password) {
		return userDAO.findUser(username, password);
	}

	public User findByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}

	public User getUserByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}

}
