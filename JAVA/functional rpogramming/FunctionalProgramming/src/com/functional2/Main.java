package com.functional2;
import java.util.*;
import java.util.stream.*;
import com.practice.Student;
public class Main {
	public static void main(String[] args) {
		List<Student> students = new LinkedList<>();
		students.add(new Student(10, "n1", 780));
		students.add(new Student(8, "n5", 680));
		students.add(new Student(12, "n3", 480));
		students.add(new Student(14, "n2", 880));
		students.add(new Student(6, "n4", 580));
		
//		students.stream().forEach(s -> System.out.println(s.getMarks()));
		
//		Stream<Student> str1 = students.stream();
//		Stream<Student> str2 = str1.filter(s -> s.getMarks()>400);
//		str2.forEach(s -> System.out.println(s.getName()));
//		students.stream()
//			.filter(s -> s.getMarks()>400)
//			.forEach(s -> System.out.println(s.getName()));
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("ramesh");
//		al.add("suresh");
//		al.add("mukesh");
//		al.add("ajay");
//		Stream<String> ss=al.stream();
//		
//		List list = ss.map(s -> "Welcome "+s).collect(Collectors.toList());
//		list.stream().forEach(s -> System.out.println(s));
//		
//		List<String> citiesL = Arrays.asList("delhi","mumbai","chennai","kolkata");
//		List<String> citiesU = citiesL.stream().map(city -> city.toUpperCase()).collect(Collectors.toList());
//		System.out.println(citiesL);
//		System.out.println(citiesU);
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(10, "n1", 852));
		al.add(new Student(12, "n2", 854));
		al.add(new Student(13, "n3", 851));
		al.add(new Student(14, "n4", 856));
		al.add(new Student(15, "n5", 858));
		
//		int x = al.stream().collect(Collectors.summingInt(s -> s.getMarks()));
//		System.out.println(x);
		
		boolean b = al.stream().allMatch(s -> s.getMarks()>800);
		System.out.println(b);
	}
}
