package com.students.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.students.model.Student;
import com.students.repository.StudentRepo;



@Controller
public class StudentUIController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	
	
	@GetMapping("/home")
	public String homeLauncher() {
		
		return "welcome";
	}
	
	
	@GetMapping("/getAllStudents")
	public String getAllStudents(Model model ){
	 Iterable<Student> itr= studentRepo.findAll();
	 
	 List<Student> students= new ArrayList<>();
	 itr.forEach(students::add);
	 
	 model.addAttribute("mydata", students);
	 
	 return "result";
	 
	}
	
	
	
	
}
