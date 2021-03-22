package com.taufik.microservice.department.main.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taufik.microservice.department.main.entity.Department;
import com.taufik.microservice.department.main.repository.IDepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private IDepartmentRepository departmentRepository;

	@Override
	public Department getDepartmentByDepartmentId(Long departmentId) {
		LOGGER.info("DepartmentService - getDepartmentByDepartmentId - departmentId - {}", departmentId);
		return departmentRepository.findById(departmentId).orElse(null);
	}

	@Override
	public Department saveDepartment(Department department) {
		LOGGER.info("DepartmentService - saveDepartment - department - {}", department);
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		LOGGER.info("DepartmentService - getAllDepartments ");
		return departmentRepository.findAll();
	}

}
