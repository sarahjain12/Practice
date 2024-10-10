package com.collections.list.linkedlist;

// Java code to demonstrate the application
// of offer() in linked list
import java.util.*;
public class Offer {

    public static void main(String[] args)
    {

        // Declaring LinkedLists
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList prioList = new LinkedList();

        // adding elements
        list.add(12);
        list.add(4);
        list.add(8);
        list.add(10);
        list.add(3);
        list.add(15);

        // declaring threshold
        int thres = 10;

        // printing the list
        System.out.println("The initial Linked list is : " + list);

        while (!list.isEmpty()) {

            int t = list.poll();

            // adding >=10 numbers at front rest at back
            if (t >= 10)
                prioList.offerFirst(t);
            else
                prioList.offerLast(t);
        }

        // The resultant list is
        System.out.println("The prioritized Linked list is : " + prioList);
    }
}
