package com.example.app;

class Vehicle{
    String brandName;
    Vehicle(String brandName){
        this.brandName = brandName;
    }

    void startTheVehicle(){
        System.out.println(brandName+" : starting");
    }
}

class Car extends Vehicle{
    int noOfDoors;
    Car(String brandName, int noOfDoors){
        super(brandName);
        this.noOfDoors = noOfDoors;
    }

    void honk(){
        System.out.println("Beep Beep!!!!!!!!!!!!!................");
    }
}
public class InheritanceDriverClass {
    public static void main(String[] args) {
        Car carObject = new Car("Toyota",5);
        carObject.startTheVehicle();
        carObject.honk();
    }
}
