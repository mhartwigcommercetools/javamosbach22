package com.education.mosbach.select.impl;

import com.education.mosbach.search.api.IntArraySearcher;
import com.education.mosbach.search.impl.LinearIntArraySearchImpl;
import com.education.mosbach.select.api.IntArraySelecter;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBruteForceIntArraySelectImpl {

    private IntArraySelecter bruteForceIntArraySelect;

    @Before
    public void before() {
        bruteForceIntArraySelect = new BruteForceIntArraySelectImpl();
    }

    @After
    public void after() {
        bruteForceIntArraySelect = null;
    }

    @Test
    @Parameters({
            "1                  ,   1              , 1",
            "1                  ,   5              , 0",
            "3-4                ,   0              , 0",
            "3-4                ,   1              , 3",
            "3-4                ,   2              , 4",
            "3-4-17-5-4         ,   2              , 4",
            "3-4-17-5-4         ,   1              , 3"
    })
    public void testSelect(String unSorted, int place, int result) {

        int[] unSortedArray =
                Arrays.stream(unSorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        assertEquals(
                result,
                bruteForceIntArraySelect.select(unSortedArray, place)
        );
    }

    @Test
    public void testSelect_emptyList() {
        int[] emptyList = {};
        assertEquals(
                0,
                bruteForceIntArraySelect.select(emptyList, 4)
        );
    }

}



