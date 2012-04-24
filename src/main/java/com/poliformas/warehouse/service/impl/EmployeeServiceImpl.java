package com.poliformas.warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.entity.Employee;
import com.poliformas.warehouse.service.EmployeeService;


public class EmployeeServiceImpl implements EmployeeService{
	
@Autowired
	private EmployeeService employeeDAO;

	public void saveEmployee(Employee employee) {
		employeeDAO.saveEmployee(employee);
		
	}

	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
		
	}

	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee);
	}

	public Employee findEmployee(Employee employee) {
		
		return employeeDAO.findEmployee(employee);
	}

}
