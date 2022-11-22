package com.SBI.useCases;

import com.SBI.dao.stateBankDAO;
import com.SBI.dao.stateBankDAOImpl;
import com.SBI.model.Account;

import java.util.Scanner;

public class RegisterAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ID: ");
        int id = sc.nextInt();
        System.out.print("Enter the email: ");
        String email = sc.next();
        System.out.print("Enter the address: ");
        String address = sc.next();
        System.out.print("Enter the balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the date: ");
        String date = sc.next();

        Account account = new Account();
        account.setId(id);
        account.setEmail(email);
        account.setAddress(address);
        account.setBalance(balance);
        account.setCreated_date(date);

        stateBankDAO dao = new stateBankDAOImpl();
        dao.saveAccount(account);

    }
}
