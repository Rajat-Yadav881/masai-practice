package com.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Two {
	public static void main(String[] args) {
		String s = "01:05:45AM";
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(s);
		List<Integer>lst = new ArrayList<>();
		while(matcher.find()) {
			int num = Integer.parseInt(matcher.group());
			lst.add(num);
		}
		
		String ast = s.substring(s.length()-2);
		
		
		if(ast.equals("PM") && lst.get(0)!=12) {
			int n = lst.set(0, 12+lst.get(0));	
			System.out.println(n);
		}
		
		if(ast.equals("AM") && lst.get(0)==12) {
			int n = lst.set(0, 00);	
			System.out.println(n);
		}
		String formattedTime = String.format("%02d:%02d:%02d", lst.get(0), lst.get(1), lst.get(2));
		System.out.println(formattedTime);
		
	}
}
