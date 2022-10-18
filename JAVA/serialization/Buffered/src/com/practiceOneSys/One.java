package com.practiceOneSys;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class One {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("d://abc.txt");
		int ch = fr.read();
		
		while(ch != -1) {
			System.out.println((char)ch);
			ch = fr.read();
		}
	}
	
}
