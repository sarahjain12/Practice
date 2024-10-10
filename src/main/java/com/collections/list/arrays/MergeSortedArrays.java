package com.collections.list.arrays;

class MergeSortedArrays {
    public static void main(String args[]){

        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        Solution3 solution3 = new Solution3();
        solution3.merge(arr1, 3, arr2, 3);
    }
}

class Solution3 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i= m+n-1;

        while(p2>=0){
            if(nums2[p2] < nums1[p1] && p1>=0){
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--]= nums2[p2--];
            }
        }
        for(int j=0; j<nums1.length; j++){
            System.out.println(nums1[j]+" ");
        }


    }

    public void addElement(int[] toArray, int startingIndex, int index, int[] nums2){
        //for(int i=0; i<fromArray.length; i++){
        if(nums2.length!=0){
            for(int j=startingIndex; j<toArray.length; j++){
                for(int i=startingIndex; i<toArray.length; i++){
                    System.out.println(toArray[i]+" ");
                }
                System.out.println("-------------------------");

                if(toArray[j] >= nums2[index]){
                    addElement(toArray, j+2, index+1, nums2);
                    toArray[j+1] = nums2[index];
                }
            }
        }
        //}
    }
}