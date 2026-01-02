package com.techouts.cj4;

public class CopyConstructor {
    private final int age;
    public CopyConstructor(int name){
        this.age =name;
    }
    public CopyConstructor(CopyConstructor obj){
        this.age =obj.age;
    }
    public static void main(String[] args){
        CopyConstructor obj = new CopyConstructor(22);
        System.out.println(obj.age);
        CopyConstructor obj2 = new CopyConstructor(obj);
        System.out.println(obj2.age);
    }

}
