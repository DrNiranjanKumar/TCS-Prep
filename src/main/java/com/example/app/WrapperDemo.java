package com.example.app;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer n = 5;
        int m = 5;
        try{
            int result = 5/0;
            System.out.println("Never reached here");
        }catch (ArithmeticException e){
            System.out.println("**********i'm inside catch block**********");
            System.out.println(e.getMessage());
        }

        int [] a = new int[3];
        System.out.println("a[3] = "+a[3]);
        System.out.println("Reached here");
    }
}
