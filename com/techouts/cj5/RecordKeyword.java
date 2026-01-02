package com.techouts.cj5;
   record Student(int id,String name){}
public class RecordKeyword {

    public static void main(String[] args) {
        Student student = new Student(39,"Gani");
        System.out.println(student);
        System.out.println(student.id());
        System.out.println(student.name());
    }
}
