package com.poliformas.warehouse.service;

import com.poliformas.warehouse.integration.entity.Company;

public interface CompanyService {
	
	public void saveCompany(Company company);
	public void updateCompany(Company company);
	public void deleteCompany(Company Company);
	public Company findCompany(Integer idCompany);

}
