package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Department;
import com.example.demo.model.DepartmentModel;
import com.example.demo.service.DepartmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	
	@Autowired
	DepartmentService deptserv;
	
	
	@GetMapping("/alldept")
public ResponseEntity<List<Department>> getAllDept () {
	
	List<Department> deptli = deptserv.getAllDepartement();
	
return new ResponseEntity<List<Department>>(deptli,HttpStatusCode.valueOf(200));
	
}
@GetMapping("/getbyId/{depid}")		
public ResponseEntity<Department> getDeptById(@PathVariable("depid") int deptID) {
	
	Optional<Department> dept =  deptserv.getById(deptID);
	
	Department dee = dept.get();
	
	return new ResponseEntity<Department>(dee,HttpStatusCode.valueOf(200));
	
}

@PostMapping("/createdept")
public ResponseEntity<Department> createDept(@RequestBody Department department) {
    //TODO: process POST request
    Department dept = deptserv.createDepartment(department);
	
    return new ResponseEntity<Department>(dept,HttpStatusCode.valueOf(200));
}
@GetMapping("/empbydept")
public ResponseEntity<List<DepartmentModel>> getMethodName(@RequestParam int deptid) {
	
	List<DepartmentModel> empdepAll = deptserv.getEmployeeDep(deptid);
	
	return new ResponseEntity<List<DepartmentModel>>(empdepAll,HttpStatusCode.valueOf(200));
}



	}
	


