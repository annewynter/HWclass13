package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello");

        int num = 0;
        int num2 = num = 10;
        System.out.println(num2);

        String str_Sample = "RockStar";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
    }
}