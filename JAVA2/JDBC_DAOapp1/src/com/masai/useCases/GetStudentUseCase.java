package com.masai.useCases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.model.Student;

public class GetStudentUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll :");
		int roll= sc.nextInt();

		StudentDao dao = new StudentDaoImpl();
		
		Student student= dao.getStudentByRoll(roll);
		
		if(student != null)
			System.out.println(student);
		else
			System.out.println("Student does not exist with Roll :"+roll);
		
		
		
		
		
		
		
		
		
		
		
	}

}
