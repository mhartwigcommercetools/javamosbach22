package com.education.mosbach.classes.class08threads;

import com.education.mosbach.threads.impl.ModuloThreeCounter;

import java.util.Random;

public class DummyThreadPlay {

    public static void main(String[] args) {

        // Priority
        // Daemon
        // t3

        int LIMIT = 1_000_000;
        int[] randomNumbers = new int[LIMIT];
        Random random = new Random();
        for (int i = 0; i < LIMIT; i++)
            randomNumbers[i] = random.nextInt();

        Thread t0 = new Thread(new ModuloThreeCounter(0, LIMIT, randomNumbers));
        Thread t1 = new Thread(new ModuloThreeCounter(1, LIMIT, randomNumbers));
        Thread t2 = new Thread(new ModuloThreeCounter(2, LIMIT, randomNumbers));

        t0.setPriority(2);
        t1.setPriority(9);
        t2.setDaemon(true);

        long beforeThreaded = System.currentTimeMillis();
        t0.start();
        t1.start();
        t2.start();

        try {
            t0.join();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long afterThreaded = System.currentTimeMillis();

        System.out.println("Hauptprogramm ist fertig.");

        // Vergleich mit SingleThread
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        long beforeSingle = System.currentTimeMillis();
        for (int i = 0; i < LIMIT; i++) {
            if (randomNumbers[i] % 3 == 0) counter0++;
            if (randomNumbers[i] % 3 == 1) counter1++;
            if (randomNumbers[i] % 3 == 2) counter2++;
        }
        long afterSingle = System.currentTimeMillis();
        System.out.println("Hauptprogramm " + counter0 + " " + counter1 + " " + counter2);

        System.out.println("=======================================");
        System.out.println("Zeitvergleich:");
        System.out.println("Threads " + (afterThreaded - beforeThreaded) + " ms");
        System.out.println("Single " + (afterSingle - beforeSingle) + " ms");

    }



}
