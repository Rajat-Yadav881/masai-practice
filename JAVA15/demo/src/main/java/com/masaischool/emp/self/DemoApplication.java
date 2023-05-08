package com.masaischool.emp.self;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masaischool.emp.dto.EmployeeDto;
import com.masaischool.emp.service.EmployeeService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeDto emp = new EmployeeDto();
		emp.setEmpis("E001");
		emp.setName("Rajat");
		emp.setCtc(10.0);
		emp.setState("TN");
		employeeService.addEmployee(emp);
	}

}
