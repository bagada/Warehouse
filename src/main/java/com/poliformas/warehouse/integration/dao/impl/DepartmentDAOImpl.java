package com.poliformas.warehouse.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poliformas.warehouse.integration.dao.DepartmentDAO;
import com.poliformas.warehouse.integration.entity.Department;


public class DepartmentDAOImpl extends HibernateDaoSupport  implements DepartmentDAO{

	public void saveDepartment(Department department) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(department);
		
	}

	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(department);
	}

	public void deleteDepartment(Department department) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(department);
	}

	public Department findDepartment(Department department) {
		// TODO Auto-generated method stub
		return (Department)getHibernateTemplate().find(String.valueOf(department.getIdDepartment())).get(0);
	}
	

}
