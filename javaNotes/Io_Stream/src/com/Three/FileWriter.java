package com.Three;
import java.io.*;
public class FileWriter {
	public static void main(String[] args) throws IOException{
		FileWriter file = new FileWriter("abc.txt");
		file.write(100);
		
		System.out.println("Done...");
	}
	file.flush();
	file.close();
}
