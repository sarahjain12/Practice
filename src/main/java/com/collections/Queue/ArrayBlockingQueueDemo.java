package com.collections.Queue;
// Program to demonstrate drainTo(Collection c)

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {

    public static void main(String[] args)
    {
        // Define capacity of ArrayBlockingQueue
        int capacity = 10;

        // Create object of  ArrayBlockingQueue
        ArrayBlockingQueue queue = new
                ArrayBlockingQueue(capacity);

        // Add elements to ArrayBlockingQueue
        queue.add(23);
        queue.add(32);
        queue.add(45);
        queue.add(12);
        queue.add(27);
        queue.add(67);

        // Print queue before drainTo operation
        System.out.println("Before drainTo Operation");
        System.out.println("queue = " + queue);

        // Create Collection object to
        // transfer elements
        ArrayList list = new
                ArrayList();

        // Call drainTo method of queue
        // and pass collection as parameter.
        queue.drainTo(list);

        // Print queue after drainTo operation
        System.out.println("After drainTo Operation");
        System.out.println("queue = " + queue);
        System.out.println("collection = " + list);
    }
}