package com.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class COForgeTest1 {

    /*
    input: 2,0,7,1,8,0,2,0,5,3,0
    output : 2,7,1,8,2,5,3,0,0,0,0
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,0,7,1,8,0,2,0,5,3,0);

        LinkedList linkedList = new LinkedList(list);

        list.stream()
                .filter(e -> e==0)
                .forEach(e -> {
                    linkedList.remove(e);
                    linkedList.addLast(e);
        });

        linkedList.stream().forEach(System.out::print);
    }

}
