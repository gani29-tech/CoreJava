package com.techouts.assessment2.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

public class ExceptionsEx {
    private static final Logger logger = Logger.getLogger(ExceptionsEx.class.getName());

    public static void main(String[] args) {

        //Checke Exceptions(Compile Time)

        //File Not Found Exception
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            logger.log(Level.WARNING, "{0}", String.valueOf(e));
        } catch (IOException i) {
            logger.log(Level.WARNING, "{0}", i.getMessage());
        }

        // IO Exception
        try {
            fis = new FileInputStream("Nine.txt");
        } catch (IOException i) {
            logger.log(Level.WARNING, "{0}", String.valueOf(i));
        }

        //Interrupted Exception
        try {
            Thread t1 = new MyThread();
            Thread t2 = new MyThread();
            t1.start();
            t2.start();
            Thread.currentThread().interrupt();
            if (Thread.currentThread().isInterrupted())
                throw new InterruptedException();
        } catch (InterruptedException i) {
            logger.log(Level.WARNING, "{0}", String.valueOf(i));
        }

        //Unchecked Exceptions(Run Time)

        //Arithmetic Exception
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            logger.log(Level.WARNING, "{0}", e.getMessage());
        }

        //ArrayIndexOutOfBounds
        int arr[] = {1, 2, 3, 4, 5};
        try {
            for (int i = 6; i > 0; i--) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.log(Level.WARNING, "{0}", e.getMessage());
        }

        //StringIndexOutOfBounds
        String name = "Ganesh";
        try {
            for (int i = 6; i > 0; i++) {
                System.out.println(name.charAt(i));
            }
        } catch (StringIndexOutOfBoundsException s) {
            logger.log(Level.WARNING, "{0}", s.getMessage());
        }

        //NumberFormatException
        String place = "HYD";
        try {
            int number = Integer.parseInt(place);
        } catch (NumberFormatException e) {
            logger.log(Level.WARNING, "{0}", e.getStackTrace());
        }

        //InputMissMatchException
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
        } catch (InputMismatchException e) {
            logger.log(Level.WARNING, "{0}", String.valueOf(e));
        }

        //NullPointerException
        try {
            String firstName = null;
            int length = firstName.length();
            logger.log(Level.INFO, "{0}", firstName);
        } catch (NullPointerException n) {
            logger.log(Level.WARNING, "{0}", String.valueOf(n));
        }
    }
}
