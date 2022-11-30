package com.usecases;

import com.model.FullTimeInstructor;
import com.model.PartTimeInstructor;
import com.utility.EMUtility;

import javax.persistence.EntityManager;

public class InsertDetail {
    public static void main(String[] args) {
        EntityManager em = EMUtility.provideEntityManager();

        FullTimeInstructor instructor = new FullTimeInstructor("A",688787,"tyu@gmail.com");
        PartTimeInstructor instructor1 = new PartTimeInstructor("Manish",3,5600,"465434");

        em.getTransaction().begin();

        em.getTransaction().commit();
        
    }



}
