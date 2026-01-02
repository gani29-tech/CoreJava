package com.techouts.cj5;
sealed interface Fruit permits Apple,Grape{
    void fruitName();
}
final class Apple implements Fruit{
    public void fruitName(){
        System.out.println("apple");
    }
}
final class Grape implements Fruit{
    public void fruitName(){
        System.out.println("grape");
    }
}
public class SealedInterface {
    public static void main(String[] args) {
        Fruit apple =  new Apple();
        apple.fruitName();
        Fruit grape =  new Grape();
        grape.fruitName();
    }
}
