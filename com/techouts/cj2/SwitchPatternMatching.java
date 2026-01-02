package com.techouts.cj2;

public class SwitchPatternMatching {
    public static void main(String[] args) {
       Object obj = "Gemini";
        switch (obj){
            case String s -> System.out.println("String");
            case Integer i -> System.out.println("Integer");
            case Boolean b -> System.out.println("Boolean");
            default -> System.out.println("Unknown Type");
        }
    }
}
