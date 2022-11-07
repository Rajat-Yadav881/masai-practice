package com.practice12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("d://myObj2.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		Object obj = ois.readObject();
//		A x = (A)obj;
		
		A x =(A) ois.readObject();
		x.funA();
		
		String s = (String)ois.readObject();
		System.out.println(s);
		
		int x1 = (Integer)ois.readObject();
		System.out.println(x1);
	}
}
