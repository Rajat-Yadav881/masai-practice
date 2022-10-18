package com.practiceOneSys;
import java.io.*;
public class Six {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("d://abc.txt"));
		
		bw.write(100);//d will be added
		bw.newLine(); //inserting a new line
		bw.write("ramesh");
		bw.newLine();
		bw.write("india");
		bw.newLine();
		char ch[]={'a','b','c'};
		bw.write(ch);
		
		bw.flush();
		bw.close();
		
		
		 System.out.println("Done");
		
	}
}
