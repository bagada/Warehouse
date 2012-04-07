package com.poliformas.warehouse.service;

import java.util.List;

import com.poliformas.warehouse.integration.entity.Authority;

public interface AuthorityService {
	public void saveAuthority(Authority authority);	
	public List<Authority> getAuthoritiesByUsername(int idUser);

}
