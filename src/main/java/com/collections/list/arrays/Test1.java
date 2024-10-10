package com.collections.list.arrays;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Test1 {

    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal("1");
        sum = sum(sum);
        System.out.println("sum = "+sum);

        BiFunction<String, String, Boolean> cs = (x,y) -> x.equals(y);
        System.out.println(cs.apply("Java8", "Java8"));

        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String forDate = myObj.format(myFormat);
        System.out.println("The Date and Time are: " + forDate);

        HashMap<Integer, String> map = new HashMap<>();

        for(Map.Entry<Integer, String> e : map.entrySet()){
            //SOP("Key : "+e.getKey()+" Values : "+e.getValue());
        }

        //map.forEach(e -> {System.out::println});



    }
    public static BigDecimal sum(BigDecimal b){
        return b.add(BigDecimal.valueOf(4));
    }

    public static void sum(int i){
        System.out.println("sum = "+i);
    }
}
