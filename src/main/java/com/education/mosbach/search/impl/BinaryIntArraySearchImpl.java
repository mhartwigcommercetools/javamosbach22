package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntArraySearcher;

public class BinaryIntArraySearchImpl implements IntArraySearcher {


    public boolean binarySearch(int[] numbers, int numberToSearch, int left, int right) {

        if (right < left) return false;

        // int pivot = (left + right) / 2;  falsch laut ungarischem Studenten

        int pivot = left + ((right - left) / 2);

        if (numbers[pivot] == numberToSearch) return true;
        if (numbers[pivot] > numberToSearch)
            return
                    binarySearch(numbers, numberToSearch, left, pivot-1);
        if (numbers[pivot] < numberToSearch)
            return
                    binarySearch(numbers, numberToSearch, pivot+1, right);

        return false;
    }


    @Override
    public boolean search(int[] numbers, int numberToSearch) {

        return
            binarySearch(numbers, numberToSearch, 0, numbers.length-1);
    }
}
