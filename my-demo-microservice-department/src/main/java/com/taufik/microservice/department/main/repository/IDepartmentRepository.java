package com.taufik.microservice.department.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taufik.microservice.department.main.entity.Department;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Long>{

}
