package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.RandomNumberList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListRandomNumberListImpl implements RandomNumberList {

    final int size;
    List<Integer> numbers = new ArrayList<>();

    public ArrayListRandomNumberListImpl(int size) {
        this.size = size;

        Random random = new Random();
        for (int i = 0; i < size; i++)
            numbers.add(random.nextInt());

    }


    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> myIterator = new Iterator<Integer>() {
            int position = -1;
            @Override
            public boolean hasNext() {
                return
                        numbers.size() > (position + 1);
            }

            @Override
            public Integer next() {
                position++;
                return
                        numbers.get(position);
            }
        };
        return myIterator;
    }

    @Override
    public Iterator<Integer> getPositiveNumbersIterator() {
        Iterator<Integer> myIterator = new Iterator<Integer>() {
            int position = -1;
            @Override
            public boolean hasNext() {

                while (
                        numbers.size() > (position + 1) &&
                        numbers.get(position + 1) < 0
                )
                    position++;
                return
                        numbers.size() > (position + 1);
            }

            @Override
            public Integer next() {
                position++;
                return
                        numbers.get(position);
            }
        };
        return myIterator;
    }
}
