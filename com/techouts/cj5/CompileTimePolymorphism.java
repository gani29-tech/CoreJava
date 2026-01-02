package com.techouts.cj5;
class Printer{
    void print(){
        System.out.println("Printing........");
    }
    void print(int number){
        System.out.println("Printing "+ number);
    }
    void print(String text){
        System.out.println("Printing "+text);
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Printer p =  new Printer();
        p.print();
        p.print("Hello");
        p.print("World");
        p.print(32);
        p.print(34);
    }
}
