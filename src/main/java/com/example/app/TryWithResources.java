package com.example.app;

public class TryWithResources implements AutoCloseable{
    TryWithResources(){
        System.out.println("1. opened");
    }
    void use(){
        System.out.println("2. using");
    }
    @Override
    public void close(){
        System.out.println("3. Automatically closed");
    }
}

class TrywithResourceDemo{
    public static void main(String[] args) {
        try(TryWithResources tryWithResources = new TryWithResources()){
            tryWithResources.use();
        }
        System.out.println("4. after the block");
    }
}
