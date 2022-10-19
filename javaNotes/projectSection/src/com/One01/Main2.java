package com.One01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class Main2 {
	public static void main(String[] args) throws  Exception {
		FileInputStream fis = new FileInputStream("d://myFile.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		Object obj = ois.readObject();
//		
//		One a1 = (One)obj;
		
		One a1 = (One)ois.readObject();
		a1.funA();
	}
}
