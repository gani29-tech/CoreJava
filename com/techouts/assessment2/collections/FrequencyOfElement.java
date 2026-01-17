package com.techouts.assessment2.collections;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrequencyOfElement {
    private static final Logger logger = Logger.getLogger(FrequencyOfElement.class.getName());

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ganesh");
        list.add("Ramu");
        list.add("Ganesh");
        list.add("Gani");
        list.add("Ganesh");
        list.add("Ram");
        SortedSet<String> sortedSet = new TreeSet<>(list);
        Scanner sc = new Scanner(System.in);
        logger.log(Level.INFO, "Enter Name to count Frequency : {0}", sortedSet);
        String search = sc.nextLine();
        logger.log(Level.INFO, "Frequency of {0} is {1}", new Object[]{search, Collections.frequency(list, search)});
    }
}
