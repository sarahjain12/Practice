package com.collections;

/*
Given array of +ve and -ve integers ,we need to find a pair whose sum is closed to Zero in Array.

For example:array[]={1,3,-5,7,8,20,-40,6};
The pair whose sum is closest to zero:-5 and 6
 */
public class Oracle {

    public static void main(String[] args) {

        int[] arr = {1,3,-5,7,8,20,-40,6};
        Oracle.getPair(arr);
    }

    private static void getPair(int[] arr){
        int closeToZero = arr[0]+arr[1], closeToZeroIndexOne=0, closeToZeroIndexTwo=1;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum = arr[i]+arr[j];
                if(sum==0){
                    System.out.println(i+":"+j);
                    break;
                }
                else if(Math.abs(sum)<Math.abs(closeToZero)){
                    closeToZero = sum;
                    closeToZeroIndexOne = i;
                    closeToZeroIndexTwo = j;
                }
            }
        }
        System.out.println(arr[closeToZeroIndexOne]+":"+arr[closeToZeroIndexTwo]);
    }
}
