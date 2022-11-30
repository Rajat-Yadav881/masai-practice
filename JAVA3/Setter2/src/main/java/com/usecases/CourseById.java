package com.usecases;

import com.Dao.CourseDao;
import com.Dao.CourseDaoImpl;
import com.exception.CourseNotFoundException;

import java.util.Scanner;

public class CourseById {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course_id: ");
        int id = sc.nextInt();

        CourseDao dao = new CourseDaoImpl();
        try {
            dao.getCourse(id);
        } catch (CourseNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
