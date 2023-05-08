package com.masaischool.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masaischool.emp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
