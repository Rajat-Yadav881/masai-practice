package com.practice10;
import java.util.ArrayList;
import java.util.List;
public class One {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("FootBall");
		list.add("Cricket");
		list.add("Chess");
		list.add("Hockey");
		
		//using the lambda expression
		list.forEach(s -> System.out.println(s));
		
		//using the Method reference
		list.forEach(System.out :: println);
	}
}
