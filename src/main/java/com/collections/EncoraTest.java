package com.collections;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EncoraTest {

    /*
    (1, 2, 3, 2, 1)
     */
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Stream.of(1,2,3,2,1).filter( i -> set.add(i)==false).forEach(System.out::println);
    }
}
