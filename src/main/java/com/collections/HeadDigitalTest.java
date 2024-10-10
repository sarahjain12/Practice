package com.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HeadDigitalTest {

/*
    */
/*
    text1 = "abcde", text2 = "ace"
    output - ace
     *//*

    public static void main(String[] args) {
        String s1 = "dabc";
        String s2 = "cab";

        String shorterString = s1;
        String longerString = s2;
        if(s2.length()<s1.length()) {
            shorterString = s2;
            longerString = s1;
        }

        Queue q = new LinkedList();
        Stack<Integer> s = new Stack<Integer>();
        s.setSize(q.size(), s);

        int k = -1;
        String str="";
        for(int i=0; i<shorterString.length(); i++){
            int j = longerString.indexOf(shorterString.charAt(i));
                if(j!=-1){
                    if(k<j) {
                        k = j;
                        str += shorterString.charAt(i);
                    }
                }
        }

        if(k!=-1){
            System.out.println(str);
        }
    }

    public void enqueue(Integer element, Stack s){
        if(!s.i){
            s.add(element);
        }
    }

    public Integer dequeue(Stack<Integer> s){

        return s.removeFirst();
    }
*/

}
