package com.BankingSystem;

import java.util.ArrayList;

public class Bank implements BankOperations {

    ArrayList<Account> accounts = new ArrayList<>();

    @Override
    public void createAccount(Account account) {

        accounts.add(account);

        
    }

    @Override
    public void viewAccounts() {

        for(Account acc : accounts) {

            System.out.println("-------------------");
            System.out.println(acc);
        }
    }

    @Override
    public void searchAccount(int accountNumber) {

        for(Account acc : accounts) {

            if(acc.accountNumber == accountNumber) {

                System.out.println("Account Found");
                System.out.println(acc);
                return;
            }
        }

        System.out.println("Account Not Found");
    }
}