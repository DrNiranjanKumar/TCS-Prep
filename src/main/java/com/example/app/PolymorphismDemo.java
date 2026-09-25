package com.example.app;

import java.util.List;

class Animal {
    String sound() { return "generic sound"; }
}
class Dog extends Animal {
    @Override String sound() { return "Woof"; }
}
class Cat extends Animal {
    @Override String sound() { return "Meow"; }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        for (Animal x : List.of(new Dog(), new Cat(), new Animal())) {
            System.out.println(x.sound());   // "Woof", "Meow", "generic sound"
        }
    }
}
