package com.bridgelabz;

public class DefaultValue {

    byte b;
    static int i;
    static short s;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;

    public static void main(String[] args) {
        DefaultValue def = new DefaultValue();
        System.out.println("Byte default value : " + def.b);
        System.out.println("Integer default value : " + i);
        System.out.println("Short default value : " + s);
        System.out.println("Long default value : " + l);
        System.out.println("Float default value : " + f);
        System.out.println("Double default value : " + d);
        System.out.println("Character default value : " + c);
        System.out.println("Boolean default value : " + bool);


    }
}
