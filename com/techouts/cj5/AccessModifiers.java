package com.techouts.cj5;
import com.techouts.cj4.*;
class Building{
    private void bedroom(){
        System.out.println("This is Bedroom");
    }
    void key(){
        bedroom();
    }
}
public class AccessModifiers extends StaticDemo{
    public static void main(String[] args) {
        Building building = new Building();
        building.key();
        method1();
        Student student = new Student(39,"Ganesh");
        System.out.println(student);
    }
}
