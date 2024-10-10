package com.strings;

public class AgeCounting {

    public static void main(String[] args) {
        AgeCounting counting = new AgeCounting();
        counting.countAge(new StringBuilder("{\"data\":\"key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt, age=51\"}"));

    }

    public int countAge(StringBuilder s){
        int count = 0;
        String[] str = s.toString().split(", age=");
        for(int i=1; i<str.length-1; i++){
            //System.out.println(str[i]+"...");
            if((Integer.parseInt((str[i].split(","))[0])) > 50){
                count++;
            }
        }
        if((Integer.parseInt((str[str.length-1].split("\"}"))[0])) > 50){
            count++;
        }
        System.out.println(count);
        return count;
    }

}
