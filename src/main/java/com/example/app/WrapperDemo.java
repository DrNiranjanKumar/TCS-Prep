package com.example.app;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer n = 5;
        int m = 5;
        try{
            int result = 5/0;
            System.out.println("Never reached here");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Reached here");
    }
}
