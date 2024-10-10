package com.collections;

import java.util.Arrays;
import java.util.List;

public class GAPTest {

    public static void main(String[] args) {
        System.out.println(solution(Arrays.asList(5,1,2,3,4,5)));
    }

    public static long solution(List<Integer> array) {
        // Write your code here
        double avg = 0;
        double sum = 0;
        long output =0;
        for(Integer i:array){
            sum += array.get(i);
        }
        avg = sum/(array.size());
        double op = (Math.ceil(2 * avg * (array.size()+1)) - sum);
        return (long) op;
    }
}

