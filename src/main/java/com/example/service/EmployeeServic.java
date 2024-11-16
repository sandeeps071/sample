package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.EmploDept;
import com.example.demo.model.Employee;

public interface EmployeeServic {
	
	//All Employees 
	public List<Employee> getEmployeeList();
	// by Employee ID 
	public Optional<Employee> getEmployeeById(int eid);
	// save employee
	public Employee createEmployee(Employee emp);
	// update employee
	public Employee updateempl(Employee empp,int eid);
	
	public List<EmploDept> getEmployeeDep(int did);

}
