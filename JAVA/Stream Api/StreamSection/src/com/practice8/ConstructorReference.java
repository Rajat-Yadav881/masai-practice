package com.practice8;
@FunctionalInterface
interface Intr{
	void sayHello();
}
public class ConstructorReference {
	ConstructorReference(){
		System.out.println("method reference using Constructor Rajat");
	}
	public static void main(String[] args) {
		Intr intr = ConstructorReference :: new;
		intr.sayHello();
	}
}
