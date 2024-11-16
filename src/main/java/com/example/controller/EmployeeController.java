package com.example.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
@RequestMapping("/hr")
public class EmployeeController {
	
	
@GetMapping("/employees")
	public ResponseEntity<List<Employee>> name() {
	
	
	
		
		return new ResponseEntity<List<Employee>>(null, null, null);;
		
	}
	
	
}
