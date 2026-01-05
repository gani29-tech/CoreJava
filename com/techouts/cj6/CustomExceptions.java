package com.techouts.cj6;

import java.util.Scanner;
import java.util.logging.Logger;
class LessAgeException extends Exception {
    public LessAgeException(String message) {
        super(message);
    }
}
public class CustomExceptions {
    static void validate(int age) throws LessAgeException {
        if (age < 18) {
            throw new LessAgeException("Age must be greater than 18");
        }
        else{
            logger.info("You are eligible to vote");
        }
    }
    private static final Logger logger = Logger.getLogger(CustomExceptions.class.getName());
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        logger.info("Please enter your age");
        int age = input.nextInt();
        try{
            validate(age);
        }
        catch(LessAgeException e){
            logger.warning(e.getMessage());
        }
    }
}
