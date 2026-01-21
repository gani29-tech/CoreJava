package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MatchingEx {
    private static final Logger logger = Logger.getLogger(MatchingEx.class.getName());

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ganesh");
        list.add("Gani");
        list.add("Nani");
        boolean result = list.stream().allMatch(a -> a.contains("a"));
        logger.log(Level.INFO, "result: {0}", result);
    }
}
