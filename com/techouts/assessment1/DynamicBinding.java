package com.techouts.assessment1;
class Cat{
    void makeSound(){
        System.out.println("Meow");
    }
}
class Dog extends Cat{
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("Bow");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Cat cat = new Dog();
        cat.makeSound();

    }
}
