package com.usecases;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.exception.UserNotFoundException;
import com.model.User;

import java.util.Scanner;

public class FindUserByName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        UserDao dao = new UserDaoImpl();
        try {
            dao.findName(name).forEach((a-> System.out.println(a.toString())));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
