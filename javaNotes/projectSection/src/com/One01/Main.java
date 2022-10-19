package com.One01;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		One one = new One();
		
		one.i = 200;//state of object
				
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://myObj.txt"));
		
		oos.writeObject(one);
		
		System.out.println("done...");
	}
}
