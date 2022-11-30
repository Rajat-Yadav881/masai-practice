package com.Dao;

import com.exception.StudentNotFoundException;
import com.model.Student;
import com.utility.EmUtility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class StudentDaoImpl implements StudentDao{
    @Override
    public void getStudent(int roll_no) throws StudentNotFoundException {
        EntityManager em = EmUtility.provideEntityManager();
        Student student = em.find(Student.class,roll_no);
        if(student==null)
            throw new StudentNotFoundException("student with the this roll number "+roll_no+" is not found");
        System.out.println("name: "+student.getName());
        System.out.println("roll no: "+student.getRollNo());
        System.out.println("MobileNo: "+student.getMobile());
        System.out.println("Email: "+student.getEmail());
        System.out.println(student.getCourse());
    }
}
