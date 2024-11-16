
package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.repo.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService {
	
	@Autowired
	DepartmentRepository depRepository;

	@Override
	public Optional<Department> getById(int deptId) {
		// TODO Auto-generated method stub
		return depRepository.findById(deptId);
	}

	@Override
	public Department createDepartment(Department dept) {
		// TODO Auto-generated method stub
		return depRepository.save(dept);
	}

	@Override
	public List<Department> getAllDepartement() {
		// TODO Auto-generated method stub
		
		
		return depRepository.findAll();
	}
	

}
