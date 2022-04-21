package com.education.mosbach.threads.impl;

import java.util.Random;

public class MoneyTransactioner implements Runnable {

    int[] accounts;
    int LIMIT;

    public MoneyTransactioner(int[] accounts, int LIMIT) {
        this.accounts = accounts;
        this.LIMIT = LIMIT;
    }

    public void transfer(int amount, int from, int to) {
        synchronized (accounts) {
            accounts[from] -= amount;
            accounts[to] += amount;
        }
    }


    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < LIMIT; i++) {
            transfer(
                    random.nextInt(1000),
                    random.nextInt(3),
                    random.nextInt(3)
            );
        }

    }
}
