package com.practice12;

import java.io.Serializable;

public class A implements Serializable{
	int i=10;
	public void funA() {
		System.out.println("inside the funA() of A");
		System.out.println(i);
	}
}
