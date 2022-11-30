package com.usecases;

import com.Dao.CourseDao;
import com.Dao.CourseDaoImpl;
import com.model.Course;
import com.model.Student;

public class RegisterCourse {
    public static void main(String[] args) {
        Course course = new Course();
        course.setCourseName("English");
        course.setDuration(50);
        course.setFee(45000);

        Student student = new Student();
        student.setName("Rajat");
        student.setEmail("bivek@gmail.com");
        student.setMobile("4657865453");
        student.setCourse(course);
        course.getStudents().add(student);

        CourseDao dao = new CourseDaoImpl();
        dao.addCourse(course);

    }
}
