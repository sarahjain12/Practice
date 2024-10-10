package com.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee2{
    int age;
    String name;

    int salary;

}
public class OPenTextTest {

    /*
    Employee with age<30 and salary between 20K and 30K.
     */
    public static void main(String[] args) {
        List<Employee2> employee2List = new ArrayList<>();




        employee2List.stream()
                .filter( e -> (e.age<30 && e.salary>20000 && e.salary<30000))
                .map(e -> e.name)
                .limit(3)
                .collect(Collectors.toList());
                //.forEach(e -> {System.out.println(e.name);});
    }
}
