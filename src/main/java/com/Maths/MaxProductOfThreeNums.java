package com.Maths;

import java.util.Arrays;

public class MaxProductOfThreeNums {
    public static void main(String s[]){
        Solution2 sol = new Solution2();
        sol.maximumProduct(new int[]{-100, -98, -1, 2, 3, 4});
    }

}

class Solution2 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        Arrays.stream(nums).forEach(n -> System.out.println(n));
        int len = nums.length;

        return nums[len-1]*nums[len-2]*nums[len-3];
    }
}
