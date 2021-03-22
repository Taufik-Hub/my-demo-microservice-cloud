package com.taufik.microservice.department.main.service;

import java.util.List;

import com.taufik.microservice.department.main.entity.Department;

public interface IDepartmentService {

	Department getDepartmentByDepartmentId(Long departmentId);

	Department saveDepartment(Department department);
	
	List<Department> getAllDepartments();

}
