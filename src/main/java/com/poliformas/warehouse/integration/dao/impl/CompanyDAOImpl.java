package com.poliformas.warehouse.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poliformas.warehouse.integration.dao.CompanyDAO;
import com.poliformas.warehouse.integration.entity.Company;

public class CompanyDAOImpl extends HibernateDaoSupport implements CompanyDAO{

	public void saveCompany(Company company) {
		getHibernateTemplate().save(company);	
	}

	public void updateCompany(Company company) {
		getHibernateTemplate().update(company);
	}

	public void deleteCompany(Company company) {
		getHibernateTemplate().delete(company);
	}

	public Company findCompany(Integer idCompany) {
		return (Company)getHibernateTemplate().get(Company.class, idCompany);
	}
	
	
	

}
