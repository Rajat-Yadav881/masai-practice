package com.practiceOneSys;
import java.io.*;
public class Two {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d://abc.txt");
		
		fw.write(100);
		fw.write("ramesh\nwelcome");
		fw.write("\n");
		fw.write("india");
		fw.write("\n");
		char ch[]={'a','b','c'};
		fw.write(ch);
		
		fw.flush();
		fw.close();
		
		System.err.println("Done");
	}
}
