package com.education.mosbach.threads.impl;

public class ModuloThreeCounter implements Runnable {

    private int counter = 0;
    private int LIMIT;
    private int[] randomNumbers;
    private int divisor;

    public ModuloThreeCounter(int divisor, int LIMIT, int[] randomNumbers) {
        this.LIMIT = LIMIT;
        this.randomNumbers = randomNumbers;
        this.divisor = divisor;
    }

    @Override
    public void run() {
        for (int i = 0; i < LIMIT; i++)
            if (randomNumbers[i] % 3 == divisor) counter++;
        System.out.println("Thread " + divisor + " ist fertig mit " + counter);
    }
}
