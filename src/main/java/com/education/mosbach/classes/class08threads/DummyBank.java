package com.education.mosbach.classes.class08threads;

import com.education.mosbach.threads.impl.BankReport;
import com.education.mosbach.threads.impl.MoneyTransactioner;
import com.education.mosbach.threads.impl.SelectedElementsInArrayAdder;

public class DummyBank {

    public static void main(String[] args) {

        // Konten füllen
        int[] accounts = {1000, 1000, 1000};
        int TRANSACTION_LIMIT = 1_000_000;
        int REPORT_LIMIT = 1000;

        Thread reportThread = new Thread(new BankReport(accounts, REPORT_LIMIT));
        Thread atmThread = new Thread(new MoneyTransactioner(accounts, TRANSACTION_LIMIT));
        Thread paypalThread = new Thread(new MoneyTransactioner(accounts, TRANSACTION_LIMIT));

        reportThread.start();
        atmThread.start();
        paypalThread.start();

    }
}
