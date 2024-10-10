package com.collections.list.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeArraysAndSort {
    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        solution.merge(IntStream.of(1,2,3,0,0,0).toArray(), 6, IntStream.of(3,5,6).toArray(), 3);
        System.out.println(List.of("mm").containsAll(Arrays.asList("mm")));
    }
}

class Solution9 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0, j=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                int temp = nums2[j];
                nums2[j] = nums1[i];
                nums1[i] = temp;
                j++;
            }
            if(nums1[i]==0){
                System.out.println("IN iff"+i+" :: "+j+"LL "+nums1[i]);
                j=0;
                nums1[i] = nums2[j];
                j++;
            }

            i++;
        }
        for(int k:nums1){
            System.out.println(nums1[k]);
        }
        System.out.println("::::");
    }
}
