package com.practice9;
import java.util.function.Consumer;
public class CConsumer {
	public static void main(String[] args) {
		Consumer<Student> c = s -> {
			System.out.println(s.getRoll());
			System.out.println(s.getMarks());
			System.out.println(s.getName());
		};
		c.accept(new Student(10,"Amit",850));
	}
}
