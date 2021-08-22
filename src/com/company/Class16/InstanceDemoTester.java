package com.company.Class16;

public class InstanceDemoTester {
    public static void main(String[] args) {
        InstanceVarDemo instance=new InstanceVarDemo();

        System.out.println(instance.sum);
        instance.sum();
        System.out.println(instance.sum);
        instance.calculateAverage();
    }
}
