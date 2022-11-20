package com.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.day1.Student");
        EntityManager em = emf.createEntityManager();

//        System.out.println("Done...");
//
//        Student student = em.find(Student.class,1);
//
//        if(student!=null){
//            System.out.println(student.toString());
//        }else{
//            System.out.println("failed..");
//        }

        Student student = em.find(Student.class,2);
        if(student!=null){
            em.getTransaction().begin();

            student.setName("Aman");

            em.getTransaction().commit();
            System.out.println("done..");
        }else{
            System.out.println("failed..");
        }


        em.close();
    }
}
