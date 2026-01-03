package com.techouts.assessment1;
class Bottle{
    private Bottle(){
        fillBottle1();
        fillBottle2();
    }
    static void fillBottle1(){
        System.out.println("Filling bottle1");
    }
    static void fillBottle2(){
        System.out.println("Filling bottle2");
    }
}
public class StaticBinding {
    public static void main(String[] args) {
        Bottle.fillBottle1();
        Bottle.fillBottle2();
    }
}
