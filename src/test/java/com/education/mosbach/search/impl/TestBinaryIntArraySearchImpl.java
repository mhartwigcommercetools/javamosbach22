package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntArraySearcher;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBinaryIntArraySearchImpl {

    private IntArraySearcher binaryIntArraySearch;

    @Before
    public void before() {
        binaryIntArraySearch = new BinaryIntArraySearchImpl();
    }

    @After
    public void after() {
        binaryIntArraySearch = null;
    }

    @Test
    @Parameters({
            "1                  ,   1              , true",
            "1                  ,   5              , false",
            "3-4                ,   3              , true",
            "3-4                ,   4              , true",
            "3-4                ,   3356           , false",
            "3-4-4-5-17         ,   3356           , false",
            "1-2-3-4-5-6-7-8    ,   9              , false",
            "3-4-4-5-17         ,   4              , true"
    })
    public void testSearch(String unSorted, int numberToSearch, boolean found) {

        int[] unSortedArray =
                Arrays.stream(unSorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        assertEquals(
                found,
                binaryIntArraySearch.search(unSortedArray, numberToSearch)
        );
    }

    @Test
    public void testSearch_emptyList() {
        int[] emptyList = {};
        assertEquals(
                false,
                binaryIntArraySearch.search(emptyList, 3)
        );
    }

}



