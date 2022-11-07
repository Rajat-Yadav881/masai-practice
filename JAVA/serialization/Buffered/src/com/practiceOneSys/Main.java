package com.practiceOneSys;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		Ten ten = new Ten();
		ten.i = 22;
		
		FileOutputStream fos = new FileOutputStream("d://abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(ten);
		
		oos.writeObject("Welcome");
		oos.writeObject(10);
		
		oos.close();
		
		System.out.println("a1 Object is seralized");
	}
}
