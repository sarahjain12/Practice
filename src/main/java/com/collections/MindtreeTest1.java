package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class MindtreeTest1 {

    /*
    arr = [4,5,6,3,4,5,6]
     */

    /*
    arr = "[2,[2,3,[4,6],[7,9]],[1,2]]";

finalArr = [2,2,3,4,6,7,9,1,2]
     */
    /*

    setTimeout(() => {
      console.log("2");
    }, "1000");

    setTimeout(() => {
      console.log("1");
    }, "2000");

    setTimeout(() => {
      console.log("3");
    }, "3000");

    setTimeout(() => {
      console.log("4");
    });
     */

    public static void main(String[] args) {
        HashSet set = new HashSet();

        String s = "[2,[2,3,[4,6],[7,9]],[1,2]]";

        s.chars().mapToObj(i -> (char)i).filter(i -> Character.isDigit(i)).forEach(System.out::println);


        //Stream.of(4, 5, 6, 3, 4 , 5, 6).filter( e -> set.add(e)).forEach(System.out::println);

    }
}
