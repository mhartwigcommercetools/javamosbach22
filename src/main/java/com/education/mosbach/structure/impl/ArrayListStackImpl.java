package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.Stack;

import java.util.ArrayList;

public class ArrayListStackImpl implements Stack {
    ArrayList<Integer> stack = new ArrayList<>();


    @Override
    public Integer peek() {
        if (isEmpty()) return 0;
        return
                stack.get(stack.size()-1);
    }

    @Override
    public Integer pop() {
        if (isEmpty()) return 0;
        return
                stack.remove(stack.size()-1);
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
