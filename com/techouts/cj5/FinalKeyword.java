package com.techouts.cj5;
class Cube{
    void show(){
        System.out.println("Cube");
    }
}
final class Cuboid extends Cube{
    @Override
    void show(){
        super.show();
        System.out.println("Cuboid");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        final int x ;
        x=10;
        System.out.println(x);
        Cuboid c=new Cuboid();
        c.show();
    }
}
