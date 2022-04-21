package com.education.mosbach.structure.impl;

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
public class TestDynamicArrayStackImpl {

    private Stack stack;

    @Before
    public void before() {
        stack = new DynamicArrayStackImpl();
    }

    @After
    public void after() {
        stack = null;
    }

    @Test
    @Parameters({
            "1                  ,   1",
            "1-2-3              ,   3",
            "3-4-4-5-6-2        ,   2",
            "3-3-3-3-3-3-3      ,   3"
    })
    public void testPeek(String toStack, int numberToPeek) {

        int[] toStackArray =
                Arrays.stream(toStack.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : toStackArray)
            stack.push(e);

        assertEquals(
                numberToPeek,
                stack.peek().intValue()
        );
    }

    @Test
    @Parameters({
            "1                  ,   1",
            "1-2-3              ,   3",
            "3-4-4-5-6-2        ,   2",
            "3-3-3-3-3-3-3      ,   3"
    })
    public void testPop(String toStack, int numberToPop) {

        int[] toStackArray =
                Arrays.stream(toStack.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : toStackArray)
            stack.push(e);

        assertEquals(
                numberToPop,
                stack.pop().intValue()
        );
    }

    @Test
    @Parameters({
            "1                  ,   1               ,  1-1",
            "1-2-3              ,   3               ,  1-2-3-3",
            "3-4-4-5-6-2        ,   2-3-4           ,  3-4-4-5-6-2-2-3-4",
            "3-3-3              ,   3-3             ,  3-3-3-3-3",
            "3-3-3              ,   3-3-4-5         ,  3-3-3-3-3-4-5",
            "3                  ,   3-3-5-6-7-8-9   ,  3-3-3-5-6-7-8-9"
    })
    public void testPush(String stackOld, String numbersToPush, String stackNew) {

        int[] toStackOld =
                Arrays.stream(stackOld.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        int[] toPush =
                Arrays.stream(numbersToPush.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        int[] toStackNew =
                Arrays.stream(stackNew.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : toStackOld)
            stack.push(e);
        for (int e : toPush)
            stack.push(e);

        for (int i = toStackNew.length - 1; i >= 0; i--)
            assertEquals(
                toStackNew[i],
                stack.pop().intValue()
        );
    }

    @Test
    public void testIsEmpty() {

        assertEquals(
                true,
                stack.isEmpty()
        );

        stack.push(1);
        assertEquals(
                false,
                stack.isEmpty()
        );

        stack.pop();
        assertEquals(
                true,
                stack.isEmpty()
        );

    }


}



