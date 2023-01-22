package com.masai.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassClassExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		Class c1 = s1.getClass();
		
		System.out.println("class name:"+c1.getName());
		Method[] m = c1.getDeclaredMethods();
		System.out.println("method of "+c1.getName()+" class...");
		for(Method method:m) {
			System.out.println(method.getName());
		}
		
		Field[] f = c1.getDeclaredFields();
		System.out.println("fields of "+c1.getName()+" class...");
		for(Field field:f) {
			System.out.println(field.getName());
		}
		
//		Constructor[] c = c1.getDeclaredConstructors();
//		System.out.println("declare constructor in our class - "+c1.getName());
//		
//		for(Constructor cons:c) {
//			System.out.println(cons.ge);
//		}
	}
}
