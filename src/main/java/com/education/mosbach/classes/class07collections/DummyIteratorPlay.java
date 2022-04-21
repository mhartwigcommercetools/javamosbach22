package com.education.mosbach.classes.class07collections;

import com.education.mosbach.structure.api.RandomNumberList;
import com.education.mosbach.structure.impl.ArrayListRandomNumberListImpl;

import java.util.Iterator;

public class DummyIteratorPlay {

    public static void main(String[] args) {

        RandomNumberList myList = new ArrayListRandomNumberListImpl(4);

        /*
        System.out.println("Jetzt durchlaufe ich.");
        Iterator<Integer> myListIterator = myList.iterator();
        while (myListIterator.hasNext())
            System.out.println("Element " + myListIterator.next());

        System.out.println("Jetzt durchlaufe ich, aber bekomme nur die positiven Zahlen");
        Iterator<Integer> myPositiveNumberListIterator = myList.getPositiveNumbersIterator();
        while (myPositiveNumberListIterator.hasNext())
            System.out.println("Element " + myPositiveNumberListIterator.next());
        */

        // Lambda
        /*
        Iterator<Integer> myListIteratorModern = myList.iterator();
        myListIteratorModern.forEachRemaining(e -> System.out.println("Element " + e));
        */

        // Methodenreferenz
        Iterator<Integer> myListIteratorModern = myList.iterator();
        myListIteratorModern.forEachRemaining(System.out::println);


    }


}
