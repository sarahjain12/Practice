package com.collections.list.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class MoveZeros {

    public static void main(String arges[]) {
        int[] arr1 = {0};

        Solution4 solution4 = new Solution4();
        solution4.moveZeroes(arr1);
    }
}

class Solution4 {
    public void moveZeroes(int[] nums) {
        /*Arrays.sort(nums);
        *//*for(int j=0; j<nums.length; j++){
            System.out.println(nums[j]+" ");
        }*//*
        Collections.reverse(Arrays.asList(nums));*/
        for(int i=0; i<nums.length; i++){
            int j=i;
            /*if(nums[j] ==0){
                j++;
                if(j==nums.length){
                    break;
                }
            }*/
            while(nums[j]==0){
                j++;
                if(j>=nums.length){
                    break;
                }
            }
            if(j>=nums.length){
                break;
            }

            if(nums[i]==0){
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }


        for(int j=0; j<nums.length; j++){
            System.out.println(nums[j]+" ");
        }
    }
}
