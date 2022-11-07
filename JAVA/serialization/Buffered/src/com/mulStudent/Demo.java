package com.mulStudent;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Demo {
	public static void main(String[] args) throws Exception{
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"n1",234));
		students.add(new Student(12,"n2",432));
		students.add(new Student(13,"n3",365));
		students.add(new Student(9,"n4",379));
		students.add(new Student(5,"n5",448));
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d://myObj3.txt"));
		
		os.writeObject(students);
		
		System.out.println("Done...");
	}
}
