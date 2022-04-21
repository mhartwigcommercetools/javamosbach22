package com.education.mosbach.classes.class03structures;

import com.education.mosbach.structure.api.LinkedList;
import com.education.mosbach.structure.impl.SortedLinkedListImpl;

public class DummyLinkedListPlay {

    public static void main(String[] args) {

        LinkedList myList = new SortedLinkedListImpl();
        System.out.println("Leere Linked List");
        myList.getAllElements().forEach(System.out::println);

        // eins rein
        myList.chain(42);
        System.out.println("Ein Element in Linked List");
        myList.getAllElements().forEach(System.out::println);

        // zwei rein
        myList.chain(48);
        System.out.println("Zwei Elemente in Linked List");
        myList.getAllElements().forEach(System.out::println);

        // drei rein
        myList.chain(31);
        System.out.println("Drei Elemente in Linked List");
        myList.getAllElements().forEach(System.out::println);

        // drei rein
        myList.chain(566);
        System.out.println("Vier Elemente in Linked List");
        myList.getAllElements().forEach(System.out::println);

        //drei raus
        myList.unchain(31);
        System.out.println("Löschen 31");
        myList.getAllElements().forEach(System.out::println);

    }


}
