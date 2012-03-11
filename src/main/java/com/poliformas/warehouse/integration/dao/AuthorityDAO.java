package com.poliformas.warehouse.integration.dao;

import java.util.List;

import com.poliformas.warehouse.integration.entity.Authority;

public interface AuthorityDAO {
	
	public void saveAuthority(Authority authority);	
	public List<Authority> getAuthoritiesByUsername(int idUser);
	

}
