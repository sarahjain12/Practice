package com.collections.list.arrays;

import java.util.*;

public class LargestNumberAfterConcatenation {

    public static void main(String args[]){
        Solution solution = new Solution();
        List<Integer> list=  new ArrayList<>(List.of(3, 30, 34, 5, 9));
        System.out.println(solution.largestNumber(list));
        System.out.println(list.stream().allMatch(e -> e.equals(2)));
    }
}

class Solution {
    // DO NOT MODIFY THE LIST
    public String largestNumber(final List<Integer> a) {

        String[] arr = new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = String.valueOf(a.get(i));
        }


        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        if(sb.charAt(0) == '0'){     //check if all zeroes are there
            return String.valueOf(0);
        }

        return sb.toString();
    }
}


