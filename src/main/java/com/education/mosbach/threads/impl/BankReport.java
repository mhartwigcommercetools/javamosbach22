package com.education.mosbach.threads.impl;

import java.util.Random;

public class BankReport implements Runnable {

    int[] accounts;
    int LIMIT;

    public BankReport(int[] accounts, int LIMIT) {
        this.accounts = accounts;
        this.LIMIT = LIMIT;
    }

    @Override
    public void run() {
        for (int i = 0; i < LIMIT; i++) {
            synchronized (accounts) {
                int account0 = accounts[0];
                int account1 = accounts[1];
                int account2 = accounts[2];
                System.out.println("==========================");
                System.out.println("Konto 0 " + account0);
                System.out.println("Konto 1 " + account1);
                System.out.println("Konto 2 " + account2);
                System.out.println("Summe = " + (account0 + account1 + account2));
            }
        }

    }
}
