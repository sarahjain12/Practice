package com.Maths;

public class PalindromeOfInteger {

    public static void main(String a[]){
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(121));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if(isNegativeNumber(x)){
            return false;
        }
        int num = x;
        int res = 0;
        while(x!=0){
            int rem = 0;
            rem = x%10;
            res = (res)*10 + rem;
            x = x/10;
        }
        if((res/10) == num){
            return true;
        }
        return false;
    }

    public boolean isNegativeNumber(int x){
        return x<0;
    }
}
