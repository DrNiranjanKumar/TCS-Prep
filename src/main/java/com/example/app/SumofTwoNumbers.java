package com.example.app;

public class SumofTwoNumbers {
    public static  int addTwoNumbers(int a, int b){
        return a+b;
    }
    public static double addTwoNumbers(double a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(2,3));
        System.out.println(addTwoNumbers(2.1,3));
        System.out.println("Actual value is: "+(2.1 + 3));
        System.out.println("Testing: "+Math.abs(5.1 - 5.099999904632568));
    }
}
