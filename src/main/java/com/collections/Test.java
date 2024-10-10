package com.collections;

import java.beans.BeanProperty;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

/*     public static void main(String[] args) {
          String s = "Surbhi is working on Java. Surbhi has a experience of 10 years. Java is a backend language.";

          String[] arr = s.split("");
          Map<String, Integer> map = new HashMap<>();

          for(int i=0; i<arr.length; i++){
               if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i])+1);
               }
               else{
                    map.put(arr[i], 1);
               }
          }

          Map<String, Integer> result = map.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByValue())
                  .collect(Collectors.toMap(
                          Map.Entry::getValue,
                          Map.Entry::getKey,
                          (oldValue, newValue) -> oldValue, LinkedHashMap::new));

          result.forEach((k,v) -> System.out.println(k+" : "+v));

          //System.out.println(s.split(" ")[0]);
     }*/
}

