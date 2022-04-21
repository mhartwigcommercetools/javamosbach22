package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.Stack;

import java.util.Arrays;

public class DynamicArrayStackImpl implements Stack {
    int LIMIT = 1;
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
        if (top < stack.length-1) {
            top++;
            stack[top] = number;
        }
        else {
            Integer[] tempStack = Arrays.copyOf(stack, stack.length + LIMIT);
            stack = tempStack;
            push(number);
        }
    }

    @Override
    public boolean isEmpty() {
        return
                (top < 0);
    }
}
