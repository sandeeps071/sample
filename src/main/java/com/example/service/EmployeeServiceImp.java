 package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmploDept;
import com.example.demo.model.Employee;
import com.example.repo.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeServic {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		
		List<Employee> empl =    employeeRepo.findAll();
		
		return empl;
	}

	@Override
	public Optional<Employee> getEmployeeById(int eid) {
		// TODO Auto-generated method stub
	Optional<Employee> oempl =	employeeRepo.findById(eid);
		
		return oempl;
	}

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		
		return employeeRepo.save(emp);
	}

	@Override
	public Employee updateempl(Employee empp, int eid) {
		// TODO Auto-generated method stub
		
		Employee emp = employeeRepo.findById(eid).orElseThrow();
		emp.setSalary(empp.getSalary());
		emp.setCommissionPct(empp.getCommissionPct());
		emp.setEmail(empp.getEmail());
		emp.setFirstName(empp.getFirstName());
		System.out.println("Update of employee"+emp.getFirstName() +" "+emp.getLastName());
		return employeeRepo.save(emp);
	}

	@Override
	public List<EmploDept> getEmployeeDep(int did) {
		// TODO Auto-generated method stub
		return employeeRepo.getEmployeDept(did);
	}

}
