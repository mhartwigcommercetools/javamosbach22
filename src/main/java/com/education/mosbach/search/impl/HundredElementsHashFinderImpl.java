package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.HashFinder;

public class HundredElementsHashFinderImpl implements HashFinder {

    int[] hashStorage = new int[100];

    public HundredElementsHashFinderImpl() {

        for (int i = 0; i < 100; i++)
                hashStorage[i] = 0;
    }

    @Override
    public void put(int element) {

        int position = element % 100;

        while (hashStorage[position] != 0 && hashStorage[position] != element)
            if (position < 99)
                position++;
            else
                position = 0;
        if (hashStorage[position] == 0) hashStorage[position] = element;

        // if (hashStorage[position] == element) return;
    }

    @Override
    public boolean find(int element) {

        int position = element % 100;

        while (hashStorage[position] != 0 && hashStorage[position] != element)
            if (position < 99)
                position++;
            else
                position = 0;
        return
                (hashStorage[position] == element);

        // if (hashStorage[position] == element) return;
    }
}
