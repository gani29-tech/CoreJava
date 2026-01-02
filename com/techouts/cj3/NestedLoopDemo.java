package com.techouts.cj3;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
                for(int j = 1; true; j++){
                    if(i==j){
                        break;
                    }
                    System.out.println("{"+i+","+j+"}");
                }
        }
    }
}
