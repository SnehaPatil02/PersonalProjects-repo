package com.practice.springboot.service;

import java.util.List;

import com.practice.springboot.model.Employee;



public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	void deleteEmployee(long id);
		
	
	
}
