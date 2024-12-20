package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Department;
import com.example.demo.model.DepartmentModel;

public interface DepartEmploy extends JpaRepository<DepartmentModel, Integer> {
	
	@Query(value ="select e.EMPLOYEE_ID,e.FIRST_NAME,e.LAST_NAME,\r\n"
			+ "e.EMAIL,e.PHONE_NUMBER,e.HIRE_DATE,e.JOB_ID,e.salary,e.COMMISSION_PCT,e.manager_id,\r\n"
			+ "e.DEPARTMENT_ID,d.DEPARTMENT_NAME,d.LOCATION_ID  from employees e left join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID\r\n"
			+ "where d.DEPARTMENT_ID = :param ",nativeQuery = true)
	List<DepartmentModel> getEmployeDept(@Param("param") Integer param);

}
