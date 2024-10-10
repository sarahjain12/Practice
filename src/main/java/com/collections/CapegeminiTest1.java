package com.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CapegeminiTest1 {

    public static void main(String[] args) {
        Employee22 employee1 = new Employee22("AA", 1, 33);
        Employee22 employee2 = new Employee22("BB", 2, 35);
        Employee22 employee3 = new Employee22("CC", 3, 32);
        Employee22 employee4 = new Employee22("DD", 4, 23);

        List<Employee22> list = Arrays.asList(employee1, employee2, employee3, employee4);
        list.sort(new MyComparator());

        list.stream().forEach(System.out::println);
    }
}

class MyComparator implements Comparator<Employee22>{
    @Override
    public int compare(Employee22 o1, Employee22 o2) {
        return Integer.compare(o1.age, o2.getAge());
    }
}