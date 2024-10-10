package com.binarySearch;

public class FindNegativeElementInaMatrix {

    public static void main(String a[]){
        Solution solution = new Solution();
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(solution.countNegatives(grid));
    }
}

class Solution {
    int count = 0;
    public int countNegatives(int[][] grid) {

        for(int i=0; i<grid.length; i++){
            binarySearch(grid[i]);
            /*for(int j=0; j<grid[i].length; j++){
                if(isNegative(grid[i][j])){
                    count++;
                }
            }*/
        }
        return count;
    }


    public void binarySearch(int[] nums){
        int left = 0;
        int right = nums.length -1 ;
        int mid = 0;

        while(left<=right){
            mid = (left + right)/2;

            if(isNegative(nums[mid])){
                count += right - mid + 1;
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }
    }

    public boolean isNegative(int x){
        return x<0;
    }
}
