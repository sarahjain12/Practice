package com.collections;

public class NetCrackerTest {

    /*
    Swapping of two numbers without using third variable.

    a= 10, b =15

    output - b=10 a=15
     */
    public static void main(String[] args) {
        int a=10, b=15;
        System.out.println(a+" : "+b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a+" : "+b);
    }
}
