package com.techouts.assessment1;
final class Example1 {                    // cannot inherit
   static final double PI = 3.14;             // value cannot be changed
    void show(){
        System.out.println(PI);
    }

}
class Example2{
    final void show(){                  // cannot be overridden
        System.out.println("Hello");
    }
}
public class Final {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.show();
        Example2 e2 = new Example2();
        e2.show();
    }
}
