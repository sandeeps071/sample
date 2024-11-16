package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Department;


public interface DepartmentService {
	
	
public List<Department> getAllDepartement();
	
public	 Optional<Department> getById(int deptId);
	
public Department createDepartment(Department dept);



}
