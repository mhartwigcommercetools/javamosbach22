package com.education.mosbach.threads.impl;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MoneyTransactionerAtomic implements Runnable {

    AtomicInteger[] accounts;
    int LIMIT;

    public MoneyTransactionerAtomic(AtomicInteger[] accounts, int LIMIT) {
        this.accounts = accounts;
        this.LIMIT = LIMIT;
    }

    public void transfer(int amount, int from, int to) {
            accounts[from].addAndGet(-1 * amount);
            accounts[to].addAndGet(amount);
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
