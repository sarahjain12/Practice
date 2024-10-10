package com.collections.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class SortingComparison {
    public static void main (String[] args) {
        int len = 5000000;

        // creating a large test array
        int[] arr = new int[len];
        for (int i = len; i > 0; i--)
            arr[len - i] = i;

        // creating a large test arraylist
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = len; i > 0; i--)
            list.add(i);

        // calculating time used by arrays.sort()
        long startA = System.currentTimeMillis();
        Arrays.sort(arr);
        long stopA = System.currentTimeMillis();

        // calculating time used by collections.sort()
        long startAL = System.currentTimeMillis();
        Collections.sort(list);
        long stopAL = System.currentTimeMillis();

        System.out.println("Time taken by Arrays.sort(): " + (stopA - startA));
        System.out.println("Time taken by Collections.sort(): " + (stopAL - startAL));
    }
}