package com.taufik.microservice.department.main.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taufik.microservice.department.main.entity.Department;
import com.taufik.microservice.department.main.service.IDepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private IDepartmentService departmentService;

	@PostMapping(value = "**")
	public Department saveDepartment(@RequestBody Department department) {
		LOGGER.info("DepartmentController - saveDepartment - department - {}", department);
		return departmentService.saveDepartment(department);
	}

	@GetMapping(value = "/{id}")
	public Department getDepartmentByDepartmentId(@PathVariable ("id") Long departmentId) {
		LOGGER.info("DepartmentController - getDepartmentByDepartmentId - departmentId - {}", departmentId);
		return departmentService.getDepartmentByDepartmentId(departmentId);
	}

	@GetMapping(value = "/")
	public List<Department> getAllDepartments() {
		LOGGER.info("DepartmentController - getAllDepartments ");
		return departmentService.getAllDepartments();
	}

	@GetMapping(value = "/**")
	public String fallBackMethod() {
		return "Service is up and running";
	}

}
