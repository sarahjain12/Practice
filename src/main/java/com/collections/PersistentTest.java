package com.collections;

public class PersistentTest {

    /*
    Find Nth non-repeating character from given string, do not consider empty spaces and do not check the case sensitivity.
     */
    public static void main(String[] args) {
        String s = "I am Surbhi Jain.";

    }

    public char getNthRepeatingCharacter(String s){
        int[] countArray = new int[26];
        int n = 2;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int charIndex = ch - 'a';

            if(countArray[charIndex]==1){
                if(n!=0){
                    n--;
                }else{
                    return ch;
                }
            }
            else{
                countArray[charIndex]=1;
            }
        }
        return 'a';
    }
}
