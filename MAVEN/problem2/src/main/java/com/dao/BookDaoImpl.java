package com.dao;

import com.model.Book;
import com.utility.EMUtility;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class BookDaoImpl implements BookDao{
    @Override
    public Book GetAllInfoByID(int book_ID) {
        Book book = null;
        EntityManager em = EMUtility.provideEntityManager();

        em.getTransaction().begin();
        book = em.find(Book.class,book_ID);
        em.getTransaction().commit();
        em.close();
        return book;
    }

    @Override
    public String CreateBook(Book book) {
        EntityManager em = EMUtility.provideEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();
        return "Done...";
    }

    @Override
    public Boolean DeleteBook(int book_ID) {
        return null;
    }

    @Override
    public String UpdateTheBook(int book_ID) {
        return null;
    }
}
