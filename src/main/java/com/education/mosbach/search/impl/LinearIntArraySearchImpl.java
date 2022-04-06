package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntArraySearcher;

public class LinearIntArraySearchImpl implements IntArraySearcher {


    @Override
    public boolean search(int[] numbers, int numberToSearch) {

        for (int e : numbers)
            if (e == numberToSearch) return true;

        return false;
    }
}
