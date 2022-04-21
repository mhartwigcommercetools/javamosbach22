package com.education.mosbach.select.impl;

import com.education.mosbach.select.api.IntArraySelecter;
import com.education.mosbach.sort.impl.QuickSortImpl;

public class BruteForceIntArraySelectImpl implements IntArraySelecter {
    @Override
    public int select(int[] numbers, int place) {
        if (place > numbers.length || place < 1)
            return 0;
        return
                (new QuickSortImpl()
                        .sort(numbers)
                )[place-1];
    }
}
