package com.collections.list.arrays;

public class RemoveDuplicatesInSortedArray {

    public static void main(String a[]){
        Solution7  solution7 = new Solution7();
        System.out.println(solution7.removeDuplicates(new int[]{1,1,2}));
    }

}

class Solution7 {
    public int removeDuplicates(int[] nums) {
        int num = nums[0];
        int count = 1;
        int index = 0;
        int size = 1;
        for(int i=1; i<nums.length; i++){
            if(num == nums[i]){
                count++;
                if(count>1){
                    nums[i] = '_';
                }
            }
            else{
                num = nums[i];
                count = 1;
                nums[++index] = nums[i];
                size++;
            }
        }
        return size;
    }
}
