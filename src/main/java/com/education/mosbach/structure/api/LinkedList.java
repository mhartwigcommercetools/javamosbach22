package com.education.mosbach.structure.api;

import java.util.List;

public interface LinkedList {

    void chain(Integer element);
    boolean unchain(Integer element);
    List<Integer> getAllElements();

}
