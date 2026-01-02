package com.techouts.cj4;
sealed class Animal permits Cat, Dog, Monkey {
    void show(){
        System.out.println("Animal");
    }
}

final class Dog extends Animal{
    @Override
    void show(){
        System.out.println("Dog");
    }

}
non-sealed class Cat extends Animal{
    @Override
    void show(){
        super.show();
        System.out.println("Cat");
    }
}
public class SealedClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();
        Monkey monkey = new Monkey();
        monkey.show();
        Dog dog = new Dog();
        dog.show();
    }
}
