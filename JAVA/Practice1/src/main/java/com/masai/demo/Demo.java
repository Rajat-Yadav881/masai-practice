package com.masai.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");

        EntityManager em = emf.createEntityManager();

        System.out.println("done");

        Student student = em.find(Student.class,1);

        if(student != null){
            System.out.println(student.toString());
        }else {
            System.out.println("does not exist..");
        }

        em.close();
    }
}
