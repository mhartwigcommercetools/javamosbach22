package com.education.mosbach.classes.class04specialclasses;

import java.util.Random;

public class DummyStringCompetition {

    // 100_000
    // 1_000_000 add 'a' to a String, StringBuilder, StringBuffer

    // who wins?


    public static void main(String[] args) {

        int LIMIT = 1_000_000;
        int[] randomNumbers = new int[LIMIT];

        Random random = new Random();
        int t = 0;
        for (int i = 0; i < LIMIT; i++) {
            randomNumbers[i] = random.nextInt(20);
        }

        long[] before = new long[3];
        long[] after = new long[3];

        before[0] = System.currentTimeMillis();
        String s1 = "";
        for (int e : randomNumbers)
            s1 += e;
        after[0] = System.currentTimeMillis();

        before[1] = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder("");
        for (int e : randomNumbers)
            s2.append(e);
        after[1] = System.currentTimeMillis();

        before[2] = System.currentTimeMillis();
        StringBuffer s3 = new StringBuffer("");
        for (int e : randomNumbers)
            s2.append(e);
        after[2] = System.currentTimeMillis();

        System.out.println("String " + (after[0] - before[0]) + " ms");
        System.out.println("StringBuilder " + (after[1] - before[1]) + " ms");
        System.out.println("StringBuffer " + (after[2] - before[2]) + " ms");


    }



}
