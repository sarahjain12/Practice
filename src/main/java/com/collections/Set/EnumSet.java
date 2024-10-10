package com.collections.Set;

// Java program to demonstrate
// the EnumSet

import java.util.*;
class enumSetExample {
    enum Colors {
        Red,
        Pink,
        Grey,
        Yellow,
        Green
    }
    public static void main(String args[])
    {

        // Creating an EnumSet
        EnumSet<Colors> colors
                = EnumSet.of(Colors.Pink, Colors.Green);

        Iterator<Colors> itr = colors.iterator();

        // Iterate and print elements to
        // the console
        System.out.println("EnumSet : ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
