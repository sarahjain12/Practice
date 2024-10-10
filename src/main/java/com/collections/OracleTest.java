package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OracleTest {

    List<Integer> list = Arrays.asList(1,2,3,4,5);
    public static void main(String[] args) {
        /*
        List integers
        even and odd numbers separately
        even numbers - ascending order
        odd numbers - descending order
         */
        OracleTest oracleTest = new OracleTest();
        oracleTest.getEvenList();
        oracleTest.getOddList();
    }

    public void getEvenList(){
        list.stream().filter(x -> x%2==0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    public void getOddList(){
        list.stream().filter(x -> x%2!=0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
