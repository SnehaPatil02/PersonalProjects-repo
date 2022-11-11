package com.practice.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
