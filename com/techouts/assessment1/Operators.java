package com.techouts.assessment1;

public class Operators {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);

        // Arithematic Opertators
        System.out.println("Addition : " +(firstNumber + secondNumber));
        System.out.println("Subtraction : " +(firstNumber - secondNumber));
        System.out.println("Multiplication : " +(firstNumber * secondNumber));
        System.out.println("Division : " +(firstNumber / secondNumber));
        System.out.println("Remainder : " +(firstNumber % secondNumber));

        // Relational Operators
        System.out.println("firstNumber >= secondNumber : "+(firstNumber >= secondNumber));
        System.out.println("firstNumber <= secondNumber : "+(firstNumber <= secondNumber));
        System.out.println("firstNumber == secondNumber : "+(firstNumber == secondNumber));
        System.out.println("firstNumber != secondNumber : "+(firstNumber != secondNumber));
        System.out.println("firstNumber > secondNumber : "+(firstNumber > secondNumber));
        System.out.println("firstNumber < secondNumber : "+(firstNumber < secondNumber));

        // Logical Operators

        boolean firstBoolean = true;
        boolean secondBoolean = false;
        System.out.println("Logical AND : " +(firstBoolean && secondBoolean));
        System.out.println("Logical OR : " +(firstBoolean || secondBoolean));
        System.out.println("Logical NOR : " +!(firstBoolean || secondBoolean));


    }
}
