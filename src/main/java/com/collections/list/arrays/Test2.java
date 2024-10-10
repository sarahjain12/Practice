package com.collections.list.arrays;

class A{
    int i=10;
    public static void m1(){
        System.out.println("A class static method m1.");
    }
    public static void m2(){
        System.out.println("A class static method m2.");
    }
    /*public void m1(){
        System.out.println("A class static method m1.");
    }*/
}

class B extends A{
    int i=20;
    public static void m2(){
        System.out.println("B class static method m2.");
    }
    public void m3(){
        System.out.println("B class static method m3.");
    }
    public void m4(){
        System.out.println("B class static method m4.");
    }
}

class Test2{
    public static void main(String[] args){
        A b= new B();
        //B.m1();
        //b.m1();
        //b.m3();
        //b.m4();
        System.out.println(b.i);
    }
}

