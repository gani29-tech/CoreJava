package com.techouts.assessment1;
class Accessing{                               // Accessible for same package
    private static final int A = 10;          // Accessible for existed class
    public static final int B = 20;

    public int getA() {
        return A;
    }
}
class Accessed{
    protected void show(){                     // Accessible for same package and subclass of another package
        System.out.println("Protected");
    }
}
public class AccessModifiers {                  // Accessible for all packages
    public static void main(String[] args) {
        Accessing accessing=new Accessing();
        System.out.println(accessing.getA());
        System.out.println(Accessing.B);
        Accessed accessed=new Accessed();
        accessed.show();
    }
}