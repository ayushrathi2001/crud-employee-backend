package com.sb.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}