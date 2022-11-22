package com.SBI.utility;

import com.SBI.useCases.*;

import java.util.Scanner;

public class Main {
    static {
        System.out.println("Welcome to the State Bank Of India ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b){
            System.out.println("1.create account");
            System.out.println("2.SearchAccount");
            System.out.println("3.Delete Account");
            System.out.println("4.withdrawal Money");
            System.out.println("5.Deposite Money");
            System.out.println("6.Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    RegisterAccount.main(null);
                    break;
                case 2:
                    SearchAccount.main(null);
                    break;
                case 3:
                    DeleteAccount.main(null);
                    break;
                case 4:
                    WithdrawalAmount.main(null);
                    break;
                case 5:
                    DepositAmount.main(null);
                    break;
                case 6:
                    System.out.println("Thankyou for trusting SBI");
                    b = false;
                    break;
                default:
                    System.out.println("Enter the correct choice");
                    break;
            }
        }

    }
}
