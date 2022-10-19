package com.OneSys;


import java.io.*;

public class One {
	public static void main(String[] args) throws IOException{
		FileWriter file = new FileWriter("abc.txt");
		
		file.write(102);
		file.write("\r\n");
		file.write("welcome");
		
		
		file.flush();
		file.close();
		System.out.println("Done...");
	}
	
}
