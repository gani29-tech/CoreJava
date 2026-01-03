package com.techouts.assessment1;
class Garbage{
    int id;
    Garbage(int id){
        this.id = id;
        System.out.println("Garbage");
    }
    void show(){
        System.out.println("Showing Garbage");
    }
}
public class GarbageCollectionDemo {
    static void createObject(){
        Garbage garbage=new Garbage(1);
        garbage.show();                         // Garbage is out of scope after this method
    }
    public static void main(String[] args) {
        createObject();
        // Here Eligible for Garbage Collection
        System.out.println("Eligible for Garbage Collection");
    }
}
