package com.usecases;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImpl;
import com.exception.StudentNotFoundException;

import java.util.Scanner;

public class StudentByRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        int roll = scanner.nextInt();

        StudentDao dao = new StudentDaoImpl();
        try {
            dao.getStudent(roll);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
