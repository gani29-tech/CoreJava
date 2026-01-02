package com.techouts.cj2;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (0));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 4. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
        System.out.println("a >>> 1: " + (a >>> 1));

        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5; System.out.println("c += 5: " + c);
        c -= 3; System.out.println("c -= 3: " + c);
        c *= 2; System.out.println("c *= 2: " + c);
        c /= 4; System.out.println("c /= 4: " + c);
        c %= 3; System.out.println("c %= 3: " + c);

        // 6. Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("d++: " + (d++));
        System.out.println("++d: " + (++d));
        System.out.println("d--: " + (d--));
        System.out.println("--d: " + (--d));
        System.out.println("-d: " + (-d));
        System.out.println("+d: " + (+d));

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int e = (a > b) ? a : b;
        System.out.println("Largest of a and b: " + e);
    }
}
