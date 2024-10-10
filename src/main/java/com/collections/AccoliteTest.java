package com.collections;

import java.util.HashSet;

public class AccoliteTest {

    public static void main(String[] args) {
        String str = "Great Responsibility";

        HashSet<Character> set = new HashSet<>();

        str.toLowerCase().chars().filter( c -> !(set.add((char)c)))
                .forEach(c -> System.out.println((char)c));
    }
}
