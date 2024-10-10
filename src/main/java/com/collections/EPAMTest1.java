package com.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EPAMTest1 {

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,3,4,5), Arrays.asList(4,5,1,6,7), Arrays.asList(3,2,1,56,8,3));

        /* Brute Force Solution
        Predicate<Integer> p1 = i -> Arrays.asList(4,3,1,56,2).contains(i);
        Predicate<Integer> p2 = i -> Arrays.asList(3,1,5,6,2).contains(i);
        Predicate<Integer> p3 = i -> Arrays.asList(4,3,1,8, 6).contains(i);

        Predicate<Integer> p = p1.and(p2).and(p3);

        Arrays.asList(1,2,3,4,5).stream().filter(p).findFirst().ifPresent(value -> { System.out.print(value);});
*/
        Map<Integer, Long> map = list.stream().flatMap(l -> l.stream()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).ifPresent(value -> System.out.println(value.getKey()));
    }
}
