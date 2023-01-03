package com.bridgelabz;


public class StaticMethod {
    static int y=10; //Static Variable

    //Static Method
    static void method(int i){
        int x = y;
        int z = x + i;
        System.out.println("The Sum of " + x + " And " + i + " = " + z);
        System.out.println("Static method called");
    }
    //Static Block
    static {
        System.out.println("Static Block Called");
    }

    public static void main(String[] args) {
        method(10);

    }
}
