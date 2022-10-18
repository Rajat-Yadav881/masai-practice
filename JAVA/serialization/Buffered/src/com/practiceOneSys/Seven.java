package com.practiceOneSys;
import java.io.*;
public class Seven {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d://abc.txt"));
		
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
	
}
