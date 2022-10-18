package com.practiceOneSys;
import java.io.*;
public class Five {
	public static void main(String[] args) throws IOException {
		File f=new File("d://abc.txt");
		FileReader fr=new FileReader(f);
		
		char[] chr = new char[(int)f.length()];
		fr.read(chr);
		for(char c:chr) {
			System.out.println(c);
		}
	}
}
