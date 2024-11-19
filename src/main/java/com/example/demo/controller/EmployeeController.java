package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.model.Employee;

import com.example.demo.service.EmployeeServic;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeServic empservice;

	@GetMapping("/allemp")
	public ResponseEntity<List<Employee>> name() {

		List<Employee> lis = empservice.getEmployeeList();

		return new ResponseEntity<List<Employee>>(lis, HttpStatusCode.valueOf(200));
	}

	@GetMapping("/getbyId")
	public ResponseEntity<Employee> getEmpById(@RequestParam int eid) {
		Optional<Employee> empo = empservice.getEmployeeById(eid);

		Employee emp = empo.get();

		return new ResponseEntity<Employee>(emp, HttpStatusCode.valueOf(200));
	}

	@PostMapping("/createEmp")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employ) {
		// TODO: process POST request

		// System.out.println(employ.getEmployeeId());
		Employee em = empservice.createEmployee(employ);

		return new ResponseEntity<Employee>(em, HttpStatusCode.valueOf(200));
	}
	
	
	@PutMapping("/empup/{eid}")
	public ResponseEntity<Employee> employeeUp(@PathVariable int eid, @RequestBody Employee emp) {
		//TODO: process PUT request
		
	Employee empup =	empservice.updateempl(emp, eid);
		
		
		return new ResponseEntity<Employee>(empup,HttpStatusCode.valueOf(200));
	}
	
	


}
