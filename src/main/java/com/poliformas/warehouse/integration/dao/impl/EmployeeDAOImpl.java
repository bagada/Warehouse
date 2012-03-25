package com.poliformas.warehouse.integration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.poliformas.warehouse.integration.dao.EmployeeDAO;
import com.poliformas.warehouse.integration.entity.Employee;

public class EmployeeDAOImpl extends HibernateDaoSupport implements EmployeeDAO  {

    public void saveEmployee(Employee employee) {
        getHibernateTemplate().save(employee);
       
       
    }

    public void updateEmployee(Employee employee) {
        getHibernateTemplate().update(employee);
       
    }

    public void deleteEmployee(Employee employee) {
        getHibernateTemplate().delete(employee);
       
    }

    public Employee findEmployee(Employee employee) {
   
        return (Employee) getHibernateTemplate().find(String.valueOf(employee.getIdEmployees())).get(0);
    }
}
