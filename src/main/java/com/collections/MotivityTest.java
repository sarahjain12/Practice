package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Implement a method in Java that takes a list of integers and returns the list sorted in ascending order.
 However, the twist is that you must sort the list using a custom comparator which sorts even numbers before odd numbers.
  Within the even and odd groups, numbers should be sorted in ascending order.

Input: [3, 1, 2, 4, 5, 7, 6]Output: [2, 4, 6, 1, 3, 5, 7]
 */
/*    @Override
    public int compareTo(Integer o1) {
        return (o1/2==0)?1:0;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2,4,5,7,6);
        list.stream().sorted(Comparator.naturalOrder().thenComparingInt(Comparator.comparing((x1, x2) -> {
            if(x1%2==0 && x2%2==0)
                return x1-x2;
        })));
    }*/
//}

public class MotivityTest {
    public static List<Integer> customSort(List<Integer> numbers) {
        /*Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a % 2 == 0 && b % 2 != 0) {
                    return -1;
                } else if (a % 2 != 0 && b % 2 == 0) {
                    return 1;
                } else {
                    return a - b;
                }
            }
        });*/
        Comparator<Integer> comparator = (Integer a, Integer b) -> {
            if (a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else if (a % 2 != 0 && b % 2 == 0) {
                return 1;
            } else {
                return a - b;
            }
        };
        Collections.sort(numbers, comparator);
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 4, 5, 7, 6);
        System.out.println(customSort(numbers));
    }
}
