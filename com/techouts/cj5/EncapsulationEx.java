package com.techouts.cj5;
class Teacher {
    private String name;
    private int age;
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
public class EncapsulationEx {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Babu",23);
        System.out.println(teacher);
        teacher.setAge(24);
        teacher.setName("Prashanth");
        System.out.println(teacher.getAge());
        System.out.println(teacher.getName());

    }
}
