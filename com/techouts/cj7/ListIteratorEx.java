package com.techouts.cj7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ganesh");
        list.add("Gani");
        list.add("Jonny");
        list.set(2, "Johnny");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));
        ListIterator<String> li = list.listIterator();
        //Iterates in Forward Direction
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        //Iterates in Backward Direction
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }
    }
}
