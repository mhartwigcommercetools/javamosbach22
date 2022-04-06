package com.education.mosbach.classes.class02sorting;

import com.education.mosbach.sort.api.IntArraySorter;
import com.education.mosbach.sort.impl.*;

import java.util.Random;

public class DummySortCompetition {

    public static void main(String[] args) {
        // lassen wir alle Sortieralg laufen
        // Zeit stoppen

        int LIMIT = 100_000;
        int[] randomNumbersBS = new int[LIMIT];
        int[] randomNumbersSS = new int[LIMIT];
        int[] randomNumbersIS = new int[LIMIT];
        int[] randomNumbersMS = new int[LIMIT];
        int[] randomNumbersQS = new int[LIMIT];

        Random random = new Random();
        int t = 0;
        for (int i = 0; i < LIMIT; i++) {
            t = random.nextInt();
            randomNumbersBS[i] = t;
            randomNumbersSS[i] = t;
            randomNumbersIS[i] = t;
            randomNumbersMS[i] = t;
            randomNumbersQS[i] = t;
        }
        long[] before = new long[5];
        long[] after = new long[5];
        before[0] = System.currentTimeMillis();
            new BubbleSortImpl().sort(randomNumbersBS);
        after[0] = System.currentTimeMillis();

        before[1] = System.currentTimeMillis();
            new SelectionSortImpl().sort(randomNumbersSS);
                    // IntArraySorter mySelectionSortImpl = new SelectionSortImpl();
                    // mySelectionSortImpl.sort(randomNumbersSS);
        after[1] = System.currentTimeMillis();

        before[2] = System.currentTimeMillis();
            new InsertionSortImpl().sort(randomNumbersIS);
        after[2] = System.currentTimeMillis();

        before[3] = System.currentTimeMillis();
            new MergeSortImpl().sort(randomNumbersMS);
        after[3] = System.currentTimeMillis();

        before[4] = System.currentTimeMillis();
            new QuickSortImpl().sort(randomNumbersQS);
        after[4] = System.currentTimeMillis();

        System.out.println("Ergebnis meines spannenden Sortierwettkampfes");
        System.out.println("BubbleSort: " + (after[0]-before[0] + "ms" ));
        System.out.println("SelectionSort: " + (after[1]-before[1] + "ms" ));
        System.out.println("InsertionSort: " + (after[2]-before[2] + "ms" ));
        System.out.println("MergeSort: " + (after[3]-before[3] + "ms" ));
        System.out.println("QuickSort: " + (after[4]-before[4] + "ms" ));
        System.out.println("=================================================");
        System.out.println("Felix denkt, QuickSort gewinnt.");





    }


}
