package com.BankingSystem;

public class Account {

    int accountNumber;
    String accountHolderName;
    double balance;
    String Name;

    public Account(int accountNumber, String accountHolderName, double balance, String Name) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Account Number : " + accountNumber +
               "\nAccount Holder : " + accountHolderName +
               "\nBalance : ₹" + balance+
               "\nUserName : " + Name;
    }
}