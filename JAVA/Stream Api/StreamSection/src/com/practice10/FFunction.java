package com.practice10;
import java.util.*;
import java.util.function.Function;
public class FFunction {
	public static void main(String[] args) {
		Function<Integer, String> f = i -> "This ia a number"+i;
		System.out.println(f.apply(10));
		
		Function<String, Integer> f1 = s -> Integer.parseInt(s);
		System.out.println(f1.apply("989"));
		
		Function<String, Integer> f2  = Integer :: parseInt;
		System.out.println(f2.apply("450")+300);
		
		Function<Student, String> f3 = s ->  "Welcome "+s.getName().toUpperCase();
		
		String msg = f3.apply(new Student(10,"amit",850));
		
		System.out.println(msg);
	}
}
