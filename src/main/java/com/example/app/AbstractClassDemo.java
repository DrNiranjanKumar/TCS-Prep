package com.example.app;

abstract class Base{
    String name;

    abstract double salary();

    abstract String nameFunctionality();

    void demographicData(){
        System.out.println(name+" earn "+salary());
    }
}

abstract class ChildOne extends Base{
    ChildOne(String name){
        this.name = name;
    }
    @Override
    public double salary(){
        return 12000_000;
    }
}

abstract class ChildTwo extends Base{
    ChildTwo(String name){
        this.name = name;
    }

    @Override
    String nameFunctionality(){
        return "Hello";
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Base newObjectOne = new ChildOne("childOne") {
            @Override
            String nameFunctionality() {
                return null;
            }
        };

        Base newObjectTwo = new ChildTwo("childTwo") {
            @Override
            double salary() {
                return 0.0;
            }
        };

        System.out.println(newObjectOne.name);
        System.out.println(newObjectOne.salary());
        System.out.println("************************************");
        System.out.println(newObjectTwo.name);
        System.out.println(newObjectTwo.nameFunctionality());

    }
}
