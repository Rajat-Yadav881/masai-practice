package com.util;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtility {
    private static EntityManagerFactory emf;
    static{
        emf= Persistence.createEntityManagerFactory("accountunit");
    }
    public static EntityManager provideEntityManager(){
//EntityManager em= emf.createEntityManager();
//return em;
        return emf.createEntityManager();
    }
}
