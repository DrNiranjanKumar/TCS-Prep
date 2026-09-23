package com.example.app;

abstract class SomeClassDoingSomething{
    String name;

    abstract double salary();

    abstract String nameFunctionality();

    void demographicData(){
        System.out.println(name+" earn "+salary());
    }
}

class ImplementSomeClassDoingSomething extends SomeClassDoingSomething{
    ImplementSomeClassDoingSomething(String name){
        this.name = name;
    }
    @Override
    public double salary(){
        return 12000_000;
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
         SomeClassDoingSomething object = new ImplementSomeClassDoingSomething("Test");
         object.demographicData();
    }
}
