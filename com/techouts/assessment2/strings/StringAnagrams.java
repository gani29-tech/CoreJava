package com.techouts.assessment2.strings;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringAnagrams {
    private static final Logger logger = Logger.getLogger(StringAnagrams.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter String 1 ");
        String string1 = sc.next();
        logger.info("Enter String 2 ");
        String string2 = sc.next();
        char[] chars2 = string2.toLowerCase().toCharArray();
        char[] chars1 = string1.toLowerCase().toCharArray();
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (char ch : chars1) {
            freq1[ch - 97]++;
        }
        for (char ch : chars2) {
            freq2[ch - 97]++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                count++;
                break;
            }
        }
        if (count == 0)
            logger.log(Level.INFO, "{O} and {1} are anagrams", new Object[]{string1, string2});
        else
            logger.log(Level.INFO, "{O} and {1} are not anagrams", new Object[]{string1, string2});
    }
}
