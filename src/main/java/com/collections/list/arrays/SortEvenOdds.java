package com.collections.list.arrays;

import java.util.Arrays;

public class SortEvenOdds {

    public static void main(String[] args) {
        SortEvenOdds s = new SortEvenOdds();
        s.sortEvenAndOdds(new int[]{1,5,7,2,8,3,10,9});
    }

    public int[] sortEvenAndOdds(int[] arr){

        int i =0, j=arr.length-1;

        while(i<j && i!=j){
            if(arr[i]%2==0){
                i++;
            }
            else if(arr[j]%2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else{
                j--;
            }
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
        return arr;
    }

}

