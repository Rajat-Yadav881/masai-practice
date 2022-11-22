package com.SBI.dao;

import com.SBI.model.Account;
import com.SBI.utility.EMUtility;

import javax.persistence.EntityManager;

public class stateBankDAOImpl implements stateBankDAO{
    @Override
    public Account findAccountById(int id) {
        Account account = null;

        EntityManager em = EMUtility.provideEntityManager();

        account = em.find(Account.class,id);

        return account;
    }

    @Override
    public String saveAccount(Account account) {
        EntityManager em = EMUtility.provideEntityManager();

        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        em.close();
        return "done...";
    }

    @Override
    public String deleteAccountById(int id) {

        EntityManager em = EMUtility.provideEntityManager();
        Account account = em.find(Account.class,id);
        if(account!=null){
            em.getTransaction().begin();
            em.remove(account);
            em.getTransaction().commit();
        }

        em.close();

        return "Account deleted";
    }

    @Override
    public String withdrawFromAccount(double amount, int accountId) {
        EntityManager em = EMUtility.provideEntityManager();
        Account account = em.find(Account.class,accountId);
        if(account!=null && account.getBalance()>amount){
            em.getTransaction().begin();

            account.setBalance(account.getBalance()-amount);
            em.getTransaction().commit();

        }
        em.close();
        return "amount withdraw From Account Done...";
    }

    @Override
    public String depositInAccount(double amount, int accountId) {
        EntityManager em = EMUtility.provideEntityManager();
        Account account = em.find(Account.class,accountId);
        if(account!=null){
            em.getTransaction().begin();

            account.setBalance(account.getBalance()+amount);
            em.getTransaction().commit();

        }
        em.close();
        return "amount deposit In Account Done...";
    }
}
