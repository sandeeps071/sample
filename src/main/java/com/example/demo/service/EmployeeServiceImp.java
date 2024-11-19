 package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NoSuchEmployeeExists;
import com.example.demo.exception.createEmployeeException;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

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
		
		//ofNullable method returns an instance of this Optional class with the specified value of the specified type. 
	Optional<Employee> oempl =	Optional.ofNullable(employeeRepo.findById(eid).orElseThrow(
			
			()-> new NoSuchEmployeeExists("\"NO employee PRESENT WITH ID = \" "+ eid+"")  ));
		
		return oempl;
	}

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Employee existingemp = employeeRepo.findById(emp.getEmployeeId()).orElse(null);
		if(existingemp==null) {
		return employeeRepo.save(emp);
		}else 
		{
			throw new createEmployeeException("Employee already exits");
		}
		
	
	}

	@Override
	public Employee updateempl(Employee empp, int eid) {
		// TODO Auto-generated method stub
		
		Employee empexistin = employeeRepo.findById(eid).orElse(null);
		
		if(empexistin==null) {
		throw	new NoSuchEmployeeExists("NO employee PRESENT to update");
		}else {
		
		empp.setSalary(empp.getSalary());
		empp.setCommissionPct(empp.getCommissionPct());
		empp.setEmail(empp.getEmail());
		empp.setFirstName(empp.getFirstName());
		System.out.println("Update of employee"+empp.getFirstName() +" "+empp.getLastName());
		return employeeRepo.save(empp);
		}}



}
