package com.StreamAPi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		st.add(new Student(10,"rajat",456));
		st.add(new Student(45,"ganexh",567));
		st.add(new Student(23,"kareal",466));
		st.add(new Student(21,"jhone",121));
		st.add(new Student(14,"dwayne",356));
		
		//from the above list get another list of student whose marks is less than 500
		
//		Stream<Student> str1 = st.stream();
//		Stream<Student> str2=str1.filter(s -> s.getMarks()<500);
//		str2.forEach(s -> System.out.println(s));
//		st.stream()
//			.filter(s -> s.getMarks()<500) //Intermediate method
//			.forEach(s -> System.out.println(s));
		
//		Stream<Student> str1 = st.stream();
//		Stream<Student> str2=str1.filter(s -> s.getMarks()<500);
//		List<Student> filterredList = str2.collect(Collectors.toList());
		
	//another list	
	List<Student> filteredList = st
														.stream()
														.filter(s -> s.getMarks()<500)
														.collect(Collectors.toList()); //convert to the list
	
	filteredList.forEach(s -> System.out.println(s));
	}
}
