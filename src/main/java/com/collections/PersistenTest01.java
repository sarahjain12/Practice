package com.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersistenTest01 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "xyz", "aaa", "aaa", "aaa");

        Map<String, Long> map = new HashMap<>();

       /* for(String s : list){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }*/

        map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().forEach(System.out::println);


        HashSet set = new HashSet();
        Employee1 e1 = new Employee1(1, "A", 3, new Address("bh"));
        Employee1 e2 = new Employee1(1, "A", 3, new Address("bh"));
        set.add(e1);
        set.add(e2);
    }
}

