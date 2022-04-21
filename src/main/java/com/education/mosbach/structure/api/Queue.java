package com.education.mosbach.structure.api;

public interface Queue {
    Integer peek();
    Integer pop();
    void push(Integer number);
    boolean isEmpty();
}
