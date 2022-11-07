package com.gfg1;
import java.util.function.*;
public class One {
	public static void main(String[] args) {
		Predicate<Integer> lesserThan = i ->(i<18);
		
		System.out.println(lesserThan.test(10));
	}
}
