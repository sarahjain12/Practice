package com.collections;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class JPMorganTest {

    public static void main(String[] args) {
        Predicate<Integer> p1= i-> i<5;

        Stream.of(1,2,3,4,5,6,7).filter(p1).forEach(System.out::println);
    }
}
/*

Employee - Id, name, manager_id

select Name, (select Name from employee where manager_id=e.id) from Employee e;

select manager_id, count(*) from Employee e group by manager_id;
*/
