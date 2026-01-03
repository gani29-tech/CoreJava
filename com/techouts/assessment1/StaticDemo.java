package com.techouts.assessment1;

public class StaticDemo {
    static int number;
    static void showNumber() {
        System.out.println(number);
    }
    public static void main(String[] args) {
        showNumber();
        number = 9;
        System.out.println(number);
    }
    // Static Variable : It is sharable inside the class
    // Static Method : We can access without creating object
    // Both are belongs to the class
}
