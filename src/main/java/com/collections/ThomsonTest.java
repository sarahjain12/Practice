/*
package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThomsonTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "A", 60000);
        Employee e2 = new Employee(2, "B", 70000);
        Employee e3 = new Employee(3, "C", 80000);
        Employee e4 = new Employee(4, "D", 40000);
        Employee e5 = new Employee(5, "E", 30000);
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Map<Integer, List<Employee>> map = list.stream()
                .filter(e -> e.salary>50000)
                .collect(
                        Collectors.groupingBy(
                                Employee::getSalary,
                                Collectors.toCollection(ArrayList::new)
                        )
                );

        map.forEach((k, v) -> {
            for(Employee e : v){
                System.out.println(k+" : "+e.name);
            }
        });
    }
}

class Employee{
    int id;
    String name;

    int salary;

    String designation;
    public Employee(int id, String name, int salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
*/
