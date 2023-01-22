package com.three;

import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		int wordCount = 0;
		boolean word = false;
		int endOfLine = str.length()-1;
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))&& i!= endOfLine) {
				word = true;
			}else if(!Character.isLetter(str.charAt(i))&& word) {
				wordCount++;
				word = false;
			}else if(Character.isLetter(str.charAt(i)) && i== endOfLine) {
				wordCount++;
			}
		}
		System.out.println("Number of words in the string: "+wordCount);
	}
}
