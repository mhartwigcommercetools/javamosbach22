package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.LinkedList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SortedLinkedListImpl implements LinkedList {

    private IntegerNode root = null;

    public void chain_head(Integer element, IntegerNode next) {
        root = new IntegerNode(element, next);
    }

    public void chain_next(IntegerNode nodeInChain, Integer element) {
        nodeInChain.next =
                new IntegerNode(element, nodeInChain.next);
    }

    public void unchain_head() {
        if (root != null)
            root = root.next;
    }

    public void unchain_next(IntegerNode nodeInChain) {
        if (nodeInChain.next != null)
            nodeInChain.next = nodeInChain.next.next;
    }

    @Override
    public void chain(Integer element) {

        if (root == null || root.content > element) {       // Alles leer oder es ist das neue root
            chain_head(element, root);
            return;
        }
                                                            // Durchgehen, immer letztes merken
        IntegerNode actual = root;
        IntegerNode previous = null;
        while (actual != null && actual.content <= element) {
            previous = actual;
            actual = actual.next;
        }
        chain_next(previous, element);

    }

    @Override
    public boolean unchain(Integer element) {

        if (root != null && root.content == element) {
            unchain_head();
            return true;
        }

        IntegerNode actual = root;
        IntegerNode previous = null;
        while (actual != null) {
            if (actual.content == element) {
                unchain_next(previous);
                return true;
            }
            else {
                previous = actual;
                actual = actual.next;
            }
        }
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
