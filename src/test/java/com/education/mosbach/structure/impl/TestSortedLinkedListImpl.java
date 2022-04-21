package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.LinkedList;
import com.education.mosbach.structure.api.Stack;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestSortedLinkedListImpl {

    private LinkedList sortedLinkedList;

    @Before
    public void before() {
        sortedLinkedList = new SortedLinkedListImpl();
    }

    @After
    public void after() {
        sortedLinkedList = null;
    }

    @Test
    @Parameters({
            "1                  ,   4          , 1-4",
            "1-2-3              ,   6          , 1-2-3-6",
            "3-4-7-28           ,   2          , 2-3-4-7-28",
            "3-9-11-17          ,   10         , 3-9-10-11-17",
            "3-9-11-17          ,   109        , 3-9-11-17-109"
    })
    public void testChain(String linkedList, int numberToChain, String newLinkedList) {

        int[] toLinkedList =
                Arrays.stream(linkedList.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : toLinkedList)
            sortedLinkedList.chain(e);
        sortedLinkedList.chain(numberToChain);

        int[] newLinkedListArray =
                Arrays.stream(newLinkedList.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int i = 0; i < newLinkedListArray.length; i++)
            assertEquals(
                sortedLinkedList.getAllElements().get(i).intValue(),
                newLinkedListArray[i]
            );

    }



}



