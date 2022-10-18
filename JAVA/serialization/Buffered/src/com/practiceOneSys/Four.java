package com.practiceOneSys;
import java.io.*;
public class Four {
	public static void main(String[] args) throws IOException {
		File file = new File("d://abc.txt");
		FileReader fileReader = new FileReader(file);
		
		char[] chr = new char[(int)file.length()];
		
		fileReader.read(chr);
		
		for(char c: chr) {
			System.out.println(c);
		}
	}
}
