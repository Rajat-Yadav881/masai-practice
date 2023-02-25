package com.example.geektrust.model;

public class MetroCard {
	String cardNumber;
    int balance;

    public MetroCard(String cardNumber, int balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getBalance() {
        return balance;
    }

//    public void addBalance(int amount) {
//        balance += amount;
//    }

    public void deductBalance(int amount) {
        balance -= amount;
    }
	
}
