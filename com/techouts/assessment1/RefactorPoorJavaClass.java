package com.techouts.assessment1;
//Poorly written Java code
class Calculator{
    int y;
    int x;
    Calculator(int a,int b){
        x=a;
        y=b;
    }
    public String toString(){
        return "x="+x+",y="+y;
    }
}
//Refactored Code
//class Calculator{
//    int firstValue;
//    int secondValue;
//    Calculator(int a,int b){
//        this.firstValue = a;
//        this.secondValue = b;
//    }
//    public String toString(){
//        return "firstValue="+firstValue+" secondValue="+secondValue;
//    }
//}
public class RefactorPoorJavaClass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1,2);
        System.out.println(calculator);
    }
}
