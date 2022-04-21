package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.Queue;
import com.education.mosbach.structure.api.Stack;

import java.util.ArrayList;

public class ArrayListQueueImpl implements Queue {
    ArrayList<Integer> stack = new ArrayList<>();


    @Override
    public Integer peek() {
        if (isEmpty()) return 0;
        return
                stack.get(0);
    }

    @Override
    public Integer pop() {
        if (isEmpty()) return 0;
        return
                stack.remove(0);
    }

    @Override
    public void push(Integer number) {
        stack.add(number);
    }

    @Override
    public boolean isEmpty() {
        return
                (stack.size() == 0);
    }
}
