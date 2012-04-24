package com.poliformas.warehouse.service;

import com.poliformas.warehouse.integration.entity.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findEmployee(Employee employee); 

}
