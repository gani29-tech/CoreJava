package com.techouts.assessment2.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListComparison {
    private static final Logger logger = Logger.getLogger(ListComparison.class.getName());
    public static void main(String[] args) {
        //ArrayList is Dynamic Array,Accessing is fast
        //LinkedList uses Double Linked list ,adding and removing eleme
        ArrayList<Integer> arraylist = new ArrayList<>();
        LinkedList<Integer> linkedlist = new LinkedList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        logger.log(Level.INFO, "arraylist : {0}" , arraylist);
        arraylist.remove(2);
        logger.log(Level.INFO, "arraylist : {0}" , arraylist);
        linkedlist.add(1);
        linkedlist.addFirst(2);
        linkedlist.addLast(3);
        linkedlist.add(4);
        logger.log(Level.INFO, "linked list : {0}" , linkedlist);
        linkedlist.remove(1);
        logger.log(Level.INFO, "linked list : {0}" , linkedlist);

    }
}
