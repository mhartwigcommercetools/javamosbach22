package com.education.mosbach.classes.class08threads;

import com.education.mosbach.threads.impl.ModuloThreeCounter;
import com.education.mosbach.threads.impl.SelectedElementsInArrayAdder;

import java.util.Random;

public class DummyThreadArraySumPlay {

    public static void main(String[] args) {

        // Priority
        // Daemon
        // t3

        int LIMIT = 400_000_000;
        int[] randomNumbers = new int[LIMIT];
        Random random = new Random();
        for (int i = 0; i < LIMIT; i++)
            randomNumbers[i] = random.nextInt(10);

        Thread t0 = new Thread(new SelectedElementsInArrayAdder(0, LIMIT, randomNumbers));
        Thread t1 = new Thread(new SelectedElementsInArrayAdder(1, LIMIT, randomNumbers));
        Thread t2 = new Thread(new SelectedElementsInArrayAdder(2, LIMIT, randomNumbers));

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
        int sum = 0;
        long beforeSingle = System.currentTimeMillis();
        for (int i = 0; i < LIMIT; i++) {
            sum += randomNumbers[i];
        }
        long afterSingle = System.currentTimeMillis();
        System.out.println("Hauptprogramm " + sum);

        System.out.println("=======================================");
        System.out.println("Zeitvergleich:");
        System.out.println("Threads " + (afterThreaded - beforeThreaded) + " ms");
        System.out.println("Single " + (afterSingle - beforeSingle) + " ms");

    }



}
