package com.SBI.useCases;

import com.SBI.dao.stateBankDAO;
import com.SBI.dao.stateBankDAOImpl;

import java.util.Scanner;

public class DepositAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID: ");
        int id = sc.nextInt();
        System.out.print("Enter the balance: ");
        double balance = sc.nextDouble();
        stateBankDAO dao = new stateBankDAOImpl();
        dao.depositInAccount(balance,id);
    }
}
