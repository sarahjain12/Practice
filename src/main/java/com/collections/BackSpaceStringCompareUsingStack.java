package com.collections;

import java.util.Stack;
public class BackSpaceStringCompareUsingStack {
    public static void main(String s[]){
        Solution solution = new Solution();
        solution.backspaceCompare("ab#c", "ad#c");
    }
}

class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] s1 = s.toCharArray();

        char[] t1 = t.toCharArray();

        Stack ss1 = push(s1);
        Stack tt1 = push(t1);

        if(ss1.equals(tt1)){
            return true;
        }
        else{
            return false;
        }
    }

    public Stack push(char[] a){
        Stack stack = new Stack();
        for(int i=0; i<a.length; i++){
            if(a[i] == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(a[i]);
            }
        }
        return stack;
    }
}

