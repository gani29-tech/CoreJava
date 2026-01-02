package com.techouts.cj4;
class C{
    int x=10;
    public void show(){
        System.out.println("x="+x);
    }

}
class D extends C{
     int y=20;
     @Override
     public void show(){
         super.show();
         System.out.println("x is "+y);
     }
}
public class ConstructorDemo2 {
    public static void main(String[] args) {
        C a= new D();
        System.out.println(a.x);
        a.show();
    }
}
