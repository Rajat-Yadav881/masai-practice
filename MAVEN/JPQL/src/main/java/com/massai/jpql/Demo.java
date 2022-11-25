package com.massai.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.*;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("accountUnit");


        EntityManager em = emfactory.createEntityManager();

        Query query = em.createNativeQuery("select * from  employee",Employee.class);

        List<Employee> ex = query.getResultList();

        for (Employee e : ex){
            System.out.println(e.toString());
        }
//        Query query = em.createQuery("findEmployee");
//        query.setParameter("id",1);
//
//        List<Employee> list = query.getResultList();
//        for (Employee e:list){
//            System.out.println(e.toString());
//        }
//        Query query = em.createQuery("select e from Employee e");
//        List<Employee> list = (List<Employee>) query.getResultList();
//        for (Employee e : list){
//            System.out.println(e.toString());
//        }
//        Employee employee = new Employee("deepak",34000,"Enginerr");
//        em.getTransaction().begin();
//        em.persist(employee);
//        em.getTransaction().commit();
//        em.close();
//        Query query = em.createQuery("select UPPER(e.ename) from Employee e");
//
//        List<String> list = query.getResultList();
//
//        for (String s : list){
//            System.out.println("Employee Name :"+s);
//        }
//
//        Query query1 = em.createQuery("select Max(e.salary) from Employee e");
//        Double result = (Double) query1.getSingleResult();
//
//        System.out.println("Max Employee Salary: "+result);
    }
}
