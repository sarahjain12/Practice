package com.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PersistentTest3 {

    /*
    Input: [3, 2, 1, 5, 6, 4] and k = 2
    Output: 5
     */
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k =3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }

        System.out.print(pq.peek());
    }
}
