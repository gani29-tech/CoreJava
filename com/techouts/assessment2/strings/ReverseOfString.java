package com.techouts.assessment2.strings;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseOfString {
    private static final Logger logger = Logger.getLogger(ReverseOfString.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter the name");
        String name = scanner.next();
        char[] chars = name.toCharArray();
        char[] chars1 = new char[name.length()];
        int count = 0;
        for (int i = name.length() - 1; i >= 0; i--) {
            chars1[count] = chars[i];
            count++;
        }
        String reverseOfName = new String(chars1);
        logger.log(Level.INFO, "Reverse of {0} is {1}", new Object[]{name, reverseOfName});
    }
}
