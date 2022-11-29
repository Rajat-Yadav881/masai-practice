package com.usecases;

import com.model.PhoneNumber;
import com.model.User;
import com.utility.EMUtility;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;


public class UserRegistration {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        EntityManager em = EMUtility.provideEntityManager();
        em.getTransaction();
        User user1 = new User();
        user1.setUserName("Prateek");
        user1.setEmailid("prateek@gmail.com");
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setPhoneNumber("184848484");
        phoneNumber.setPhoneType("Landline");

        PhoneNumber phoneNumber1 = new PhoneNumber();
        phoneNumber1.setPhoneNumber("484848484");
        phoneNumber1.setPhoneType("Home");

        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.setPhoneNumber("4874619415");
        phoneNumber2.setPhoneType("Office");

        List<PhoneNumber> arr = new ArrayList<>();
        arr.add(phoneNumber);
        arr.add(phoneNumber1);
        arr.add(phoneNumber2);

        user1.setPhoneNumbers(arr);
//        User user2 = new User();
        em.persist(user1);
        System.out.println("Done...");
        em.getTransaction().commit();
//        em.close();
    }
}
