package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Department;
import com.example.demo.model.DepartmentModel;


public interface DepartmentService {
	
	
public List<Department> getAllDepartement();
	
public	 Optional<Department> getById(int deptId);
	
public Department createDepartment(Department dept);
//deptEmploye
	public List<DepartmentModel> getEmployeeDep(int did);


}
