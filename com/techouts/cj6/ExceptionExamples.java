package com.techouts.cj6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionExamples {
    private static final Logger logger = Logger.getLogger(ExceptionExamples.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileInputStream fis = new FileInputStream("files.txt")) {
            logger.info("Hi");
        }catch(FileNotFoundException e){
            logger.warning(String.valueOf(e));
        }
        catch (IOException e) {
            logger.warning(e.getMessage());
        }


        try {
            String name = null;
            int length = name.length();
            logger.log(Level.INFO, "Length of name is {0}", length);
        } catch (NullPointerException n) {
            logger.warning(String.valueOf(n));
        }


        try {
            int[] array = new int[2];
            logger.info("Enter the Array Values");
            for (int i = 0; i < 2; i++) {
                array[i] = scanner.nextInt();
            }
            for (int j = 0; j < 3; j++) {
                logger.log(Level.INFO, "Array of index {0} is {1}", new Object[]{j, array[j]});
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            logger.warning(String.valueOf(a));
        }


        try {
            logger.info("Enter the Number : ");
            int number = scanner.nextInt();
            logger.log(Level.INFO, "Number is {0}", number);
        } catch (InputMismatchException i) {
            logger.warning(String.valueOf(i));
        }

        scanner.nextLine();

        try{
            logger.info("Enter your First Name : ");
            String firstName = scanner.nextLine();
            for(int k=0; k<=firstName.length(); k++){
                logger.log(Level.INFO, "Index char {0} is {1}", new Object[]{k, firstName.charAt(k)});
            }
        }
        catch(StringIndexOutOfBoundsException s){
            logger.warning(String.valueOf(s));
        }

        try{
            logger.info("Enter your Last Name : ");
            String lastName = scanner.nextLine();
            int number = Integer.parseInt(lastName);
            logger.log(Level.INFO, "Number is {0}", number);
        }
        catch(NumberFormatException n){
            logger.warning(String.valueOf(n));
        }
    }
}
