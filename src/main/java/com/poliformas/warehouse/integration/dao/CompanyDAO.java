package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.Company;

public interface CompanyDAO {
	
	public void saveCompany(Company company);
	public void updateCompany(Company company);
	public void deleteCompany(Company company);
	public Company findCompany(Integer idMArk);


}
