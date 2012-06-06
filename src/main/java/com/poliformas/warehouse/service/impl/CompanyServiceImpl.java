package com.poliformas.warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.dao.CompanyDAO;
import com.poliformas.warehouse.integration.entity.Company;
import com.poliformas.warehouse.service.CompanyService;

public class CompanyServiceImpl implements CompanyService{
	@Autowired
	private CompanyDAO companyDAO;

	public void saveCompany(Company company) {
		
		companyDAO.saveCompany(company);
		
	}

	public void updateCompany(Company company) {
		companyDAO.saveCompany(company);
		
	}

	public void deleteCompany(Company Company) {
		companyDAO.deleteCompany(Company);
		
	}

	public Company findCompany(Integer idCompany) {
		
		return companyDAO.findCompany(idCompany);
	}
	
	

}
