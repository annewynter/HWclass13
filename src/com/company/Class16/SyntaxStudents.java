package com.company.Class16;

public class SyntaxStudents {
    static String schoolname="Syntax";
    static int studylength=6;

    String name;
    int id;
    int age;

    double calculateFee(){
        int var1=10;
        int var2=20;
        return var1*var2+100;

    }

    void displayFee(){
        System.out.println(name+" has to pay "+calculateFee());


    }
}
