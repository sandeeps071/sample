
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.DepartmentException;
import com.example.demo.model.Department;
import com.example.demo.model.DepartmentModel;
import com.example.demo.repo.DepartEmploy;
import com.example.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService {
	
	@Autowired
	DepartmentRepository depRepository;

	@Autowired
	DepartEmploy depemp;
	
	@Override
	public Optional<Department> getById(int deptId) {
		// TODO Auto-generated method stub
		
		Optional<Department> depim = Optional.ofNullable(depRepository.findById(deptId)).orElseThrow(()->
				
				new DepartmentException("Department Not Found "));
		
		return depim;
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
	@Override
	public List<DepartmentModel> getEmployeeDep(int did) {
		// TODO Auto-generated method stub
		return depemp.getEmployeDept(did);
	}

}
