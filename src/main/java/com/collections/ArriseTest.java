package com.collections;

import java.util.*;
import java.util.function.Predicate;

public class ArriseTest {

    /*
    Given N elements, please implement a stack which on every pop operation, removes and returns the maximum frequency element. If there’s a tie in the frequency,
    then the topmost highest frequency element will be returned.

Examples:
push(4)
push(6)
push(7)
push(6)
push(9)
push(5)
push(6)
push(8)
push(9)

stack --> (4,6,7,6,9,5,6,8,9)

output :
pop() --> 6
pop() --> 9
     */
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.push(4);
        myStack.push(6);
        myStack.push(7);
        myStack.push(6);
        myStack.push(9);
        myStack.push(5);
        myStack.push(6);
        myStack.push(8);
        myStack.push(9);
    }
}

class MyStack{
    int[] stack;
    Map<Integer, Integer> map = new LinkedHashMap<>();

    public void push(Integer val){
        if(map.containsKey(val)){
            map.put(val, map.get(val)+1);
        }else{
            map.put(val, 1);
        }
    }

    public Integer pop(){

        return null;
    }

}
