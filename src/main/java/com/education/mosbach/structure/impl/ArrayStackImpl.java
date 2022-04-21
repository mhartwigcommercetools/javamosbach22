package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.Stack;

import java.util.ArrayList;

public class ArrayStackImpl implements Stack {
    int LIMIT = 20;
    Integer[] stack = new Integer[LIMIT];
    int top = -1;

    @Override
    public Integer peek() {
        if (isEmpty()) return 0;
        return
             stack[top];
    }

    @Override
    public Integer pop() {
        if (isEmpty()) return 0;
        return
                stack[top--];
    }

    @Override
    public void push(Integer number) {
        top++;
        stack[top] = number;
    }

    @Override
    public boolean isEmpty() {
        return
                (top < 0);
    }
}
