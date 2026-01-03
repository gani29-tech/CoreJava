package com.techouts.assessment1;

public class violatingCodingStandards {               // class name should be PascalCase
    static void Printageheight(){                     // method name should be camelCase
    System.out.println("Hi");                         // System.out.println replaced with returnable formatted String
    }
    int age;
    int height;
    violatingCodingStandards(int age, int height){
        this.age = age;
        this.height = height;
    }
    // proper spacing and format
    public static void main(String[] args) {
     int Defaultnumber =10;
     violatingCodingStandards obj=new violatingCodingStandards(Defaultnumber, Defaultnumber);
    }
}
