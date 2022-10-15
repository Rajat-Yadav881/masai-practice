package com.practice12;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(12,"n1",456));
		students.add(new Student(43,"n2",654));
		students.add(new Student(23,"n3",123));
		students.add(new Student(13,"n4",257));
		students.add(new Student(76,"n5",556));
		
		Stream<Student> str1 = students.stream(); //here converting to the stream
		
//		Stream<Student> str2 = str1.map(s -> {
//			Student s2 = new Student(s.getRoll(),s.getName(),s.getMarks()+45);
//			return s2;
//		});
		
//		Stream<Student> str2 = str1.map(s -> new Student(s.getRoll(),s.getName(),s.getMarks()+45));
//		
//		List<Student> modfiedStudents = str2.collect(Collectors.toList()); //now collecting that upper object element as list
		
//		List<Student> modfiedStudents = students
//																						.stream()
//																						.map(s -> new Student(s.getRoll(),s.getName(),s.getMarks()+45))
//																						.collect(Collectors.toList());
//		System.out.println(modfiedStudents);
		List<Student> modfiedList = students
																				.stream()
																				.filter(s -> s.getMarks()<500)
																				.map(s -> new Student(s.getRoll(),s.getName(),s.getMarks()+45))
																				.collect(Collectors.toList());
		modfiedList.forEach(s -> System.out.println(s));
		
		
																				
	
	}
}
