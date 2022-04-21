package com.education.mosbach.threads.impl;

import java.util.concurrent.atomic.AtomicInteger;

public class BankReportAtomic implements Runnable {

    AtomicInteger[] accounts;
    int LIMIT;

    public BankReportAtomic(AtomicInteger[] accounts, int LIMIT) {
        this.accounts = accounts;
        this.LIMIT = LIMIT;
    }

    @Override
    public void run() {
        for (int i = 0; i < LIMIT; i++) {
                int account0 = accounts[0].get();
                int account1 = accounts[1].get();
                int account2 = accounts[2].get();
                System.out.println("==========================");
                System.out.println("Konto 0 " + account0);
                System.out.println("Konto 1 " + account1);
                System.out.println("Konto 2 " + account2);
                System.out.println("Summe = " + (account0 + account1 + account2));
        }

    }
}
