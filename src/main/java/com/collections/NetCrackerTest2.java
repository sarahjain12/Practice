package com.collections;

public class NetCrackerTest2 {

    public static void main(String[] args) {
        System.out.println(NetCrackerTest2.factorial(5));
    }

    public static int factorial(int n){
        if (n == 0 || n==1) {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
