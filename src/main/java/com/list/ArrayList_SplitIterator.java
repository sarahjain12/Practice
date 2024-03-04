package com.list;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayList_SplitIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to List
        names.add("Kumar");
        names.add("Bob");
        names.add("Raj");
        names.add("David");
        names.add("Eve");

        Spliterator<String> spliterator
                = names.spliterator();

        spliterator.forEachRemaining(System.out::println);
    }
}
