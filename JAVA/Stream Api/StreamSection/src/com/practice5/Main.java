package com.practice5;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"name1",780));
		students.add(new Student(12,"name2",480));
		students.add(new Student(14,"name3",680));
		students.add(new Student(15,"name4",580));
		
		Collections.sort(students,(i1,i2)->i1.getMarks()>i2.getMarks() ? +1 : -1);
		System.out.println(students);
	}
}
