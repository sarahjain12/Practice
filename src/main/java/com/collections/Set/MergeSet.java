package com.collections.Set;

// Java Program to Demonstrate Merging of two sets in Java
// Using Double brace Initialization

// Importing required classes

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Main class
public class MergeSet {

    // Method 1
    // To merge two sets
    // using DoubleBrace Initialisation
    public static <T> Set<T> mergeSet(Set<T> a, Set<T> b)
    {

       //M1
       // Adding all elements of respective Sets
        // using addAll() method
        return new HashSet<T>() {
            {
                addAll(a);
                addAll(b);
            }
        };

        /*// M2
        // Creating an empty HashSet
        Set<T> mergedSet = new HashSet<T>();

        // Adding the two sets to be merged
        // into the new Set using addAll() method
        mergedSet.addAll(a);
        mergedSet.addAll(b);

        // Returning the merged set
        return mergedSet;*/

        /*// M3
        // Creating a Set with 'a'
        Set<T> mergedSet
                = a.stream().collect(Collectors.toSet());

        // Adding the second set to be merged
        mergedSet.addAll(b);

        // Returning the merged Set
        return mergedSet;*/

        /*//M4
        // Creating an empty HashSet of Integer type
        Set<Integer> mergedSet = new HashSet<>();

        // Adding the two sets to be merged
        // into the new Set
        Collections.addAll(mergedSet,
                a.toArray(new Integer[0]));
        Collections.addAll(mergedSet,
                b.toArray(new Integer[0]));

        // Returning the merged Set
        return mergedSet;*/

        /*// M5
        // Creating an empty set
        Set<T> mergedSet = new HashSet<T>();

        // add the two sets to be merged
        // into the new set
        Stream.of(a, b).forEach(mergedSet::addAll);

        // returning the merged set
        return mergedSet;*/

        // M6
        // Adding the two Sets to be merged
        // into the new Set and
        // returning the merged set
        /*return Stream.of(a, b)
                .flatMap(x -> x.stream())
                .collect(Collectors.toSet());*/

        // M7
        // Adding the two sets to be merged
        // into the new Set and
        // returning the merged set
        /*return Stream.concat(a.stream(), b.stream())
                .collect(Collectors.toSet());*/

        //M8
        //return org.apache.commons.collections4.SetUtils.union(a, b);

        //M9
        //return com.google.common.collect.Sets.newHashSet(com.google.common.collect.Iterables.concat(a, b));
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Creating the sets to be merged

        // First set
        Set<Integer> a = new HashSet<Integer>();
        // Applying Arrays.asList()
        a.addAll(
                Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 }));

        // Second set
        Set<Integer> b = new HashSet<Integer>();
        // Applying Arrays.asList()
        b.addAll(
                Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));

        // Printing the Sets
        System.out.println("Set a: " + a);
        System.out.println("Set b: " + b);

        // Calling Method 1 to merge above Sets
        System.out.println("Merged Set: " + mergeSet(a, b));
    }
}
