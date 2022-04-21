package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.LinkedList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SortedLinkedListImpl implements LinkedList {

    private IntegerNode root = null;

    @Override
    public void chain(Integer element) {
        // Alles leer
        if (root == null) {
            root = new IntegerNode(element, null);
        }

        // Hat ein Element
        else
            if (root.next == null) {
                if (root.content < element)
                    root.next = new IntegerNode(element, null);
                else
                    root = new IntegerNode(element, root);
            }

            // Hat mindestens zwei Element
            else {
                    if (root.content > element)
                        root = new IntegerNode(element, root);
                    else {
                        IntegerNode t = root;
                        while (t.next !=null && t.next.content < element)
                            t = t.next;
                        IntegerNode p = t;
                        p.next = new IntegerNode(element, t.next);
                    }
            }
    }

    @Override
    public boolean unchain(Integer element) {

        /*
        if (root == null) return false;

        IntegerNode t = root;
        IntegerNode p = null;
        while (t != null OR t.content != element) {
            p = t;
            t = t.next;
        }

        if (t != null && t.content == element) {
            p.next = t.next;
            return true;
        }
        else

         */
            return false;
    }

    @Override
    public List<Integer> getAllElements() {
        List<Integer> integers = new ArrayList<>();
        IntegerNode t = root;
        while (t != null) {
            integers.add(t.content);
            t = t.next;
        }

        return integers;
    }
}
