package com.techouts.assessment1;
class Laptop{
    private int id;
    private String brand;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public Laptop(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setId(int id) {
        this.id = id;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP",2);
        System.out.println(laptop);
        laptop.setId(1);
        laptop.setBrand("Apple");
        System.out.print(laptop.getBrand()+" ");
        System.out.println(laptop.getId());

    }
}
