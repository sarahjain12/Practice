package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ArriseTest01 {

    // freqMap is to map element to its frequency
    static Map<Integer, Integer> freqMap = new HashMap<>();

    // setMap is to map frequency to the
    // element list with this frequency
    static Map<Integer, Stack<Integer>> setMap = new HashMap<>();

    // Variable which stores maximum frequency
    // of the stack element
    static int maxfreq = 0;

    // Function to insert x in the stack
    public static void push(int x)
    {

        // Frequency of x
        int freq = freqMap.getOrDefault(x, 0) + 1;

        // Mapping of x with its frequency
        freqMap.put(x, freq);

        // Update maxfreq variable
        if (freq > maxfreq)
            maxfreq = freq;

        // Map element to its frequency list
        // If given frequency list doesn't exist
        // make a new list of the required frequency
        setMap.computeIfAbsent(freq, z -> new Stack()).push(x);
    }

    // Function to remove maximum frequency element
    public static int pop()
    {

        // Remove element from setMap
        // from maximum frequency list
        int top = setMap.get(maxfreq).pop();

        // Decrement the frequency of the popped element
        freqMap.put(top, freqMap.get(top) - 1);

        // If whole list is popped
        // then decrement the maxfreq
        if (setMap.get(maxfreq).size() == 0)
            maxfreq--;
        return top;
    }

    // Driver code
    public static void main(String[] args)
    {

        // Push elements to the stack
        push(4);
        push(6);
        push(7);
        push(6);
        push(8);

        // Pop elements
        System.out.println(pop());
        System.out.println(pop());
    }
}
