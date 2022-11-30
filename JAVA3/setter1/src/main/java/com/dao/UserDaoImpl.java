package com.dao;

import com.exception.UserNotFoundException;
import com.model.User;
import com.utility.EMUtility;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDaoImpl implements UserDao{
    @Override
    public User createUser(User user) throws UserNotFoundException {
        EntityManager em = EMUtility.provideEntityManager();
        if(user==null){
            throw new UserNotFoundException("please provide proper details");
        }
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        return user;
    }

    @Override
    public List<User> findName(String name) throws UserNotFoundException {
        EntityManager em = EMUtility.provideEntityManager();
        List<User> users = em.createQuery("from User where userName = '"+name+"'",User.class).getResultList();
        if(users.isEmpty()){
            throw new UserNotFoundException("sorry no user with the name "+name+" found");
        }
        return users;
    }
}
