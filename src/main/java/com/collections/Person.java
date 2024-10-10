package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Integer id;

    private String name;

    private Integer age;


    Person(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Shikha", 20));
        personList.add(new Person(2, "Soumya", 21));
        personList.add(new Person(3, "Raj", 22));

        personList.stream().filter(p -> p.age>21).map(p-> p.name).forEach(System.out::println);

        System.out.println(personList.stream().mapToInt(p -> p.age).average().getAsDouble());
    }

}

