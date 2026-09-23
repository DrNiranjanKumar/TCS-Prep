package com.example.app;

public class MultipleInheritance implements InterfacetoDemoMultipleInheritance{

    public static void main(String[] args) {
        System.out.println("***Demo of Multiple Inheritance***");
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.anotherMethodToDoSomething();
        multipleInheritance.methodToDoSomething();
    }

    @Override
    public void methodToDoSomething() {
        System.out.println("I'm in methodToDoSomething()");
    }

    @Override
    public void anotherMethodToDoSomething() {
        System.out.println("I'm in anotherMethodToDoSomething()");
    }
}
