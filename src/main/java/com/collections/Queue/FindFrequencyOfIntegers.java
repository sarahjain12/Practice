package com.collections.Queue;

// Java Program to implement above approach

import java.util.LinkedList;
import java.util.Queue;

class FindFrequencyOfIntegers {

    // Driver code
    public static void main(String[] args)
    {
        // Declaring Queue
        Queue<Integer> q = new LinkedList<>();
        int N = 8;
        int[] a = new int[] { 1, 2, 3, 4, 5, 2, 3, 1 };
        int M = 5;
        int[] b = new int[] { 1, 3, 2, 9, 10 };

        // Invoking object of Geeks class
        Geeks obj = new Geeks();

        for (int i = 0; i < N; i++) {
            // calling insert()
            // to add elements in queue
            obj.insert(q, a[i]);
        }

        for (int i = 0; i < M; i++) {
            // calling findFrequency()
            int f = obj.findFrequency(q, b[i]);
            if (f != 0) {
                // variable f
                // will have final frequency
                System.out.print(f + " ");
            }
            else {
                System.out.print("-1"
                        + " ");
            }
        }
    }
}

// Helper class Geeks to implement
// insert() and findFrequency()
class Geeks {

    // Function to insert
    // element into the queue
    static void insert(Queue<Integer> q, int k)
    {
        // adding N integers into the Queue
        q.add(k);
    }

    // Function to find frequency of an element
    // return the frequency of k
    static int findFrequency(Queue<Integer> q, int k)
    {
        // to count frequency of elements
        int cntFrequency = 0;

        // storing size of queue in a variable
        int size = q.size();

        // running loop until size becomes zero
        while (size-- != 0) {

            // storing and deleting
            // first element from queue
            int x = q.poll();

            // comparing if it's equal to integer K
            // that belongs to M
            if (x == k) {
                // increment count
                cntFrequency++;
            }
            // add element back to queue because
            // we also want N integers
            q.add(x);
        }
        // return the count
        return cntFrequency;
    }
}