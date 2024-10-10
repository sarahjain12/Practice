package com.collections.list.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindPivotIndex {
    public static void main(String args[]){
        Solution5 solution = new Solution5();
        int[] list=  {-1,-1,0,1,1,0};
        System.out.println(solution.pivotIndex(list));
    }
}


class Solution5 {
    public int pivotIndex(int[] nums) {

        int sumLeft=0; int sumRight=0;
        for(int i=0; i<nums.length; i++){
            if(i==0){
                for(int j=i+1; j<nums.length; j++){
                    sumRight += nums[j];
                }
            }
            else{
                sumRight -= nums[i];
                sumLeft += nums[i-1];
            }
            if(sumLeft == sumRight){
                return i;
            }
        }
        return -1;
    }
}