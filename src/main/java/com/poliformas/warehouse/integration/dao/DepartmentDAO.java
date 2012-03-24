package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.Department;

public interface DepartmentDAO {
	
	public void saveDepartment(Department department);
	public void updateDepartment(Department department);
	public void deleteDepartment(Department department);
	public Department findDepartment(Department department);

}
