package com.mulStudent;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
public class Demo2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream("d://myObj3.txt");
		ObjectInputStream ois = new ObjectInputStream(fileInputStream);
		
		List<Student> students = (List<Student>) ois.readObject();
		
//		Student newStudent = new Student(50,"n7",469);
//		students.add(newStudent);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://myObj3.txt"));
		
		 oos.writeObject(students);
		
		students.forEach(s -> System.out.println(s));
		
	}
}
