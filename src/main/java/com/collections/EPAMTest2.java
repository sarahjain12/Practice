package com.collections;

import java.util.HashMap;
import java.util.Map;

public class EPAMTest2 {

    // To get the index of the two numbers whose addition is equal to the given sum.
    public static void main(String[] args) {
        int sum = 13;
        int[] arr = {1,2,4,5,6,9};

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int diff = sum - arr[i];
            if(map.containsKey(diff)){
                System.out.print(i+" : "+map.get(diff));
                break;
            }
            map.put(arr[i], i);
        }
    }
}
