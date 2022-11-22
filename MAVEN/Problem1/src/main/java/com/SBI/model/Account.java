package com.SBI.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String email;
    private String address;
    private double balance;
    private String created_date;


    public Account() {
        super();
    }

    public Account(int id, String email, String address, double balance, String created_date) {
        super();
        this.id = id;
        this.email = email;
        this.address = address;
        this.balance = balance;
        this.created_date = created_date;
    }

    public Account(String email, String address, double balance, String created_date) {
        super();
        this.email = email;
        this.address = address;
        this.balance = balance;
        this.created_date = created_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", created_date='" + created_date + '\'' +
                '}';
    }
}
