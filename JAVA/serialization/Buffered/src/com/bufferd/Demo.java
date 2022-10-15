package com.bufferd;
import java.io.*;
public class Demo {
	
	public static void main(String[] args) throws IOException{
//		BufferedReader bw = new BufferedReader(new FileWriter("C://abc.txt"));
//		String line  = bw.readLine();
//		
//		while(line!=null) {
//			
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name: ");
		String name = br.readLine();
		System.out.println("Enter the age ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Welcome : "+name);
		System.out.println("age is : "+age);
	}

}

//1. Scanner class
//2. Buffered class
//3. Command Line Argument
