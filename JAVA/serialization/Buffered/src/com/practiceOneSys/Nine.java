package com.practiceOneSys;
import java.io.*;
public class Nine {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("d://img.jpg");
		
		FileOutputStream fos = new FileOutputStream("d://img2.jpg");
		
		int i = fis.read();
		
		while(i != -1) {
			fos.write(i);
			i = fis.read();
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("Success........");
		
	}
}
