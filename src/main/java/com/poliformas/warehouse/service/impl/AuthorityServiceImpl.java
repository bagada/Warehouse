package com.poliformas.warehouse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.dao.AuthorityDAO;
import com.poliformas.warehouse.integration.entity.Authority;
import com.poliformas.warehouse.service.AuthorityService;

public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	private AuthorityDAO authorityDAO; 
	public void saveAuthority(Authority authority) {
		authorityDAO.saveAuthority(authority);
	}

	public List<Authority> getAuthoritiesByUsername(int idUser) {
		return authorityDAO.getAuthoritiesByUsername(idUser);
	}

}
