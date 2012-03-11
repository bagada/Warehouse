package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.User;

public interface UserDAO {
	
	
	public void saveUser(User user);
	public void updateUser(User user);	
	public User findUser(String username,String password);
	public User findByUsername(String username);
	public User getUserByUsername(String username);
	
	

}
