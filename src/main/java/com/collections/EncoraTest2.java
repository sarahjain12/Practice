package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EncoraTest2 {

    /*
    String str = "I am rani";
     */
    public static void main(String[] args) {
        String str = "I am rani";
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            Character character = str.charAt(i);
            if(map.containsKey(character)){
                map.put(character, map.get(character)+1);
            }
            else{
                map.put(character, 1);
            }
        }
    }
}
