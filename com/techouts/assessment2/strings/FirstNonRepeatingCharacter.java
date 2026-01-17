package com.techouts.assessment2.strings;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FirstNonRepeatingCharacter {
    private static final Logger logger = Logger.getLogger(FirstNonRepeatingCharacter.class.getName());
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logger.info("Enter a name to check first non-repeating character");
        String name =  input.next();
        char[] ch = name.toCharArray();
        int a[] = new int[26];
        for(char c : ch) {
            a[c-97]++;
        }
        int count = 0;
        for(char c : ch) {
            if(a[c-97]==1) {
                logger.log(Level.INFO,"First non-repeating character {0}",c);
                count++;
                break;
            }
        }
        if(count==0) {
            logger.info("There is no non-repeating character");
        }
    }
}
