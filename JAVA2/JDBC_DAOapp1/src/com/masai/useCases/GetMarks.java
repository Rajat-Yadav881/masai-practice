package com.masai.useCases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class GetMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll: ");
		int roll = sc.nextInt();
		
		StudentDao dao = new StudentDaoImpl();
		int marks = dao.getMarksByRoll(roll);
		if(marks>0)
			System.out.println("marks is : "+marks);
		else
			System.out.println("Student does not exist with this roll number : "+roll);
		
	}
}
