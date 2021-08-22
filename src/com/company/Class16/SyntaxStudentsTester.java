package com.company.Class16;

public class SyntaxStudentsTester {
    public static void main(String[] args) {

        SyntaxStudents input1=new SyntaxStudents();
        input1.name="Serge";
        input1.age=22;
        input1.id=123;
        System.out.println(SyntaxStudents.schoolname);

        input1.displayFee();
        SyntaxStudents input2=new SyntaxStudents();
        input2.name="Anne";
        input2.age=17;
        input2.id=124;

        System.out.println(SyntaxStudents.schoolname);
    }
}
