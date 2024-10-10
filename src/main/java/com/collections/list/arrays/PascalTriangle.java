package com.collections.list.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String a[]){
        Solution6 sol = new Solution6();
        sol.generate(5);
    }
}

class Solution6 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int element = 1;
        for(int i=0; i<numRows; i++){
            List<Integer> innerList = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    innerList.add(element);
                }else{
                    List<Integer> tempList = list.get(i-1);
                    innerList.add(tempList.get(j-1)+tempList.get(j));
                }
            }
            list.add(innerList);
        }
        return list;
    }
}
