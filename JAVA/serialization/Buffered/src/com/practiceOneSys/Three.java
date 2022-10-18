package com.practiceOneSys;
import java.io.*;
public class Three {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("d://abc.txt");
		int i=fileReader.read();
		
		while(i != -1) {
			System.out.println((char)(i));
			i = fileReader.read();
		}
	}
}
