package com.SBI.useCases;

import com.SBI.dao.stateBankDAO;
import com.SBI.dao.stateBankDAOImpl;

import java.util.Scanner;

public class DeleteAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID: ");
        int id = sc.nextInt();

        stateBankDAO dao = new stateBankDAOImpl();
        dao.deleteAccountById(id);
    }
}
