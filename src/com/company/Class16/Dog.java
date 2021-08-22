package com.company.Class16;

public class Dog {
    String name;// instance variable
    static int noOfLegs = 4;
    static String breed; //static variable
    String color;

    void bark() {
        int times = 10; //local
        for (int i = 0; i < times; i++) {
            System.out.println("Dog can bark");
        }
    }
}
