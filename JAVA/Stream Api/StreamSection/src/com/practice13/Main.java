package com.practice13;
import java.util.*;
import java.util.stream.Collectors;

import com.practice12.Student;
//min and max method
//these methods are also terminal method which will take a comprator object using which we can decide maximium and minimum
//this min() and max() method will return the min and max object in the from of the java.util.Optional class object
//this class is introduce in java 1.8 version, and basically used to avoid the Null Pointer Exception
//to get the element from the optional class , we need to call get() method.
//if opt.isPresent return the boolean value
public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(12,"n1",456));
		students.add(new Student(43,"n2",654));
		students.add(new Student(23,"n3",123));
		students.add(new Student(13,"n4",257));
		students.add(new Student(76,"n5",556));
		
		long num = students.stream().filter(s -> s.getMarks()<500).count();
		System.out.println(num);
		
		boolean b = students.stream().anyMatch(s -> s.getMarks()<500);
		System.out.println(b);
		
		int x = students.stream().collect(Collectors.summingInt(s -> s.getMarks()));
		System.err.println(x);
		//to avoid the null value or to deal with the null value we use the Optional class
		Optional<Student> optStudent = students.stream().min((i1,i2)-> i1.getMarks()>i2.getMarks() ? +1 : -1);
		Student maxStudent = optStudent.get();
		
		System.out.println(maxStudent);
	}
}
