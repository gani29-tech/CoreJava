package com.techouts.cj2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OperatorsDemo {
    private static final Logger logger = Logger.getLogger(OperatorsDemo.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 1. Arithmetic Operators
        logger.info("Arithmetic Operators: ");
        logger.log(Level.INFO, "a +b = {0} ", a + b);
        logger.log(Level.INFO, "a *b = {0} ", a * b);
        logger.log(Level.INFO, "a - b = {0} ", a - b);
        logger.log(Level.INFO, "a / b = {0} ", a / b);
        logger.log(Level.INFO, "a % b = {0} ", a % b);

        // 2. Relational Operators
        logger.info("Relational Operators: ");
        logger.log(Level.INFO, "a >= b = {0} ", a >= b);
        logger.log(Level.INFO, "a <= b = {0} ", a <= b);
        logger.log(Level.INFO, "a<b = {0} ", a < b);
        logger.log(Level.INFO, "a==b = {0} ", a == b);
        logger.log(Level.INFO, "a!=b = {0} ", a != b);
        logger.log(Level.INFO, "a>b = {0} ", a > b);

        // 3. Logical Operators
        logger.info("Logical Operators:");
        boolean x = true;
        boolean y = false;
        logger.log(Level.INFO, "x &&y = {0} ", x && y);
        logger.log(Level.INFO, "x &||y = {0} ", x || y);
        logger.log(Level.INFO, "!x : {0} ", !x);

        // 4. Bitwise Operators
        logger.info("Bitwise Operators:");
        logger.log(Level.INFO, "a & b = {0} ", a & b);
        logger.log(Level.INFO, "a | b = {0} ", a | b);
        logger.log(Level.INFO, "a ^ b = {0} ", a ^ b);
        logger.log(Level.INFO, "a ^ ~ b = {0} ", a ^ ~b);
        logger.log(Level.INFO, "a >> b = {0} ", a >> b);
        logger.log(Level.INFO, "a << b = {0} ", a << b);
        logger.log(Level.INFO, "a >>> b = {0} ", a >>> b);


        // 5. Assignment Operators
        logger.info("Assignment Operators:");
        int c = 10;
        c += 5;
        logger.log(Level.INFO, "c += 5 --> c = {0}", c);
        c -= 5;
        logger.log(Level.INFO, "c -= 5 --> c = {0}", c);
        c *= 2;
        logger.log(Level.INFO, "c *= 2 --> c = {0}", c);
        c /= 4;
        logger.log(Level.INFO, "c /= 4 --> c = {0}", c);
        c %= 3;
        logger.log(Level.INFO, "c %= 3 --> c = {0}", c);

        // 6. Unary Operators
        logger.info("Unary Operators:");
        int d = 5;
        logger.log(Level.INFO, "d++ = {0}", d++);
        logger.log(Level.INFO, "d-- = {0}", d--);
        logger.log(Level.INFO, "--d = {0}", --d);
        logger.log(Level.INFO, "++d = {0}", ++d);
        logger.log(Level.INFO, "-d = {0}", -d);
        logger.log(Level.INFO, "+d = {0}", +d);

        // 7. Ternary Operator
        logger.info("Ternary Operators:");
        int e = (a > b) ? a : b;
        logger.log(Level.INFO, "Largest of {0} and {1} is {2} ", new Object[]{a, b, e});
    }
}
