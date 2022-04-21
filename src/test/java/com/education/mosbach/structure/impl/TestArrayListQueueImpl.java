package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.Queue;
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
public class TestArrayListQueueImpl {

    private Queue queue;

    @Before
    public void before() {
        queue = new ArrayListQueueImpl();
    }

    @After
    public void after() {
        queue = null;
    }

    @Test
    @Parameters({
            "1                  ,   1",
            "1-2-3              ,   1",
            "3-4-4-5-6-2        ,   3",
            "3-3-3-3-3-3-3      ,   3"
    })
    public void testPeek(String toQueue, int numberToPeek) {

        int[] toQueueArray =
                Arrays.stream(toQueue.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : toQueueArray)
            queue.push(e);

        assertEquals(
                numberToPeek,
                queue.peek().intValue()
        );
    }

    @Test
    @Parameters({
            "1                  ,   1",
            "1-2-3              ,   1",
            "3-4-4-5-6-2        ,   3",
            "3-3-3-3-3-3-3      ,   3"
    })
    public void testPop(String toQueue, int numberToPop) {

        int[] toQueueArray =
                Arrays.stream(toQueue.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : toQueueArray)
            queue.push(e);

        assertEquals(
                numberToPop,
                queue.pop().intValue()
        );
    }

    @Test
    @Parameters({
            "1                  ,   1               ,  1-1",
            "1-2-3              ,   3               ,  1-2-3-3",
            "3-4-4-5-6-2        ,   2-3-4           ,  3-4-4-5-6-2-2-3-4",
            "3-3-3              ,   3-3             ,  3-3-3-3-3"
    })
    public void testPush(String queueOld, String numbersToPush, String queueNew) {

        int[] toQueueOld =
                Arrays.stream(queueOld.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        int[] toPush =
                Arrays.stream(numbersToPush.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        int[] toQueueNew =
                Arrays.stream(queueNew.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : toQueueOld)
            queue.push(e);
        for (int e : toPush)
            queue.push(e);

        for (int i = 0; i < toQueueNew.length; i++)
            assertEquals(
                toQueueNew[i],
                queue.pop().intValue()
        );
    }

    @Test
    public void testIsEmpty() {

        assertEquals(
                true,
                queue.isEmpty()
        );

        queue.push(1);
        assertEquals(
                false,
                queue.isEmpty()
        );

        queue.pop();
        assertEquals(
                true,
                queue.isEmpty()
        );

    }


}



