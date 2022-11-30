package com.usecases;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.exception.UserNotFoundException;
import com.model.PhoneNumber;
import com.model.User;
import com.model.phoneType;

import java.util.Scanner;

public class RegisterUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter the email: ");
        String email = sc.next();
        System.out.println("Enter the phoneId: ");
        int pid = sc.nextInt();
        System.out.println("Enter the Phone Number: ");
        String phNum = sc.next();
        System.out.println("Enter the phoneId: ");
        int pid1 = sc.nextInt();
        System.out.println("Enter the Phone Number: ");
        String phNum1 = sc.next();
        System.out.println("Enter the phoneId: ");
        int pid2 = sc.nextInt();
        System.out.println("Enter the Phone Number: ");
        String phNum2 = sc.next();
        User user = new User();
        user.setUserName(name);
        user.setEmailId(email);
        user.getPhone().add(new PhoneNumber(pid,phNum, phoneType.HOME));
        user.getPhone().add(new PhoneNumber(pid1,phNum1,phoneType.OFFICE));
        user.getPhone().add(new PhoneNumber(pid2,phNum2,phoneType.LANDLINE));

        UserDao dao = new UserDaoImpl();
        try {
            dao.createUser(user);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
