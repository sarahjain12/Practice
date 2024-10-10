package com.collections;

public class AccoliteTest1 {

/*
    synchronized void  methoda(Integer i){
        synchronized (String s){
            // processing
        }
    }

    synchronized void  methodb(String s){
        synchronized (Integer i){

        }
    }
*/

    /*
    Given an array arr[] where each element represents the max number of steps that can be made forward from that index.
    The task is to find the minimum number of jumps to reach the end of the array starting from index 0.

    Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
    output - 3
     */

    public static void main(String[] args) {

        int arr[] = {0, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int j=0, count=arr[0], max=arr[0], maxIndex = 0, hop=0;
        if(arr[0]==0){
            System.out.println(0);
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (count != 0) {
                    if (arr[i] > max) {
                        max = arr[i];
                        maxIndex = i;
                    }
                    count--;
                } else {
                    i = maxIndex;
                    count = max;
                    max = 0;
                    hop++;
                }
            }
            System.out.println(hop);
        }
    }
}
