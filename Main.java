package com.BankingSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        for(int i = 1001; i <= 1200; i++) {

            bank.createAccount(
            		new Account(
            			    i,
            			    "Customer" + (i - 1000),
            			    5000 + ((i - 1000) * 100),
            			    "user" + (i - 1000)
            			)
            );
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number : ");

        int accountNumber = sc.nextInt();

        bank.searchAccount(accountNumber);

        sc.close();
    }
}