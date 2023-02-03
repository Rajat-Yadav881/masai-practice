package com.one;

public class Five {
	public static void main(String[] args) {
		//cohesion;
		Five.cat();
		Five.dog();
		Five.camel();
		
	}
	
	static void cat() {
		System.out.println("meow");
	}
	static void dog() {
		System.out.println("bark");
	}
	static void camel() {
		System.out.println("hump");
	}
	static void baby() {
		System.out.println("cry");
	}
	
}

