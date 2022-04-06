package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntArraySorter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSortImpl implements IntArraySorter {

        public ArrayList<Integer> msort(ArrayList<Integer> unsorted) {
            if (unsorted.size() > 1) {
                ArrayList<Integer> left = new ArrayList<>();
                ArrayList<Integer> right = new ArrayList<>();
                for (int i = 0; i < unsorted.size(); i++) {
                    if (i % 2 == 0)
                        left.add(unsorted.get(i));
                    else
                        right.add(unsorted.get(i));
                }
                ArrayList<Integer> leftSorted = msort(left);
                ArrayList<Integer> rightSorted = msort(right);
                ArrayList<Integer> sorted = new ArrayList<>();
                while (leftSorted.size() + rightSorted.size() > 0) {
                    if (leftSorted.size() > 0 && rightSorted.size() > 0)
                        if (leftSorted.get(0) < rightSorted.get(0))
                            sorted.add(leftSorted.remove(0));
                        else
                            sorted.add(rightSorted.remove(0));
                    else
                        if (leftSorted.size() == 0)
                            sorted.add(rightSorted.remove(0));
                        else
                            sorted.add(leftSorted.remove(0));
                }
                return
                        sorted;
            }
            return unsorted;
        }



      public int[] sort(int[] unsorted) {

            ArrayList<Integer> unsortedAL = new ArrayList<>();
            for (int e : unsorted)
                unsortedAL.add(e);

            ArrayList<Integer> sortedAL = msort(unsortedAL);

            int[] sorted = new int[unsorted.length];
            int i = 0;
            for (Integer e : sortedAL)
                sorted[i++] = e;

        return
                sorted;
    }

}
