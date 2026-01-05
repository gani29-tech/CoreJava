package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Operators {
    private static final Logger logger = Logger.getLogger(Operators.class.getName());

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        logger.log(Level.INFO, "{0}", firstNumber);
        logger.log(Level.INFO, "{0}", secondNumber);

        // Arithematic Opertators
        logger.log(Level.INFO, "Addition : {0}", firstNumber + secondNumber);
        logger.log(Level.INFO, "Subtraction : {0}", firstNumber - secondNumber);
        logger.log(Level.INFO, "Multiplication : {0}", firstNumber * secondNumber);
        logger.log(Level.INFO, "Division : {0}", firstNumber / secondNumber);
        logger.log(Level.INFO, "Modulus : {0}", firstNumber % secondNumber);

        // Relational Operators
        logger.log(Level.INFO, "firstNumber >= secondNumber: {0}", firstNumber >= secondNumber);
        logger.log(Level.INFO, "firstNumber <= secondNumber: {0}", firstNumber <= secondNumber);
        logger.log(Level.INFO, "firstNumber > secondNumber: {0}", firstNumber > secondNumber);
        logger.log(Level.INFO, "firstNumber < secondNumber: {0}", firstNumber < secondNumber);
        logger.log(Level.INFO, "firstNumber != secondNumber: {0}", firstNumber != secondNumber);

        // Logical Operators
        boolean firstBoolean = true;
        boolean secondBoolean = false;
        logger.log(Level.INFO, "Logical AND : {0}", firstBoolean && secondBoolean);
        logger.log(Level.INFO, "Logical OR : {0}", firstBoolean || secondBoolean);
        logger.log(Level.INFO, "Logical XOR : {0}", firstBoolean ^ secondBoolean);
        logger.log(Level.INFO, "Logical NOR :  {0}", !(firstBoolean || secondBoolean));

    }
}
