package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class DepartmentModel {
	

	@Id
	@Column(name ="DEPARTMENT_ID")
	private int departmentId;
	@Column(name ="DEPARTMENT_NAME")
	private String departmentName;
	@Column(name ="MANAGER_ID")
	private String managerId;
	
	
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	@OneToMany
	@JoinColumn(name="DEPARTMENT_ID" ,referencedColumnName = "DEPARTMENT_ID")
	private List<Employee> emplist;
	
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	
	

}
