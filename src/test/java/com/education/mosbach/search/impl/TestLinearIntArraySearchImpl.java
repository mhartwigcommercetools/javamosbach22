package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntArraySearcher;
import com.education.mosbach.sort.api.IntArraySorter;
import com.education.mosbach.sort.impl.BubbleSortImpl;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestLinearIntArraySearchImpl {

    private IntArraySearcher linearIntArraySearch;

    @Before
    public void before() {
        linearIntArraySearch = new LinearIntArraySearchImpl();
    }

    @After
    public void after() {
        linearIntArraySearch = null;
    }

    @Test
    @Parameters({
            "1                  ,   1              , true",
            "1                  ,   5              , false",
            "3-4                ,   3              , true",
            "3-4                ,   4              , true",
            "3-4                ,   3356           , false",
            "3-4-17-5-4         ,   3356           , false",
            "3-4-17-5-4         ,   4              , true"
    })
    public void testSearch(String unSorted, int numberToSearch, boolean found) {

        int[] unSortedArray =
                Arrays.stream(unSorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        assertEquals(
                found,
                linearIntArraySearch.search(unSortedArray, numberToSearch)
        );
    }

    @Test
    public void testSearch_emptyList() {
        int[] emptyList = {};
        assertEquals(
                false,
                linearIntArraySearch.search(emptyList, 3)
        );
    }

}



