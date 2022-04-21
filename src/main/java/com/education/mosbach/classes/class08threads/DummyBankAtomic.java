package com.education.mosbach.classes.class08threads;

import com.education.mosbach.threads.impl.BankReport;
import com.education.mosbach.threads.impl.BankReportAtomic;
import com.education.mosbach.threads.impl.MoneyTransactioner;
import com.education.mosbach.threads.impl.MoneyTransactionerAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class DummyBankAtomic {

    public static void main(String[] args) {

        // Konten füllen
        AtomicInteger[] accounts = {
                new AtomicInteger(1000),
                new AtomicInteger(1000),
                new AtomicInteger(1000)
        };
        int TRANSACTION_LIMIT = 1_000_000;
        int REPORT_LIMIT = 100_000;

        Thread reportThread = new Thread(new BankReportAtomic(accounts, REPORT_LIMIT));
        Thread atmThread = new Thread(new MoneyTransactionerAtomic(accounts, TRANSACTION_LIMIT));
        Thread paypalThread = new Thread(new MoneyTransactionerAtomic(accounts, TRANSACTION_LIMIT));

        reportThread.start();
        atmThread.start();
        paypalThread.start();

    }
}
