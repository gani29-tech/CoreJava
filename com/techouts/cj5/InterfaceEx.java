package com.techouts.cj5;
interface Drawable{
    void draw();
    static void show(){
        System.out.println("show");
    }
    static int getArea(int a, int b){
        return a*b;
    }
    private void shape(){
        System.out.println("shape");
    }
    default void display(){
        shape();
        System.out.println("display");
    }
}
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Drawable circle;
        circle= new Circle();
        circle.draw();
        circle = new Rectangle();
        circle.draw();
        Drawable.show();
        circle.display();
        System.out.println(Drawable.getArea(1,2));
    }
}
