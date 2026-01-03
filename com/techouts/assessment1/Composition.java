package com.techouts.assessment1;
class MotorCycle{
    MotorCycle(){
        Tyre tyre = new Tyre("H1","Apollo");
        System.out.println(tyre);
    }
}
class Tyre {
    String name;
    String brand;
    Tyre(String name, String brand){
        this.name=name;
        this.brand=brand;
    }

    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

}

public class Composition {
    public static void main(String[] args) {
        new MotorCycle();
    }
}
