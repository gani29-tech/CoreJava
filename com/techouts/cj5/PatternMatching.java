package com.techouts.cj5;
public class PatternMatching {
    sealed interface Vegetable permits Tomato,Potato{
        void vegetableName();
    }
    static final class Tomato implements Vegetable{
        public void vegetableName(){
            System.out.println("Tomato");
        }
    }
    static final class Potato implements Vegetable{
        public void vegetableName(){
            System.out.println("Potato");
        }
    }
    public static void printVegetableName(Vegetable vegetable){
        switch (vegetable){
            case Tomato t -> System.out.println("Eating Tomato");
            case Potato p -> System.out.println("Eating Potato");
        }
    }
    public static void main(String[] args) {
        Tomato t = new Tomato();
        Potato p = new Potato();
        t.vegetableName();
        printVegetableName(t);
        t.vegetableName();
        printVegetableName(p);

    }
}
