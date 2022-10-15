package com.practice;

import java.util.*;

public class Main {
	
	//java.util.Arrays
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "n1", 780));
		students.add(new Student(8, "n5", 680));
		students.add(new Student(12, "n3", 480));
		students.add(new Student(14, "n2", 880));
		students.add(new Student(6, "n4", 580));
		
		Student student = Collections.max(students,new compareit());
		System.out.println(student);
	}
	

}
