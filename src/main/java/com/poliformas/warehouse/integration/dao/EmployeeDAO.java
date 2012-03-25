package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.Employee;

public interface EmployeeDAO {
	
	public void saveEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findEmployee(Employee employee); 
}
