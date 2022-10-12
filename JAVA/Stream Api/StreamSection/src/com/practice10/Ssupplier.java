package com.practice10;
import java.util.function.Supplier;
public class Ssupplier {
	public static void main(String[] args) {
		Supplier<String> s = ()->  "This is from Lambda Expression";
		System.out.println(s.get());
		Supplier<Student> s2 = () -> new Student(10,"ram",345);
		System.out.println(s2.get().getName());
	}
}
