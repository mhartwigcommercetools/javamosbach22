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
public class TestHundredElementsHashFinderImpl {

    private HundredElementsHashFinderImpl hashFinder;

    @Before
    public void before() {
        hashFinder = new HundredElementsHashFinderImpl();
    }

    @After
    public void after() {
        hashFinder = null;
    }

    @Test
    @Parameters({
            "1                  ,   1              , true",
            "1                  ,   5              , false",
            "3-444              ,   3              , true",
            "3-444              ,   444            , true",
            "3-444-98444        ,   98444          , true",
            "3-99-199-299-4     ,   3356           , false",
            "3-99-199-299-4     ,   199            , true",
            "3-777-777-777-777  ,   3356           , false",
            "3-777-777-777-777  ,   777            , true"
    })
    public void testPushAndFind(String unSorted, int numberToSearch, boolean found) {

        int[] unSortedArray =
                Arrays.stream(unSorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : unSortedArray)
            hashFinder.put(e);

        assertEquals(
                found,
                hashFinder.find(numberToSearch)
        );

    }


}



