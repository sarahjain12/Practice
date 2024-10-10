package com.collections.Queue;

// Java implementation to find the K
// closest points to origin
// using Priority Queue
import java.util.*;

// Point class to store
// a point
class Pair implements Comparable<Pair>
{
    int first, second;
    Pair(int a, int b)
    {
        first = a;
        second = b;
    }

    public int compareTo(Pair o)
    {
        int x1 = first * first;
        int y1 = second * second;
        int x2 = o.first * o.first;
        int y2 = o.second * o.second;
        return (x1 + y1) - (x2 + y2);
    }
}

class FindKClosestPointsToOrigin{

    // Function to find the K closest points
    static void kClosestPoints(int x[], int y[],
                               int n, int k)
    {
        // Create a priority queue
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Pushing all the points
        // in the queue
        for(int i = 0; i < n; i++)
        {
            pq.add(new Pair(x[i], y[i]));
        }

        // Print the first K elements
        // of the queue
        for(int i = 0; i < k; i++)
        {

            // Remove the top of the queue
            // and store in a temporary pair
            Pair p = pq.poll();

            // Print the first (x)
            // and second (y) of pair
            System.out.println(p.first +
                    " " + p.second);
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        // x coordinate of points
        int x[] = { 1, -2 };

        // y coordinate of points
        int y[] = { 3, 2 };
        int K = 1;

        int n = x.length;

        kClosestPoints(x, y, n, K);

        String s="ewr";
        String s2 = "se";
        System.out.println(s.contains(s2));
    }
}

// This code is contributed by jrishabh99
