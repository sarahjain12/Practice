package com.Maths;

public class HappyNumber {
    public static void main(String s[]){
        Solution1 solution1= new Solution1();
        solution1.isHappy(1111111);
    }
}

class Solution1 {
    public boolean isHappy(int n) {
        int rem = 0;
        while(n>0){
            rem += Math.pow(n%10, 2);
            n = n/10;
        }
        if(rem == 1){
            return true;
        }
        else{
            if(2<rem && rem<9){
                return false;
            }
            else{
                return isHappy(rem);
            }
        }
    }
}
