package com.practice12;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		A a1 = new A();
		
		a1.i=200;
		
		FileOutputStream fw = new FileOutputStream("d://myObj2.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fw);
		
		oos.writeObject(a1);//convert in byte stream
		
		oos.writeObject("Welcome");//String obj
		
		oos.writeObject(100);//Integer obj
		
		System.out.println("Done...");
		
		
	}
}
