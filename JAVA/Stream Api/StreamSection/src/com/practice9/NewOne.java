package com.practice9;
import java.util.*;
public class NewOne {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "name1", 650));
		students.add(new Student(12, "name2", 750));
		students.add(new Student(13, "name3", 550));
		students.add(new Student(14, "name4", 820));
		students.add(new Student(15, "name5", 720));
		students.add(new Student(16, "name6", 620));
		
//		System.out.println(students);
		
		students.removeIf(s -> s.getMarks()<700);
			System.out.println(students);

	}
}
