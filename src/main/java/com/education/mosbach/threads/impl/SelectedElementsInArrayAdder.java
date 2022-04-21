package com.education.mosbach.threads.impl;

public class SelectedElementsInArrayAdder implements Runnable {

    private int sum = 0;
    private int LIMIT;
    private int[] randomNumbers;
    private int divisor;

    public SelectedElementsInArrayAdder(int divisor, int LIMIT, int[] randomNumbers) {
        this.LIMIT = LIMIT;
        this.randomNumbers = randomNumbers;
        this.divisor = divisor;
    }

    @Override
    public void run() {
        for (int i = divisor; i < LIMIT; i = i+3)
            sum += randomNumbers[i];
        // System.out.println("Thread " + divisor + " ist fertig mit " + sum);
    }
}
